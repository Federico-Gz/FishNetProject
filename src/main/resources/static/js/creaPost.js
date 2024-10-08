const pulsanteAggiungi = document.getElementById("pulsante");
const divCreaPost = document.getElementsByClassName("creaPost")[0];
const mainContainer = document.getElementById("main-container");
const overlay = document.getElementById("overlay");
const tastoChiusura = document.getElementById("x");

pulsanteAggiungi.addEventListener("click", mostraCreaPost);
tastoChiusura.addEventListener("click", chiudiCreaPost);

function mostraCreaPost(){
	divCreaPost.classList.remove("creaPost");	
	divCreaPost.classList.add("centra");
	mainContainer.classList.add("sfoca");
	overlay.classList.add("overlay");
	document.body.style.overflow = "hidden";
}

function chiudiCreaPost(){
	divCreaPost.classList.remove("centra");
	divCreaPost.classList.remove("centra");
	divCreaPost.classList.add("creaPost");
	mainContainer.classList.remove("sfoca");
	overlay.classList.remove("overlay");
	document.body.style.overflow = "visible";
}