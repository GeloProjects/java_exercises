import java.util.Scanner;

public class WhileLoop {
    public static void main(String[]args){


        Scanner name = new Scanner(System.in);

        System.out.println("Enter Name:");
        String N = name.nextLine();

        int a = 1;

        while(a <=100){

            System.out.println(N);
            a++;
        }
    
        name.close();
    }

   
}