import java.util.ArrayList;
import java.util.Scanner;

public class ejercicioarreglo {
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        ArrayList <Integer> numeros = new ArrayList<>();
        System.out.println("Escribe 10 numeros enteros: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            int numero = consola.nextInt();
            numeros.add(numero);
        }
            int mayor = numeros.get(0);
            int menor = numeros.get(0);
            int posmayor = 0;
            int posmenor = 0;
           
            for(int i=1; i<numeros.size(); i++){
                int actual = numeros.get(i);
                if(actual > mayor){
                    mayor = actual;
                    posmayor = i;
                }
                if(actual< menor){
                    menor = actual;
                    posmenor = i;
                }
        }
        System.out.println("El número mayor es " + mayor + " y está en la posición " + posmayor);
        System.out.println("El número menor es " + menor + " y está en la posición " + posmenor);
    }
}
