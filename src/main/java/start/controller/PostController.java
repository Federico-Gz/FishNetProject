package start.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class PostController {
	
	@GetMapping("/inserisciPost")
	public String inserisciPost() {
		File directory = new File("C:\\Desktop\\Uploads");
		return "creaPostTest";
	}
	
    @Value("${upload.directory}")  // Recupera il valore dal file application.properties
    private String uploadDirectory;

    @PostMapping("/posts/save")
    public String savePost(@RequestParam("image") MultipartFile file, RedirectAttributes redirectAttributes) {
        try {
            // Controlla se il file non è vuoto
            if (!file.isEmpty()) {
                // Recupera il nome del file caricato
                String fileName = file.getOriginalFilename();
                // Costruisci il percorso completo del file
                String filePath = uploadDirectory + fileName;

                // Salva il file nella cartella esterna
                Path path = Paths.get(filePath);
                Files.write(path, file.getBytes());

                // Puoi memorizzare il percorso del file nel database o altre operazioni
                System.out.println("File salvato in: " + filePath);
            }

        } catch (IOException e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("message", "Errore durante il caricamento del file");
        }

        return "home";  // Redirigi a una pagina di successo
    }
}
