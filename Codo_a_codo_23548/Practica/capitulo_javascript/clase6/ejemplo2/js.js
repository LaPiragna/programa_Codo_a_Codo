// Inicializa un arreglo vacío
var arreglo = [];

// Define una función para cargar datos
function cargarDatos(){
	// Obtiene los valores de los campos de entrada "nombre" y "edad"
	const nombre = document.getElementById("nombre").value;
	const edad = document.getElementById("edad").value;
	
	// Define una función constructora para crear objetos "persona"
	function persona(n, e){
		this.nombre = n;
		this.edad = e;
	}
	
	// Crea un nuevo objeto "persona" con los valores ingresados
	p = new persona(nombre, edad);
	
	// Agrega el nuevo objeto al arreglo
	arreglo.push(p);
	
	// Agrega una nueva fila a la tabla con los valores ingresados
	document.getElementById("tbody").innerHTML +=  `
    <tr>
        <td>${nombre}</td>
        <td>${edad}</td>
    </tr>`;
}

// Obtiene el botón por su ID
const boton = document.getElementById("boton");

// Agrega un event listener al botón para cargar los datos cuando se hace clic en él
boton.addEventListener("click", cargarDatos);
