import java.util.Scanner; 

public class Taller1_5 {
    
    public static void main (String args[]) {

        Scanner dato = new Scanner(System.in);
        String nombre = "", apellido = "";
        String nombremascota = "", tipomascota = "";
        int edadmascota = 0;


        System.out.println("Porfavor digite su nombre: ");
        nombre = dato.nextLine();
        System.out.println(" ");
        System.out.println("Porfavor digite su apellido: ");
        apellido = dato.nextLine();
        System.out.println(" ");
        System.out.println("####### Infomracion de la mascota #######");
        System.out.println(" ");
        System.out.println("Porfavor digite el nombre de su mascota ");
        nombremascota = dato.nextLine();
        System.out.println(" ");
        System.out.println("Porfavor digite la raza o el tipo de su mascota: ");
        tipomascota = dato.nextLine();
        System.out.println(" ");
        System.out.println("Porfavor digite la edad de su mascota: ");
        edadmascota = dato.nextInt();
        System.out.println(" ");
        System.out.println(nombremascota + " es de raza o tipo  "+ tipomascota + ", el cual, tiene "+ edadmascota + " años de edad " + " y "+nombre + " " + apellido+" es su dueño");
    }
}
