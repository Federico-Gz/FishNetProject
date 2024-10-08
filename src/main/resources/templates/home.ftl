<!DOCTYPE html>
<html lang="it">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    
    <link rel="stylesheet" href="/css/home.css">
    <link rel="stylesheet" href="/css/navbar.css">
    <link rel="stylesheet" href="/css/post.css">

    <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css" />
</head>

<body style="background: linear-gradient(135deg, #ccb8b8 0%, #6baaf7 100%);">

    <div id="overlay" class="d-flex justify-content-center align-items-center">

        <!-- DIV FORM PER AGGIUNGERE UN POST -->

        <div class="card d-flex container w-50 creaPost p-0" data-post-id="1" >
        
        
            <form class="container bg-body-tertiary" action="/posts/save" method="post" enctype="multipart/form-data">
                <div class="container-fluid d-flex justify-content-between align-items-start" style="display: inherit;">
                    <div class="d-flex w-50" style="display: inherit;">
                        <img src="/img/logo.png" alt="Logo" class="d-flex align-self-center img-profilo"/>
                             
                        <div class="d-flex flex-column align-self-center mt-3">
                            <h6 class="align-self-center">${utente.getUsername()}</h6>
                          <!--  <p class="align-self-center">Luogo</p> -->
                        </div>
                    </div>
                        <ion-icon id="x" name="close-circle-outline" class="align-self-start p-0 fs-2"></ion-icon>
                </div>

                <div class="d-flex justify-content-center">
                    <input type="file" name="image" accept="image/png, image/jpeg" class="card-img-top w-100 p-3" placeholder="/img/logo.png" />
                </div>

                <div class="card-body" >
                    <div class="form-floating mb-4">
  						<textarea name="descrizione" class="form-control" style="height:100px; max-height: 250px;" placeholder="Leave a comment here" id="floatingTextarea"></textarea>
 						<label for="descrizione">Scrivi qui</label>
					</div>
                    <div class="container d-flex justify-content-center align-items-center" >
                        <button type="submit" class="btn btn-outline-info">Pubblica</button>
                    </div>
                </div>
            </form>
            
            
        </div>
    </div>

    <div class="d-flex w-100 flex-column justify-content-center align-items-center" id="main-container">
        <#include "/components/navbar.ftl" />
        <div class="container d-flex flex-column wid">
        
        
               <!--serve per ciclare sulla lista di post, crea tante pagine post.ftl quanti sono i post nella lista -->
           <#if listaPost??> <!-- Verifica se listaPost esiste -->             
                  <#list listaPost as post>
                     <#include "/components/post.ftl"/>
                  </#list>              
            <#else>
                 <p>Nessun post disponibile</p> <!-- Messaggio se listaPost è null -->
            </#if>
       
       
       
       
       
       
        </div>
    </div>

    <ion-icon class="position-fixed bottom-0 end-0 p-0 fs-1" id="pulsante" name="add-circle-outline"></ion-icon>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous">
    </script>

    <script src="/js/script.js"></script>
    <script src="/js/creaPost.js"></script>
</body>

</html>