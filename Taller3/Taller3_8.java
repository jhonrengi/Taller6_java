import java.lang.ref.Cleaner;
import java.util.Scanner;
public class Taller3_8 {
    

    public static void main(String[] args) {
        Scanner dato = new Scanner (System.in);
        Scanner dato2 = new Scanner (System.in);
        Scanner dato3 = new Scanner (System.in);
        Scanner dato4 = new Scanner (System.in);
        int opcion, cedula1=0,cedula2=0,cedula3=0,cedula4=0,cedula5=0,cedula6=0,cedula7=0,cedula8=0;
        String nombre1 = "", categoria1= "";
        String nombre2 = "", categoria2= "";
        String nombre3 = "", categoria3= "";
        String nombre4 = "", categoria4= "";
        String nombre5 = "", categoria5= "";
        String nombre6 = "", categoria6= "";
        String nombre7 = "", categoria7= "";
        String nombre8 = "", categoria8= "";
        boolean contacto_1 = false;
        boolean contacto_2 = false;
        boolean contacto_3 = false;
        boolean contacto_4 = false;
        boolean contacto_5 = false;
        boolean contacto_6 = false;
        boolean contacto_7 = false;
        boolean contacto_8 = false;
        int buscar, retirar,seleccionar;
        
        int num_usu = 0;

        boolean lista_contactos = false;
        boolean confirmar = false;

        
        do{
            System.out.println("Escuela automovilistica el maestro");
            System.out.println();
            System.out.println("Porfavor seleccione alguna de las siguientes opciones: ");
            System.out.println("1.Registrar usuario");
            System.out.println("2.Consultar usuario registrado");
            System.out.println("3.Aprobar o reprobar usuarios");
            System.out.println("4.Salir");
            opcion = dato.nextInt();

            switch (opcion) {
                case 1:{
                    
                    System.out.println("###################### Registrar usuario ######################  ");
                    System.out.println();
                    System.out.println("Porfavor digite el numero exacto de los usuarios que desea registrar (Maximo 8, Oprima 9 para regresa)");
                    num_usu = dato2.nextInt();

                    switch (num_usu) {
                        case 1:{
                            
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre1 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula1 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria1 = dato3.nextLine();
                            
        
                            System.out.println("Se ha registrado el usuario, con los siguientes datos: ");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula1);
                            System.out.println("--------Categoria: "+"                  "         +categoria1);
                            System.out.println("----------------------------------------------");
                            lista_contactos =true;
                            contacto_1 = true;
                            break;
                        }    
                            
                        case 2:{
                            if (contacto_1==false){

                                
                                System.out.println("-----------------------Usuario 1 --------------------------------");
                                System.out.println("Digite el nombre completo del usuario: ");
                                nombre1 = dato4.nextLine();
                                System.out.println("Digite el numero de cedula del usuario: ");
                                cedula1 = dato2.nextInt();
                                System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                                System.out.println();
                                System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                                categoria1 = dato3.nextLine();

                                System.out.println("");
                                System.out.println("-----------------------Usuario 2--------------------------------");
                                System.out.println("Digite el nombre completo del usuario: ");
                                nombre2 = dato3.nextLine();
                                System.out.println("Digite el numero de cedula del usuario: ");
                                cedula2 = dato2.nextInt();
                                System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                                System.out.println();
                                System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                                categoria2 = dato3.nextLine();
                                
            
                               

                                System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                                System.out.println("-----------------------Usuario 1 --------------------------------");
                                System.out.println("Se ha registrado el usuario, con los siguientes datos: ");
                                System.out.println("----------------------------------------------");
                                System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                                System.out.println("--------Numero de cedula: "+"                    "+cedula1);
                                System.out.println("--------Categoria: "+"                           "+categoria1);
                                System.out.println("----------------------------------------------");

                                System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                                System.out.println("-----------------------Usuario 2 --------------------------------");
                                System.out.println("Se ha registrado el usuario, con los siguientes datos: ");
                                System.out.println("----------------------------------------------");
                                System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                                System.out.println("--------Numero de cedula: "+"                  "  +cedula2);
                                System.out.println("--------Categoria: "+"                  "         +categoria2);
                                System.out.println("----------------------------------------------");

                                lista_contactos =true;
                                contacto_1 = true;
                                contacto_2 = true;
                            }else if(contacto_1==true){
                                System.out.println("Usuario 1 ya se encuentra registrado");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("-----------------------Usuario 2--------------------------------");
                                System.out.println("Digite el nombre completo del usuario: ");
                                nombre2 = dato3.nextLine();
                                System.out.println("Digite el numero de cedula del usuario: ");
                                cedula2 = dato2.nextInt();
                                System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                                System.out.println();
                                System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                                categoria2 = dato3.nextLine();

                                

                                System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                                System.out.println("-----------------------Usuario 2 --------------------------------");
                                System.out.println("Se ha registrado el usuario, con los siguientes datos: ");
                                System.out.println("----------------------------------------------");
                                System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                                System.out.println("--------Numero de cedula: "+"                  "  +cedula2);
                                System.out.println("--------Categoria: "+"                  "         +categoria2);
                                System.out.println("----------------------------------------------");
                                contacto_2 = true;
                                lista_contactos =true;
                            }
                            
                            break;
                        }
                        case 3:{
                            System.out.println("-----------------------Usuario 1 --------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre1 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula1 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria1 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 2--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre2 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula2 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria2 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 3--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre3 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula3 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria3 = dato3.nextLine();

                            
                            
        
                            

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 1 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula1);
                            System.out.println("--------Categoria: "+"                  "         +categoria1);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 2 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula2);
                            System.out.println("--------Categoria: "+"                  "         +categoria2);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 3 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre3);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula3);
                            System.out.println("--------Categoria: "+"                  "         +categoria3);
                            System.out.println("----------------------------------------------");

                            

                                

                            
                            contacto_1 = true;
                            contacto_2 = true;
                            contacto_3 = true;

                            lista_contactos =true;
                            break;
                        }
                        case 4:{
                            System.out.println("-----------------------Usuario 1 --------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre1 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula1 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria1 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 2--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre2 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula2 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria2 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 3--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre3 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula3 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria3 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 4--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre4 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula4 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria4 = dato3.nextLine();

                            
                            
        
                            

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 1 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula1);
                            System.out.println("--------Categoria: "+"                  "         +categoria1);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 2 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula2);
                            System.out.println("--------Categoria: "+"                  "         +categoria2);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 3 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre3);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula3);
                            System.out.println("--------Categoria: "+"                  "         +categoria3);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 4 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre4);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula4);
                            System.out.println("--------Categoria: "+"                  "         +categoria4);
                            System.out.println("----------------------------------------------");

                            

                            contacto_1 = true;
                            contacto_2 = true;
                            contacto_3 = true;
                            contacto_4 = true;

    


                            lista_contactos =true;
                            break;
                        }
                        case 5:{
                            System.out.println("-----------------------Usuario 1 --------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre1 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula1 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria1 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 2--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre2 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula2 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria2 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 3--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre3 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula3 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria3 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 4--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre4 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula4 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria4 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 5--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre5 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula5 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria5 = dato3.nextLine();

                            
                            
        
                            

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 1 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula1);
                            System.out.println("--------Categoria: "+"                  "         +categoria1);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 2 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula2);
                            System.out.println("--------Categoria: "+"                  "         +categoria2);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 3 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre3);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula3);
                            System.out.println("--------Categoria: "+"                  "         +categoria3);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 4 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre4);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula4);
                            System.out.println("--------Categoria: "+"                  "         +categoria4);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 5 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre5);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula5);
                            System.out.println("--------Categoria: "+"                  "         +categoria5);
                            System.out.println("----------------------------------------------");

                            


                            

                            contacto_1 = true;
                            contacto_2 = true;
                            contacto_3 = true;
                            contacto_4 = true;
                            contacto_5 = true;

                            lista_contactos =true;
                            break;
                        }
                        case 6:{
                            System.out.println("-----------------------Usuario 1 --------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre1 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula1 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria1 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 2--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre2 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula2 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria2 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 3--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre3 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula3 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria3 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 4--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre4 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula4 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria4 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 5--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre5 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula5 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria5 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 6--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre6 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula6 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria6 = dato3.nextLine();

                            
                        

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 1 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula1);
                            System.out.println("--------Categoria: "+"                  "         +categoria1);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 2 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula2);
                            System.out.println("--------Categoria: "+"                  "         +categoria2);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 3 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre3);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula3);
                            System.out.println("--------Categoria: "+"                  "         +categoria3);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 4 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre4);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula4);
                            System.out.println("--------Categoria: "+"                  "         +categoria4);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 5 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre5);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula5);
                            System.out.println("--------Categoria: "+"                  "         +categoria5);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 6 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre6);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula6);
                            System.out.println("--------Categoria: "+"                  "         +categoria6);
                            System.out.println("----------------------------------------------");

                            contacto_1 = true;
                            contacto_2 = true;
                            contacto_3 = true;
                            contacto_4 = true;
                            contacto_5 = true;
                            contacto_6 = true;

                            
                        }
                        case 7:{
                            System.out.println("-----------------------Usuario 1 --------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre1 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula1 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria1 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 2--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre2 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula2 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria2 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 3--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre3 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula3 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria3 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 4--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre4 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula4 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria4 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 5--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre5 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula5 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria5 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 6--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre6 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula6 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria6 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 7--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre7 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula7 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria7 = dato3.nextLine();

                            
                            
        
                            

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 1 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula1);
                            System.out.println("--------Categoria: "+"                  "         +categoria1);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 2 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula2);
                            System.out.println("--------Categoria: "+"                  "         +categoria2);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 3 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre3);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula3);
                            System.out.println("--------Categoria: "+"                  "         +categoria3);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 4 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre4);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula4);
                            System.out.println("--------Categoria: "+"                  "         +categoria4);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 5 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre5);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula5);
                            System.out.println("--------Categoria: "+"                  "         +categoria5);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 6 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre6);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula6);
                            System.out.println("--------Categoria: "+"                  "         +categoria6);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 7 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre7);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula7);
                            System.out.println("--------Categoria: "+"                  "         +categoria7);
                            System.out.println("----------------------------------------------");

                            contacto_1 = true;
                            contacto_2 = true;
                            contacto_3 = true;
                            contacto_4 = true;
                            contacto_5 = true;
                            contacto_6 = true;
                            contacto_7 = true;
                            

                        }
                        case 8:{
                            System.out.println("-----------------------Usuario 1 --------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre1 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula1 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria1 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 2--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre2 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula2 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria2 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 3--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre3 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula3 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria3 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 4--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre4 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula4 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria4 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 5--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre5 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula5 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria5 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 6--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre6 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula6 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria6 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 7--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre7 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula7 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria7 = dato3.nextLine();

                            System.out.println("");
                            System.out.println("-----------------------Usuario 8--------------------------------");
                            System.out.println("Digite el nombre completo del usuario: ");
                            nombre8 = dato3.nextLine();
                            System.out.println("Digite el numero de cedula del usuario: ");
                            cedula8 = dato2.nextInt();
                            System.out.println("Porfavor digite la categoria al que usuario se desea registrar: ");
                            System.out.println();
                            System.out.println("Recuerde las categorias: A1,A2,B1,B2,B3,C1,C2,C3");
                            categoria8 = dato3.nextLine();
                            
        
                            

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 1 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula1);
                            System.out.println("--------Categoria: "+"                  "         +categoria1);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 2 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula2);
                            System.out.println("--------Categoria: "+"                  "         +categoria2);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 3 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre3);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula3);
                            System.out.println("--------Categoria: "+"                  "         +categoria3);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 4 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre4);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula4);
                            System.out.println("--------Categoria: "+"                  "         +categoria4);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 5 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre5);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula5);
                            System.out.println("--------Categoria: "+"                  "         +categoria5);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 6 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre6);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula6);
                            System.out.println("--------Categoria: "+"                  "         +categoria6);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 7 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre7);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula7);
                            System.out.println("--------Categoria: "+"                  "         +categoria7);
                            System.out.println("----------------------------------------------");

                            System.out.println("Se ha ingresado el vehiculo con los siguientes datos: ");
                            System.out.println("");
                            System.out.println("-----------------------Usuario 8 --------------------------------");
                            System.out.println("");
                            System.out.println("----------------------------------------------");
                            System.out.println("--------Nombre de usuario:  "+"                  "+nombre8);
                            System.out.println("--------Numero de cedula: "+"                  "  +cedula8);
                            System.out.println("--------Categoria: "+"                  "         +categoria8);
                            System.out.println("----------------------------------------------");
                            contacto_1 = true;
                            contacto_2 = true;
                            contacto_3 = true;
                            contacto_4 = true;
                            contacto_5 = true;
                            contacto_6 = true;
                            contacto_7 = true;
                            contacto_8 = true;

                        }
                            
                    }

                    
                  
                }
                    break;

                case 2:{
                    System.out.println("###################### Consultar usuario ###################### ");
                    System.out.println(" ");
                    System.out.println("Porfavor digite el numero de cedula del usuario que desea buscar: ");
                    buscar = dato4.nextInt();

                    if (buscar==cedula1){
                        System.out.println("Se ha encontrado el usuario con los siguientes datos: ");
                        System.out.println("-----------------------Usuario 1 --------------------------------");
                        System.out.println("");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                        System.out.println("--------Numero de cedula: "+"                  "  +cedula1);
                        System.out.println("--------Categoria: "+"                  "         +categoria1);
                        System.out.println("----------------------------------------------");
                    }else if(buscar==cedula2){
                        System.out.println("Se ha encontrado el usuario con los siguientes datos: ");
                        System.out.println("-----------------------Usuario 2 --------------------------------");
                        System.out.println("");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                        System.out.println("--------Numero de cedula: "+"                  "  +cedula2);
                        System.out.println("--------Categoria: "+"                  "         +categoria2);
                        System.out.println("----------------------------------------------");
                    }else if(buscar == cedula3){
                        System.out.println("Se ha encontrado el usuario con los siguientes datos: ");
                        System.out.println("-----------------------Usuario 3 --------------------------------");
                        System.out.println("");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre3);
                        System.out.println("--------Numero de cedula: "+"                  "  +cedula3);
                        System.out.println("--------Categoria: "+"                  "         +categoria3);
                        System.out.println("----------------------------------------------");
                    }else if(buscar == cedula4){
                        System.out.println("Se ha encontrado el usuario con los siguientes datos: ");
                        System.out.println("-----------------------Usuario 4 --------------------------------");
                        System.out.println("");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre4);
                        System.out.println("--------Numero de cedula: "+"                  "  +cedula4);
                        System.out.println("--------Categoria: "+"                  "         +categoria4);
                        System.out.println("----------------------------------------------");
                    }else if(buscar == cedula5){
                        System.out.println("Se ha encontrado el usuario con los siguientes datos: ");
                        System.out.println("-----------------------Usuario 5 --------------------------------");
                        System.out.println("");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre5);
                        System.out.println("--------Numero de cedula: "+"                  "  +cedula5);
                        System.out.println("--------Categoria: "+"                  "         +categoria5);
                        System.out.println("----------------------------------------------");
                    }else if(buscar == cedula6){
                        System.out.println("Se ha encontrado el usuario con los siguientes datos: ");
                        System.out.println("-----------------------Usuario 6 --------------------------------");
                        System.out.println("");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre6);
                        System.out.println("--------Numero de cedula: "+"                  "  +cedula6);
                        System.out.println("--------Categoria: "+"                  "         +categoria6);
                        System.out.println("----------------------------------------------");
                    }else if(buscar == cedula7){
                        System.out.println("Se ha encontrado el usuario con los siguientes datos: ");
                        System.out.println("-----------------------Usuario 7 --------------------------------");
                        System.out.println("");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre7);
                        System.out.println("--------Numero de cedula: "+"                  "  +cedula7);
                        System.out.println("--------Categoria: "+"                  "         +categoria7);
                        System.out.println("----------------------------------------------");
                    }else if(buscar == cedula8){
                        System.out.println("Se ha encontrado el usuario con los siguientes datos: ");
                        System.out.println("-----------------------Usuario 8 --------------------------------");
                        System.out.println("");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre8);
                        System.out.println("--------Numero de cedula: "+"                  "  +cedula8);
                        System.out.println("--------Categoria: "+"                  "         +categoria8);
                        System.out.println("----------------------------------------------");
                    }else{
                        System.out.println("No existe ningun usuario con esa cedula");
                    }

                    

                }
                    
                    break;

                case 3:{
                    System.out.println("###################### Aprobar o reprobar usuarios ###################### ");
                    System.out.println(" ");
                    System.out.println("Lista de usuarios registrados");
                    System.out.println(" ");
                    

                    if (contacto_1 == true){
                        System.out.println("-----------------------Usuario 1 --------------------------------");
                        System.out.println("");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                        System.out.println("--------Numero de cedula: "+"                  "  +cedula1);
                        System.out.println("--------Categoria: "+"                  "         +categoria1);
                        System.out.println("----------------------------------------------");

                    }else{
                        System.out.println("No se ha registrado el usuario 1");
                    }

                    if (contacto_2 == true){
                        System.out.println("-----------------------Usuario 2 --------------------------------");
                        System.out.println("");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                        System.out.println("--------Numero de cedula: "+"                  "  +cedula2);
                        System.out.println("--------Categoria: "+"                  "         +categoria2);
                        System.out.println("----------------------------------------------");

                    }else{
                        System.out.println("No se ha registrado el usuario 2");
                    }

                    if (contacto_3 == true){
                        System.out.println("-----------------------Usuario 3 --------------------------------");
                        System.out.println("");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre3);
                        System.out.println("--------Numero de cedula: "+"                  "  +cedula3);
                        System.out.println("--------Categoria: "+"                  "         +categoria3);
                        System.out.println("----------------------------------------------");

                    }else{
                        System.out.println("No se ha registrado el usuario 3");
                    }

                    if (contacto_4 == true){
                        System.out.println("-----------------------Usuario 4 --------------------------------");
                        System.out.println("");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre4);
                        System.out.println("--------Numero de cedula: "+"                  "  +cedula4);
                        System.out.println("--------Categoria: "+"                  "         +categoria4);
                        System.out.println("----------------------------------------------");

                    }else{
                        System.out.println("No se ha registrado el usuario 4");
                    }

                    if (contacto_5 == true){
                        System.out.println("-----------------------Usuario 5 --------------------------------");
                        System.out.println("");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre5);
                        System.out.println("--------Numero de cedula: "+"                  "  +cedula5);
                        System.out.println("--------Categoria: "+"                  "         +categoria5);
                        System.out.println("----------------------------------------------");

                    }else{
                        System.out.println("No se ha registrado el usuario 5");
                    }

                    if (contacto_6 == true){
                        System.out.println("-----------------------Usuario 6 --------------------------------");
                        System.out.println("");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre6);
                        System.out.println("--------Numero de cedula: "+"                  "  +cedula6);
                        System.out.println("--------Categoria: "+"                  "         +categoria6);
                        System.out.println("----------------------------------------------");

                    }else{
                        System.out.println("No se ha registrado el usuario 6");
                    }

                    if (contacto_7 == true){
                        System.out.println("-----------------------Usuario 7 --------------------------------");
                        System.out.println("");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre7);
                        System.out.println("--------Numero de cedula: "+"                  "  +cedula7);
                        System.out.println("--------Categoria: "+"                  "         +categoria7);
                        System.out.println("----------------------------------------------");

                    }else{
                        System.out.println("No se ha registrado el usuario 7");
                    }

                    if (contacto_8 == true){
                        System.out.println("-----------------------Usuario 8 --------------------------------");
                        System.out.println("");
                        System.out.println("----------------------------------------------");
                        System.out.println("--------Nombre de usuario:  "+"                  "+nombre8);
                        System.out.println("--------Numero de cedula: "+"                  "  +cedula8);
                        System.out.println("--------Categoria: "+"                  "         +categoria8);
                        System.out.println("----------------------------------------------");

                    }else{
                        System.out.println("No se ha registrado el usuario 8");
                    }

                    System.out.println("Seleccione alguno de los usuarios existentes (Digite unicamente el numero del registro del usuario, de lo contrario oprima 9 para volver)");
                    retirar = dato3.nextInt();

                    switch (retirar){
                        case 1:{
                            System.out.println("Seleccione alguna de las siguientes opciones: ");
                            System.out.println("1.Aprobar");
                            System.out.println("2.Reprobar");
                            seleccionar = dato4.nextInt();

                            switch (seleccionar) {
                                case 1:{
                                    System.out.println("-----------------------Usuario 1 --------------------------------");
                                    System.out.println("");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                                    System.out.println("--------Numero de cedula: "+"                  "  +cedula1);
                                    System.out.println("--------Categoria: "+"                  "         +categoria1);
                                    System.out.println("----------------------------------------------");     
                                    System.out.println("Ha aprobado el curso, por consiguiente entra en tramite para adquirir la licencia de conduccion");
                                    contacto_1 = false;
                                    nombre1 = "";
                                    cedula1 = 0;
                                    categoria1 = "";
                                    break;

                                }
                                case 2:{
                                    System.out.println("-----------------------Usuario 1 --------------------------------");
                                    System.out.println("");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("--------Nombre de usuario:  "+"                  "+nombre1);
                                    System.out.println("--------Numero de cedula: "+"                  "  +cedula1);
                                    System.out.println("--------Categoria: "+"                  "         +categoria1);
                                    System.out.println("----------------------------------------------");     
                                    System.out.println("Ha repobrado el curso, por consiguiente no entra en tramite para adquirir la licencia de conduccion");
                                    contacto_1 = false;
                                    nombre1 = "";
                                    cedula1 = 0;
                                    categoria1 = "";
                                    break;
                                }
                            }

                            break;
                        }
                        case 2:{
                            System.out.println("Seleccione alguna de las siguientes opciones: ");
                            System.out.println("1.Aprobar");
                            System.out.println("2.Reprobar");
                            seleccionar = dato4.nextInt();

                            switch (seleccionar) {
                                case 1:{
                                    System.out.println("-----------------------Usuario 2 --------------------------------");
                                    System.out.println("");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                                    System.out.println("--------Numero de cedula: "+"                  "  +cedula2);
                                    System.out.println("--------Categoria: "+"                  "         +categoria2);
                                    System.out.println("----------------------------------------------");     
                                    System.out.println("Ha aprobado el curso, por consiguiente entra en tramite para adquirir la licencia de conduccion");
                                    contacto_2 = false;
                                    nombre2 = "";
                                    cedula2 = 0;
                                    categoria2 = "";
                                    break;

                                }
                                case 2:{
                                    System.out.println("-----------------------Usuario 2 --------------------------------");
                                    System.out.println("");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("--------Nombre de usuario:  "+"                  "+nombre2);
                                    System.out.println("--------Numero de cedula: "+"                  "  +cedula2);
                                    System.out.println("--------Categoria: "+"                  "         +categoria2);
                                    System.out.println("----------------------------------------------");     
                                    System.out.println("Ha repobrado el curso, por consiguiente no entra en tramite para adquirir la licencia de conduccion");
                                    contacto_2 = false;
                                    nombre2 = "";
                                    cedula2 = 0;
                                    categoria2 = "";
                                    break;
                                }
                            }  
                            break; 
                        }
                        case 3:{
                            System.out.println("Seleccione alguna de las siguientes opciones: ");
                            System.out.println("1.Aprobar");
                            System.out.println("2.Reprobar");
                            seleccionar = dato4.nextInt();

                            switch (seleccionar) {
                                case 1:{
                                    System.out.println("-----------------------Usuario 3 --------------------------------");
                                    System.out.println("");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("--------Nombre de usuario:  "+"                  "+nombre3);
                                    System.out.println("--------Numero de cedula: "+"                  "  +cedula3);
                                    System.out.println("--------Categoria: "+"                  "         +categoria3);
                                    System.out.println("----------------------------------------------");     
                                    System.out.println("Ha aprobado el curso, por consiguiente entra en tramite para adquirir la licencia de conduccion");
                                    contacto_3 = false;
                                    nombre3 = "";
                                    cedula3 = 0;
                                    categoria3 = "";
                                    break;

                                }
                                case 2:{
                                    System.out.println("-----------------------Usuario 3 --------------------------------");
                                    System.out.println("");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("--------Nombre de usuario:  "+"                  "+nombre3);
                                    System.out.println("--------Numero de cedula: "+"                  "  +cedula3);
                                    System.out.println("--------Categoria: "+"                  "         +categoria3);
                                    System.out.println("----------------------------------------------");     
                                    System.out.println("Ha repobrado el curso, por consiguiente no entra en tramite para adquirir la licencia de conduccion");
                                    contacto_3 = false;
                                    nombre3 = "";
                                    cedula3 = 0;
                                    categoria3
                                     = "";
                                    break;
                                }
                            }
                            break;
                        }
                        case 4:{
                            System.out.println("Seleccione alguna de las siguientes opciones: ");
                            System.out.println("1.Aprobar");
                            System.out.println("2.Reprobar");
                            seleccionar = dato4.nextInt();

                            switch (seleccionar) {
                                case 1:{
                                    System.out.println("-----------------------Usuario 4 --------------------------------");
                                    System.out.println("");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("--------Nombre de usuario:  "+"                  "+nombre4);
                                    System.out.println("--------Numero de cedula: "+"                  "  +cedula4);
                                    System.out.println("--------Categoria: "+"                  "         +categoria4);
                                    System.out.println("----------------------------------------------");     
                                    System.out.println("Ha aprobado el curso, por consiguiente entra en tramite para adquirir la licencia de conduccion");
                                    contacto_4 = false;
                                    nombre4 = "";
                                    cedula4 = 0;
                                    categoria4 = "";
                                    break;

                                }
                                case 2:{
                                    System.out.println("-----------------------Usuario 4 --------------------------------");
                                    System.out.println("");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("--------Nombre de usuario:  "+"                  "+nombre4);
                                    System.out.println("--------Numero de cedula: "+"                  "  +cedula4);
                                    System.out.println("--------Categoria: "+"                  "         +categoria4);
                                    System.out.println("----------------------------------------------");     
                                    System.out.println("Ha repobrado el curso, por consiguiente no entra en tramite para adquirir la licencia de conduccion");
                                    contacto_4 = false;
                                    nombre4 = "";
                                    cedula4 = 0;
                                    categoria4 = "";
                                    break;
                                }
                            }
                            break;
                        }
                        case 5:{
                            System.out.println("Seleccione alguna de las siguientes opciones: ");
                            System.out.println("1.Aprobar");
                            System.out.println("2.Reprobar");
                            seleccionar = dato4.nextInt();

                            switch (seleccionar) {
                                case 1:{
                                    System.out.println("-----------------------Usuario 5 --------------------------------");
                                    System.out.println("");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("--------Nombre de usuario:  "+"                  "+nombre5);
                                    System.out.println("--------Numero de cedula: "+"                  "  +cedula5);
                                    System.out.println("--------Categoria: "+"                  "         +categoria5);
                                    System.out.println("----------------------------------------------");     
                                    System.out.println("Ha aprobado el curso, por consiguiente entra en tramite para adquirir la licencia de conduccion");
                                    contacto_5 = false;
                                    nombre5 = "";
                                    cedula5 = 0;
                                    categoria5 = "";
                                    break;

                                }
                                case 2:{
                                    System.out.println("-----------------------Usuario 5 --------------------------------");
                                    System.out.println("");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("--------Nombre de usuario:  "+"                  "+nombre5);
                                    System.out.println("--------Numero de cedula: "+"                  "  +cedula5);
                                    System.out.println("--------Categoria: "+"                  "         +categoria5);
                                    System.out.println("----------------------------------------------");     
                                    System.out.println("Ha repobrado el curso, por consiguiente no entra en tramite para adquirir la licencia de conduccion");
                                    contacto_5 = false;
                                    nombre5 = "";
                                    cedula5 = 0;
                                    categoria5 = "";
                                    break;
                                }
                            }
                            break;
                        }
                        case 6:{
                            System.out.println("Seleccione alguna de las siguientes opciones: ");
                            System.out.println("1.Aprobar");
                            System.out.println("2.Reprobar");
                            seleccionar = dato4.nextInt();

                            switch (seleccionar) {
                                case 1:{
                                    System.out.println("-----------------------Usuario 6 --------------------------------");
                                    System.out.println("");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("--------Nombre de usuario:  "+"                  "+nombre6);
                                    System.out.println("--------Numero de cedula: "+"                  "  +cedula6);
                                    System.out.println("--------Categoria: "+"                  "         +categoria6);
                                    System.out.println("----------------------------------------------");     
                                    System.out.println("Ha aprobado el curso, por consiguiente entra en tramite para adquirir la licencia de conduccion");
                                    contacto_6 = false;
                                    nombre6 = "";
                                    cedula6 = 0;
                                    categoria6 = "";
                                    break;

                                }
                                case 2:{
                                    System.out.println("-----------------------Usuario 6 --------------------------------");
                                    System.out.println("");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("--------Nombre de usuario:  "+"                  "+nombre6);
                                    System.out.println("--------Numero de cedula: "+"                  "  +cedula6);
                                    System.out.println("--------Categoria: "+"                  "         +categoria6);
                                    System.out.println("----------------------------------------------");      
                                    System.out.println("Ha repobrado el curso, por consiguiente no entra en tramite para adquirir la licencia de conduccion");
                                    contacto_6 = false;
                                    nombre6 = "";
                                    cedula6 = 0;
                                    categoria6 = "";
                                    break;
                                }
                            }
                            break;
                        }
                        case 7:{
                            System.out.println("Seleccione alguna de las siguientes opciones: ");
                            System.out.println("1.Aprobar");
                            System.out.println("2.Reprobar");
                            seleccionar = dato4.nextInt();

                            switch (seleccionar) {
                                case 1:{
                                    System.out.println("-----------------------Usuario 7 --------------------------------");
                                    System.out.println("");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("--------Nombre de usuario:  "+"                  "+nombre7);
                                    System.out.println("--------Numero de cedula: "+"                  "  +cedula7);
                                    System.out.println("--------Categoria: "+"                  "         +categoria7);
                                    System.out.println("----------------------------------------------");     
                                    System.out.println("Ha aprobado el curso, por consiguiente entra en tramite para adquirir la licencia de conduccion");
                                    contacto_7 = false;
                                    nombre7 = "";
                                    cedula7 = 0;
                                    categoria7 = "";
                                    break;

                                }
                                case 2:{
                                    System.out.println("-----------------------Usuario 7 --------------------------------");
                                    System.out.println("");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("--------Nombre de usuario:  "+"                  "+nombre7);
                                    System.out.println("--------Numero de cedula: "+"                  "  +cedula7);
                                    System.out.println("--------Categoria: "+"                  "         +categoria7);
                                    System.out.println("----------------------------------------------");     
                                    System.out.println("Ha repobrado el curso, por consiguiente no entra en tramite para adquirir la licencia de conduccion");
                                    contacto_7 = false;
                                    nombre7 = "";
                                    cedula7 = 0;
                                    categoria7 = "";
                                    break;
                                }
                            }
                            break;
                        }
                        case 8:{
                            System.out.println("Seleccione alguna de las siguientes opciones: ");
                            System.out.println("1.Aprobar");
                            System.out.println("2.Reprobar");
                            seleccionar = dato4.nextInt();

                            switch (seleccionar) {
                                case 1:{
                                    System.out.println("-----------------------Usuario 8 --------------------------------");
                                    System.out.println("");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("--------Nombre de usuario:  "+"                  "+nombre8);
                                    System.out.println("--------Numero de cedula: "+"                  "  +cedula8);
                                    System.out.println("--------Categoria: "+"                  "         +categoria8);
                                    System.out.println("----------------------------------------------");     
                                    System.out.println("Ha aprobado el curso, por consiguiente entra en tramite para adquirir la licencia de conduccion");
                                    contacto_8 = false;
                                    nombre8 = "";
                                    cedula8 = 0;
                                    categoria8 = "";
                                    break;

                                }
                                case 2:{
                                    System.out.println("-----------------------Usuario 8 --------------------------------");
                                    System.out.println("");
                                    System.out.println("----------------------------------------------");
                                    System.out.println("--------Nombre de usuario:  "+"                  "+nombre8);
                                    System.out.println("--------Numero de cedula: "+"                  "  +cedula8);
                                    System.out.println("--------Categoria: "+"                  "         +categoria8);
                                    System.out.println("----------------------------------------------");     
                                    System.out.println("Ha repobrado el curso, por consiguiente no entra en tramite para adquirir la licencia de conduccion");
                                    contacto_8 = false;
                                    nombre8 = "";
                                    cedula8 = 0;
                                    categoria8 = "";
                                    break;
                                }
                            }
                            break;
                        }                        

                        
                          
                            

                    }
                }
 
    

                    break;

            
                default:
                    break;
            }

        }while(opcion<4 && opcion>0);
    }
}