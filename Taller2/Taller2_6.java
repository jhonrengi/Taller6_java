import java.util.Scanner;

public class Taller2_6 {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        Scanner dato2 = new Scanner(System.in);
        Scanner dato3 = new Scanner(System.in);
        int opcion = 0;
        int opcion2 = 0;
        int opcion3 = 0;
        int numero = 0;
        int acuerdo = 0;
        int encuesta = 0;
        String nombre = "", modelo = "",novedad2 = "", servicio = "";
        boolean novedad = false;


        System.out.println("Bienvenido al taller EL MAQUINISTA, porfavor seleccione alguna de las siguientes opciones: ");
        System.out.println("1. Registrar entrada de moto.");
        System.out.println("2. Registrar salida de moto.");
        System.out.println("3. Salir");
        opcion = dato.nextInt();

        switch (opcion) {
            case 1:{
                System.out.println("####################### Registro de entrada #######################");
                System.out.println(" ");
                System.out.println("Bienvenido , a continuacion observara un menu con los servicios que presta el taller, porfavor, seleccione el que necesita.");
                System.out.println("1. Matenimiento");
                System.out.println("2. Lavado total");
                System.out.println("3. Salir");
                opcion2 = dato.nextInt();

                switch (opcion2) {

                    case 1:{
                        System.out.println(" ");
                        System.out.println("######### Mantenimiento #########");
                        System.out.println("Porfavor digite su nombre completo: ");
                        nombre = dato2.nextLine();
                        System.out.println("Porfavor digite el modelo de su moto: ");
                        modelo = dato2.nextLine();
                        System.out.println("Tiene alguna novedad que desee exponerele al mecanico? ");
                        System.out.println("Si es asi, digite true, si no, false");
                        novedad = dato2.nextBoolean();

                        if (novedad == true){

                            System.out.println("¿Cual es la novedad?, porfavor digitela");
                            novedad2 = dato3.nextLine();
                            System.out.println("se ha registrado la sigiente informacion: ");
                            System.out.println(" ");
                            System.out.println("Usuario: "+ nombre);
                            System.out.println("Modelo de la moto: " + modelo);
                            System.out.println("Novedad: " + novedad2);
                            System.out.println(" ");
                            System.out.println("El servicio de mantenimineto tiene un cobro de #### pesos, ¿esta de acuerdo?");
                            System.out.println("1.Si");
                            System.out.println("2.No");
                            acuerdo = dato3.nextInt();
                            if (acuerdo == 1){

                                System.out.println("Gracias por su compra, porfavor digite su numero de contacto para que el mecanico se comunique con usted una vez este lista su moto: ");
                                numero = dato.nextInt();
                                System.out.println("El mecanico se comunicara con usted por el siguiente numero de contacto: " + numero);
                            }else if(acuerdo == 2){
                                System.out.println("Gracias por su tiempo, que tenga un buen dia.");
                            }else{
                                System.out.println("Opcion invalida");
                            }
                        }else if (novedad == false){
                            System.out.println("se ha registrado la sigiente informacion: ");
                            System.out.println("Usuario: " + nombre);
                            System.out.println("Modelo de la moto: " + modelo);
                            System.out.println("novedad: no presenta");
                            System.out.println("");
                            System.out.println("El servicio de mantenimiento tiene un cobro de #### pesos, ¿esta de acuerdo?");
                            System.out.println("1.Si");
                            System.out.println("2.No");
                            acuerdo = dato.nextInt();

                            if (acuerdo == 1){

                                System.out.println("Gracias por su compra, porfavor digite su numero de contacto para que el mecanico se comunique con usted una vez este lista su moto: ");
                                numero = dato.nextInt();
                                System.out.println("El mecanico se comunicara con usted por el siguiente numero de contacto: "+numero);
                            }else if(acuerdo == 2){
                                System.out.println("Gracias por su tiempo, que tenga un buen dia.");
                            }else{
                                System.out.println("Opcion invalida");
                            }
                        }
                        
                        break;
                    }
                    case 2:{

                        System.out.println("######### Lavado total #########");
                        System.out.println("El servicio de lavado, cuenta con la la impieza total de la moto, incluyendo llanta, rines y tecnologia.");
                        System.out.println("");
                        System.out.println("Porfavor digite su nombre completo: ");
                        nombre = dato.nextLine();
                        System.out.println("Porfavor digite el modelo de su moto: ");
                        modelo = dato.nextLine();
                        System.out.println("Tiene alguna novenad que desee exponerele al mecanico? ");
                        System.out.println("Si es asi, digite 1, si no, oprima 0");
                        novedad = dato.nextBoolean();

                        if (novedad == true){
                            System.out.println("¿Cual es la novedad?, porfavor digitela");
                            novedad2 = dato.nextLine();
                            System.out.println("se ha registrado la sigiente informacion: ");
                            System.out.println("Usuario: "+nombre);
                            System.out.println("se ha registrado la sigiente informacion: "+modelo);
                            System.out.println("se ha registrado la sigiente informacion: "+novedad2);
                            System.out.println("");
                            System.out.println("El servicio de lavado tiene un cobro de #### pesos, ¿esta de acuerdo?");
                            System.out.println("1.Si");
                            System.out.println("2.No");
                            acuerdo = dato.nextInt();

                            if (acuerdo == 1){

                                System.out.println("Gracias por su compra, porfavor digite su numero de contacto para que el mecanico se comunique con usted una vez este lista su moto: ");
                                numero = dato.nextInt();
                                System.out.println("El mecanico se comunicara con usted por el siguiente numero de contacto: "+numero);
                            }else if(acuerdo == 2){
                                System.out.println("Gracias por su tiempo, que tenga un buen dia.");
                            }else{
                                System.out.println("Opcion invalida");
                            }
                        }else if (novedad == false){
                            System.out.println("se ha registrado la sigiente informacion: ");
                            System.out.println("Usuario: "+nombre);
                            System.out.println("se ha registrado la sigiente informacion: "+modelo);
                            System.out.println("se ha registrado la sigiente informacion: "+novedad2);
                            System.out.println("");
                            System.out.println("El servicio de lavado tiene un cobro de #### pesos, ¿esta de acuerdo?");
                            System.out.println("1.Si");
                            System.out.println("2.No");
                            acuerdo = dato.nextInt();

                            if (acuerdo == 1){

                                System.out.println("Gracias por su compra, porfavor digite su numero de contacto para que el mecanico se comunique con usted una vez este lista su moto: ");
                                numero = dato.nextInt();
                                System.out.println("El mecanico se comunicara con usted por el siguiente numero de contacto: "+numero);
                            }else if(acuerdo == 2){
                                System.out.println("Gracias por su tiempo, que tenga un buen dia.");
                            }else{
                                System.out.println("Opcion invalida");
                            }
                        }
                        break;
                    }
                    
                }
                
                break;
            }
            
            case 2:{
                System.out.println("####################### Registro de salida #######################");
                System.out.println("Porfavor digite su nombre completo");
                nombre = dato2.nextLine();
                System.out.println("Porfavor digite el modelo de su vehiculo");
                modelo = dato2.nextLine();
                System.out.println("Digite el servicio que ha recibido:");
                System.out.println("1.Mantenimiento");
                System.out.println("2.Lavado total");
                System.out.println("3.Ninguno");
                opcion3 = dato2.nextInt();
                
                switch (opcion3) {
                    case 1:{
                        System.out.println("¿Que tal le ha parecido el serivico?");
                        System.out.println("1.Excelente");
                        System.out.println("2.Malo");
                        encuesta = dato2.nextInt();

                        if (encuesta==1){
                            System.out.println("Nos hace muy feliz saber que tuvo un excelente servicio, gracias por preferirnos, que tenga un excelente dia");
                        }else if (encuesta == 2){
                            System.out.println("¿Cual es el motivo por el que siente haber tenido un mal serivicio?: ");
                            servicio = dato3.nextLine();
                            System.out.println("Su informacion es vital para poder mejorar nuestros serivicos, le agradecemos por su paciencia");
                            System.out.println("Se ha guardado la siguiente informacion: "+servicio);
                            System.out.println("Le pedimos disculpas por no haber tenido un buen servicio, que tenga un excelente dia.");
                        }
                        
                        break;
                    }
                    case 2:{
                        System.out.println("¿Que tal le ha parecido el serivico?");
                        System.out.println("1.Excelente");
                        System.out.println("2.Malo");
                        encuesta = dato2.nextInt();

                        if (encuesta==1){
                            System.out.println("Nos hace muy feliz saber que tuvo un excelente servicio, gracias por preferirnos, que tenga un excelente dia");
                        }else if (encuesta == 2){
                            System.out.println("¿Cual es el motivo por el que siente haber tenido un mal serivicio?: ");
                            servicio = dato3.nextLine();
                            System.out.println("Su informacion es vital para poder mejorar nuestros serivicos, le agradecemos por su paciencia");
                            System.out.println("Se ha guardado la siguiente informacion: "+servicio);
                            System.out.println("Le pedimos disculpas por no haber tenido un buen servicio, que tenga un excelente dia.");
                        }
                        
                        break;

                    }
                    case 3:{
                        System.out.println("Opcion invalida");
                        
                    }
                        
                }
                
                
                break;
            }

            case 3:{
                
                System.out.println("Saliendo del programa");
               
                break;
                
               
            }

        }
    }
}
