import java.util.Scanner; 

public class Taller1_4 {
    
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        String Pais = "", Capital = "";
        System.out.println(" ");
        System.out.println("Digite el nombre de la ciudad: ");
        Capital = dato.nextLine();
        System.out.println(" ");
        System.out.println("Digite el nombre del pais: ");
        Pais = dato.nextLine();
        System.out.println(" ");
        System.out.println("La ciudad "+Capital+" es la capital del pais "+Pais);
    }
}
