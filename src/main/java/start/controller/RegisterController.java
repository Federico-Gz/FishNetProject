package start.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import start.DAO.UtenteDAO;
import start.model.Utente;

@Controller
//@RequestMapping("/index")
public class RegisterController {

	@Autowired
	private UtenteDAO utenteService;


	@GetMapping("/registrati")
	public String mostraPagina() {
		return "registrazione";
	}

	@PostMapping("/registrazioneOk") // metodo per inserire un nuovo utente
	public String inserisciUtente(@ModelAttribute Utente utente,@RequestParam String action) {
		if(action.equals("registrati")) {
			if (utenteService.controlloPresenzaUserPw(utente.getUsername(), utente.getEmail())) {
				return "errore";
			} else {
				if(!utenteService.controlloData(utente.getData())) {
					utenteService.inserisciUtente(utente);
					return "login";
				}
				else {
					return "errore";
				}
			}
		}else if(action.equals("indietro")) {
			System.out.println("indietro premuto");
			return "login";
			
		}
		return "errore";
	}

//	@GetMapping("/rimuovi")
//	public String rimuoviUtente() {
//		utenteService.cancellaUtenteTramiteId(1);// aggiugnere query di ftl
//		return "registrazione";
//	}
//
//	@GetMapping("/rimuovi") //da testare ma non da mettere in pagina
//	public String rimuoviTuttiUtenti() {
//
//		List<Utente> utenti = utenteService.selezionaUtenti();
//		for (Utente x : utenti) {
//			utenteService.cancellaUtente(x);
//		}
//		return "registrazione";
//	}

}
