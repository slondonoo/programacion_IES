Algoritmo  Ejercicio4_6
	Definir num1, num2, num3 Como Real
	Escribir Sin Saltar "Ingrese el primer n�mero"
	Leer num1
	Escribir Sin Saltar "Ingrese el segundo n�mero"
	Leer num2
	Escribir Sin Saltar "Ingrese el tercer n�mero"
	Leer num3
	Si num1>num2 y num1>num3 Entonces
		Escribir "El n�mero:" num1, " es el mayor"
	SiNo
		Si num2>num3 Entonces
			Escribir "El n�mero:" num2, " es el mayor"
		SiNo
			Escribir "El n�mero:" num3, " es el mayor"
		FinSi
	Fin Si
FinAlgoritmo