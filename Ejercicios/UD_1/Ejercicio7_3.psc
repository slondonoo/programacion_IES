Algoritmo  Ejercicio7_3
	Definir numerador, denominador Como Entero
	Repetir
		Escribir Sin Saltar"Escribe el numerador"
		Leer numerador
		Escribir Sin Saltar "Escribe el denominador"
		Leer denominador
		Mientras denominador=0 Hacer
			Escribir "El denominador debe ser positivo"
			Escribir Sin Saltar "Escribe el denominador"
			Leer denominador
		Fin Mientras
		Escribir "La división es: " numerador/denominador
	Hasta Que denominador=0
FinAlgoritmo