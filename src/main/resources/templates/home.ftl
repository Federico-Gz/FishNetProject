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

    <div class=" d-flex w-100 flex-column justify-content-center align-items-center ">
           <#include "/components/navbar.ftl"/>
           <div class="container d-flex flex-column wid ">
           <!--serve per ciclare sulla lista di utenti, crea tante pagine post.ftl quanti sono gli utenti nella lista -->
           <#list utenti as utente>
           		<#include "/components/post.ftl"/>
           		</#list>
           		
           </div>      
    </div>



    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous">
     </script>
     
    <script src="/js/script.js"></script> 
</body>

</html>