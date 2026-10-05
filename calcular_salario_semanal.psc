Proceso calcular_salario_semanal
	Definir nombre Como Cadena;
	Definir horas_trabajadas, horas_extra Como Entero;
	Definir pago_hora, salario Como Real;
	Escribir 'Hola, para poder calcular tu salario ocupo tu nombre, dámelo';
	Leer nombre;
	Escribir 'Dime las horas que trabajaste en la semana';
	Leer horas_trabajadas;
	Escribir 'A cuánto te pagan la hora?';
	Leer pago_hora;
	Si (horas_trabajadas<=40) Entonces
		salario <- (horas_trabajadas*pago_hora);
	SiNo
		horas_extra <- (horas_trabajadas-40);
		salario <- (horas_trabajadas*pago_hora)+(horas_extra*pago_hora);
	FinSi
	Escribir 'Tu salario semanal es de:', salario;
FinProceso
