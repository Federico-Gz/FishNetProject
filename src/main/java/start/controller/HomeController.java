//package start.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import start.DAOimpl.UtenteDAOimpl;
//import start.model.Utente;
//
//@Controller
//@RequestMapping("/home")
//public class HomeController {
//
//	@Autowired
//	private static UtenteDAOimpl utenteService;
//	
//	public static String ShowUtenti(Model model) {
//		List<Utente> utenti = utenteService.selezionaUtenti();   //metodo per mostrare utenti su home.ftl come fossero post (richiamato sopra)
//		model.addAttribute("utenti",utenti);
//		return"home";
//	}
//	
//	
//}
