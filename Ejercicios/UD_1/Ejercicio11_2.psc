Algoritmo Ejercicio11_2
	Definir num Como entero
	Repetir
		Escribir Sin Saltar "Ingresa un n�mero"
		Leer num
		Si num<>0 entonces
			Mientras num<0 Hacer
				Escribir "Ingrese un numero positivo"
				leer num
			Fin Mientras
			Escribir "La ra�z cuadrada es " rc(num)
		FinSi
	Hasta Que num=0
FinAlgoritmo
