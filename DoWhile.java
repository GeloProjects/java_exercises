import java.util.Scanner;


public class DoWhile {
    public static void main(String[]args){

        Scanner name = new Scanner(System.in);

        System.out.println("What is your name?");
        String N = name.nextLine();
        int a = 1;

        do{
            System.out.println(N);
            a++;
        }while(a<=100);
        name.close();
    }
    
}
