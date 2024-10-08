package start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;
import start.DAO.PostDAO;
import start.DAO.UtenteDAO;
import start.model.Utente;

@Controller
public class ProfiloController {

	
	@Autowired
	UtenteDAO utenteService;
	
	@Autowired
	PostDAO postService;
	
//	@GetMapping
//	public String mostraPostUtente(HttpSession session,Model model) {
//		Utente u = (Utente)session.getAttribute("utente");
//		u.getPostCreati();
//		return null;
//	}
	
}
