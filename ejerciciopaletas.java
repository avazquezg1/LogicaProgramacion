import java.util.Scanner;

public class ejerciciopaletas {
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        String[] nombres = {"fresa", "limón", "coco"};
        double[] precios = {15.0, 12.0, 18.0};
        int paletas_vendidas =0;
        double dinero_ganado =0.0;
        int total_dias = 2;
        for(int dia=1; dia<=total_dias; dia++){
            System.out.println("Día"+ dia);
            for(int i=0; i<nombres.length; i++){
                System.out.println("Cantidad vendida de " + nombres[i] + ":");
                int cantidad = consola.nextInt();
                paletas_vendidas += cantidad;
                dinero_ganado += cantidad * precios[i];
                System.out.println("se vendieron " + cantidad + " paletas de " + nombres[i] + " a un precio de " + precios[i] + " cada una");
            }
        }
        System.out.println("Total de paletas que se vendieron: " + paletas_vendidas);
        System.out.println("Dinero recaudado: " + dinero_ganado);
        consola.close();
        
    
    }
}