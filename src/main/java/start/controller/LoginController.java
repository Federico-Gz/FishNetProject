package start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;

import start.DAO.UtenteDAO;
import start.model.Utente;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	private UtenteDAO utenteService;

	@GetMapping
	public String showLoginPage() {
		return "login"; // Il nome del file FTL senza estensione
	}
	
	@PostMapping("/login") // metodo per gestire i bottoni e le pagine di reindirizzo
	public String mostraPagina(@RequestParam String action, @RequestParam String username,
			@RequestParam String password, Model model) {
		if (action.equals("login")) {
			if (utenteService.controlloCredenziali(username, password)) { 
				// metodo per mostrare utenti su home.ftl come fossero post
//				List<Utente> utenti = utenteService.selezionaUtenti();
//				model.addAttribute("utenti",utenti);
				this.inserisciPost(model);
					return "home"; // Le credenziali erano corrette accedi alla home
			} else {
				// messaggio che viene passato alla pagina login.ftl quando la pagina viene ricaricata
				model.addAttribute("credenzialiErrate", "Username o password errati");
				return "login"; // Le credenziali erano errate
			}

		}
		else if (action.equals("register")) { // Premuto il tasto registrati

			return "registrazione"; // Pagina di registrazione
		} 

		return "errore";
	}
	
	        
	// metodo che serve per poter usare una lista nella ftl home
	public void inserisciPost(Model model) {
		List<Utente> utenti = utenteService.selezionaUtenti();
		model.addAttribute("utenti",utenti);
	}
	
	
	

}