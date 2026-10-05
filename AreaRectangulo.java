public class AreaRectangulo {
    void main(){
        double base = Double.parseDouble(IO.readln("Dame la base:"));
        double altura = Double.parseDouble(IO.readln("Dame la altura:"));
        double area = base*altura;
        IO.println("El area es:"+area);
    }
    
}
