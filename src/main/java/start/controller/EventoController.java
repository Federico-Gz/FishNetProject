package start.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import start.DAO.EventoDAO;
import start.DAO.LuogoDAO;
import start.model.Evento;
import start.model.Luogo;
import start.model.Post;
import start.model.Utente;

@Controller
public class EventoController {

	@Autowired
	private EventoDAO eventoService;
	
	@Autowired
	private LuogoDAO luogoService;
	
	@PostMapping("/inserisciEvento")
	public String inserisciEvento(HttpSession session,@RequestParam("descrizione") String descrizione,@RequestParam("numeroCanne") Integer numeroCanne,
			@RequestParam("specialitaCanna") String specialitaCanna,@RequestParam("gommone") String gommone,
			@RequestParam("tipologiaEsca") String tipologiaEsca,@RequestParam("dataInizio") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate dataInizio,
			@RequestParam("dataFine")  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataFine/*,@RequestParam("numeroPartecipanti") int numeroPartecipanti*/,@RequestParam("luogo") String luogo) {
		System.out.println("evento ins");
		Utente u = (Utente)session.getAttribute("utente");
		Luogo l = luogoService.findByName(luogo);

		Evento e = new Evento(u,descrizione,l,numeroCanne,specialitaCanna,gommone,tipologiaEsca, dataInizio,dataFine);	
		eventoService.inserisciEvento(e);
		List<Evento> listaEventi = eventoService.selezionaTuttiEvento();
		
		listaEventi.add(e);
		
		u.getEventiCreati().add(e);
		session.setAttribute("evento", e);
		List<Evento> listaEventiSession = (List<Evento>) session.getAttribute("listaEventi");
		listaEventiSession.add(e);
		session.setAttribute("listaEventi", listaEventiSession);
		session.setAttribute("listaEventoUtente", u.getEventiCreati());
		return "eventi";
	}
	
}
