import java.util.Scanner;


public class Taller4_5 {

    public static void main(String[] args) {
        
        int matriz[][] = new int[11][11];
        int i,j;
        Scanner dato = new Scanner(System.in);
        

        

        for (i =0 ; i<=10; i++){
            for(j = 0; j<=10; j++){
                matriz[i][j]=i*j;
                
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for(i=0;i<=10; i++){
            for(j=0;j<=10;j++){
                if(i!=10){
                    System.out.print(j+" x "+i+"   ");
                }
                else{
                    System.out.print(j+" x "+i+"  ");
                }
                
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Porfavor digite un numero al azar de las filas: ");
        i = dato.nextInt();
        System.out.println();
        System.out.print("Porfavor digite un numero al azar de las columnas: ");
        j = dato.nextInt();
        System.out.println();
        System.out.print("El resultado encontrado dentro de la tabla es: "+matriz[i][j]);






       

       
        


    }
    
}
