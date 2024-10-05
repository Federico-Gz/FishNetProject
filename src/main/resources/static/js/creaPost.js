const pulsanteAggiungi = document.getElementById("pulsante");
const divCreaPost = document.getElementsByClassName("creaPost")[0];
const mainContainer = document.getElementById("main-container");
const overlay = document.getElementById("overlay");

pulsanteAggiungi.addEventListener("click", mostraCreaPost);

function mostraCreaPost(){
	divCreaPost.classList.remove("creaPost");	
	divCreaPost.classList.add("centra");
	mainContainer.classList.add("sfoca");
	overlay.classList.add("overlay");
	document.body.style.overflow = "hidden";
}