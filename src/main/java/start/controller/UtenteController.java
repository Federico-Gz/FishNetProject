package start.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import start.DAO.postDAO;
import start.DAO.utenteDAO;
import start.model.Post;
import start.model.Utente;

@Controller
//@RequestMapping("/index")
public class UtenteController {

	@Autowired
	private utenteDAO utenteService;

	@GetMapping("/login")
	public String mostraPagina() {
		return "registrazione";
	}

	@PostMapping("/login")
	public String inserisciUtente(@ModelAttribute Utente utente) {
	
		utenteService.inserisciUtente(utente);
		return "registrazione";
	}

//	@GetMapping("/rimuovi")
//	public String rimuoviUtente() {
//		utenteService.cancellaUtenteTramiteId(1);// aggiugnere query di ftl
//		return "registrazione";
//	}
//
//	@GetMapping("/rimuovi")
//	public String rimuoviTuttiUtenti() {
//
//		List<Utente> utenti = utenteService.selezionaUtenti();
//		for (Utente x : utenti) {
//			utenteService.cancellaUtente(x);
//		}
//		return "registrazione";
//	}

}
