import java.util.Scanner;


public class If_and_else {

    public static void main(String[]args){

        Scanner inputs = new Scanner(System.in);

      

            System.out.print("Int X:");
            int X = inputs.nextInt();
            System.out.print("Int Y:");
            int Y = inputs.nextInt();


            if (X>Y){
                System.out.println(X +" "+"is larger");
            }else if (X==Y){
                System.out.println("The numbers are equal");
            }else{
                System.out.println(Y +" "+"is larger");
            }


          

         inputs.close();

    }

}
