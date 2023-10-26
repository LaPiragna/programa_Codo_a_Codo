function cargar(){
	const VALOR = document.getElementById("ingreso").value;
	
	const DIV = document.createElement("div");
	
	const elemento = document.body.appendChild(DIV);
	
	elemento.innerText = VALOR;
}

const BTNCLICK = document.getElementById("boton");

BTNCLICK.addEventListener("click", cargar);