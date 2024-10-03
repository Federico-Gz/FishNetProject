package start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/")
public class DefaultController {

	@GetMapping
	public String showDefaultPage() {
		return "login"; // Il nome del file FTL senza estensione
	}

	@PostMapping("/login")
	public String mostraPagina() {
//			 @RequestParam String username, 
//	            @RequestParam String password, 
//	            @RequestParam String accesso,
//	            @RequestParam String register, 
//	            Model model) {
//		 // Se è stato premuto il bottone Login
//        if (accesso != null) {
////            // Logica per gestire il login
////            boolean loginSuccess = verificaCredenziali(username, password);
////            if (loginSuccess) {
////                return "paginaLoginSuccess"; // Pagina di login success
////            } else {
////                model.addAttribute("errore", "Credenziali errate");
////                return "paginaLogin"; // Torna alla pagina di login con errore
////            }
//        }
//
//        // Se è stato premuto il bottone Registrati
//        if (register != null) {
//            // Reindirizza a una pagina di registrazione
//            return "registrazione"; // Nome della pagina di registrazione
//        }

        return "errore"; // Nel caso in cui nessun bottone sia stato premuto

	}
}