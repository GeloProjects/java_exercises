import java.util.Scanner;

public class Operators {
    public static void main(String[]args){

       Scanner integer = new Scanner(System.in);

     
        System.out.print("Enter integer A:");
        int A = integer.nextInt();
        System.out.print("Enter integer B:");
        int B = integer.nextInt();
        System.out.print("Ente integer C:");
        int C = integer.nextInt();
 
         System.out.printf("Sum= %d%n", (A+B+C));
         System.out.printf("Average = %.2f%n", (double)(A+B+C)/3);
         System.out.printf("Product = %d%n", (A*B*C));
        
      
      
        integer.close();
    }
}
