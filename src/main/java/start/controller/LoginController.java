package start.controller;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;


import start.DAO.EventoDAO;
import start.DAO.Mi_piaceDAO;
import start.DAO.PostDAO;
import start.DAO.UtenteDAO;
import start.model.Evento;
import start.model.Post;
import start.model.Utente;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	private EventoDAO eventoService;
	
	@Autowired
	private UtenteDAO utenteService;
	
	@Autowired 
	private PostDAO postService;

	@Autowired
	private Mi_piaceDAO likeService;
	
	@GetMapping
	public String showLoginPage() {
		return "login"; // Il nome del file FTL senza estensione
	}
	
	@PostMapping("/login") // metodo per gestire i bottoni e le pagine di reindirizzo
	public String mostraPagina(@RequestParam String action, @RequestParam String username,
			@RequestParam String password, HttpSession session) {
		if (action.equals("login")) {
			if (utenteService.controlloCredenziali(username, password)) { 
				this.showAllPost(session, username);
					return "home"; // Le credenziali erano corrette accedi alla home
			} else {
				// messaggio che viene passato alla pagina login.ftl quando la pagina viene ricaricata
				session.setAttribute("credenzialiErrate", "Username o password errati");
				return "login"; // Le credenziali erano errate
			}

		}
		else if (action.equals("register")) { // Premuto il tasto registrati

			return "registrazione"; // Pagina di registrazione
		} 

		return "errore";
	}
	
	      
	public void showAllPost(HttpSession session, String username) {
		List<Post> listaPost = postService.selezionaTuttiPost();
		if (listaPost == null) {
			listaPost = new ArrayList<>(); // Inizializza con una lista vuota
		}

		List<Evento> listaEventi = eventoService.selezionaTuttiEvento();
	    if(listaEventi == null) {
	    	listaEventi = new ArrayList<>();
	    }
	    
		Utente utente = utenteService.selezionaUtenteByUsername(username);
		listaPost.sort(Comparator.comparing(Post::getDataOra).reversed());
		session.setAttribute("listaPost", listaPost);		
		session.setAttribute("utente", utente); // aggiunto al model l'utente per far comparire il nome dell'utente loggato su navbar.ftl
		session.setAttribute("listaEventi", listaEventi);
		utente.getPostCreati().sort(Comparator.comparing(Post::getDataOra).reversed());
		session.setAttribute("listaPostUtente", utente.getPostCreati());
		session.setAttribute("listaEventoUtente", utente.getEventiCreati());

	}
	

}