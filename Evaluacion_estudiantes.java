
    void main (){
    float suma = 0;
    float promedio;
    String nombre = IO.readln("Dame tu nombre ");
    int TOTAL_CALIFICACIONES = 4;
    float[] calificaciones = new float[TOTAL_CALIFICACIONES];

    calificaciones[0] = Float.parseFloat(IO.readln("Dame tu calificación uno "));
    calificaciones[1] = Float.parseFloat(IO.readln("Dame tu calificación dos "));
    calificaciones[2] = Float.parseFloat(IO.readln("Dame tu calificación tres "));
    calificaciones[3] = Float.parseFloat(IO.readln("Dame tu calificación cuatro "));
    suma = calificaciones[0]+calificaciones[1]+calificaciones[2]+calificaciones[3];
    promedio = suma / TOTAL_CALIFICACIONES;
    IO.println("Oye " + nombre + "," + "tu promedio es: "+ promedio);
    if(promedio<6.0)
        IO.println("Rezagado");
    else if (promedio>=6.0 && promedio<8.0)
        IO.println("Aprobado");
    else if (promedio>=8.0&&promedio<9.0)
        IO.println("Buen desempeño");
    else if (promedio>=9.0&&promedio<=10.0)
        IO.println("Excelencia académica");
    if(promedio>=9.0&&calificaciones[0]>=8.0&&calificaciones[1]>=8.0&&calificaciones[2]>=8.0&&calificaciones[3]>=8.0)
     IO.println("Obtienes beca del 20% en tu inscripción del siguiente semestre");
     
    



    }  

