package start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import start.DAO.PostDAO;
import start.DAO.UtenteDAO;

@Controller
public class ProfiloController {

	
	@Autowired
	UtenteDAO utenteService;
	
	@Autowired
	PostDAO postService;
	
	
	
}
