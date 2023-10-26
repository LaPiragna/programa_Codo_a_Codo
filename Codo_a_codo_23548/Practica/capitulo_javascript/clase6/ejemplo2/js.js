/**
 * Arreglo para almacenar objetos de tipo persona.
 * @type {Object[]}
 */
var arreglo = [];

/**
 * Agrega un objeto persona al arreglo y actualiza el HTML.
 * @function
 * @name cargar
 * @param {Object} persona - El objeto persona a agregar.
 * @returns {void} 
 */
function cargar(persona){
	arreglo.push(persona); //agrega al arreglo
	document.getElementById("tbody").innerHTML += `
		<tr>
			<td>${persona.nombre}</td>
			<td>${persona.edad}</td>
		</tr>`;	//agrega al html
}

/**
 * Crea un objeto persona con los datos capturados y llama a la función cargar.
 * @function
 * @name capturaDatos
 * @inner
 * @param {none} 
 * @returns {void} 
 */
function capturaDatos() { 
    /**
     * Crea un objeto persona.
     * @constructor
     * @param {string} nombre - El nombre de la persona.
     * @param {number} edad - La edad de la persona.
     */
    function persona(nombre, edad){
        this.nombre = nombre;
        this.edad= edad;
    }
    var capNombre = document.getElementById('name').value;
    var capEdad = document.getElementById('edad').value;
    p = new persona(capNombre, capEdad);
    cargar(p);
}

const BTNCLICK = document.getElementById("boton");
BTNCLICK.addEventListener("click", capturaDatos);