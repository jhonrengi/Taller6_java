
import java.util.Scanner;

public class Taller2_1 {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        int edad = 0;

        System.out.println("Porfavor digite su edad: ");
        edad = dato.nextInt();

        if (edad >= 18){
            System.out.println("Usted es mayor de edad");
        }
    }
    
}
