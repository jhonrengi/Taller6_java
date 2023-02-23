import java.util.Random;

public class Taller4_2 {
    public static void main(String[] args) {
        int vector[] = new int[20];
        int i = 0;
        int numeros;
        Random numero = new Random();
        
        

        do{

            
            
            for(i=0; i<vector.length; i++){
                numeros = (int) (Math.random()*1000+1);
                vector[i] = numeros;

                if (vector[i]%2 == 0){
                    System.out.println("Numero par "+vector[i]);
                    
                }else{
                    System.out.println("Numero impar "+vector[i]);
                    
                }

                vector[i] = 0;
            }
            

        }while(i<vector.length);
        
    }
    
}
