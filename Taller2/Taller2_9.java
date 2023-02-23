import java.util.Scanner;

public class Taller2_9 {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        Scanner dato3 = new Scanner(System.in);
        int opcion = 0;
        double base = 0, altura = 0,base2 = 0;
        double area_Rec,area_Trian;
       
     

        System.out.println(" ");
        System.out.println("########################## Aplicacion para calcular el area de figura geometricas ##########################");
        System.out.println(" ");
        System.out.println("Seleccione la figura a la que le desea hallar el area: ");
        System.out.println("1.Rectangulo");
        System.out.println("2.Triangulo ");
        System.out.println("3.Trapecio ");
        System.out.println("4.Salir ");
        opcion = dato.nextInt();

        switch (opcion) {
            case 1:{
                System.out.println("####################### Rectangulo #######################");
                System.out.println(" ");
                System.out.println("Para hallar el valor del area del rectangulo, se hace uso de la siguiente formula:");
                System.out.println("");
                System.out.println("Area rectangulo = Base * Altura");
                System.out.println("");
                System.out.println("Entendido esto, hallar el area de un rectangulo");
                System.out.println("");
                System.out.println("Escriba el valor de la base: ");
                base = dato3.nextDouble();
                System.out.println("Escriba el valor de la altura: ");
                System.out.println("");
                altura = dato3.nextDouble();
                area_Rec = base*altura;
                System.out.println("");
                System.out.println("El valor del area del rectangulo es: " + area_Rec);


                
                break;

            }
                  
            case 2:{

                System.out.println("####################### Triangulo #######################");
                System.out.println(" ");
                System.out.println("Para hallar el valor del area del Triangulo, se hace uso de la siguiente formula:");
                System.out.println("");
                System.out.println("Area triangulo = (Base * Altura)/2");
                System.out.println("");
                System.out.println("Entendido esto, hallar el area de un rectangulo");
                System.out.println("");
                System.out.println("Escriba el valor de la base: ");
                base = dato3.nextDouble();
                System.out.println("");
                System.out.println("Escriba el valor de la altura: ");
                System.out.println("");
                altura = dato3.nextDouble();
                area_Trian = (base*altura)/2;
                System.out.println("");
                System.out.println("El valor del area del triangulo es: " + area_Trian);
                
                break;

            }

            case 3:{
                
                System.out.println("####################### Trapecio #######################");
                System.out.println(" ");
                System.out.println("Para hallar el valor del area del Trapecio, se hace uso de la siguiente formula:");
                System.out.println("");
                System.out.println("Area trapecio = ((Base1 + Base2)/2)* h");
                System.out.println("");
                System.out.println("Entendido esto, hallar el area de un trapecio");
                System.out.println("");
                System.out.println("Escriba el valor de la base: ");
                base = dato3.nextDouble();
                System.out.println("");
                System.out.println("Escriba el valor de la base2: ");
                base2 = dato3.nextDouble();
                System.out.println("Escriba el valor de la altura: ");
                System.out.println("");
                altura = dato3.nextDouble();
                area_Trian = ((base+base2)/2)*altura;
                System.out.println("");
                System.out.println("El valor del area del triangulo es: " + area_Trian);
                
                break;
            }
            default:{
                System.out.println("Opcion invalida, porfavor reinicie");
            }
         
            
        }
    }
}     


    
    
