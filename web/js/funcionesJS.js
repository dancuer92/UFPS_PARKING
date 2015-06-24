
/* ARRAY DE IMAGENES */
ads = new Array(3);
ads[0] = "img/s1.jpg";
ads[1] = "img/s2.jpg";
ads[2] = "img/s3.png";


/* ARRAY DE URLs */
arrayURLs = new Array(3);
arrayURLs[0] = "http://jarroba.com/indice-ingenieria-del-software/"
arrayURLs[1] = "http://jarroba.com/lenguajes-de-programacion/"
arrayURLs[2] = "http://jarroba.com/aplicaciones-moviles/"


//variable para llevar la cuenta de la imagen siguiente
var contador = 0;


var tiempo = 2// En segundos
var timer = tiempo * 1000;

function banner() {

	contador = contador % 3
	document.banner.src = ads[contador];
	setTimeout("banner()", timer);
	contador++;
}

function ponerURL() {
	contador2 = contador;
	url = window.open(arrayURLs[contador2]);
	return false;
}
