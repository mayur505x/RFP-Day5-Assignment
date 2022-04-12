import java.util.Scanner;

public class SwapNumber {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        
        /*User Input*/
        System.out.println("***** Before Swapping Number *****");
        System.out.print("First Number: ");
        int a = scan.nextInt();
        System.out.print("Second Number: ");
        int b = scan.nextInt();
        
        /*Iteration for Swap Numbers*/ 
        int temp = a;
        a = b;
        b = temp;

        /*Print Output*/
        System.out.println("***** After Swapping Number *****");
        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);

    }

}
