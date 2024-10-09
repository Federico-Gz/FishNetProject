<!DOCTYPE html>
<html lang="it">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Google Maps - Aggiungi Indicatore</title>
    <link rel="stylesheet" href="/css/mappa.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	<link rel="stylesheet" href="/css/navbar.css">
</head>

<body>

    <div class="container">
    <#include "/components/navbar.ftl" />
        <div id="map" class=""></div>
    </div>

    <script
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBgGS-pHVL1asKPHaBN3QZco4SV5qMD1bA&callback=initMap&v=weekly"
        defer></script>
    <script src="/js/mappa.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>

</html>