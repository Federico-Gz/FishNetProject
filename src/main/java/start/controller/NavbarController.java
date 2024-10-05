package start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavbarController {

	@GetMapping("/showLogin")  // Richiamato dal tasto esci della navbar
	public String showLogin() {
		return "login";
	}
	
//	@GetMapping("/showHome")
//	public String showHome() {  Richiamato dal tasto home della navbar 
//		return "home";         al momento non funziona perchè la lista di utenti che popola i post viene passata dal LoginController
//	}
}