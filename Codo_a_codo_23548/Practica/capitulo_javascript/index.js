var btn = document.querySelector('button');

random = number => Math.floor(Math.random() * (number+1));

function randomColor(){
	var randomC = 'rgb('+random(255)+','+random(255)+','+random(255)+')';
	document.body.style.backgroundColor = randomC;
}

function changeColor(){
	setInterval(randomColor, 1000);
}

btn.addEventListener('click', changeColor);