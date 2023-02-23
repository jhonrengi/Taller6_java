public class Taller3_3 {
    public static void main(String[] args) {
        int n = 9;
        int i = 0;
        do{
            for (i = 1; i<=n; i++){
                for(int j =i; j<=n ; j++){
                    System.out.print(" ");
                }
                for (int j = 1; j<i ; j++){
                    System.out.print("*");
                }
                for (int j = 1; j<=i ; j++){
                    System.out.print("*");
                }
                
                
                System.out.println();
            }
            System.out.println("        ***\n        ***\n       *****\n");
        }while(i<9); 
    }
}
