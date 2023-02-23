public class Taller3_2 {

    public static void main(String[] args) {
        int n = 9;
        do{
            for (int i = 1; i<=n; i++){
                for(int j =i; j<=n ; j++){
                    System.out.print(" ");
                }
                for (int j = 1; j<=i ; j++){
                    System.out.print("*");
                }
                
                System.out.println();
            }
        }while(n>9);  
    }
    
}
