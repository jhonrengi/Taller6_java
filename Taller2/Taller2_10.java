import java.util.Scanner;

public class Taller2_10 {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        Scanner dato3 = new Scanner(System.in);
        int opcion = 0;
        double cantidad = 0, valor  = 0, retiro = 0;
        String usuario = "";
       
     

        System.out.println(" ");
        System.out.println("Bienvenido a SU BANCO FIEL, porfavor ingrese el nombre del titular: ");
        System.out.println(" ");
        usuario = dato.nextLine();
        System.out.println("Digite la cantidad que tiene guardada en su cuenta:");
        cantidad = dato.nextDouble();
        System.out.println(" ");
        System.out.println("Muchas gracias, porfavor seleccione alguna de las siguientes opciones: ");
        System.out.println("1.Ingresar dinero");
        System.out.println("2.Retiros");
        System.out.println("3.Consultar saldo actual");
        System.out.println("4.Salir");
        opcion = dato.nextInt();

        switch (opcion) {
            case 1:{
                System.out.println("########### Ingresar dinero ###########");
                System.out.println(" ");
                System.out.println("Porfavor ingrese el valor que va a depositar, no puede ser un valor negativo");
                System.out.println("");
                valor = dato3.nextDouble();
                
                if (valor == 0){
                    System.out.println("Opcion invalida, el valor debe ser mayor que 0");
                    System.out.println(" ");
                }else if (valor >0){
                    cantidad = cantidad + valor;
                    System.out.println("Se ha registrado correctamente el valor ingresado, su saldo actual es: " + cantidad);
                    System.out.println("Que tenga un buen dia ");
                }else{
                    System.out.println("Opcion invalida, el valor debe ser mayor que 0");
                }


                
                break;

            }
                  
            case 2:{

                System.out.println("########### Retiros ###########");
                System.out.println("Porfavor ingrese el valor que desea retirar");
                retiro = dato.nextDouble();

                if (retiro == 0){
                    System.out.println("Opcion invalida, el valor debe ser mayor que 0");
                    System.out.println(" ");
                }else if (retiro>0){
                    cantidad = cantidad -retiro;
                    System.out.println("Se ha registrado correctamente el valor retirado, su saldo actual es: " + cantidad);
                    System.out.println("Que tenga un buen dia ");
                }else{
                    System.out.println("Opcion invalida, el valor debe ser mayor que 0");
                }
                    
                
                break;

            }

            case 3:{
                
                System.out.println("########### Consultar saldo actual ###########");
                System.out.println("Como no se le ha generado ningun cobro y no ha realizado ningun retiro, su saldo actual es: "+ cantidad);
                
                break;
            }
            default:{
                System.out.println("Saliendo del programa");
            }
         
            
        }
    }
}     
