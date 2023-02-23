import java.util.Scanner;
public class Taller3_5 {
    

    public static void main(String[] args) {
        Scanner dato = new Scanner (System.in);
        int opcion;

        
        do{
            System.out.println("Menu de usuario");
            System.out.println("1.Capturar nombre");
            System.out.println("2.Saludar persona");
            System.out.println("3.Salir del sistema");
            opcion = dato.nextInt();

        }while(opcion<3 && opcion>0);
    }
}
