Proceso Evaluacion_estudiante
	Definir nombre como cadena;
	Definir calificacion_uno, calificacion_dos, calificacion_tres, calificacion_cuatro, promedio, suma Como Real;
	suma<-0;
	Escribir "Dame tu nombre";
	Leer nombre;
	Escribir "Dame tu primera calificación";
	Leer calificacion_uno;
	suma<-suma+calificacion_uno;
	Escribir "Dame tu segunda calificación";
	Leer calificacion_dos;
	suma<-suma+calificacion_dos;
	Escribir "Dame tu tercera calificación";
	Leer calificacion_tres;
	suma<-suma+calificacion_tres;
	Escribir"Dame tu cuarta calificación";
	Leer calificacion_cuatro;
	suma<-suma+calificacion_cuatro;
	promedio<-suma/4;
	Si promedio<6.0 Entonces
		Escribir "Rezagado";
	FinSi
	Si (promedio >=6.0) Y (promedio <=7.9) Entonces
		Escribir "Aprobado";
	FinSi
	Si (promedio>=8.0) Y (promedio<=8.9) Entonces
		Escribir "Buen desempeño";
	FinSi
	Si promedio>=9.0 Entonces
		Escribir "Excelencia académica";
	FinSi

	Escribir "Tú:", nombre;
	Escribir "Tu promedio es de:", promedio;
	Si (promedio >=9.0) Y (calificacion_uno>=8.0) Y (calificacion_dos>=8.0) Y (calificacion_tres>=8.0) Y (calificacion_cuatro>=8.0) Entonces
		Escribir "Beca del 20% en inscripción del siguiente semestre";
	SiNo
		Escribir "Sin beca";
	FinSi
	
	
FinProceso
