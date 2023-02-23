import java.util.Random;
import java.util.Scanner;

public class Taller4_3 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int vector[] = new int[1000];
        int i = 0;
        int numeros=0;
        int contador = 0;
        Random numero = new Random();
        
        

        do{

            System.out.println("Porfavor digite un numero del 1 al 1000: ");
            numeros = dato.nextInt();
            
            for(i=1; i<=numeros; i++){

                if (numeros%i == 0){
                    contador = contador + 1;
                } 
                
            }
            if ( contador == 2){
                System.out.println("Es un numero primo"+numeros);

            }else{
                System.out.println("No es un numero primo"+numeros);
            }
            

        }while(i<numeros);
        
    }
    
}
