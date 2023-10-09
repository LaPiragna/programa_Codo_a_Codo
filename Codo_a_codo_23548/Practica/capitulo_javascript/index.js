function obtenerNombre(){return prompt("Como te llamas?");}
function callBack(nombre){alert(`Hola ${nombre}, bienvenido!`);}

callBack(obtenerNombre());