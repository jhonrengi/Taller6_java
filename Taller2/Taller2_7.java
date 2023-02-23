import java.util.Scanner;

public class Taller2_7 {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        Scanner dato2 = new Scanner(System.in);
        double peso_bajo = 0, peso_alto = 0, peso_malto = 0, peso_dalto = 0;
        double peso_bajo2 = 0, peso_alto2 = 0, peso_malto2 = 0, peso_dalto2 = 0;
        double peso_bajo3 = 0, peso_alto3 = 0, peso_malto3 = 0, peso_dalto3 = 0;
        int numero_per = 0;
        double peso = 0,peso2 = 0,peso3 = 0;
        double estatura = 0,estatura2 = 0,estatura3 = 0;
        double IMC = 0, IMC2=0, IMC3 = 0;

        String nombre = "", nombre2 = "",nombre3 = "";

        System.out.println(" ");
        System.out.println("Aplicacion para calcular el indice de masa corporal (IMC).");
        System.out.println(" ");
        System.out.println("Porfavor digite el numero de personas que haran la encuesta: ");
        numero_per = dato.nextInt();

        switch (numero_per) {
            case 1:{
                System.out.println("####################### Registro de usuario #######################");
                System.out.println(" ");
                System.out.println("Porfavor digite el nombre completo");
                nombre = dato2.nextLine();
                System.out.println("Digite el peso exacto (En kilogramos, utilice coma si es un decimal) ");
                peso = dato2.nextDouble();
                System.out.println("Digite la estatura (En Metros, utilice coma si es un decimal) ");
                estatura = dato2.nextDouble();
                IMC = peso/Math.pow(estatura,2);
                peso_bajo = 24.9 - IMC;
                peso_alto = IMC - 24.9;
                peso_malto = IMC - 24.9;
                peso_dalto = (34.9-IMC)*(-1);
                
                if (IMC > 16 && IMC<18.4){
                    System.out.println(nombre+" Segun su indice de masa corporal "+ IMC + " Usted esta por debajo del peso saludable, especificamente "+peso_bajo+" puntos del peso ideal");

                }else if (IMC > 18.401 && IMC<=24.9){
                    System.out.println(nombre+" Segun su indice de masa corporal "+ IMC + " Usted se encuentra dentro del rango del peso ideal o normal ");
                }else if (IMC > 24.901 && IMC<=29.9){
                    System.out.println(nombre+" Segun su indice de masa corporal "+ IMC + " Usted esta por encima del peso saludable , especificamente "+peso_alto+" puntos del peso ideal");
                }else if (IMC > 29.901 && IMC<=34.9){
                    System.out.println(nombre+" Segun su indice de masa corporal "+ IMC + " Usted esta por encima del SOBRE PESO, lo que significa que se encuentra en estado de obesidad y esta especificamente  "+ peso_malto +" puntos encima del peso ideal.");
                }else if(IMC > 34.901){
                    System.out.println(nombre+" Segun su indice de masa corporal "+ IMC + " Usted esta por encima del SOBRE PESO, lo que significa que se encuentra en estado de obesidad o obesidad morbida y esta especificamente "+ peso_dalto +" puntos encima del peso ideal.");
                }
                break;

            }
                  
            case 2:{
                System.out.println("####################### Registro de usuario #######################");
                System.out.println(" ");
                System.out.println("Porfavor digite el nombre completo de la PRIMERA persona: ");
                System.out.println(" ");
                nombre = dato2.nextLine();
                System.out.println("Porfavor digite el nombre completo de la SEGUNDA persona: ");
                System.out.println(" ");
                nombre2 = dato2.nextLine();
                System.out.println("Digite el peso exacto (En kilogramos, utilice coma si es un decimal) de la PRIMERA persona");
                System.out.println(" ");
                peso = dato2.nextDouble();
                System.out.println("Digite el peso exacto (En kilogramos, utilice coma si es un decimal) de la SEGUNDA persona");
                System.out.println(" ");
                peso2 = dato2.nextDouble();
                System.out.println("Digite la estatura (En Metros, utilice coma si es un decimal) de la PRIMERA persona ");
                System.out.println(" ");
                estatura = dato2.nextDouble();
                System.out.println("Digite la estatura (En Metros, utilice coma si es un decimal) de la SEGUNDA persona ");
                System.out.println(" ");
                estatura2 = dato2.nextDouble();
                IMC = peso/Math.pow(estatura,2);
                IMC2 = peso2/Math.pow(estatura2,2);

                peso_bajo = 24.9 - IMC;
                peso_alto = IMC - 24.9;
                peso_malto = IMC - 24.9;
                peso_dalto = (34.9-IMC)*(-1);

                peso_bajo2 = 24.9 - IMC2;
                peso_alto2 = IMC2 - 24.9;
                peso_malto2 = IMC2 - 24.9;
                peso_dalto2 = (34.9-IMC2)*(-1);
                
                if ((IMC > 16 && IMC <= 18.4)){
                    System.out.println(nombre+" Segun su indice de masa corporal "+ IMC + " Usted esta por debajo del peso saludable, especificamente "+peso_bajo+" puntos del peso ideal");
                }else if ((IMC > 18.401 && IMC <=24.9)){
                    
                    System.out.println(nombre+" Segun su indice de masa corporal "+ IMC + " Usted se encuentra dentro del rango del peso ideal o normal "); 
                }else if ((IMC > 24.901 && IMC<=29.9)){
                    System.out.println(nombre+" Segun su indice de masa corporal "+ IMC + " Usted esta por encima del peso saludable , especificamente "+peso_alto+" puntos del peso ideal");
                }else if (IMC > 29.901 && IMC<=34.9){
                    System.out.println(nombre+" Segun su indice de masa corporal "+ IMC + " Usted esta por encima del SOBRE PESO, lo que significa que se encuentra en estado de obesidad y esta especificamente  "+ peso_malto +" puntos encima del peso ideal.");
                }else if(IMC > 34.901){
                    System.out.println(nombre+" Segun su indice de masa corporal "+ IMC + " Usted esta por encima del SOBRE PESO, lo que significa que se encuentra en estado de obesidad o obesidad morbida y esta especificamente "+ peso_dalto +" puntos encima del peso ideal.");
                }

                if (IMC2>16 && IMC2<18.4 ){
                    System.out.println(nombre2+" Segun su indice de masa corporal "+ IMC2 + " Usted esta por debajo del peso saludable, especificamente "+peso_bajo2+" puntos del peso ideal");

                }else if(IMC2 > 18.401 && IMC2 <=24.9) {
                    System.out.println(nombre2+" Segun su indice de masa corporal "+ IMC2 + " Usted se encuentra dentro del rango del peso ideal o normal ");
                }else if(IMC2 > 24.901 && IMC2 <= 29.9){
                    System.out.println(nombre2+" Segun su indice de masa corporal "+ IMC2 + " Usted esta por encima del peso saludable , especificamente "+peso_alto2 +" puntos del peso ideal");
                }else if(IMC2 > 29.901 && IMC2<=34.9){
                    System.out.println(nombre2+" Segun su indice de masa corporal "+ IMC2 + " Usted esta por encima del SOBRE PESO, lo que significa que se encuentra en estado de obesidad y esta especificamente  "+ peso_malto2 +" puntos encima del peso ideal.");
                }else if (IMC2 > 34.901){
                    System.out.println(nombre2+" Segun su indice de masa corporal "+ IMC2 + " Usted esta por encima del SOBRE PESO, lo que significa que se encuentra en estado de obesidad o obesidad morbida y esta especificamente "+ peso_dalto2 +" puntos encima del peso ideal.");
                }
                break;

            }

            case 3:{
                
                System.out.println("####################### Registro de usuario #######################");
                System.out.println(" ");
                System.out.println("Porfavor digite el nombre completo de la PRIMERA persona: ");
                nombre = dato2.nextLine();
                System.out.println("Porfavor digite el nombre completo de la SEGUNDA persona: ");
                nombre2 = dato2.nextLine();
                System.out.println("Porfavor digite el nombre completo de la TERCERA persona: ");
                nombre3 = dato2.nextLine();
                System.out.println("Digite el peso exacto (En kilogramos, utilice coma si es un decimal) de la PRIMERA persona");
                peso = dato2.nextDouble();
                System.out.println("Digite el peso exacto (En kilogramos, utilice coma si es un decimal) de la SEGUNDA persona");
                peso2 = dato2.nextDouble();
                System.out.println("Digite el peso exacto (En kilogramos, utilice coma si es un decimal) de la TERCERA persona");
                peso3 = dato2.nextDouble();
                System.out.println("Digite la estatura (En Metros, utilice coma si es un decimal) de la PRIMERA persona ");
                estatura = dato2.nextDouble();
                System.out.println("Digite la estatura (En Metros, utilice coma si es un decimal) de la SEGUNDA persona ");
                estatura2 = dato2.nextDouble();
                System.out.println("Digite la estatura (En Metros, utilice coma si es un decimal) de la TERCERA persona ");
                estatura3 = dato2.nextDouble();

                IMC = peso/Math.pow(estatura,2);
                IMC2 = peso2/Math.pow(estatura2,2);
                IMC3 = peso3/Math.pow(estatura3,2);

                peso_bajo = 24.9 - IMC;
                peso_alto = IMC - 24.9;
                peso_malto = IMC - 24.9;
                peso_dalto = (34.9-IMC)*(-1);

                peso_bajo2 = 24.9 - IMC2;
                peso_alto2 = IMC2 - 24.9;
                peso_malto2 = IMC2 - 24.9;
                peso_dalto2 = (34.9-IMC2)*(-1);

                peso_bajo3 = 24.9 - IMC3;
                peso_alto3 = IMC3 - 24.9;
                peso_malto3 = IMC3 - 24.9;
                peso_dalto3 = (34.9-IMC3)*(-1);
                
                if ((IMC > 16 && IMC <= 18.4)){
                    System.out.println(nombre+" Segun su indice de masa corporal "+ IMC + " Usted esta por debajo del peso saludable, especificamente "+peso_bajo+" puntos del peso ideal");
                }else if ((IMC > 18.401 && IMC <=24.9)){
                    
                    System.out.println(nombre+" Segun su indice de masa corporal "+ IMC + " Usted se encuentra dentro del rango del peso ideal o normal "); 
                }else if ((IMC > 24.901 && IMC<=29.9)){
                    System.out.println(nombre+" Segun su indice de masa corporal "+ IMC + " Usted esta por encima del peso saludable , especificamente "+peso_alto+" puntos del peso ideal");
                }else if (IMC > 29.901 && IMC<=34.9){
                    System.out.println(nombre+" Segun su indice de masa corporal "+ IMC + " Usted esta por encima del SOBRE PESO, lo que significa que se encuentra en estado de obesidad y esta especificamente  "+ peso_malto +" puntos encima del peso ideal.");
                }else if(IMC > 34.901){
                    System.out.println(nombre+" Segun su indice de masa corporal "+ IMC + " Usted esta por encima del SOBRE PESO, lo que significa que se encuentra en estado de obesidad o obesidad morbida y esta especificamente "+ peso_dalto +" puntos encima del peso ideal.");
                }

                if (IMC2>16 && IMC2<18.4 ){
                    System.out.println(nombre2+" Segun su indice de masa corporal "+ IMC2 + " Usted esta por debajo del peso saludable, especificamente "+peso_bajo2+" puntos del peso ideal");

                }else if(IMC2 > 18.401 && IMC2 <=24.9) {
                    System.out.println(nombre2+" Segun su indice de masa corporal "+ IMC2 + " Usted se encuentra dentro del rango del peso ideal o normal ");
                }else if(IMC2 > 24.901 && IMC2 <= 29.9){
                    System.out.println(nombre2+" Segun su indice de masa corporal "+ IMC2 + " Usted esta por encima del peso saludable , especificamente "+peso_alto2 +" puntos del peso ideal");
                }else if(IMC2 > 29.901 && IMC2<=34.9){
                    System.out.println(nombre2+" Segun su indice de masa corporal "+ IMC2 + " Usted esta por encima del SOBRE PESO, lo que significa que se encuentra en estado de obesidad y esta especificamente  "+ peso_malto2 +" puntos encima del peso ideal.");
                }else if (IMC2 > 34.901){
                    System.out.println(nombre2+" Segun su indice de masa corporal "+ IMC2 + " Usted esta por encima del SOBRE PESO, lo que significa que se encuentra en estado de obesidad o obesidad morbida y esta especificamente "+ peso_dalto2 +" puntos encima del peso ideal.");
                }


                if (IMC3>16 && IMC3<18.4 ){
                    System.out.println(nombre3+" Segun su indice de masa corporal "+ IMC3 + " Usted esta por debajo del peso saludable, especificamente "+peso_bajo3+" puntos del peso ideal");

                }else if(IMC3 > 18.401 && IMC3 <=24.9) {
                    System.out.println(nombre3+" Segun su indice de masa corporal "+ IMC3 + " Usted se encuentra dentro del rango del peso ideal o normal ");
                }else if(IMC3 > 24.901 && IMC3 <= 29.9){
                    System.out.println(nombre3+" Segun su indice de masa corporal "+ IMC3 + " Usted esta por encima del peso saludable , especificamente "+peso_alto3 +" puntos del peso ideal");
                }else if(IMC3 > 29.901 && IMC3<=34.9){
                    System.out.println(nombre3+" Segun su indice de masa corporal "+ IMC3 + " Usted esta por encima del SOBRE PESO, lo que significa que se encuentra en estado de obesidad y esta especificamente  "+ peso_malto3 +" puntos encima del peso ideal.");
                }else if (IMC3 > 34.901){
                    System.out.println(nombre3+" Segun su indice de masa corporal "+ IMC3 + " Usted esta por encima del SOBRE PESO, lo que significa que se encuentra en estado de obesidad o obesidad morbida y esta especificamente "+ peso_dalto3 +" puntos encima del peso ideal.");
                }
               
                break;
            }

            
        }
    }
}     


    
    
