<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    
    <#-- LINK BOOTSTRAP-->
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/login.css">

	<#-- LINK GOOGLE FONT-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
	<#-- LINK FAVICON-->
    <link rel="icon" href="/img/favicon/favicon.ico" type="image/x-icon">

</head>
<body>
    <div class="d-flex flex-column justify-content-center align-items-center vh-100">
        <img class="text-logo" src="/img/FishNet..png" alt="Logo"  >
        
        <form class="mx-auto p-5 w-25 rounded-5" action="/login" method="post"> 
            <div class="mb-3 d-flex flex-column">
                <label for="username" class="form-label align-self-center raleway-1">Username</label>
                <input type="text" class="form-control w-75 align-self-center text-center rounded-4 raleway-2" id="username" name="username" placeholder="Inserisci il tuo username" required>
            </div>
            <div class="mb-3 d-flex flex-column">
                <label for="password" class="form-label align-self-center raleway-1">Password</label>
                <input type="password" class="form-control w-75 align-self-center text-center rounded-4 raleway-2" id="password" name="password" placeholder="Inserisci la tua password" required>
            </div>
            <div class="d-flex justify-content-center">
                <button type="submit" class="btn btn-primary m-2 raleway-1">Login</button>
                <button type="button" class="btn btn-secondary m-2 raleway-1">Registrati</button>
            </div>
            
        </form>

        <img src="/img/logo.png" alt="Logo" class="img-logo mb-3">
        <footer class="d-flex flex-column w-100 justify-content-center align-items-center">
            <p class="raleway-1">&copy; FishNet. Tutti i diritti riservati.</p>
            <p class="raleway-1">Francesco Amerio | Luca Greco | Federico Graziani | Luigi De Lucia | Enrico Valle</p>
        </footer>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    
</body>
</html>
