window.onload = function(){
	var links = document.querySelectorAll(".navbar-nav .nav-link"); // Selecciona todos los links
	var url = window.location.href; // Obtiene la URL de la página actual

	if (url.endsWith("index.html") || 
		url.endsWith("index.html#")){
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
	else if(url.includes("conviertete_en_orador.html") ||
		url.includes("conviertete_en_orador.html#")){
			links.forEach(function(link, index){
			if (index == 3) links[index].style.color = "white";
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

	/*
	index.html
	-primer link blanco
	-resto de links negro
	-hover al resto de links
	-onclick en el resto de linnks
	*/

}
