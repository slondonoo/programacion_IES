Algoritmo  Ejercicio4_6
	Definir num1, num2, num3 Como Real
	Escribir Sin Saltar "Ingrese el primer número"
	Leer num1
	Escribir Sin Saltar "Ingrese el segundo número"
	Leer num2
	Escribir Sin Saltar "Ingrese el tercer número"
	Leer num3
	Si num1>num2 y num1>num3 Entonces
		Escribir "El número:" num1, " es el mayor"
	SiNo
		Si num2>num3 Entonces
			Escribir "El número:" num2, " es el mayor"
		SiNo
			Escribir "El número:" num3, " es el mayor"
		FinSi
	Fin Si
FinAlgoritmo