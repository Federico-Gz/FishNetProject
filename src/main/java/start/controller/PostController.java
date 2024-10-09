package start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;
import start.DAO.DislikeDAO;
import start.DAO.LuogoDAO;
import start.DAO.Mi_piaceDAO;
import start.DAO.PostDAO;
import start.model.Dislike;
import start.model.Luogo;
import start.model.Mi_piace;
import start.model.Post;
import start.model.Utente;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
public class PostController {

	@Autowired
	private DislikeDAO dislikeService;

	@Autowired
	private Mi_piaceDAO likeService;

	@Autowired
	private PostDAO postService;

	@Autowired
	private LuogoDAO luogoService;

	@GetMapping("/inserisciPost")
	public String inserisciPost() {
		return "creaPostTest";
	}

	@Value("${upload.directory}") // Recupera il valore dal file application.properties
	private String uploadDirectory;

	@PostMapping("/posts/save")
	public String savePost(@RequestParam("image") MultipartFile file, @RequestParam("descrizione") String descrizione,
			HttpSession session, RedirectAttributes redirectAttributes) {
		try {
			// Controlla se il file non è vuoto
			if (!file.isEmpty()) {
				// Recupera il nome del file caricato
				String fileName = file.getOriginalFilename();
				// Costruisci il percorso completo del file
				String filePath = uploadDirectory + fileName;
				// session.setAttribute("filePath",filePath); //modifica fatta per inserire img
				// nel progetto

				// Salva il file nella cartella esterna
				Path path = Paths.get(filePath);
				Files.write(path, file.getBytes());

				// Puoi memorizzare il percorso del file nel database o altre operazioni
				Utente utente = (Utente) session.getAttribute("utente");
				Luogo l = new Luogo("Savona", 44.2975603, 8.4645);
				luogoService.inserisciLuogo(l);
				// Post post = new Post(utente,descrizione, filePath,l); //modifica fatta per
				// inserire img nel progetto
				Post post = new Post(utente, descrizione, fileName, l);// prima si utilizzava post riga 64
				postService.inserisciPost(post);

				utente.getPostCreati().add(post);
				// session.setAttribute("listaPostUtente", utente.getPostCreati());
				System.out
						.println("Numero post: " + utente.getPostCreati().size() + "utente : " + utente.getUsername());

				session.setAttribute("post", post);
				List<Post> listaPost = (List<Post>) session.getAttribute("listaPost");
				listaPost.add(post);
				session.setAttribute("listaPost", listaPost);
				System.out.println("File salvato in: " + fileName);

			}

		} catch (IOException e) {
			e.printStackTrace();
			redirectAttributes.addFlashAttribute("message", "Errore durante il caricamento del file");
		}

		return "home"; // Redirigi a una pagina di successo
	}

	@PostMapping("/addInteraction")
	public String addLike(@RequestParam String action, @RequestParam int id_post, HttpSession session, Model model) {

		boolean aggiuntaInterazione = false;
		
		if (action.equals("like")) {
			boolean inserito = false;
			Utente u = (Utente) session.getAttribute("utente");
			Post p = postService.selezionaPostById(id_post);

			int likeInseriti = (int) likeService.contaMi_piace();
			session.setAttribute("likeInseriti", likeInseriti);
			
			List<Mi_piace> listaLike = likeService.selezionaTuttiMi_piace();
			for (Mi_piace x : listaLike) {
				if (x.getUtente().getUsername().equals(u.getUsername()) ) {
					inserito = true;
				}
			}
			if (inserito == false && aggiuntaInterazione==false) {
				Mi_piace l = new Mi_piace(u, p);
				likeService.inserisciMi_piace(l);
				aggiuntaInterazione=true;
			}

//            for (Post p : listaPost) {
//                if(p.getIdPost()==id_post && p.getUtente().getUsername().equals(u.getUsername())) {
//                    Mi_piace l = new Mi_piace(u,p);
//                    likeService.inserisciMi_piace(l);
//                }
//            }
//            Post p = (Post) session.getAttribute("post");
//            List<Mi_piace> likes = likeService.selezionaTuttiMi_piace();
//            for (Mi_piace m : likes) {
//                if (!m.getUtente().getUsername().equals(u.getUsername()) && m.getPost().getIdPost() == p.getIdPost()) {
//                    Mi_piace l = new Mi_piace(u, p);
//                    likes.add(l);
//                    likeService.inserisciMi_piace(l);
//                }
//            }

		} else if (action.equals("dislike")) {
			boolean inserito = false;
			Utente u = (Utente) session.getAttribute("utente");
			Post p = postService.selezionaPostById(id_post);
			
			int disLikeInseriti = (int) dislikeService.contaDislike();
			session.setAttribute("disLikeInseriti", disLikeInseriti);
			
			List<Dislike> listaDisLike = dislikeService.selezionaTuttiDislike();
			
			
			for(Dislike x : listaDisLike) {
				if(x.getUtente().getUsername().equals(u.getUsername())) {
					inserito = true;
				}
			}
			if(inserito == false&&aggiuntaInterazione==false) {
				Dislike d = new Dislike(u, p);
				dislikeService.inserisciDislike(d);
				aggiuntaInterazione=true;
			}
			

			
			
			
			
//    		Post postCorretto=null;
//			for (Post p : listaPost) {
//				if (p.getIdPost() == id_post) {
//					postCorretto=p;
//					System.out.println("dislike inserito");
//				}
//			}
//		    Set<Dislike> disLikes = postCorretto.getDislikes();
//		    for(Dislike d: disLikes) {
//		    	if(!d.getUtente().getUsername().equals(u.getUsername())) {
//		    		Dislike dislike = new Dislike(u,postCorretto);
//		    		dislikeService.inserisciDislike(dislike);
//		    		
//		    		
//		    	}
//		    }
		}

		return "home";

	}

}
