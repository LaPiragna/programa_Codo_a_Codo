window.onload = function(){
	var links = document.querySelectorAll(".navbar-nav .nav-link"); // Selecciona todos los links
	var url = window.location.href; // Obtiene la URL de la página actual
	console.log(url);

	if (url.endsWith("https://meek-swan-b3bbf2.netlify.app/") || 
		url.endsWith("https://meek-swan-b3bbf2.netlify.app/#")){
		console.log("main page")
		links.forEach(function(link, index){
			if (index == 0) links[index].style.color = "white";
			else {
				links[index].style.color = "rgb(30,30,30)";
				links[index].addEventListener("mouseover", function(event){
					event.target.style.color ="rgb(200,200,200)";
				})
				links[index].addEventListener("mouseout", function(event){
					event.target.style.color ="rgb(30,30,30)";
				})
			}
		})
		
	}
	else if(url.endsWith("comprar_tickets") ||
		url.endsWith("comprar_tickets#")){
			console.log("secondary page")
			links.forEach(function(link, index){
				if (index != 4){
					links[index].style.color = "rgb(30,30,30)";
					links[index].addEventListener("mouseover", function(event){
						event.target.style.color ="rgb(200,200,200)";
					})
					links[index].addEventListener("mouseout", function(event){
						event.target.style.color ="rgb(30,30,30)";
					})
				}
			})
			var resumenButton = document.querySelector('button[name="Resumen"]');
			resumenButton.addEventListener('click', function(event) {
				var cantidad = document.getElementById('inputCantidad').value;
				var categoria = document.querySelector('select').value;
				var precioTicket = 120;
				var descuento;

				switch(categoria) {
					case '1': // Estudiante
						descuento = 0.8;
						break;
					case '2': // Trainee
						descuento = 0.5;
						break;
					case '3': // Junior
						descuento = 0.15;
						break;
					default:
						descuento = 0;
				}
				var totalPagar = cantidad * precioTicket * (1 - descuento);
				document.querySelector('.alert').textContent = 'Total a pagar $' + Math.trunc(totalPagar);
			});

	};
};
