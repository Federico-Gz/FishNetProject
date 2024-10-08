package start.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import start.DAO.PostDAO;
import start.DAO.UtenteDAO;


@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UtenteDAO utenteService;
	
	@Autowired
	private PostDAO postService;
	
	
	
	
	
	
}
