Proceso Clasificar_numeros
	Definir num Como Entero;
	Leer num;
	Si num==0 Entonces
		Escribir 'El número cero es neutro, por lo tanto no puede ser negativo, positivo, par o impar';
	FinSi
	Si num<0 Entonces
		Escribir 'El número es negativo';
	FinSi
	Si num>0 Entonces
		Escribir 'El número es positivo';
	FinSi
	Si (num MOD 2==0) Y (num<>0) Entonces
		Escribir 'El número es par';
	FinSi
	Si (num MOD 2<>0) Entonces
		Escribir 'El número es impar';
	FinSi
FinProceso
