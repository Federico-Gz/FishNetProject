const pulsanteAggiungi = document.getElementById("pulsante");
const divCreaEvento = document.getElementsByClassName("creaEvento")[0];
const mainContainer = document.getElementById("main-container");
const overlay = document.getElementById("overlay");
const tastoChiusura = document.getElementById("x");
const aggiungiPartecipante = document.getElementById("incrementa");
const rimuoviPartecipante = document.getElementById("decrementa");
let counter = document.getElementById('counter');

pulsanteAggiungi.addEventListener("click", mostraCreaPost);
tastoChiusura.addEventListener("click", chiudiCreaPost);
aggiungiPartecipante.addEventListener("click", increment);
rimuoviPartecipante.addEventListener("click", decrement);


function mostraCreaPost(){
	divCreaEvento.classList.remove("creaEvento");	
	divCreaEvento.classList.add("centra");
	mainContainer.classList.add("sfoca");
	overlay.classList.add("overlay");
	document.body.style.overflow = "hidden";
}

function chiudiCreaPost(){
	divCreaEvento.classList.remove("centra");
	divCreaEvento.classList.add("creaEvento");
	mainContainer.classList.remove("sfoca");
	overlay.classList.remove("overlay");
	document.body.style.overflow = "visible";
}

function increment() {
    let counter = document.getElementById('counter');
    counter.value = parseInt(counter.value) + 1;
  }

  function decrement() {
    let counter = document.getElementById('counter');
    if (counter.value > 0) {
      counter.value = parseInt(counter.value) - 1;
    }
  }

