<!DOCTYPE html>
<html lang="it">

<!DOCTYPE html>
<html lang="it">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>

    

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link rel="stylesheet" href="/css/registrazione.css">

        
            <link rel="preconnect" href="https://fonts.googleapis.com">
            <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
            <link href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,100..900;1,100..900&display=swap"
                rel="stylesheet">

            
                <link rel="icon" href="img/favicon/favicon.ico" type="image/x-icon">

</head>

<body>
    <div class="d-flex flex-column justify-content-center align-items-center vh-100">
        <img class="text-logo" src="/img/FishNet..png" alt="Logo">

        <form class="mx-auto p-5 w-25 rounded-5" action="/registrazioneOk" method="post">
            <div class="mb-3 d-flex flex-column">
                <label for="nome" class="form-label align-self-center raleway-1">Nome</label>
                <input type="text" class="form-control w-75 align-self-center text-center rounded-4 raleway-2"
                    id="nome" name="nome" placeholder="Inserisci il tuo nome" required>
            </div>
            <div class="mb-3 d-flex flex-column">
                <label for="cognome" class="form-label align-self-center raleway-1">Cognome</label>
                <input type="text" class="form-control w-75 align-self-center text-center rounded-4 raleway-2"
                    id="cognome" name="cognome" placeholder="Inserisci il tuo cognome" required>
            </div>
            <div class="mb-3 d-flex flex-column">
                <label for="data_nascita" class="form-label align-self-center raleway-1">Data di nascita</label>
                <input type="date" class="form-control w-75 align-self-center text-center rounded-4 raleway-2"
                    id="data_nascita" name="data" placeholder="Inserisci la tua data di nascita" required>
            </div>
            <div class="mb-3 d-flex flex-column">
                <label for="email" class="form-label align-self-center raleway-1">Email</label>
                <input type="text" class="form-control w-75 align-self-center text-center rounded-4 raleway-2"
                    id="email" name="email" placeholder="Inserisci la tua email" required>
            </div>
            <div class="mb-3 d-flex flex-column">
                <label for="username" class="form-label align-self-center raleway-1">Username</label>
                <input type="text" class="form-control w-75 align-self-center text-center rounded-4 raleway-2"
                    id="username" name="username" placeholder="Inserisci il tuo username" required>
            </div>
            <div class="mb-3 d-flex flex-column">
                <label for="password" class="form-label align-self-center raleway-1">Password</label>
                <input type="password" class="form-control w-75 align-self-center text-center rounded-4 raleway-2"
                    id="password" name="password" placeholder="Inserisci la tua password" required>
            </div>
            <div class="d-flex justify-content-center">
                <button type="submit" name="action" value="indietro" class="btn btn-primary m-2 raleway-1">Indietro</button>
                <button type="submit"  class="btn btn-secondary m-2 raleway-1">Registrati</button>
            </div>

        </form>

        <img src="/img/logo.png" alt="Logo" class="img-logo mb-3"> <!-- Logo centrato con margine sotto -->
        <footer class="d-flex flex-column w-100 justify-content-center align-items-center">
            <p class="raleway-1">&copy; FishNet. Tutti i diritti riservati.</p>
            <p class="raleway-1">Francesco Amerio | Luca Greco | Federico Graziani | Luigi De Lucia | Enrico Valle</p>
        </footer>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>

</body>

</html>