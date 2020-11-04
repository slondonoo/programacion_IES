Algoritmo Ejercicio4_4
	Definir num1, num2 Como Real
	Escribir Sin Saltar "Escribe el primer número"
	Leer num1
	Escribir Sin Saltar "Escribe el segundo número"
	Leer num2
	Si num1>0 y num2>0
		Escribir "Los dos números son positivos"
	SiNo
		Si num1<0 y num2<0 Entonces
			Escribir "Los dos números son negativos"
		SiNo
			Si num1>0 o num2>0 Entonces
				Escribir "Hay un número positivo"
			SiNo
				Escribir "Hay dos números nulos"
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo