Proceso Clasificacion_numero
	Definir num Como Entero;
	Definir esPositivo, esCero, esNegativo, esPar, esImpar Como Logico;
	Escribir "Escribe el número entero";
	Leer num;
	esPositivo <- (num>0);
	esCero<- (num==0);
	esNegativo<- (num<0);
	esPar<- Verdadero;
	esImpar<- Falso;
	Si esCero Entonces
		esPar<- Falso;
		esImpar<- Falso;
	SiNo
		esPar<- (num Mod 2 ==0);
		esImpar<- (num Mod 2 <> 0);
	FinSi
	Si esPositivo Entonces
		Escribir "Es un número positivo";
	FinSi
	Si esNegativo Entonces
		Escribir "Es un número negativo";
	FinSi
	Si esCero Entonces
		Escribir "El número es cero";
	FinSi
	Si esPar Entonces
		Escribir "El número es par";
	FinSi
	Si esImpar Entonces
		Escribir "El número es impar";
	FinSi
	Si esCero Entonces
		Escribir "El cero es número neutro";
	FinSi
	
FinProceso
