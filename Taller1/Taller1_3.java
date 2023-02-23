import java.util.Scanner; 

public class Taller1_3 {
    
    public static void main (String args[]) {

        Scanner dato = new Scanner(System.in);
        String nombre = "", apellido = "";
        String nombrepadre = "", apellidopadre = "";
        String nombremadre = "", apellidomadre = "";


        System.out.println("Porfavor digite su nombre: ");
        nombre = dato.nextLine();
        System.out.println(" ");
        System.out.println("Porfavor digite su apellido: ");
        apellido = dato.nextLine();
        System.out.println(" ");
        System.out.println("####### Infomracion de padre #######");
        System.out.println(" ");
        System.out.println("Porfavor digite el nombre de su padre: ");
        nombrepadre = dato.nextLine();
        System.out.println(" ");
        System.out.println("Porfavor digite el apellido de su padre: ");
        apellidopadre = dato.nextLine();
        System.out.println(" ");
        System.out.println("####### Infomracion de madre #######");
        System.out.println(" ");
        System.out.println("Porfavor digite el nombre de su madre: ");
        nombremadre = dato.nextLine();
        System.out.println(" ");
        System.out.println("Porfavor digite el apellido de su madre: ");
        apellidomadre = dato.nextLine();
        System.out.println(" ");
        System.out.println("yo " + nombre + " "+ apellido + " soy hijo de "+ nombrepadre + " " + apellidopadre+ " y "+nombremadre + " " + apellidomadre);
        



    }
}