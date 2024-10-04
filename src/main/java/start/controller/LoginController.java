package start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.ui.Model;

import start.DAOimpl.UtenteDAOimpl;
import start.model.Utente;

@Controller
@RequestMapping("/")
public class LoginController {
	List<Utente> utenti;
	@Autowired
	private UtenteDAOimpl utenteService;

	@GetMapping
	public String showLoginPage() {
		return "login"; // Il nome del file FTL senza estensione
	}

	@PostMapping("/login") // metodo per gestire i bottoni e le pagine di reindirizzo
	public String mostraPagina(@RequestParam("action") String action, @RequestParam("username") String username,
			@RequestParam("password") String password, Model model) {
		if ("login".equals(action)) {
			if (utenteService.controlloCredenziali(username, password)) {
				HomeController.ShowUtenti(model);// metodo per mostrare utenti su home.ftl come fossero post
					return "home";
			} else {
				return "errore";
			}

		} else if ("register".equals(action)) {

			return "registrazione";
		} else if ("indietro".equals(action)) {

			return "login";

		}
		return "/";
	}
	
//	@GetMapping("/homePost")          metodo che serve per poter usare una lista nella ftl home
//	public String nome(Model model) {
//		List<Utente> utenti = utenteService.selezionaUtenti();
//		model.addAttribute("utenti",utenti);
//			return "home";
//	}
	

}