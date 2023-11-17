var body = document.body;
var flag = 0; //0 -> light, 1 -> dark
var btn = document.getElementById("modoluz");

function cambiarLuz(){
	if (flag == 0) {
		flag = 1;
		body.style.backgroundColor = "rgb(40,40,40)";
		btn.className = "btn btn-light";
	}
	else{
		flag = 0;
		body.style.backgroundColor = "rgb(255,255,255)";
		btn.className = "btn btn-dark";
	}
}

btn.addEventListener("click", cambiarLuz);// Obtiene el elemento body del documento
var body = document.body;

// Inicializa una bandera para rastrear el modo actual (0 para luz, 1 para oscuro)
var flag = 0;

// Obtiene el botón por su ID
var btn = document.getElementById("modoluz");

// Define una función para cambiar el modo de luz
function cambiarLuz(){
	// Si el modo actual es luz (0)
	if (flag == 0) {
		// Cambia a modo oscuro
		flag = 1;
		// Cambia el color de fondo a oscuro
		body.style.backgroundColor = "rgb(40,40,40)";
		// Cambia el estilo del botón a light
		btn.className = "btn btn-light";
	}
	else{
		// Cambia a modo luz
		flag = 0;
		// Cambia el color de fondo a blanco
		body.style.backgroundColor = "rgb(255,255,255)";
		// Cambia el estilo del botón a dark
		btn.className = "btn btn-dark";
	}
}

// Agrega un event listener al botón para cambiar el modo de luz cuando se hace clic en él
btn.addEventListener("click", cambiarLuz);
