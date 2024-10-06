package start.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import start.DAO.PostDAO;

@Controller
public class PostController {

	
	@Autowired 
	private PostDAO postService;
	
	
	@GetMapping("/showPost")
	public String showCreaPost() {
		return "creaPostTest";
	}
	
	@PostMapping("/creaPost")
	public String creaPost(@RequestParam String contenuto,@RequestParam MultipartFile file ) {
		if (file.isEmpty()) {
			return "errore";
		}

        try {
        	// Definisci il percorso dove salvare l'immagine
            String uploadPosition = "src/main/resources/static/uploads/";
            File img = new File(uploadPosition);
            
            String filePath = uploadPosition + file.getOriginalFilename();
			file.transferTo(new File(filePath));
		
        
        } catch (IOException e) {
			e.printStackTrace();
		}
		
		return "home";
	}
	
}
