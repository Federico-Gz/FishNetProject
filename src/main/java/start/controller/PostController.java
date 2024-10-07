package start.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import start.DAO.PostDAO;
import start.DAO.UtenteDAO;
import start.model.Post;
import start.model.Utente;

@Controller
public class PostController {

	
	@Autowired 
	private PostDAO postService;
	
	@Autowired 
	private UtenteDAO utenteService;
	
	
	@GetMapping("/showPost")
	public String showCreaPost() {
		return "creaPostTest";
	}
	
	
//	@PostMapping("/creaPost")
//	public String creaPost(@ModelAttribute Post post) {
//		postService.inserisciPost(post);
//		return "home";
//	}
//	@PostMapping("/creaPost")
//		  public RedirectView savePost(Utente utente,
//		            @RequestParam("image") MultipartFile multipartFile) throws IOException {
//		         
//		        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
//		        post.setImg(fileName);
//		        postService.inserisciPost(post);
//		        Post savedUser = post;
//		 
//		        String uploadDir = "user-photos/" + savedUser.getId();
//		 
//		        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
//		         
//		        return new RedirectView("/users", true);
//		    }
	
}
