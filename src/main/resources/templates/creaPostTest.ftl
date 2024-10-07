<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Carica Immagine</title>
</head>
<body>
    <h1>Carica un'immagine</h1>
    
    <form th:action="@{/showPost}"
    th:object="${post}" method="post"
    enctype="multipart/form-data"
    >
    ...
    <div>
     
    <label>Photos: </label>
    <input type="file" name="image" accept="image/png, image/jpeg" />
     
    </div>
    ...
</form>
</body>
</html>
