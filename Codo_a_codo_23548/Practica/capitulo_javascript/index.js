const btn = document.querySelector('button'); 

function random(number) {
  return Math.floor(Math.random() * (number+1));
}

function changeColor() {
  const rndCol = 'rgb(' + random(255) + ',' + random(255) + ',' + random(255) + ')'; 
  document.body.style.backgroundColor = rndCol;
}

btn.onclick = function() {
  setInterval(changeColor, 1000); // Cambia el color cada 1 segundo
}
