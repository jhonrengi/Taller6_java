import java.util.Scanner;
public class Taller3_1 {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        int n;
        System.out.println("Porfavor digite un numero: ");
        n = dato.nextInt();
        
        for(int i = 1 ; i <= n ; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  
        }
    }
}
