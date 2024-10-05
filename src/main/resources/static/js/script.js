document.addEventListener("DOMContentLoaded", function() {
    console.log("DOM fully loaded and parsed");  // Verifica che il DOM sia pronto

    const likeButtons = document.querySelectorAll('[id^="like-button"]');

    // Aggiungi un listener ad ogni pulsante like
    likeButtons.forEach(button => {

        button.addEventListener("click", function(event) {
            event.preventDefault();  

            // Ottieni il post-id specifico dal pulsante cliccato
            const postId = this.getAttribute('data-post-id');

            // Seleziona il contatore corretto
            const likeCounter = document.getElementById(`like-counter-${postId}`);

            // Incrementa il contatore dei like
            let counter = parseInt(likeCounter.textContent);

            counter++;
            likeCounter.textContent = counter;

            // Aggiungi l'animazione al contatore
            likeCounter.classList.add("animate__animated", "animate__fadeInDown");

            likeCounter.addEventListener("animationend", function() {
                likeCounter.classList.remove("animate__animated", "animate__fadeInDown");
            }, { once: true });
        });
    }); 
	
	//Aggiunto tasto indietro che dalla pagina registrazione.ftl torna indietro
	 document.getElementById('indietro').addEventListener('click', function() {
			
	        //torna alla pagina precedente
			window.history.back();
	    });
	
});
