Proceso Adivinar_Numero
	Definir numero_secreto, intento, contador_intentos Como Entero;
	numero_secreto<- Aleatorio(1, 100);
	contador_intentos<- 0;
	Repetir
		Escribir "Adivina el número";
		Leer intento;
		contador_intentos <- contador_intentos+1;
		Si intento < numero_secreto Entonces
			Escribir "El número es mayor a tu intento";
		SiNo
			Si intento > numero_secreto Entonces
				Escribir "El número es menor a tu intento";
			SiNo
				Escribir "Lo has acertado, el número secreto es:", numero_secreto;
			FinSi
		FinSi
		
	Hasta Que intento = numero_secreto
	Escribir "Tu número de intentos fue:", contador_intentos;
FinProceso
