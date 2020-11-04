Algoritmo  Ejercicio11_1
	Definir x, alt, contador Como Entero
	x=Aleatorio(1,100)
	Escribir Sin Saltar "Adivina un número del 1 al 100"
	Leer alt
	contador=1
	
	Mientras alt<>x y contador<7 hacer
		Escribir Sin Saltar "Inténtalo de nuevo, "
			Si x<alt Entonces
				Escribir "es un número menor"
			SiNo
				Escribir "es un número mayor"
			Fin Si
		Leer alt
		contador=contador+1
	Fin Mientras 
	Si alt=x Entonces
		Escribir "Has acertado"
	SiNo
		Escribir "No has acertado, consumiste los ", contador, " intentos" 
	Fin Si
FinAlgoritmo