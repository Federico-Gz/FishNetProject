<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Carica Immagine</title>
</head>
<body>

<h2>Carica Immagine per il Post</h2>

<!-- Controllo per eventuali messaggi di errore -->
<#if message??>
    <div style="color: red;">${message}</div>
</#if>

<!-- Form per il caricamento dell'immagine -->
<form action="/posts/save" method="post" enctype="multipart/form-data">
    
    <!-- Campo descrizione del post -->
    <div>
        <label for="descrizione">Descrizione del post:</label>
        <textarea id="descrizione" name="descrizione" rows="4" cols="50"></textarea>
    </div>

    <!-- Campo per il caricamento dell'immagine -->
    <div>
        <label for="image">Carica Immagine:</label>
        <input type="file" id="image" name="image" accept="image/png, image/jpeg" required>
    </div>

    <!-- Pulsante di invio -->
    <div>
        <button type="submit">Salva Post</button>
    </div>
</form>

</body>
</html>


