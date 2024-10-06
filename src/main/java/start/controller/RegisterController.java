package start.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String inserisciUtente(@ModelAttribute Utente utente,@RequestParam String action,Model model) {
		if(action.equals("registrati")) {
			// Viene controllato che username, password non siano già presenti nel db e che la data di nascita non sia errata
			if (utenteService.controlloPresenzaUserPw(utente.getUsername(), utente.getEmail())) {
				model.addAttribute("userEmailInUso", "Risulta già un utente registrato con questo indirizzo email ed username");
				return "registrazione";
			}else if(utenteService.controlloPresenzaUser(utente.getUsername())){
				model.addAttribute("userInUso", "Risulta già un utente registrato con questo username");
				return "registrazione";
			}else if(utenteService.controlloPresenzaEmail(utente.getEmail())){
				model.addAttribute("emailInUso", "Risulta già un utente registrato con questo indirizzo email");
				return "registrazione";
			}
			else {
				if(!utenteService.controlloData(utente.getData())) {
					utenteService.inserisciUtente(utente);
					return "login";
				}
				else {
					model.addAttribute("dataErrata", "La data di nascita è errata");
					return "registrazione";
				}
			}
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
