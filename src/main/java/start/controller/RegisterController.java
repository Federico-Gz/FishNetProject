package start.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import start.DAO.utenteDAO;
import start.model.Utente;

@Controller
//@RequestMapping("/index")
public class RegisterController {

	@Autowired
	private utenteDAO utenteService;

//	@PostMapping("/registrati")
//	public String mostraPagina(@RequestParam("action")String azione) {
//		if(azione.equals("register")) {
//			return "registrazione";
//			
//		}else if(azione.equals("accesso")){
//			System.out.println("controlla i dati di accesso");
//		}
//		
//		return "registrazione";
//	}

	@GetMapping("/registrati")
	public String mostraPagina() {
		return "registrazione";
	}

	@PostMapping("/registrazioneOk") // metodo per inserire un nuovo utente
	public String inserisciUtente(@ModelAttribute Utente utente) {

		utenteService.inserisciUtente(utente);
		return "login";
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
