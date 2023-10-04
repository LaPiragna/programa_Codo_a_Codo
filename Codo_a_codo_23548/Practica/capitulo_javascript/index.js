var pass = '123';
var usuario;
var clave;

usuario = prompt('Enter username:');
clave = prompt('Enter password:');

if (clave == pass){
		alert('Hi ' + usuario + '!, how are you?');
	}
	
	else {
		alert('Invalid password!');
	}