Proceso Matrices
	Definir matriza Como Entero;
	Definir NFA, NCA, NFB, NCB, i, j, k como entero;
	Escribir "Cuántas filas tiene tu matriz A";
	Leer NFA;
	Escribir "Cuántas columnas tiene tu matriz A";
	Leer NCA;
	Escribir "Cuántas filas tiene tu matriz B";
	Leer NFB;
	Escribir "Cuántas columnas tiene tu matriz B";
	Leer NCB;

	Si NCA == NFB Entonces
		Escribir "Tus matrices se pueden multiplicar";
		Escribir "";
		Escribir "-----Aquí ingresarás los datos de tu Matriz A-----"
		Dimensionar matriza(NFA,NCA);
		Dimensionar matrizb(NFB, NCB);
		Dimensionar matrizc(NFC, NCC);
		Para i <- 1 Hasta NFA Hacer
		Para j<-1 Hasta NCA Hacer
			Escribir "Ingresa el valor de: A ( ",i, ",", j, ")";
			Leer matriza(i,j);
			FinPara
		FinPara
		
		Escribir "";
		Escribir "-----Aquí ingresarás los datos de tu Matriz B-----";
		Escribir "";
		Para i<-1 Hasta NFB Hacer
			Para j<-1 Hasta NCB Hacer
				Escribir "Ingresa el valor de: B ( ",i, ",", j, " )";
				Leer matrizb(i,j);
			FinPara
		FinPara
		
		Escribir "";
		Para i<-1 Hasta NFA Hacer
			Para j<-1 Hasta NCB Hacer
				matrizc(i,j)<-0;
				Para k<-1 Hasta NCA Hacer
					matrizc(i,j)<- matrizc(i,j) + (matriza(i,k) * matrizb(k,j));
				FinPara
			FinPara
		FinPara
		
		Escribir "-----Matriz resultante-----";
		Para i<-1 Hasta NFA Hacer
			Para j<-1 Hasta NCB Hacer
				Escribir Sin Saltar matrizc(i,j)," ";
			FinPara
			Escribir "";
		FinPara
	SiNo
		Escribir "Tus matrices no se pueden multiplicar, el número de filas de la primera matriz debe ser igual al número de filas de la segunda matriz";
	FinSi
	
FinProceso
