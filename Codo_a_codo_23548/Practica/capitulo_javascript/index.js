var btn = document.querySelector('button');

random = number => Math.floor(Math.random() * (number+1));

function randomColor(){
	document.body.style.backgroundColor = 'rgb('+random(255)+','+random(255)+','+random(255)+')';
}

function changeColor(){
	setInterval(randomColor, 1000);
}

btn.addEventListener('click', changeColor);