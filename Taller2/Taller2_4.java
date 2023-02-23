import java.util.Scanner;

public class Taller2_4 {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        Scanner dato2 = new Scanner(System.in);
        int opcion = 0;
        int opcion2 = 0;
        int opcion3 = 0;
        int opcion4 = 0;
        String danos = " ";
        boolean novedad = false;


        System.out.println("Bienvinido a la tienda-video selecciona una opcion para continuar: ");
        System.out.println("1. Alquilar pelicula!");
        System.out.println("2. Consultar peliculas disponibles");
        System.out.println("3. Entregar pelicula");
        System.out.println("4. Salir");
        opcion = dato.nextInt();

        switch (opcion) {
            case 1:{
                System.out.println("########## Alquilar pelicula ##########");
                System.out.println("A continuacion observara las peliculas que estan disponibles: ");
                System.out.println("1. Titanic");
                System.out.println("2. Buscando a nemo");
                System.out.println("3. Los increibles");
                System.out.println("¿Cual desea alquilar?, (Porfavor digite el numero correspondiente de la pelicula)");
                opcion2 = dato.nextInt();

                switch (opcion2) {
                    case 1:{
                        System.out.println("felicidades, ha alquilado la pelicula (Titanic)");
                        
                        break;
                    }
                    case 2:{
                        System.out.println("felicidades, ha alquilado la pelicula (Buscando a nemo)");
                    }
                    case 3:{
                        System.out.println("felicidades, ha alquilado la pelicula (Los increibles)");
                    }
                
                }
                
                break;
            }
            
            case 2:{
                System.out.println("########## Consultar pelicula ##########");
                System.out.println("A continuacion observara las peliculas que estan disponibles: ");
                System.out.println("1. Titanic");
                System.out.println("2. Buscando a nemo");
                System.out.println("3. Los increibles");
                System.out.println("¿Cual desea alquilar?, (Porfavor digite el numero correspondiente de la pelicula)");
                opcion3 = dato.nextInt();

                switch (opcion3) {
                    case 1:{
                        System.out.println("felicidades, ha alquilado la pelicula (Titanic)");
                        
                        break;
                    }
                    case 2:{
                        System.out.println("felicidades, ha alquilado la pelicula (Buscando a nemo)");
                        break;
                    }
                    case 3:{
                        System.out.println("felicidades, ha alquilado la pelicula (Los increibles)");
                        break;
                    }
                
                }
                break;
            }

            case 3:{
                

                System.out.println("########## Consultar pelicula ##########");
                System.out.println("A continuacion digite el numero de la pelicula que va a entregar: ");
                System.out.println("1. Titanic");
                System.out.println("2. Buscando a nemo");
                System.out.println("3. Los increibles");
                opcion4 = dato.nextInt();

                switch (opcion4) {
                    case 1:{
                        System.out.println("¿La pelicula tiene alguna novedad?(true para si, false para no)");
                        novedad = dato.nextBoolean();
                        if (novedad = true){
                            System.out.println("Porfavor digite la novedad que tiene la pelicula: ");
                            danos = dato2.nextLine();
                            System.out.println("Se ha guardado la informacion, la pelicula tiene los siguientes daños: ");
                            System.out.println(danos);
                        }else{
                            System.out.println("Gracias por su entrega");
                        }
                        
                        
                        break;
                    }
                    case 2:{
                        System.out.println("¿La pelicula tiene alguna novedad?(true para si, false para no)");
                        novedad = dato.nextBoolean();
                        if (novedad = true){
                            System.out.println("Porfavor digite la novedad que tiene la pelicula: ");
                            danos = dato2.nextLine();
                            System.out.println("Se ha guardado la informacion, la pelicula tiene los siguientes daños: ");
                            System.out.println(danos);
                        }else{
                            System.out.println("Gracias por su entrega");
                        }
                        break;
                    }
                    case 3:{
                        System.out.println("¿La pelicula tiene alguna novedad?(true para si, false para no)");
                        novedad = dato.nextBoolean();
                        if (novedad = true){
                            System.out.println("Porfavor digite la novedad que tiene la pelicula: ");
                            danos = dato2.nextLine();
                            System.out.println("Se ha guardado la informacion, la pelicula tiene los siguientes daños: ");
                            System.out.println(danos);
                        }else{
                            System.out.println("Gracias por su entrega");
                        }
                        break;
                    }
                
                }
                break;
               
            }
            case 4:{
                System.out.println("Saliendo del programa");
               
                break;
            }

        }
    }
}
