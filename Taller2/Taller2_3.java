import java.util.Scanner;

public class Taller2_3 {

    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        int edad = 0;
        String nombre = "";
        String apellido = "";

        System.out.println("Porfavor digite su nombre: ");
        nombre = dato.nextLine();

        System.out.println("Porfavor digite su apellido: ");
        apellido = dato.nextLine();

        System.out.println("Porfavor digite su edad: ");
        edad = dato.nextInt();

        if (edad >= 18){
            System.out.println(nombre+" "+ apellido + " usted es mayor de edad por lo tanto, puede ingresar a la fiesta");
        }else {
            System.out.println(nombre+" "+ apellido + " usted es menor de edad por lo tanto, no puede ingresar a la fiesta, porfavor devuelvase a su casa");
        }
    }
}
