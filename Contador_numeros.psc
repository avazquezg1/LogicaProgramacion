Proceso Contador_numeros
	Definir repeticion, num, cuantos, positivo, negativo, cero Como Entero;
	positivo <- 0;
	negativo <- 0;
	cero <- 0;
	Escribir 'Cuántos números quieres ingresar?';
	Leer cuantos;
	Para repeticion<-1 Hasta cuantos Hacer
		Escribir 'Ingresa el número';
		Leer num;
		Si (num==0) Entonces
			cero <- cero+1;
		FinSi
		Si (num<0) Entonces
			negativo <- negativo+1;
		FinSi
		Si (num>0) Entonces
			positivo <- positivo+1;
		FinSi
	FinPara
	Escribir 'Total de números positivos:', positivo;
	Escribir 'Total de números negativos:', negativo;
	Escribir 'Total de números cero:', cero;
FinProceso
