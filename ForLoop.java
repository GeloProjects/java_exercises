import java.util.Scanner;

public class ForLoop {
    public static void main(String[]args){

        Scanner name = new Scanner(System.in);

        System.out.println("What is your name?");
        String N = name.nextLine();
        int i;
        for(i = 1; i <=100; i++){
            System.out.println(N);


            name.close();
        
        }
       
    }
}
