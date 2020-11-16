import java.util.Scanner;

public class Operators2 {
    public static void main(String[]args){

     Scanner integer = new Scanner(System.in);
    
    
        System.out.print("Enter Number:");
        int num = integer.nextInt();
        String number = (num % 2 == 0)? "even":"odd";
        System.out.print(num+" "+"is"+" "+ number); 
        
       
  
    }
}  