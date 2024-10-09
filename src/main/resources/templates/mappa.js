function initMap() {
    // Inizializza la mappa
    const map = new google.maps.Map(document.getElementById("map"), {
        center: { lat: 41.8719, lng: 12.5674 }, // Coordinate iniziali (New York in questo esempio)
        zoom: 5, // Livello di zoom
        mapTypeId: "satellite", // Mappa satellitare
    });

    // Imposta l'inclinazione 3D
    map.setTilt(45);

    // Aggiungi marker statici
    addStaticMarkers(map);
}

// Funzione per aggiungere marker statici
function addStaticMarkers(map) {
    const locations = [
        { 
            lat: 46.0160, 
            lng: 9.2572, 
            title: "Lago di Como", 
            info: "Il Lago di Como è famoso per la sua bellezza scenica, circondato da montagne e villaggi pittoreschi.<br><br><strong>PESCI PRESENTI:</strong> Luccio, Persico, Carpa, Tinca e Salmonidi." 
        }, 
        { 
            lat: 45.9676, 
            lng: 8.6533, 
            title: "Lago Maggiore", 
            info: "Il Lago Maggiore è uno dei laghi più grandi d'Italia, noto per le sue splendide isole e il paesaggio montano circostante.<br><br><strong>PESCI PRESENTI:</strong> Luccio, Persico, Carpa, Tinca, Salmonidi." 
        }, 
        { 
            lat: 42.6060, 
            lng: 11.9576, 
            title: "Lago di Bolsena", 
            info: "Il Lago di Bolsena è il lago vulcanico più grande d'Europa, famoso per la sua limpidezza e le belle spiagge.<br><br><strong>PESCI PRESENTI:</strong> Carpa, Pesce Gatto, Trota, Luccio, Persico, Tinca." 
        }, 
        { 
            lat: 42.1195, 
            lng: 12.2433, 
            title: "Lago di Bracciano", 
            info: "Il Lago di Bracciano è noto per la sua bellezza naturale e la qualità delle acque. È un luogo ideale per attività acquatiche e pesca.<br><br><strong>PESCI PRESENTI:</strong> Luccio, Carpa, Tinca."
        }, 
        { 
            lat: 45.7219, 
            lng: 10.0670, 
            title: "Lago d'Iseo", 
            info: "Il Lago d'Iseo è un lago di origine glaciale, famoso per il suo paesaggio mozzafiato e le sue isole, tra cui l'Isola di Montisola.<br><br><strong>PESCI PRESENTI:</strong> Luccio, Persico, Carpa."
        }, 
        { 
            lat: 43.1296, 
            lng: 12.0947, 
            title: "Lago Trasimeno", 
            info: "Il Lago Trasimeno è il quarto lago più grande d'Italia, ricco di storia e cultura, circondato da bellissimi paesaggi.<br><br><strong>PESCI PRESENTI:</strong> Carpa, Luccio, Persico, Tinca."
        }, 
        { 
            lat: 45.4173, 
            lng: 8.0365, 
            title: "Lago di Viverone", 
            info: "Il Lago di Viverone è un lago naturale situato in Piemonte, famoso per le sue acque calme e i suoi pesci.<br><br><strong>PESCI PRESENTI:</strong> Carpa, Luccio, Persico."
        }, 
        { 
            lat: 40.8803, 
            lng: 15.3102, 
            title: "Lago di Conza", 
            info: "Il Lago di Conza è un lago artificiale situato in Campania, noto per la sua bellezza e per le attività ricreative.<br><br><strong>PESCI PRESENTI:</strong> Carpa, Luccio, Tinca."
        }, 
        { 
            lat: 37.4388, 
            lng: 14.5626, 
            title: "Lago di Ogliastro", 
            info: "Il Lago di Ogliastro è un lago situato in Sicilia, famoso per la sua fauna e flora, nonché per le sue attività ricreative.<br><br><strong>PESCI PRESENTI:</strong> Carpa, Luccio."
        }, 
        { 
            lat: 46.1464, 
            lng: 10.7029, 
            title: "Lago di San Giuliano", 
            info: "Il Lago di San Giuliano è un lago situato in Trentino, ideale per la pesca e le attività all'aperto.<br><br><strong>PESCI PRESENTI:</strong> Luccio, Persico, Carpa."
        }, 
        { 
            lat: 41.8795, 
            lng: 15.7469, 
            title: "Lago di Varano", 
            info: "Il Lago di Varano è il più grande lago costiero d'Italia, noto per le sue acque salmastre e la ricca fauna.<br><br><strong>PESCI PRESENTI:</strong> Anguilla, Carpa, Luccio."
        }, 
        { 
            lat: 41.8806, 
            lng: 15.4244, 
            title: "Lago di Lesina", 
            info: "Il Lago di Lesina è un lago costiero della Puglia, conosciuto per la sua biodiversità e per le attività di pesca.<br><br><strong>PESCI PRESENTI:</strong> Orata, Sgombro, Anguilla."
        }, 
        { 
            lat: 39.2437, 
            lng: 9.0405, 
            title: "Lago di Cagliari", 
            info: "Il Lago di Cagliari è un lago situato in Sardegna, noto per il suo ecosistema e la ricca avifauna.<br><br><strong>PESCI PRESENTI:</strong> Cefalo, Spigola."
        }, 
        { 
            lat: 41.1138, 
            lng: 13.6222, 
            title: "Lago di Paola", 
            info: "Il Lago di Paola è un lago situato nel Lazio, ideale per la pesca sportiva e le attività ricreative.<br><br><strong>PESCI PRESENTI:</strong> Carpa, Luccio."
        }, 
        { 
            lat: 45.9863, 
            lng: 8.9700, 
            title: "Lago di Lugano", 
            info: "Il Lago di Lugano è un lago situato tra Italia e Svizzera, noto per la sua bellezza paesaggistica e le sue opportunità per attività acquatiche.<br><br><strong>PESCI PRESENTI:</strong> Luccio, Persico, Carpa, Salmonidi." 
        },
        { 
            lat: 45.7824, 
            lng: 9.1387, 
            title: "Lago di Montorfano", 
            info: "Il Lago di Montorfano è un lago situato in Lombardia, famoso per la sua tranquillità e le opportunità di pesca.<br><br><strong>PESCI PRESENTI:</strong> Luccio, Carpa, Tinca."
        }, 
        { 
            lat: 45.7998, 
            lng: 9.2634, 
            title: "Lago di Pusiano", 
            info: "Il Lago di Pusiano è un lago situato in Lombardia, circondato da paesaggi pittoreschi e ricco di biodiversità.<br><br><strong>PESCI PRESENTI:</strong> Luccio, Persico, Carpa."
        }, 
        { 
            lat: 45.6673, 
            lng: 9.9587, 
            title: "Lago di Sarnico", 
            info: "Il Lago di Sarnico è un lago situato in Lombardia, noto per la sua bellezza paesaggistica e per le sue attività acquatiche.<br><br><strong>PESCI PRESENTI:</strong> Luccio, Persico, Carpa."
        }, 
        { 
            lat: 45.9554, 
            lng: 8.4658, 
            title: "Lago di Mergozzo", 
            info: "Il Lago di Mergozzo è un lago di origine glaciale situato in Piemonte, famoso per le sue acque cristalline.<br><br><strong>PESCI PRESENTI:</strong> Trota, Luccio, Persico."
        }, 
        { 
            lat: 42.5394, 
            lng: 13.3820, 
            title: "Lago di Campostosto", 
            info: "Il Lago di Campostosto è un lago situato in Abruzzo, famoso per la sua bellezza naturale e le opportunità di pesca.<br><br><strong>PESCI PRESENTI:</strong> Trota, Carpa."
        }, 
        { 
            lat: 41.9217, 
            lng: 13.8637, 
            title: "Lago di Scanno", 
            info: "Il Lago di Scanno è un lago situato in Abruzzo, circondato da montagne e boschi, ideale per la pesca sportiva.<br><br><strong>PESCI PRESENTI:</strong> Trota, Luccio, Persico."
        }, 
        { 
            lat: 45.6049, 
            lng: 10.6351, 
            title: "Lago di Garda", 
            info: "Il Lago di Garda è il lago più grande d'Italia, famoso per le sue acque cristalline e i paesaggi mozzafiato, circondato da colline e montagne.<br><br><strong>PESCI PRESENTI:</strong> Luccio, Persico, Carpa, Tinca, Salmonidi." 
        }, 
        { 
            lat: 46.2604, 
            lng: 10.9489, 
            title: "Lago di Tovel", 
            info: "Il Lago di Tovel è un lago situato in Trentino, famoso per il suo colore rosso in estate e per la pesca.<br><br><strong>PESCI PRESENTI:</strong> Trota, Luccio."
        }, 
        { 
            lat: 43.0548, 
            lng: 11.9662, 
            title: "Lago di Chiusi", 
            info: "Il Lago di Chiusi è un lago situato in Toscana, noto per le sue opportunità di pesca e le bellezze naturali.<br><br><strong>PESCI PRESENTI:</strong> Carpa, Luccio."
        }, 
        { 
            lat: 46.0145, 
            lng: 11.2446, 
            title: "Lago di Caldonazzo", 
            info: "Il Lago di Caldonazzo è un lago situato in Trentino, noto per le sue acque cristalline e le attività acquatiche.<br><br><strong>PESCI PRESENTI:</strong> Luccio, Persico, Carpa."
        }
    ];

    const infoWindow = new google.maps.InfoWindow({
        content: "", // Contenuto iniziale vuoto
    });

    locations.forEach(location => {
        const marker = new google.maps.Marker({
            position: { lat: location.lat, lng: location.lng },
            map: map,
            title: location.title,
            animation: google.maps.Animation.DROP, // Animazione "drop"
            icon: {
                url: "/img/logo.png", // Icona per il marcatore di pesca
                scaledSize: new google.maps.Size(40, 40), // Dimensione dell'icona
            }
        });

        // Aggiungi un listener per il clic sul marcatore
        marker.addListener("click", () => {
            infoWindow.setContent(`
                <div class="info-window">
                    <h5>${location.title}</h5>
                    <p>${location.info}</p>
                </div>
            `);
            infoWindow.open(map, marker);
        });
    });
}

// Imposta initMap come callback per l'inizializzazione della mappa
window.initMap = initMap;