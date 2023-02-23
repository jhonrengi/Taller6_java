
import java.util.Scanner;

public class Taller4_1 {


    public static void main(String[] args) {

        int vector[] = new int[5];
        Scanner dato1 = new Scanner(System.in);
    

        int numero1=0;
        int numero2=0;
        int numero3=0;
        int numero4=0;
        int numero5=0;

        System.out.println("Digite un numero al azar: ");
        numero1 = dato1.nextInt();

        System.out.println("Digite un numero al azar: ");
        numero2 = dato1.nextInt();

        System.out.println("Digite un numero al azar: ");
        numero3 = dato1.nextInt();

        System.out.println("Digite un numero al azar: ");
        numero4 = dato1.nextInt();

        System.out.println("Digite un numero al azar: ");
        numero5 = dato1.nextInt();

        vector[0] = numero1;
        vector[1] = numero2;
        vector[2] = numero3;
        vector[3] = numero4;
        vector[4] = numero5;

        for (int i = 0; i < vector.length; i++) {
            System.out.println();
            System.out.println("Matriz[0]"+"="+vector[i]);

            for (i = 1; i < vector.length; i++) {
                System.out.println("Matriz[1]"+"="+vector[i]);
                for (i = 2; i < vector.length; i++) {
                    System.out.println("Matriz[2]"+"="+vector[i]);
                    for (i = 3; i < vector.length; i++) {
                        System.out.println("Matriz[3]"+"="+vector[i]);  
                        for ( i = 4; i < vector.length; i++) {
                            System.out.println("Matriz[4]"+"="+vector[i]);
                            System.out.println();   
                        } 
                    }
                }
            }


        }

        

    }
    
}
