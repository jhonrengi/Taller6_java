import java.util.Scanner;

public class Taller2_8 {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        Scanner dato2 = new Scanner(System.in);
        Scanner dato3 = new Scanner(System.in);
        int opcion = 0;
        double porcion = 0;
        String disponible1= "", disponible2= "", disponible3= "",disponible4= "",disponible5= "", ventas = "";
        String sabor = "", cantidad = "", decoracion = "";

        System.out.println(" ");
        System.out.println("Buen dia don CARLOS, ¿que desea realizar el dia hoy?");
        System.out.println(" ");
        System.out.println("1. Registrar pedidos");
        System.out.println("2. Registrar tortas disponibles");
        System.out.println("3. Registrar venta");
        System.out.println("4. Salir");
        opcion = dato.nextInt();

        switch (opcion) {
            case 1:{
                System.out.println("############ Registrar pedido ############");
                System.out.println(" ");
                System.out.println("Porfavor don carlos digite el sabor que sera la torta");
                sabor = dato2.nextLine();
                System.out.println("Porfavor don carlos digite la cantidad que tendra la torta (3/4, 1/4, 1/2 , 1 libra)");
                cantidad = dato2.nextLine();
                System.out.println("Ahora don carlos, digite el numero de porciones que tendra la torta");
                porcion = dato2.nextDouble();
                System.out.println("Por ultimo don carlos, digite la decoracion (tematica) que tendra la torta");
                decoracion = dato3.nextLine();
                System.out.println("");
                System.out.println("########### Registro de torta exitoso ########### ");
                System.out.println("");
                System.out.println("Se realizara la torta con las siguientes caracteristicas: ");
                System.out.println("");
                System.out.println("Sabor: "+ sabor);
                System.out.println("Cantidad: "+ cantidad);
                System.out.println("Porciones: "+ porcion);
                System.out.println("Decoracion: "+ decoracion);
                
                break;

            }
                  
            case 2:{
                System.out.println("############ Registrar tortas disponibles ############");
                System.out.println(" ");
                System.out.println("Porfavor don carlos, digite las tortas que tenga disponibles para la venta(maximo 5)");
                System.out.println("Torta 1:  ");
                disponible1 = dato3.nextLine();
                System.out.println("Torta 2:   ");
                disponible2 = dato3.nextLine();
                System.out.println("Torta 3:   ");
                disponible3 = dato3.nextLine();
                System.out.println("Torta 4:   ");
                disponible4 = dato3.nextLine();
                System.out.println("Torta 5:   ");
                disponible5 = dato3.nextLine();
                System.out.println(" ");
                System.out.println("Estan disponibles las siguientes tortas:  ");
                System.out.println("Torta 1: " + disponible1);
                System.out.println("Torta 2: " + disponible2);
                System.out.println("Torta 3: " + disponible3);
                System.out.println("Torta 4: " + disponible4);
                System.out.println("Torta 5: " + disponible5);
                break;

            }

            case 3:{
                
                System.out.println("############ Registrar venta ############");
                System.out.println("Porfavor don carlos, digite la ventas del dia.");
                ventas = dato3.nextLine();
                System.out.println("Se registran las siguientes ventas del dia: " + ventas);
                break;
            }
            default:{
                System.out.println("Seleccion erronea, porfavor reinicie el programa");
            }
         
            
        }
    }
}     


    
    
