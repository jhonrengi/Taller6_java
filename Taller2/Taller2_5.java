import java.util.Scanner;

public class Taller2_5 {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        Scanner dato2 = new Scanner(System.in);
        int opcion = 0;
        int opcion2 = 0;
        int opcion3 = 0;
        int numero = 0;
        String medicamento = "", esperaba = "";
        boolean confirmar = false, confirmar2=false, confirmar3=false;


        System.out.println("Bienvenido a la drogueria MI SALUD, porfavro seleccione alguna de las siguientes opciones: ");
        System.out.println("1.Comprar producto");
        System.out.println("2.Consultar precios");
        System.out.println("3.Devoluciones");
        System.out.println("4. Salir");
        opcion = dato.nextInt();

        switch (opcion) {
            case 1:{
                System.out.println("############# Comprar producto #############");
                System.out.println("Porfavor seleccione algunas de las siguientes categorias: ");
                System.out.println("1.Para aliviar el dolor");
                System.out.println("2.Para la tension");
                System.out.println("3.Para la acidez");
                opcion2 = dato.nextInt();

                switch (opcion2) {
                    case 1:{
                        System.out.println("############# Medicamentos para el dolor #############");
                        System.out.println("A continuacion se muestran los medicamentos disponibles: ");
                        System.out.println("Tabla x12: ");
                        System.out.println("1.Acetaminofen 50mg: Medicamento para el dolor, fiebre, congestion");
                        System.out.println("2.Ibuprofeno 50mg: Medicamento para el dolor, fiebre, dolor corporal");
                        System.out.println("3.Naproxeno 100mg: Medicamento exclusivo para el dolor del cuerpo y congestion");
                        System.out.println("¿Porfavor digite el numero del medicamento que desea comprar: ");
                        numero = dato.nextInt();

                        if (numero == 1){
                            System.out.println("Esta a punto de comprar el medicamento (acetaminofen de 50mg) por 2000 pesos");
                            System.out.println("Esta seguro? (true Para si, false para no)");
                            confirmar = dato.nextBoolean();

                            if (confirmar ==  true){

                                System.out.println("Ha comprado tabla de acetaminofen de 50mg");
                                System.out.println("Gracias por su compra");
                            }else{
                                System.out.println("Regresando al menu");
                            }
                        }else if (numero == 2){
                            System.out.println("Esta a punto de comprar el medicamento (ibuprofeno de 50mg) por 3500 pesos");
                            System.out.println("Esta seguro? (true Para si, false para no)");
                            confirmar2 = dato.nextBoolean();

                            if (confirmar2 ==  true){

                                System.out.println("Ha comprado tabla de ibuprofeno de 50mg");
                                System.out.println("Gracias por su compra");
                            }else{
                                System.out.println("Regresando al menu");
                            }

                        }else if (numero == 3){
                            System.out.println("Esta a punto de comprar el medicamento ( naproxeno de 100mg) por 8000 pesos");
                            System.out.println("Esta seguro? (true Para si, false para no)");
                            confirmar3 = dato.nextBoolean();

                            if (confirmar3 ==  true){

                                System.out.println("Ha comprado tabla de naproxeno de 100mg");
                                System.out.println("Gracias por su compra");
                            }else{
                                System.out.println("Regresando al menu");
                            }
                        }

                        
                        break;
                    }
                    case 2:{

                        System.out.println("############# Medicamentos para la tension #############");
                        System.out.println("A continuacion se muestran los medicamentos disponibles: ");
                        System.out.println("Tabla x12: ");
                        System.out.println("1.Losartan 50mg: Medicamento exclusivo para la hipertension");
                        System.out.println("2.Hygroton 50mg: Medicamento exclusivo para la tension alta");
                        System.out.println("3.Diuril 100mg: Medicamento exclusivo para la tension alta y baja");
                        System.out.println("¿Porfavor digite el numero del medicamento que desea comprar: ");
                        numero = dato.nextInt();

                        if (numero == 1){
                            System.out.println("Esta a punto de comprar el medicamento ( Losartan de 50mg) por 4500 pesos");
                            System.out.println("Esta seguro? (true Para si, false para no)");
                            confirmar = dato.nextBoolean();

                            if (confirmar ==  true){

                                System.out.println("Ha comprado tabla de Losartan de 50mg");
                                System.out.println("Gracias por su compra");
                            }else{
                                System.out.println("Regresando al menu");
                            }
                        }else if (numero == 2){
                            System.out.println("Esta a punto de comprar el medicamento ( Hygroton de 50mg) por 5000 pesos");
                            System.out.println("Esta seguro? (true Para si, false para no)");
                            confirmar2 = dato.nextBoolean();

                            if (confirmar2 ==  true){

                                System.out.println("Ha comprado tabla de Hygroton de 50mg");
                                System.out.println("Gracias por su compra");
                            }else{
                                System.out.println("Regresando al menu");
                            }

                        }else if (numero == 3){
                            System.out.println("Esta a punto de comprar el medicamento ( Diuril de 100mg) por 6000 pesos");
                            System.out.println("Esta seguro? (true Para si, false para no)");
                            confirmar3 = dato.nextBoolean();

                            if (confirmar3 ==  true){

                                System.out.println("Ha comprado tabla de Diuril de 100mg");
                                System.out.println("Gracias por su compra");
                            }else{
                                System.out.println("Regresando al menu");
                            }
                        }

                        break;

                    }
                    case 3:{
                        System.out.println("############# Medicamentos para el acidez #############");
                        System.out.println("A continuacion se muestran los medicamentos disponibles: ");
                        System.out.println("");
                        System.out.println("1.Milanta x500 ml: Medicamento para aliviar al acidez y el reflujo ");
                        System.out.println("2.gabizcon, cajax12 (10 ml): Medicamento para aliviar al acidez y el reflujo ");
                        System.out.println("3.Hiosina 50mg: Medicamento Medicamento para aliviar al acidez, el reflujo, el dolor abdominal y prevenir ulceras.");
                        System.out.println("¿Porfavor digite el numero del medicamento que desea comprar: ");
                        numero = dato.nextInt();

                        if (numero == 1){
                            System.out.println("Esta a punto de comprar el medicamento (Milanta de 500ml) por 23000 pesos");
                            System.out.println("Esta seguro? (true Para si, false para no)");
                            confirmar = dato.nextBoolean();

                            if (confirmar ==  true){

                                System.out.println("Ha comprado tabla de Milanta de 500ml");
                                System.out.println("Gracias por su compra");
                            }else{
                                System.out.println("Regresando al menu");
                            }
                        }else if (numero == 2){
                            System.out.println("Esta a punto de comprar el medicamento (gabizcon,cajax12 (10 ml)) por 25000 pesos");
                            System.out.println("Esta seguro? (true Para si, false para no)");
                            confirmar2 = dato.nextBoolean();

                            if (confirmar2 ==  true){

                                System.out.println("Ha comprado tabla de gabizcon,cajax12 (10 ml)");
                                System.out.println("Gracias por su compra");
                            }else{
                                System.out.println("Regresando al menu");
                            }

                        }else if (numero == 3){
                            System.out.println("Esta a punto de comprar el medicamento (Hiosina de 50mg)) por 8000 pesos");
                            System.out.println("Esta seguro? (true Para si, false para no)");
                            confirmar3 = dato.nextBoolean();

                            if (confirmar3 ==  true){

                                System.out.println("Ha comprado tabla de Hiosina de 50mg");
                                System.out.println("Gracias por su compra");
                            }else{
                                System.out.println("Regresando al menu");
                            }
                        }
                    }
                
                }
                
                break;
            }
            
            case 2:{
                System.out.println("############# Consultar precios #############");
                System.out.println("A continuacion se observa la lista de los productos disponibles: ");
                System.out.println("1.Acetaminofen 50mg: 2000 pesos");
                System.out.println("2.Ibuprofeno 50mg: 3500 pesos");
                System.out.println("3.Naproxeno 100mg: 4500 pesos");
                System.out.println("4.Losartan 50mg: 8000 pesos");
                System.out.println("5.Hygroton 50mg: 5000 pesos");
                System.out.println("6.Diuril 100mg: 6000 pesos");
                System.out.println("7.Milanta x500 ml: 23000 pesos");
                System.out.println("8.gabizcon, cajax12 (10 ml): 25000 pesos ");
                System.out.println("9.Hiosina 50mg: 8000 pesos");
                
                break;
            }

            case 3:{
                

                System.out.println("############# Devoluciones #############");
                System.out.println("Porfavor digite el nombre del medicamento que desea realizar la devolucion");
                medicamento = dato2.nextLine();
                System.out.println("¿Cual es la razon por la que desea realizar la devolucion?");
                System.out.println("1. No era el medicamento esperado.");
                System.out.println("2.El medicamento esta vencido o esta apunto de vencerce.");
                opcion3 = dato.nextInt();

                switch (opcion3) {
                    case 1:{
                        System.out.println("Digite el nombre del medicamento que esperaba: ");
                        esperaba = dato2.nextLine();
                        System.out.println("Se hara el cambio del medicamento: "+medicamento+" Por "+esperaba);
                        System.out.println("Porfavor envie el medicamento a la siguiente direccion: ");
                        System.out.println("Calle xxxxx, numero xxxx");
                        System.out.println("De otro modo, comuniquese al #########");
                        System.out.println("Gracias por su tiempo");
                    
                        break;
                    }
                    case 2:{
                        System.out.println("Porfavor envie el medicamento a la siguiente direccion: ");
                        System.out.println("Calle xxxxx, numero xxxx");
                        System.out.println("De otro modo, comuniquese al #########");
                        System.out.println("Gracias por su tiempo");
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
