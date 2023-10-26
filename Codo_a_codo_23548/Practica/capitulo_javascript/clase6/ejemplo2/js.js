var arreglo = [];

function cargarDatos(){
	const nombre = document.getElementById("nombre").value;
	const edad = document.getElementById("edad").value;
	
	function persona(n, e){
		this.nombre = n;
		this.edad = e;
	}
	
	p = new persona(nombre, edad);
	arreglo.push(p);
	
	document.getElementById("tbody").innerHTML +=  `
    <tr>
        <td>${nombre}</td>
        <td>${edad}</td>
    </tr>`;

}

const boton = document.getElementById("boton");
boton.addEventListener("click", cargarDatos);