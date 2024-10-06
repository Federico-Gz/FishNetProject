<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Carica Immagine</title>
</head>
<body>
    <h1>Carica un'immagine</h1>
    <form action="/upload" method="post" enctype="multipart/form-data">
        <label for="contenuto">Testo post:</label>
        <input type="text" id="contenuto" name="contenuto"><br><br>
        
        <label for="file">Seleziona un'immagine:</label>
        <input type="file" id="file" name="file" accept="image/*"><br><br>
        
        <input type="submit" value="Carica">
    </form>
</body>
</html>
