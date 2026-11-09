import java.util.Scanner;

public class vta_vivero{
    public static void main(String[] args) {
        //Datos de entrada
        Scanner scanner = new Scanner (System.in);
        String[] dias = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado"};
        String[] productos = {"Cactus", "Suculeta", "Maceta", "Tierra", "Fertilizante"};
        double[] precios = {45.5, 35.5, 60, 80, 95};
        double[][] matrizVentas = new double[dias.length][productos.length];
        double unidades_vendidas = 0;
        double monto_venta = 0;
        //Registro de unidades vendidas
        System.out.println("----------ingreso de unidades vendidas----------");
            for (int i=0; i< dias.length; i++){
                System.out.println("Día: " + dias[i]);
                for (int j=0; j< productos.length; j++){
                    System.out.print("Unidades vendidas de " + productos[j] + ": ");
                    double unidades = scanner.nextDouble();
                    unidades_vendidas += unidades;
                    double montoActual = unidades * precios[j];
                    monto_venta += montoActual;
                    matrizVentas[i][j] = montoActual;
                }
            } 
        //Mostrar resultados
        System.out.println("\nEl total de unidades vendidas es: " + unidades_vendidas);
        System.out.println("\nEl monto total de ventas es: " + monto_venta);
        System.out.println("\n----------Matriz de ventas----------");
        System.out.printf("%-12s", "Día");
        for (String producto : productos) {
            System.out.printf("%-12s", producto);
        }
        System.out.println();
        for (int i = 0; i < matrizVentas.length; i++) {
            System.out.printf("%-12s", dias[i]);
            for (int j = 0; j < matrizVentas[i].length; j++) {
                System.out.printf("%-12.1f", matrizVentas[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n----------Total de ventas por producto----------");
        for (int j = 0; j < productos.length; j++) {
            double totalProducto = 0;
            for (int i = 0; i < dias.length; i++) {
                totalProducto += matrizVentas[i][j];
            }
            System.out.printf("Total de ventas de %s: %.1f\n", productos[j], totalProducto);
        }
    }
}
