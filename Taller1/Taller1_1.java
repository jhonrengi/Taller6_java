import java.util.Scanner; 

public class Taller1_1 {
    
    public static void main (String args[]) {

        Scanner dato = new Scanner(System.in);
        String nombre = "", apellido = "";

        System.out.println("Porfavor digite su nombre: ");
        nombre = dato.nextLine();

        System.out.println("Porfavor digite su apellido: ");
        apellido = dato.nextLine();

        System.out.println("Bienveido " + nombre + " "+ apellido);
        



    }
}
