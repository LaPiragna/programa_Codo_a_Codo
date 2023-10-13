var spanUp = document.getElementById("sizeup");
var spanDown = document.getElementById("sizedown");
var body = document.body;

function sizeUp(){
	let newSize, currentSize = document.body.style.fontSize;
	if (currentSize === "") currentSize = "16px";
	newSize = parseInt(currentSize)+1;
	document.body.style.fontSize = newSize + "px";
}

function sizeDown(){
	let newSize, currentSize = document.body.style.fontSize;
	if (currentSize === "") currentSize = "16px";
	newSize = parseInt(currentSize)-1;
	document.body.style.fontSize = newSize + "px";
}

spanUp.addEventListener("click", sizeUp);
spanDown.addEventListener("click", sizeDown);

function showHelp(help) {
	document.getElementById('help').innerHTML = help;
}

function makeHelpCallback(help){
	return function(){
		showHelp(help);
	};
}

function setupHelp() {
	var helpText = [
		{'id': 'email', 'help': 'Dirección de correo electrónico'},
		{'id': 'name', 'help': 'Nombre completo'},
		{'id': 'age', 'help': 'Edad (debes tener más de 16 años)'}
	];
	for (var i = 0; i < helpText.length; i++) {
		var item = helpText[i];
		document.getElementById(item.id).onfocus = makeHelpCallback(item.help);
	}
}

setupHelp();