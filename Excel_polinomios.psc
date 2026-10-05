Proceso Excel_polinomios
	Definir grado, i Como Entero;
    Definir x_inicio, x_fin, paso_x, x, fx, fx_anterior, x_anterior, coef Como Real;
    Definir tolerancia, termino_independiente Como Real;
    Definir estado_actual, estado_anterior Como Entero;
    Definir inicio_tramo, fin_tramo Como Real;
    
    tolerancia <- 0.0001;
	
    Escribir "--- ANÁLISIS DE POLINOMIO GENERAL ---";
    Escribir "Ingrese el grado del polinomio (máximo 19):";
    Leer grado;
    
    Dimension coef[20];
    
    Escribir "";
    Escribir "Ingrese los coeficientes de mayor a menor exponente:";
    Para i <- 0 Hasta grado Hacer
        Si i < grado Entonces
            Escribir "Coeficiente de x^", (grado - i), ":";
        SiNo
            Escribir "Término independiente (constante):";
        FinSi;
        Leer coef[i];
    FinPara;
    
    termino_independiente <- coef[grado];
    
    Escribir "";
    Escribir "--- DOMINIO DE TABULACIÓN ---";
    Escribir "Valor inicial de x:";
    Leer x_inicio;
    Escribir "Valor final de x:";
    Leer x_fin;
    Escribir "Tamaño del paso (ej. 0.1):";
    Leer paso_x;
    
    Escribir "";
    Escribir "========================================";
    Escribir "          RESULTADOS DEL ANÁLISIS       ";
    Escribir "========================================";
    
    Escribir "Intersección con el eje Y: (0, ", termino_independiente, ")";
    Escribir "----------------------------------------";
    Escribir "RAÍCES Y TRAMOS DE LA FUNCIÓN:";
    
    x <- x_inicio;
    estado_anterior <- 0; 
    
    Mientras x <= (x_fin + tolerancia) Hacer
        
        fx <- 0;
        Para i <- 0 Hasta grado Hacer
            fx <- fx + (coef[i] * (x ^ (grado - i)));
        FinPara;
        
        Si abs(fx) <= tolerancia Entonces
            estado_actual <- 0; 
        SiNo
            Si fx > 0 Entonces
                estado_actual <- 1;
            SiNo
                estado_actual <- -1;
            FinSi;
        FinSi;
        
        Si estado_actual = 0 Entonces
            Escribir " -> Raíz real exacta en: x = ", x;
            estado_anterior <- 0;
        SiNo
            Si x = x_inicio Entonces
                inicio_tramo <- x;
                estado_anterior <- estado_actual;
            SiNo
                Si estado_actual <> estado_anterior Entonces
                    
                    Si estado_anterior = 1 Entonces
                        Escribir " -> Tramo positivo desde x = ", inicio_tramo, " hasta x = ", x_anterior;
                    SiNo
                        Si estado_anterior = -1 Entonces
                            Escribir " -> Tramo negativo desde x = ", inicio_tramo, " hasta x = ", x_anterior;
                        FinSi;
                    FinSi;
                    
                    Si estado_anterior <> 0 Y estado_actual <> 0 Entonces
                        Escribir " -> Raíz real estimada (cambio de signo) entre x = ", x_anterior, " y x = ", x;
                    FinSi;
                    
                    inicio_tramo <- x_anterior;
                    estado_anterior <- estado_actual;
                FinSi;
            FinSi;
        FinSi;
        
        x_anterior <- x;
        fx_anterior <- fx;
        x <- x + paso_x;
        
    FinMientras;
    
    Si estado_anterior = 1 Entonces
        Escribir " -> Tramo positivo desde x = ", inicio_tramo, " hasta x = ", x_anterior;
    SiNo
        Si estado_anterior = -1 Entonces
            Escribir " -> Tramo negativo desde x = ", inicio_tramo, " hasta x = ", x_anterior;
        FinSi;
    FinSi;
    
    Escribir "========================================";
            
	
FinProceso
