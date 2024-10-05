package start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import start.DAO.utenteDAO;
import start.model.Utente;

@Controller
@RequestMapping("/index")
public class UtenteController {
	

	@Autowired
	private utenteDAO utenteService;

	@GetMapping("/inserisci")
	public String inserisciUtente() {

		Utente u = new Utente("utente@gmail.com", "carlo", "giovanni", "vasco", "danilo");
		utenteService.inserisciUtente(u);
		return "home";
	}
	
}
