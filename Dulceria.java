import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dulceria {
public static void main(String[] args) {
    // 1. Inicialización del sistema
        try (Scanner consola = new Scanner(System.in)) {
        String[] productos = new String[4];
        productos[0] = "Chocolate";
        productos[1] = "Paleta";
        productos[2] = "Gomitas";
        productos[3] = "Galletas";
        int[] precios = new int[4];
        precios[0] = 18;
        precios[1] = 12;
        precios[2] = 25;
        precios[3] = 15;
        int[] unidadesVendidas = new int[productos.length];
        int[] ingresosPorProducto = new int[productos.length];
        List<String> clientes = new ArrayList<>();
        // 2. Registro de ventas
        String registrarOtraVenta = "s";
        while (registrarOtraVenta.equalsIgnoreCase("s")) {
            System.out.print("\nIngrese el nombre del cliente: ");
            String cliente = consola.next();
            clientes.add(cliente);
            int totalCliente = 0;
            String agregarProducto;
            do {
                System.out.println("\nProductos disponibles:");
                for (int i = 0; i < productos.length; i++) {
                    System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
                }
                int codigo;
                do {
                    System.out.print("Seleccione el código del producto (1-4): ");
                    codigo = consola.nextInt();
                } while (codigo < 1 || codigo > 4);
                String producto = null;
                int precio = 0;
                switch (codigo) {
                    case 1:
                        producto = productos[0];
                        precio = precios[0];
                        break;
                    case 2:
                        producto = productos[1];
                        precio = precios[1];
                        break;
                    case 3:
                        producto = productos[2];
                        precio = precios[2];
                        break;
                    case 4:
                        producto = productos[3];
                        precio = precios[3];
                        break;
                    default:
                        System.out.println("Código de producto inválido");
                }
                int cantidad;
                do {
                    System.out.print("Ingrese la cantidad del producto que desea comprar (mayor que 0): ");
                    cantidad = consola.nextInt();
                } while (cantidad <= 0);
                int importe = precio * cantidad;
                totalCliente += importe;
                unidadesVendidas[codigo - 1] += cantidad;
                ingresosPorProducto[codigo - 1] += importe;
                System.out.println(cliente + " compró " + cantidad + " " + producto
                        + ". Precio unitario: $" + precio + ". Importe: $" + importe);
                System.out.print("¿Desea agregar otro producto? (s/n): ");
                agregarProducto = consola.next();
            } while (agregarProducto.equalsIgnoreCase("s"));
            System.out.println("Total de la compra de " + cliente + ": $" + totalCliente);
            System.out.print("¿Desea registrar otra venta? (s/n): ");
            registrarOtraVenta = consola.next();
        }

        //Reporte de productos vendidos
        System.out.println("\nResumen de productos vendidos:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": precio unitario $" + precios[i] + ", "+ unidadesVendidas[i]+ " unidades vendidas, ingresos: $" + ingresosPorProducto[i]);
        }
    //Reporte final (Mostrar cantidad de clientes atendidos, Lista con los nombres de los clientes, Cantidad totalde venta de cada tipo de producto, Promedio de venta por cliente)
        int totalClientes = clientes.size();
        System.out.println("\nCantidad de clientes atendidos: " + totalClientes);
        System.out.println("Lista de clientes atendidos:");
        for (String cliente : clientes) {
            System.out.println(cliente);
        }
        System.out.println("Cantidad total de venta por tipo de producto:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": " + unidadesVendidas[i] + " unidades vendidas, ingresos: $" + ingresosPorProducto[i]);
        }
        double promedioVentaPorCliente = 0;
        if (totalClientes > 0) {
            int totalIngresos = 0;
            for (int ingreso : ingresosPorProducto) {
                totalIngresos += ingreso;
            }
            promedioVentaPorCliente = (double) totalIngresos / totalClientes;
            System.out.println("El total de ingresos fue de: $"+ totalIngresos);
        }
        System.out.println("Promedio de venta por cliente: $" + promedioVentaPorCliente);
        }
    }
}
    
