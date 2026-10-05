public class imc {
    public static void main(String[]args){
        int personas= Integer.parseInt(IO.readln("Dime cuántas de cuántas personas quieres sacer el IMC: "));
        for (int i=1; i<=personas; i++){
        float peso= Float.parseFloat(IO.readln("Persona "+i+" ingresa tu peso en kilogramos: "));
        float estatura= Float.parseFloat(IO.readln("Persona "+i+" ingresa tu estatura en metros: "));
        float imc= peso/(estatura*estatura);
        IO.println("Tu IMC es: "+ imc);
        int categoria=0;
        if (imc<18.5){
           categoria=1;
        }else if(imc>=18.5&&imc<=24.9){
           categoria=2;
        }else if(imc>=25.0&&imc<=29.9){
            categoria=3;
        }else if(imc>=30.0&&imc<=34.9){
            categoria=4;        
        }else if(imc>=35.0&&imc<=39.9){ 
           categoria=5;
        }else if(imc>=40.0){
            categoria=6;
        }
        switch(categoria){
            case 1:
                 IO.println("Para la persona"+i+ " el rango de IMC es: Bajo peso");
                 IO.println("Se te recomienda aumentar tus calorías diarias y hacer ejercicio de fuerza");
                 break;
            case 2:
                 IO.println("Para la persona"+i+ " el rango de IMC es: Peso normal");
                 IO.println("Se te recomienda mantener tus hábitos alimenticios de forma equilibrada y hacer ejercicioal menos 30 minutos al día");
                 break;
            case 3:
                IO.println("Para la persona"+i+ " el rango de IMC es: Sobrepeso");
                IO.println("Se te recomienda reducir el consumo de azúcares, harinas y comida frita, también evita el sedentarismo y camina al menos 30 minutos diarios 5 veces por semana");
                break;
            case 4:
               IO.println("Para la persona"+i+ " el rango de IMC es: Obesidad grado 1");
               IO.println("Se te recomienda hacer un déficit calórico de entre 500 y 600 kcalorías diarias, así como realizar mínimo de 150 a 200 minutos de ejercicioa la semana");
               break;
            case 5:
               IO.println("Para la persona"+i+ " el rango de IMC es: Obesidad grado 2");
               IO.println("Se te recomienda hacer una dieta con un enfoque óptimo de proteínas de 1.5 a 1.8g de proteína por kilogramo de tu peso ideal, así como hacer un déficit calórico de entre 600 y 700 kcalorías diarias");
               break;
            case 6:
               IO.println("Para la persona"+i+ " el rango de IMC es: Obesidad grado 3");
               IO.println("Se te recomienda hacer una dieta con un consumo muy bajo de contenido calírico, haciendo así un déficit de entre 800 a 1000 kcalorías diarias, se te recomienda también asistir a un psicólogo para facilitar el acompañamiento durante el proceso y un fisioterapeuta para mejorar la movilidad sin riesgos de caídas o lesiones");
               break;
            default:
                IO.println("Error al calcular el rango de IMC, se te solicita revisar los datos que ingresaste");
                break;
        }
        }
        }
    }
