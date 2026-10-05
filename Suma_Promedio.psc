Proceso Suma_Promedio
	Definir num, promedio, suma Como Real;
	Definir cuantos, repeticion Como Entero;
	suma<-0;
	Escribir "Cuántos números ingresará para calcular el promedio?";
	Leer cuantos;
	Para repeticion<-1 Hasta cuantos Hacer
		Escribir "Número_", repeticion, ":";
		Leer num;
		suma<- suma+num;
	FinPara
	promedio<- suma/cuantos;
	
	Escribir "Suma:", suma;
	Escribir "Promedio:", promedio;
	
FinProceso
