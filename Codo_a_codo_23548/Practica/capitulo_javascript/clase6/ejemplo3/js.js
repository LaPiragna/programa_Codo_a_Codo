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

btn.addEventListener("click", cambiarLuz);