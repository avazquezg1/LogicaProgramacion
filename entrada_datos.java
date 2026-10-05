
import java.util.Scanner;

public class entrada_datos {
    public static void main(String[] ars)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre1 = scan.nextLine();
        System.out.println("Tu nombre es: "+ nombre1);
        scan.close();
    }
    
}

class entrada_datos1 {
    public static void main (String[] args) {
        IO.println("Hola, buen día!");
        String nombre2 = IO.readln("Escribe tu nombre: ");
        IO.println("Tu nombre es: "+nombre2);
    }
}