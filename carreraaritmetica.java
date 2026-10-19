import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class carreraaritmetica {
    public static void main(String[] args) {
        int numero_en = 25;
        Scanner consola = new Scanner (System.in);
        System.out.println("Dame el número de mes en que naciste (1-12): ");
        int mes = consola.nextInt();
        //Etapa 1: promedio de 5 números
        System.out.println("Etapa 1: Dame 5 números enteros para calcular su promedio");
        List<Integer> numeros = new ArrayList<>();
        for (int i =0; i<5; i++){
            System.out.println("Dame el número " + (i+1) + ": ");
            int numero = consola.nextInt();
            numeros.add(numero);
        }
        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        double etapa1 = 0;
        double promedio = (double) suma / numeros.size();
        etapa1 = numero_en + promedio;
        System.out.println("El resultado de la etapa 1 es: " + etapa1);
        //Etapa 2: residuo de entrada % 7
        System.out.println("Etapa 2: Calculando el residuo de la etapa 1 % 7");
        double etapa2 = 0;
        double residuo = etapa1 % 7;
        etapa2 = etapa1 + residuo;
        System.out.println("El resultado de la etapa 2 es: " + etapa2);
        //Etapa 3: Porcentaje 12%
        System.out.println("Etapa 3: Calculando el 12% de la etapa 2");
        double etapa3 = 0;
        etapa3 = etapa2 + (etapa2 * 0.12);
        System.out.println("El resultado de la etapa 3 es: " + etapa3);
        //Etapa 4: Suma "N" de valores enteros
        System.out.println("Etapa 4: Suma de valores enteros");
        double etapa4 = 0;
        List<Integer> valores = new ArrayList<>();
        while (true) {
            System.out.println("Dame un valor entero (Presiona 0 para finalizar): ");
            int valor = consola.nextInt();
            if(valor ==0) {
                break;
            }
            valores.add(valor);
        }
        for (int v : valores) {
            etapa4 += v;
        }
        etapa4 += etapa3;
        System.out.println("El resultado de la etapa 4 es: " + etapa4);
    //Etapa 5: Elige un divisor (1-9)
    System.out.println("Etapa 5: Elige un divisor (1-9)");
        double etapa5 = 0;
        System.out.println("Dame un número divisor del 1 al 9: ");
        int divisor = consola.nextInt();
        if(divisor<1 || divisor>9) {
            System.out.println("El divisor no es válido, intenta con otro número");
        }
        else{
            etapa5 = etapa4 / divisor;
            System.out.println("El resultado de la etapa 5 es: " + etapa5);
        }
    int tipo_mes;

    tipo_mes = (mes % 2 == 0) ? 1 : 2;

    switch (tipo_mes) {
        case 1:
            System.out.println("El mes es par");
            int dato_entero = (int) etapa5;
            System.out.println("El dato entero es: " + dato_entero);
            break;
        case 2:
            System.out.println("El mes es impar");
            System.out.printf("El dato decimal es: %.4f%n", etapa5 % 1);
            break;
        default:
            System.out.println("Error: tipo de mes desconocido");
            break;
        }
    }
}
    
