Proceso Ejercicio11_1
	Definir alto, ancho, filas, columnas Como Entero
	Escribir Sin Saltar "Definir altura del rectangulo"
	Leer alto
	Escribir Sin Saltar "Definir ancho del rectangulo"
	Leer ancho
	Para filas <- 1 Hasta alto Hacer
		Para columnas<-1 Hasta ancho Hacer
			Si filas=1 o filas=alto o columnas=1 o columnas=ancho o filas= columnas o filas+columnas=alto+1 Entonces
				Escribir Sin Saltar" * "
			SiNo
				Escribir Sin Saltar " - "
			Fin Si
		Fin Para
		Escribir ""
	Fin Para	
FinProceso
