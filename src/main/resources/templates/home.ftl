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
    
 	<link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"
  />

</head>

<body style="background: linear-gradient(135deg, #ccb8b8 0%, #6baaf7 100%);">
<div id="overlay" class="d-flex justify-content-center align-items-center">
	<#-- DIV PER IL FORM PER AGGIUNGERE UN POST -->
	
<div class="card d-flex container w-100 creaPost p-0" data-post-id="1">
    <form class="container bg-body-tertiary">
        <div class="container-fluid d-flex justify-content-between align-items-start" style="display:inherit;" >
            <div class="d-flex w-50 " style="display:inherit;">
                <img src="/img/logo.png" alt="Logo" class="d-flex align-self-center img-profilo" style="display:inherit;" />
                <div class="d-flex flex-column align-self-center mt-3 ">
                    <h6 class="align-self-center">Nome profilo</h6>
                    <p class="align-self-center">Luogo</p>
                </div>
            </div>
            <a href="#" class="align-self-start p-3" >
                <ion-icon name="ellipsis-vertical-outline"></ion-icon>
            </a>
        </div>
    

        <div class="d-flex justify-content-center " style="display:inherit;">
            <input type="file" accept="image/*" class="card-img-top w-100 p-3" placeholder="/img/logo.png" />
        </div>

        <div class="card-body " style="display:inherit;">
            <p class="card-text">
                <input type="text" placeholder="Inserisci testo"></input>
            </p>
            <div class="container d-flex justify-content-center align-items-center " style="display:inherit;">
                <p class="like-counter m-0" >0</p>
                <a class="navbar-brand button" " href="#" data-post-id="1" style="padding: 1px;">
                    <img src="../img/like.png" width="60" height="50">
                </a>
                <a class="navbar-brand button" " href="#" data-post-id="1" style="padding: 1px;">
                    <img src="../img/notLike.png" width="60" height="50">
                </a>
                <p class="like-counter m-0">0</p>
            </div>
        </div>
    </form>
</div>
</div>
    <div class=" d-flex w-100 flex-column justify-content-center align-items-center" id="main-container">
    		
           <#include "/components/navbar.ftl"/>
           <div class="container d-flex flex-column wid ">
           		<#include "/components/post.ftl"/>
           		<#include "/components/post.ftl"/>  
           		<#include "/components/post.ftl"/>  
           </div>      
    </div>

	<ion-icon class="position-fixed bottom-0 end-0 p-3 fs-1" id="pulsante" name="add-circle-outline"></ion-icon>
	




    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous">
     </script>
     
    <script src="/js/script.js"></script>
    <script src="/js/creaPost.js"></script>  
</body>

</html>