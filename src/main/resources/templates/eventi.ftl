<!DOCTYPE html>
<html lang="it">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Eventi</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        
    <link rel="stylesheet" href="/css/home.css">
    <link rel="stylesheet" href="/css/navbar.css">
    <link rel="stylesheet" href="/css/evento.css">
    <link rel="stylesheet" href="/css/eventi.css">
    
    <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
    
 	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>

</head>

<body style="background: linear-gradient(135deg, #ccb8b8 0%, #6baaf7 100%);">
	
	<div id="overlay" class="d-flex justify-content-center align-items-center">
	<#-- DIV PER IL FORM PER AGGIUNGERE UN EVENTO -->
	
	<div class="card d-flex container creaEvento w-100">
	<form action="/inserisciEvento" method="post" class="container bg-body-tertiary">
        <div class="container bg-body-tertiary">
            <div class="container-fluid d-flex justify-content-between align-items-start" >
                <div class="d-flex w-50">
                    <img src="/img/logo.png" alt="Logo"
                        class="d-flex align-self-center img-profilo"/>
                    <div class="d-flex flex-column align-self-center mt-3">
                        <h6 class="align-self-center ">Nome profilo</h6>
                    </div>

                </div>
                  <ion-icon id="x" name="close-circle-outline" class="align-self-start p-0 fs-2"></ion-icon>
            </div>
        </div>

        <div class="card-text shadow-lg p-3 m-3 bg-body-tertiary rounded w-100 d-flex justify-content-center align-items-center">
	  		<label for="descrizione" class="form-label m-0 mt-2"></label>
			<input class="form-control" id="descrizione" name="descrizione" placeholder="Descrivi brevemente l'evento?">			
		</div>
        
        

        <div class="container d-flex mt-2" >
            <div class="card-text shadow-lg p-3 m-3 bg-body-tertiary rounded w-50 d-flex justify-content-evenly align-items-center">
                <ul>
                    <li>
                    	<label for="numeroCanne" class="form-label m-0 mt-2">Numero canne</label>
						<select class="form-select" id="numeroCanne" name="numeroCanne" aria-label="Numero canne">
						  <option selected>Scegli</option>
						  <option value="1">1</option>
						  <option value="2">2</option>
						  <option value="3">3</option>
						  <option value="4">4</option>
						</select>
                    </li>
                    <li>
                    	<label for="specialitaCanna" class="form-label m-0 mt-2">Specialità canna</label>
						<select class="form-select" id="specialitaCanna" name="specialitaCanna" aria-label="Specialità canna">
						  <option selected>Scegli</option>
						  <option value="Carpfishing">Carpfishing</option>
						  <option value="Surfcasting">Surfcasting</option>
						  <option value="Troutarea">Troutarea</option>
						  <option value="Spinning">Spinning</option>
						  <option value="Specialist">Specialist</option>
						</select>
                    </li>
                </ul>
                <ul>
                	<li>
                    	<label for="gommone" class="form-label m-0 mt-2">Gommone</label>
						<select class="form-select" id="gommone" name="gommone" aria-label="gommone">
						  <option selected>Scegli</option>
						  <option value="Si">Si</option>
						  <option value="No">No</option>
						</select>
                    </li>
                    <li>
                    	<label for="tipologiaEsca" class="form-label m-0 mt-2">Tipologia esca</label>
						<select class="form-select" id="" name="tipologiaEsca" aria-label="Tipologia esca">
						  <option selected>Scegli</option>
						  <option value="Boiles">Boiles</option>
						  <option value="Vivo">Vivo</option>
						  <option value="Granaglie">Granaglie</option>
						  <option value="Finto">Finto</option>
						</select>
                    </li>
                </ul>
           
            </div>
            
            <div class="card-text shadow-lg p-3 m-3 bg-body-tertiary rounded w-50 d-flex justify-content-evenly align-items-center">
                <ul class="w-50 ps-2 pr-2">
                    <li>
	  					<label for="lago" class="form-label m-0 mt-2">Seleziona un Lago</label>
    <select class="form-control" id="lago" name="luogo">
        <option value="Lago di Garda">Lago di Garda</option>
        <option value="Lago di Como">Lago di Como</option>
        <option value="Lago Maggiore">Lago Maggiore</option>
        <option value="Lago di Bolsena">Lago di Bolsena</option>
        <option value="Lago di Bracciano">Lago di Bracciano</option>
        <option value="Lago di Iseo">Lago di Iseo</option>
        <option value="Lago di Trasimeno">Lago di Trasimeno</option>
        <option value="Lago di Viverone">Lago di Viverone</option>
        <option value="Lago di Conza">Lago di Conza</option>
        <option value="Lago di Ogliastro">Lago di Ogliastro</option>
        <option value="Lago di San Giuliano">Lago di San Giuliano</option>
        <option value="Lago di Varano">Lago di Varano</option>
        <option value="Lago di Lesina">Lago di Lesina</option>
        <option value="Lago di Cagliari">Lago di Cagliari</option>
        <option value="Lago di Paola">Lago di Paola</option>
        <option value="Lago di Ceresio">Lago di Ceresio</option>
        <option value="Lago di Montorfano">Lago di Montorfano</option>
        <option value="Lago di Pusiano">Lago di Pusiano</option>
        <option value="Lago di Sarnico">Lago di Sarnico</option>
        <option value="Lago di Mergozzo">Lago di Mergozzo</option>
        <option value="Lago di Bolsena">Lago di Bolsena</option>
        <option value="Lago di Bracciano">Lago di Bracciano</option>
        <option value="Lago di Campotosto">Lago di Campotosto</option>
        <option value="Lago di Scanno">Lago di Scanno</option>
        <option value="Lago di Campione">Lago di Campione</option>
        <option value="Lago di Fimon">Lago di Fimon</option>
        <option value="Lago di Albano">Lago di Albano</option>
        <option value="Lago di Taranto">Lago di Taranto</option>
        <option value="Lago di Barrea">Lago di Barrea</option>
        <option value="Lago di Fiastra">Lago di Fiastra</option>
        <option value="Lago di Tovel">Lago di Tovel</option>
        <option value="Lago di Molveno">Lago di Molveno</option>
        <option value="Lago di Cavazzo">Lago di Cavazzo</option>
        <option value="Lago di Misurina">Lago di Misurina</option>
    </select>
						
                    </li>
                    <li>                    				
						<label for="dataInizio" class="form-label m-0 mt-2">Data inizio:</label>
						<input type="date" class="form-control" id="dataInizio" name="dataInizio" min="2024-10-06">					
	               </li>
                </ul>   
                <ul class="w-50 ps-2 pr-2">
                	<li>              
						<label for="dataFine" class="form-label m-0 mt-2">Data fine:</label>
						<input type="date" class="form-control" id="dataFine" name="dataFine" min="2024-10-06">		
                    </li>
                   <!-- <li>
                    	<label for="numeroPartecipanti" class="form-label m-0 mt-2">N. partecipanti</label>
                    	<div class="container mt-0 d-flex justify-content-center">
  							<div class="d-flex align-items-center w-100">
							    <button class="btn btn-outline-primary w-25" type="button" id="decrementa">-</button>
							    <input type="number" name "numeroPartecipanti" class="form-control mx-2 text-center w-50" value="1" id="counter">
							    <button class="btn btn-outline-primary w-25 " type="button" id="incrementa">+</button>
  							</div>
						</div>
                    </li>-->
                </ul>
                
            </div>
            
        </div>

        <div class="container d-flex mt-2 justify-content-center" >
            <div class="container d-flex justify-content-center align-items-center" >
                        <button type="submit" class="btn btn-outline-info">Pubblica</button>
                    </div>
        </div>
	</form>
    </div>
    
	</div>
	
    <div class=" d-flex w-100 flex-column justify-content-center align-items-center" id="main-container">
           <#include "/components/navbar.ftl"/>
           <div class="container d-flex flex-column wid ">
           
            <#if listaEventi??> <!-- Verifica se listaEventi esiste -->
                 <#list listaEventi as evento>
           		     <#include "/components/evento.ftl"/>
                 </#list>
            <#else>
                 <p>Nessun post disponibile</p> <!-- Messaggio se listaEventi è null -->
            </#if>		 
           
           
                    		 
           </div>      
    </div>
    
    <ion-icon class="position-fixed bottom-0 end-0 p-0 fs-1" id="pulsante" name="add-circle-outline"></ion-icon>
    

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous">
    </script>
     
    <script src="/js/script.js"></script> 
    <script src="/js/creaEvento.js"></script> 
</body>

</html>