Algoritmo Ejercicio6_3
	Definir x1, x2, res Como Entero
	x1 <-azar(101)
	x2 <-azar(101)
	Escribir Sin Saltar "Realiza la siguiente suma: "
	Escribir x1, "+", x2
	Escribir Sin Saltar "Respuesta"
	Leer res
	Mientras x1 +  x2 <> res Hacer
		Escribir Sin Saltar "Realiza la siguiente suma: "
		Escribir x1, "+", x2
		Escribir Sin Saltar "Respuesta"
		Leer res
	Fin Mientras
	Escribir "Correcto"
FinAlgoritmo