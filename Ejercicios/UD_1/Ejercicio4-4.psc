Algoritmo Ejercicio4_4
	Definir num1, num2 Como Real
	Escribir Sin Saltar "Escribe el primer n�mero"
	Leer num1
	Escribir Sin Saltar "Escribe el segundo n�mero"
	Leer num2
	Si num1>0 y num2>0
		Escribir "Los dos n�meros son positivos"
	SiNo
		Si num1<0 y num2<0 Entonces
			Escribir "Los dos n�meros son negativos"
		SiNo
			Si num1>0 o num2>0 Entonces
				Escribir "Hay un n�mero positivo"
			SiNo
				Escribir "Hay dos n�meros nulos"
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo