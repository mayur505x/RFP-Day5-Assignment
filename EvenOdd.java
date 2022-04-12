import java.util.Scanner;

public class EvenOdd {
    public static void main(String []args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("We will tell you Number is Even or Odd.");
        System.out.print("Enter a Number:");
        int n = scan.nextInt();

         if ( n%2 == 0 )
             System.out.println( n + " is Even");
         else {
             System.out.println(n + " is Odd");
         }

    }

}
