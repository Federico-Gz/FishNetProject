package start.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;
import start.DAO.EventoDAO;
import start.DAO.PostDAO;
import start.DAO.UtenteDAO;
import start.model.Evento;
import start.model.Post;
import start.model.Utente;

@Controller
public class NavbarController {
	
	@Autowired
	private PostDAO postService;
	
	@Autowired
	private EventoDAO eventoService;
	
	@Autowired
	private UtenteDAO utenteService;

	@GetMapping("/showLogin")  // Richiamato dal tasto esci della navbar
	public String showLogin(HttpSession session) {
		session.invalidate();		
		return "login";
	}
	
	@GetMapping("/showHome")
	public String showHome(HttpSession session) {
		List<Post> listaPost = postService.selezionaTuttiPost();
		if (listaPost == null) {
			listaPost = new ArrayList<>(); // Inizializza con una lista vuota
		}

		List<Evento> listaEventi = eventoService.selezionaTuttiEvento();
	    if(listaEventi == null) {
	    	listaEventi = new ArrayList<>();
	    }
		session.setAttribute("listaPost", listaPost);		
		session.setAttribute("listaEventi", listaEventi);
		return "home";        // al momento non funziona perchè la lista di utenti che popola i post viene passata dal LoginController
	}
	
	@GetMapping("/profilo")
	public String showProfilo(HttpSession session) {
		List<Post> listaPost = postService.selezionaTuttiPost();
		if (listaPost == null) {
			listaPost = new ArrayList<>(); // Inizializza con una lista vuota
		}

		List<Evento> listaEventi = eventoService.selezionaTuttiEvento();
	    if(listaEventi == null) {
	    	listaEventi = new ArrayList<>();
	    }
		session.setAttribute("listaPost", listaPost);		
		session.setAttribute("listaEventi", listaEventi);
		return "profilo";
	}
	
	@GetMapping("/eventi")
	public String showEventi(HttpSession session) {
		Utente u = (Utente)session.getAttribute("utente");
		List<Evento> listaEventiSession = (List<Evento>) session.getAttribute("listaEventi");
		session.setAttribute("listaEventi", listaEventiSession);
		session.setAttribute("listaEventoUtente", u.getEventiCreati());
		return "eventi";
	}
}
