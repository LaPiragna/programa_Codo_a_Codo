var links = document.querySelectorAll(".navbar-nav .nav-link"); // Selecciona todos los links
var url = window.location.href; // Obtiene la URL de la página actual

if (url.endsWith("index.html") || url.endsWith("index.html#")){
	document.body.style.backgroundColor = "blue";
}
else if(url.endsWith("conviertete_en_orador.html")){
	document.body.style.backgroundColor = "green";
	console.log(true);
}

/*
index.html
-primer link blanco
-resto de links negro
-hover al resto de links
-onclick en el resto de linnks
*/
