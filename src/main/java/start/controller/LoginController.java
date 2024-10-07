package start.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;

import start.DAO.PostDAO;
import start.DAO.UtenteDAO;
import start.model.Post;
import start.model.Utente;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	private UtenteDAO utenteService;
	
	@Autowired PostDAO postService;

	@GetMapping
	public String showLoginPage() {
		return "login"; // Il nome del file FTL senza estensione
	}
	
	@PostMapping("/login") // metodo per gestire i bottoni e le pagine di reindirizzo
	public String mostraPagina(@RequestParam String action, @RequestParam String username,
			@RequestParam String password, HttpSession session) {
		if (action.equals("login")) {
			if (utenteService.controlloCredenziali(username, password)) { 
				// metodo per mostrare utenti su home.ftl come fossero post
//				List<Utente> utenti = utenteService.selezionaUtenti();
//				model.addAttribute("utenti",utenti);
//				this.inserisciPost(model);
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
	
	        
	// metodo che serve per poter usare una lista nella ftl home
//	public void inserisciPost(Model model) {
//		List<Utente> utenti = utenteService.selezionaUtenti();
//		model.addAttribute("utenti",utenti);
//	}
	
	public void showAllPost(HttpSession session, String username) {
		List<Post> listaPost = postService.selezionaTuttiPost();
		if (listaPost == null) {
			listaPost = new ArrayList<>(); // Inizializza con una lista vuota
		}
		Post post = null;
		Utente utente = utenteService.selezionaUtenteByUsername(username);
		for (Post p : listaPost) {
			if (p.getUtente().getUsername().equals(username)) {
				post = p;
			}
		}
        //in DB da cambiare in NN like,dis,descrizione
		session.setAttribute("listaPost", listaPost);
		session.setAttribute("post", post); // agginto al model il singolo post per far comparire il nome del creatore su post.ftl
		session.setAttribute("utente", utente); // aggiunto al model l'utente per far comparire il nome dell'utente loggato su navbar.ftl

	}
	

}