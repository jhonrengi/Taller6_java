import java.lang.ref.Cleaner;
import java.util.Scanner;
public class Taller3_6 {
    

    public static void main(String[] args) {
        Scanner dato = new Scanner (System.in);
        Scanner dato2 = new Scanner (System.in);
        Scanner dato3 = new Scanner (System.in);
        Scanner dato4 = new Scanner (System.in);
        int opcion, opcion2,opcion3, contacto1=0,contacto2=0,contacto3=0;
        String nombre1 = "", organizacion1= "";
        String nombre2 = "", organizacion2= "";
        String nombre3 = "", organizacion3= "";
        int buscar = 0;

        boolean lista_contactos = false;
        boolean confirmar = false;

        
        do{
            System.out.println("Aplicacion para almacenar, buscar y Eliminar contactos.");
            System.out.println();
            System.out.println("Porfavor seleccione alguna de las opciones en el siguiente menu: ");
            System.out.println("1.Añadir contacto");
            System.out.println("2.Buscar contacto");
            System.out.println("3.Eliminar contacto");
            System.out.println("4.Salir");
            opcion = dato.nextInt();

            switch (opcion) {
                case 1:{
                    System.out.println("################### Añadir contacto ###################");
                    System.out.println();
                    System.out.println("Porfavor digite cuantos usuarios desea registrar");
                    System.out.println("(Se pueden registrar hasta maximo 3 contactos)");
                    opcion2 = dato2.nextInt();

                    switch(opcion2){
                        case 1:{
                            System.out.println("Porfavor digite el nombre completo del usuario que desea guardar: ");
                            nombre1 = dato3.nextLine();
                            System.out.println("Ahora, digite el numero de contacto correspondiente del usuario que acaba de registrar: ");
                            contacto1 = dato3.nextInt();
                            System.out.println("Por ultimo digite en que organizacion se encuentra: ");
                            organizacion1 = dato4.nextLine();

                            System.out.println("Registro exitoso, se ha guardado el contacto: ");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre: "+"                  "+nombre1);
                            System.out.println("--------Numero de contacto: "+"      "+ contacto1);
                            System.out.println("--------Organizacion: "+"            "+ organizacion1);
                            System.out.println("----------------------------------------------");
                            lista_contactos =true;


                            break;
                        }    
                        case 2:{


                            System.out.println("Porfavor digite el nombre completo del primer usuario que desea guardar: ");
                            nombre1 = dato3.nextLine();
                            System.out.println("Ahora, digite el numero de contacto correspondiente: ");
                            contacto1 = dato3.nextInt();
                            System.out.println("Por ultimo digite en que organizacion se encuentra: ");
                            organizacion1 = dato4.nextLine();
                           

                            System.out.println("Porfavor digite el nombre completo del segundo usuario que desea guardar: ");
                            nombre2 = dato4.nextLine();
                            System.out.println("Ahora, digite el numero de contacto correspondiente: ");
                            contacto2 = dato2.nextInt();
                            System.out.println("Por ultimo digite en que organizacion se encuentra: ");
                            organizacion2 = dato4.nextLine();
                            

                            System.out.println("Registro exitoso, se han guardado los siguientes contactos: ");
                            System.out.println("");
                            System.out.println("---------------------Contacto 1---------------");
                            System.out.println("--------Nombre: "+"                  "+nombre1);
                            System.out.println("--------Numero de contacto: "+"      "+ contacto1);
                            System.out.println("--------Organizacion: "+"            "+ organizacion1);
                            System.out.println("----------------------------------------------");

                            System.out.println(" ");
                            System.out.println("---------------------Contacto 2---------------");
                            System.out.println("--------Nombre: "+"                  "+nombre2);
                            System.out.println("--------Numero de contacto: "+"      "+ contacto2);
                            System.out.println("--------Organizacion: "+"            "+ organizacion2);
                            System.out.println("----------------------------------------------");

                            
                            lista_contactos =true;
                            break;

                        }

                        case 3:{
                            System.out.println("Porfavor digite el nombre completo del primer usuario que desea guardar: ");
                            nombre1 = dato3.nextLine();
                            System.out.println("Ahora, digite el numero de contacto correspondiente: ");
                            contacto1 = dato3.nextInt();
                            System.out.println("Por ultimo digite en que organizacion se encuentra: ");
                            organizacion1 = dato4.nextLine();
                            

                            System.out.println("Porfavor digite el nombre completo del segundo usuario que desea guardar: ");
                            nombre2 = dato4.nextLine();
                            System.out.println("Ahora, digite el numero de contacto correspondiente: ");
                            contacto2 = dato2.nextInt();
                            System.out.println("Por ultimo digite en que organizacion se encuentra: ");
                            organizacion2 = dato4.nextLine();
                            

                            System.out.println("Porfavor digite el nombre completo del tercer usuario que desea guardar: ");
                            nombre3 = dato4.nextLine();
                            System.out.println("Ahora, digite el numero de contacto correspondiente: ");
                            contacto3 = dato2.nextInt();
                            System.out.println("Por ultimo digite en que organizacion se encuentra: ");
                            organizacion3 = dato4.nextLine();
                            

                            System.out.println("Registro exitoso, se han guardado los siguientes contactos: ");
                            System.out.println("");
                            System.out.println("---------------------Contacto 1---------------");
                            System.out.println("--------Nombre: "+"                  "+nombre1);
                            System.out.println("--------Numero de contacto: "+"      "+ contacto1);
                            System.out.println("--------Organizacion: "+"            "+ organizacion1);
                            System.out.println("----------------------------------------------");

                            System.out.println(" ");
                            System.out.println("---------------------Contacto 2---------------");
                            System.out.println("--------Nombre: "+"                  "+nombre2);
                            System.out.println("--------Numero de contacto: "+"      "+ contacto2);
                            System.out.println("--------Organizacion: "+"            "+ organizacion2);
                            System.out.println("----------------------------------------------");

                            System.out.println(" ");
                            System.out.println("---------------------Contacto 3---------------");
                            System.out.println("--------Nombre: "+"                  "+nombre3);
                            System.out.println("--------Numero de contacto: "+"      "+ contacto3);
                            System.out.println("--------Organizacion: "+"            "+ organizacion3);
                            System.out.println("----------------------------------------------");

                            
                            lista_contactos =true;
                            break;
                            

                        }
                        

                    }
                }
                    break;

                case 2:
                    System.out.println("################### Buscar contacto ###################");
                    System.out.println("Porfavor digite el numero de contacto del usuario que desea buscar: ");
                    buscar = dato4.nextInt();

                    if (buscar == contacto1){
                        System.out.println("");
                        System.out.println("Se ha encontrado el contacto: ");
                        System.out.println("--------Nombre: "+"                  "+nombre1);
                        System.out.println("--------Numero de contacto: "+"      "+ contacto1);
                        System.out.println("--------Organizacion: "+"            "+ organizacion1);
                    }else if (buscar == contacto2){
                        System.out.println("");
                        System.out.println("Se ha encontrado el contacto: ");
                        System.out.println("--------Nombre: "+"                  "+nombre2);
                        System.out.println("--------Numero de contacto: "+"      "+ contacto2);
                        System.out.println("--------Organizacion: "+"            "+ organizacion2);
                    }else if (buscar == contacto3){
                        System.out.println("");
                        System.out.println("Se ha encontrado el contacto: ");
                        System.out.println("--------Nombre: "+"                  "+nombre3);
                        System.out.println("--------Numero de contacto: "+"      "+ contacto3);
                        System.out.println("--------Organizacion: "+"            "+ organizacion3);
                    }else {
                        System.out.println("");
                        System.out.println("Contacto no encontrado, porfavor selecione la opcion 1 del menu y registrelo");
                        System.out.println("");
                    }
                    break;

                case 3:

                    if (lista_contactos == true){
                        System.out.println("################### Eliminar contacto ###################");
                        System.out.println("Lista de contactos: ");
                        System.out.println("1."+ nombre1);
                        System.out.println("2."+ nombre2);
                        System.out.println("3."+nombre3);
                        System.out.println("¿Cual contacto desea Eliminar? (Si no hay contactos, oprima 4 para regresar)");
                        opcion3 = dato4.nextInt();

                        switch (opcion3){
                            case 1:{
                                System.out.println("¿Esta seguro que desea Eliminar el contacto?");
                                System.out.println(" true para si, false para no");
                                confirmar = dato4.nextBoolean();

                                if (confirmar==true){
                                    nombre1 = " ";
                                    System.out.println("");
                                    System.out.println("Contacto eliminado");
                                    System.out.println("");
                                }else{
                                    System.out.println("Volviendo al menu");
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("¿Esta seguro que desea Eliminar el contacto?");
                                System.out.println(" true para si, false para no");
                                confirmar = dato4.nextBoolean();

                                if (confirmar==true){
                                    nombre2 = " ";
                                    System.out.println("");
                                    System.out.println("Contacto eliminado");
                                    System.out.println("");
                                }
                                else{
                                    System.out.println("");
                                    System.out.println("Volviendo al menu");
                                    System.out.println("");
                                }
                                break;
                            }
                            case 3:{
                                System.out.println("¿Esta seguro que desea Eliminar el contacto?");
                                System.out.println(" true para si, false para no");
                                confirmar = dato4.nextBoolean();

                                if (confirmar==true){
                                    nombre3 = " ";
                                    System.out.println("Contacto eliminado");
                                }
                                else{
                                    System.out.println("Volviendo al menu");
                                }
                                break;
                            }
                            case 4:{
                                System.out.println("Volviendo al menu");
                            }

                        }




                    }else{
                        System.out.println("");
                        System.out.println("No hay contactos agregados");
                        System.out.println("");
                    }

                    break;

            
                default:
                    break;
            }

        }while(opcion<4 && opcion>0);
    }
}