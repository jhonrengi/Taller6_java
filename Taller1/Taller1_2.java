
import java.util.Scanner; 

public class Taller1_2 {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        String nombre = "";
        String apellido = "";
        int edad = 0;
        double estatura = 0;

        System.out.println("Porfavor digite su nombre: ");
        nombre = dato.nextLine();
        System.out.println(" ");
        System.out.println("Porfavor digite su apellido: ");
        apellido =dato.nextLine();
        System.out.println(" ");
        System.out.println("Porfavor digite su edad: ");
        edad = dato.nextInt();
        System.out.println(" ");
        System.out.println("Porfavor digite su estatura (Utilice coma en vez de punto): ");
        estatura = dato.nextDouble();
        System.out.println(" ");
        System.out.println("Hola "+ nombre+ " " + apellido+ " Usted tiene "+edad+ " Años y mide "+ estatura);
        
    }
    
}
