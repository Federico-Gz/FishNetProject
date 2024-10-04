package start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import org.springframework.ui.Model;


//import ch.qos.logback.core.model.Model;
//import start.DAO.utenteDAO;
import start.DAOimpl.utenteDAOimpl;

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	private utenteDAOimpl utenteService;

	@GetMapping
	public String showDefaultPage() {
		return "login"; // Il nome del file FTL senza estensione
	}

	@PostMapping("/login") // metodo per gestire i bottoni e le pagine di reindirizzo
	
	//CHIEDERE AI RAGAZZI FRONTEND PROBLEMA BOTTONE
	public String mostraPagina(@RequestParam("action") String action, @RequestParam("username") String username,
			@RequestParam("password") String password, Model model) {
		if ("login".equals(action)) {
			if (utenteService.controlloCredenziali(username, password)) {
				return "ciao";
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

}