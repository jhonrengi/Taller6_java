import java.lang.ref.Cleaner;
import java.util.Scanner;
public class Taller3_7 {
    

    public static void main(String[] args) {
        Scanner dato = new Scanner (System.in);
        Scanner dato2 = new Scanner (System.in);
        Scanner dato3 = new Scanner (System.in);
        Scanner dato4 = new Scanner (System.in);
        int opcion, contacto1=0,contacto2=0,contacto3=0,contacto4=0,contacto5=0;
        String nombre1 = "", placa1= "", modelo1="";
        String nombre2 = "", placa2= "", modelo2="";
        String nombre3 = "", placa3= "", modelo3="";
        String nombre4 = "", placa4= "", modelo4="";
        String nombre5 = "", placa5= "", modelo5="";
        boolean contacto_1 = false;
        boolean contacto_2 = false;
        boolean contacto_3 = false;
        boolean contacto_4 = false;
        boolean contacto_5 = false;
        int buscar, retirar;
        
        int cuantos = 0;

        boolean lista_contactos = false;
        boolean confirmar = false;

        
        do{
            System.out.println("Bienvenido al parqueadero EL GUARDIAN");
            System.out.println();
            System.out.println("porfavor seleccione alguna de las siguientes opciones: ");
            System.out.println("1.Ingresar al parqueadero");
            System.out.println("2.Consultar vehivulo");
            System.out.println("3.Retirar del parquedero");
            System.out.println("4.Salir");
            opcion = dato.nextInt();

            switch (opcion) {
                case 1:{
                    
                    System.out.println(" ");
                    System.out.println("¿Cuantos vehiculos desea ingresar? (maximo 5) ");
                    cuantos = dato2.nextInt();

                    switch (cuantos) {
                        case 1:{
                            System.out.println("Para que el vehiculo ingrese al parquedero , es necesario de los siguientes datos: ");
                            System.out.println("Digite el nombre completo del dueño del carro: ");
                            nombre1 = dato3.nextLine();
                            System.out.println("Digite su numero de contacto: ");
                            contacto1 = dato2.nextInt();
                            System.out.println("Digite el numero de la placa del vehiculo: ");
                            placa1 = dato3.nextLine();
                            System.out.println("Digite el modelo del vehiculo: ");
                            modelo1 = dato3.nextLine();
        
                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                            System.out.println("--------Numero de contacto: "+"                  "+ contacto1);
                            System.out.println("--------Placa del vehiculo: "+"                  "+ placa1);
                            System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo1);
                            System.out.println("----------------------------------------------");
                            lista_contactos =true;
                            contacto_1 = true;
                            break;
                        }    
                            
                        case 2:{
                            if (contacto_1==false){

                                System.out.println("Para que el vehiculo ingrese al parquedero , es necesario de los siguientes datos: ");
                                System.out.println("-----------------------Vehiculo 1--------------------------------");
                                System.out.println("Digite el nombre completo del dueño del carro: ");
                                nombre1 = dato3.nextLine();
                                System.out.println("Digite su numero de contacto: ");
                                contacto1 = dato2.nextInt();
                                System.out.println("Digite el numero de la placa del vehiculo: ");
                                placa1 = dato3.nextLine();
                                System.out.println("Digite el modelo del vehiculo: ");
                                modelo1 = dato3.nextLine();

                                System.out.println("");
                                System.out.println("-----------------------Vehiculo 2--------------------------------");
                                System.out.println("Digite el nombre completo del dueño del carro: ");
                                nombre2 = dato3.nextLine();
                                System.out.println("Digite su numero de contacto: ");
                                contacto2 = dato3.nextInt();
                                System.out.println("Digite el numero de la placa del vehiculo: ");
                                placa2 = dato4.nextLine();
                                System.out.println("Digite el modelo del vehiculo: ");
                                modelo2 = dato4.nextLine();

                                System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                                System.out.println("-----------------------Vehiculo 1--------------------------------");
                                System.out.println("----------------------------------------------");
                                System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                                System.out.println("--------Numero de contacto: "+"                  "+ contacto1);
                                System.out.println("--------Placa del vehiculo: "+"                  "+ placa1);
                                System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo1);
                                System.out.println("----------------------------------------------");

                                System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                                System.out.println("-----------------------Vehiculo 2--------------------------------");
                                System.out.println("----------------------------------------------");
                                System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                                System.out.println("--------Numero de contacto: "+"                  "+ contacto2);
                                System.out.println("--------Placa del vehiculo: "+"                  "+ placa2);
                                System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo2);
                                System.out.println("----------------------------------------------");

                                lista_contactos =true;
                                contacto_1 = true;
                                contacto_2 = true;
                            }else if(contacto_1==true){
                                System.out.println("Vehiculo 1 ya se encuentra registrado");
                                System.out.println("");
                                System.out.println("-----------------------Vehiculo 2--------------------------------");
                                System.out.println("Digite el nombre completo del dueño del carro: ");
                                nombre2 = dato3.nextLine();
                                System.out.println("Digite su numero de contacto: ");
                                contacto2 = dato3.nextInt();
                                System.out.println("Digite el numero de la placa del vehiculo: ");
                                placa2 = dato4.nextLine();
                                System.out.println("Digite el modelo del vehiculo: ");
                                modelo2 = dato4.nextLine();

                                System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                                System.out.println("-----------------------Vehiculo 1--------------------------------");
                                System.out.println("----------------------------------------------");
                                System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                                System.out.println("--------Numero de contacto: "+"      "+ contacto1);
                                System.out.println("--------Placa del vehiculo: "+"            "+ placa1);
                                System.out.println("--------Modelo del vehiculo: "+"            "+ modelo1);
                                System.out.println("----------------------------------------------");

                                System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                                System.out.println("-----------------------Vehiculo 2--------------------------------");
                                System.out.println("----------------------------------------------");
                                System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                                System.out.println("--------Numero de contacto: "+"      "+ contacto2);
                                System.out.println("--------Placa del vehiculo: "+"            "+ placa2);
                                System.out.println("--------Modelo del vehiculo: "+"            "+ modelo2);
                                System.out.println("----------------------------------------------");
                                contacto_2 = true;
                                lista_contactos =true;
                            }
                            
                            break;
                        }
                        case 3:{
                            System.out.println("Para que el vehiculo ingrese al parquedero , es necesario de los siguientes datos: ");
                            System.out.println("-----------------------Vehiculo 1--------------------------------");
                            System.out.println("Digite el nombre completo del dueño del carro: ");
                            nombre1 = dato2.nextLine();
                            System.out.println("Digite su numero de contacto: ");
                            contacto1 = dato2.nextInt();
                            System.out.println("Digite el numero de la placa del vehiculo: ");
                            placa1 = dato3.nextLine();
                            System.out.println("Digite el modelo del vehiculo: ");
                            modelo1 = dato3.nextLine();

                            
                            System.out.println("-----------------------Vehiculo 2--------------------------------");
                            System.out.println("Digite el nombre completo del dueño del carro: ");
                            nombre2 = dato3.nextLine();
                            System.out.println("Digite su numero de contacto: ");
                            contacto2 = dato3.nextInt();
                            System.out.println("Digite el numero de la placa del vehiculo: ");
                            placa2 = dato3.nextLine();
                            System.out.println("Digite el modelo del vehiculo: ");
                            modelo2 = dato4.nextLine();

                            
                            System.out.println("-----------------------Vehiculo 3--------------------------------");
                            System.out.println("Digite el nombre completo del dueño del carro: ");
                            nombre3 = dato3.nextLine();
                            System.out.println("Digite su numero de contacto: ");
                            contacto3 = dato3.nextInt();
                            System.out.println("Digite el numero de la placa del vehiculo: ");
                            placa3 = dato3.nextLine();
                            System.out.println("Digite el modelo del vehiculo: ");
                            modelo3 = dato4.nextLine();

                            
                            

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("-----------------------Vehiculo 1--------------------------------");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                            System.out.println("--------Numero de contacto: "+"                  "+ contacto1);
                            System.out.println("--------Placa del vehiculo: "+"                  "+ placa1);
                            System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo1);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("-----------------------Vehiculo 2--------------------------------");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                            System.out.println("--------Numero de contacto: "+"                  "+ contacto2);
                            System.out.println("--------Placa del vehiculo: "+"                  "+ placa2);
                            System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo2);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("-----------------------Vehiculo 3--------------------------------");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre3);
                            System.out.println("--------Numero de contacto: "+"                  "+ contacto3);
                            System.out.println("--------Placa del vehiculo: "+"                  "+ placa3);
                            System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo3);
                            System.out.println("----------------------------------------------");

                            
                            contacto_1 = true;
                            contacto_2 = true;
                            contacto_3 = true;

                            lista_contactos =true;
                            break;
                        }
                        case 4:{
                            System.out.println("Para que el vehiculo ingrese al parquedero , es necesario de los siguientes datos: ");
                            System.out.println("-----------------------Vehiculo 1--------------------------------");
                            System.out.println("Digite el nombre completo del dueño del carro: ");
                            nombre1 = dato2.nextLine();
                            System.out.println("Digite su numero de contacto: ");
                            contacto1 = dato2.nextInt();
                            System.out.println("Digite el numero de la placa del vehiculo: ");
                            placa1 = dato3.nextLine();
                            System.out.println("Digite el modelo del vehiculo: ");
                            modelo1 = dato3.nextLine();

                            
                            System.out.println("-----------------------Vehiculo 2--------------------------------");
                            System.out.println("Digite el nombre completo del dueño del carro: ");
                            nombre2 = dato3.nextLine();
                            System.out.println("Digite su numero de contacto: ");
                            contacto2 = dato3.nextInt();
                            System.out.println("Digite el numero de la placa del vehiculo: ");
                            placa2 = dato3.nextLine();
                            System.out.println("Digite el modelo del vehiculo: ");
                            modelo2 = dato4.nextLine();

                            
                            System.out.println("-----------------------Vehiculo 3--------------------------------");
                            System.out.println("Digite el nombre completo del dueño del carro: ");
                            nombre3 = dato3.nextLine();
                            System.out.println("Digite su numero de contacto: ");
                            contacto3 = dato3.nextInt();
                            System.out.println("Digite el numero de la placa del vehiculo: ");
                            placa3 = dato3.nextLine();
                            System.out.println("Digite el modelo del vehiculo: ");
                            modelo3 = dato4.nextLine();

                            
                            System.out.println("-----------------------Vehiculo 4--------------------------------");
                            System.out.println("Digite el nombre completo del dueño del carro: ");
                            nombre4 = dato3.nextLine();
                            System.out.println("Digite su numero de contacto: ");
                            contacto4 = dato3.nextInt();
                            System.out.println("Digite el numero de la placa del vehiculo: ");
                            placa4 = dato3.nextLine();
                            System.out.println("Digite el modelo del vehiculo: ");
                            modelo4 = dato4.nextLine();

                            
                           

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("-----------------------Vehiculo 1--------------------------------");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                            System.out.println("--------Numero de contacto: "+"                  "+ contacto1);
                            System.out.println("--------Placa del vehiculo: "+"                  "+ placa1);
                            System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo1);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("-----------------------Vehiculo 2--------------------------------");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                            System.out.println("--------Numero de contacto: "+"                  "+ contacto2);
                            System.out.println("--------Placa del vehiculo: "+"                  "+ placa2);
                            System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo2);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("-----------------------Vehiculo 3--------------------------------");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre3);
                            System.out.println("--------Numero de contacto: "+"                  "+ contacto3);
                            System.out.println("--------Placa del vehiculo: "+"                  "+ placa3);
                            System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo3);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("-----------------------Vehiculo 4--------------------------------");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre4);
                            System.out.println("--------Numero de contacto: "+"                  "+ contacto4);
                            System.out.println("--------Placa del vehiculo: "+"                  "+ placa4);
                            System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo4);
                            System.out.println("----------------------------------------------");

                            contacto_1 = true;
                            contacto_2 = true;
                            contacto_3 = true;
                            contacto_4 = true;

    


                            lista_contactos =true;
                            break;
                        }
                        case 5:{
                            System.out.println("Para que el vehiculo ingrese al parquedero , es necesario de los siguientes datos: ");
                            System.out.println("-----------------------Vehiculo 1--------------------------------");
                            System.out.println("Digite el nombre completo del dueño del carro: ");
                            nombre1 = dato2.nextLine();
                            System.out.println("Digite su numero de contacto: ");
                            contacto1 = dato2.nextInt();
                            System.out.println("Digite el numero de la placa del vehiculo: ");
                            placa1 = dato3.nextLine();
                            System.out.println("Digite el modelo del vehiculo: ");
                            modelo1 = dato3.nextLine();

                            
                            System.out.println("-----------------------Vehiculo 2--------------------------------");
                            System.out.println("Digite el nombre completo del dueño del carro: ");
                            nombre2 = dato3.nextLine();
                            System.out.println("Digite su numero de contacto: ");
                            contacto2 = dato3.nextInt();
                            System.out.println("Digite el numero de la placa del vehiculo: ");
                            placa2 = dato3.nextLine();
                            System.out.println("Digite el modelo del vehiculo: ");
                            modelo2 = dato4.nextLine();

                            
                            System.out.println("-----------------------Vehiculo 3--------------------------------");
                            System.out.println("Digite el nombre completo del dueño del carro: ");
                            nombre3 = dato3.nextLine();
                            System.out.println("Digite su numero de contacto: ");
                            contacto3 = dato3.nextInt();
                            System.out.println("Digite el numero de la placa del vehiculo: ");
                            placa3 = dato3.nextLine();
                            System.out.println("Digite el modelo del vehiculo: ");
                            modelo3 = dato4.nextLine();

                            
                            System.out.println("-----------------------Vehiculo 4--------------------------------");
                            System.out.println("Digite el nombre completo del dueño del carro: ");
                            nombre4 = dato3.nextLine();
                            System.out.println("Digite su numero de contacto: ");
                            contacto4 = dato3.nextInt();
                            System.out.println("Digite el numero de la placa del vehiculo: ");
                            placa4 = dato3.nextLine();
                            System.out.println("Digite el modelo del vehiculo: ");
                            modelo4 = dato4.nextLine();

                            
                            System.out.println("-----------------------Vehiculo 5--------------------------------");
                            System.out.println("Digite el nombre completo del dueño del carro: ");
                            nombre5 = dato3.nextLine();
                            System.out.println("Digite su numero de contacto: ");
                            contacto5 = dato3.nextInt();
                            System.out.println("Digite el numero de la placa del vehiculo: ");
                            placa5 = dato3.nextLine();
                            System.out.println("Digite el modelo del vehiculo: ");
                            modelo5 = dato4.nextLine();

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("-----------------------Vehiculo 1--------------------------------");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                            System.out.println("--------Numero de contacto: "+"                  "+ contacto1);
                            System.out.println("--------Placa del vehiculo: "+"                  "+ placa1);
                            System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo1);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("-----------------------Vehiculo 2--------------------------------");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                            System.out.println("--------Numero de contacto: "+"                  "+ contacto2);
                            System.out.println("--------Placa del vehiculo: "+"                  "+ placa2);
                            System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo2);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("-----------------------Vehiculo 3--------------------------------");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre3);
                            System.out.println("--------Numero de contacto: "+"                  "+ contacto3);
                            System.out.println("--------Placa del vehiculo: "+"                  "+ placa3);
                            System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo3);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("-----------------------Vehiculo 4--------------------------------");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre4);
                            System.out.println("--------Numero de contacto: "+"                  "+ contacto4);
                            System.out.println("--------Placa del vehiculo: "+"                  "+ placa4);
                            System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo4);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("-----------------------Vehiculo 5--------------------------------");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre5);
                            System.out.println("--------Numero de contacto: "+"                  "+ contacto5);
                            System.out.println("--------Placa del vehiculo: "+"                  "+ placa5);
                            System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo5);
                            System.out.println("----------------------------------------------");


                            

                            contacto_1 = true;
                            contacto_2 = true;
                            contacto_3 = true;
                            contacto_4 = true;
                            contacto_5 = true;

                            lista_contactos =true;
                            break;
                        }
                            
                    }

                    
                  
                }
                    break;

                case 2:{
                    System.out.println("################ Consultar vehiculo ################");
                    System.out.println(" ");
                    System.out.println("Porfavor digite numero de contacto del dueño  del vehiculo");
                    buscar = dato4.nextInt();

                    if (buscar==contacto1){
                        System.out.println("Se ha encontrado el vehiculo con los siguientes datos: ");
                        System.out.println("-----------------------Vehiculo 1--------------------------------");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                        System.out.println("--------Numero de contacto: "+"                  "+ contacto1);
                        System.out.println("--------Placa del vehiculo: "+"                  "+ placa1);
                        System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo1);
                        System.out.println("----------------------------------------------");
                    }

                    if (buscar==contacto2){
                        System.out.println("Se ha encontrado el vehiculo con los siguientes datos: ");
                        System.out.println("-----------------------Vehiculo 2--------------------------------");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                        System.out.println("--------Numero de contacto: "+"                  "+ contacto2);
                        System.out.println("--------Placa del vehiculo: "+"                  "+ placa2);
                        System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo2);
                        System.out.println("----------------------------------------------");

                    }

                    else if(buscar == contacto3){
                        System.out.println("Se ha encontrado el vehiculo con los siguientes datos: ");
                        System.out.println("-----------------------Vehiculo 3--------------------------------");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre3);
                        System.out.println("--------Numero de contacto: "+"                  "+ contacto3);
                        System.out.println("--------Placa del vehiculo: "+"                  "+ placa3);
                        System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo3);
                        System.out.println("----------------------------------------------");
                    }

                    else if(buscar ==contacto4){
                        System.out.println("Se ha encontrado el vehiculo con los siguientes datos: ");
                        System.out.println("-----------------------Vehiculo 4--------------------------------");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre4);
                        System.out.println("--------Numero de contacto: "+"                  "+ contacto4);
                        System.out.println("--------Placa del vehiculo: "+"                  "+ placa4);
                        System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo4);
                        System.out.println("----------------------------------------------");
                    }

                    else if(buscar == contacto5){
                        System.out.println("Se ha encontrado el vehiculo con los siguientes datos: ");
                        System.out.println("-----------------------Vehiculo 5--------------------------------");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre5);
                        System.out.println("--------Numero de contacto: "+"                  "+ contacto5);
                        System.out.println("--------Placa del vehiculo: "+"                  "+ placa5);
                        System.out.println("--------Modelo del vehiculo: "+"                 "+ modelo5);
                        System.out.println("----------------------------------------------");
                    }
                    
                    else{
                        System.out.println("No existe ningun vehiculo con esa placa");
                    }
                }
                    
                    break;

                case 3:{
                    System.out.println("################ Retirar vehiculo ################");
                    System.out.println(" ");
                    System.out.println("Porfavor digite el numero del contacto del dueño del vehiculo que va a retirar: ");
                    retirar = dato3.nextInt();

                    if (retirar == contacto1){
                        System.out.println("Retirando vehiculo, muchas gracias por su compra");
                        nombre1= "";
                        placa1 = "";
                        modelo1 = "";
                        contacto1 = 0;

                    }else if (retirar == contacto2){
                        System.out.println("Retirando vehiculo, muchas gracias por su compra");
                        nombre2= "";
                        placa2 = "";
                        modelo2 = "";
                        contacto2 = 0;
                    }else if( retirar == contacto3){
                        System.out.println("Retirando vehiculo, muchas gracias por su compra");
                        nombre3= "";
                        placa3 = "";
                        modelo3 = "";
                        contacto3 = 0;
                    }else if (retirar == contacto4){
                        System.out.println("Retirando vehiculo, muchas gracias por su compra");
                        nombre4= "";
                        placa4 = "";
                        modelo4 = "";
                        contacto4 = 0;
                    }else if(retirar == contacto5){
                        System.out.println("Retirando vehiculo, muchas gracias por su compra");
                        nombre5= "";
                        placa5 = "";
                        modelo5 = "";
                        contacto5 = 0;
                    }else{
                        System.out.println("No existe ningun vehiculo con esa placa");
                       
                    }
                }

    

                    break;

            
                default:
                    break;
            }

        }while(opcion<4 && opcion>0);
    }
}