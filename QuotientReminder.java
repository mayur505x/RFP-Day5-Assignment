import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {
	
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Dividend: ");
        int dividend = scan.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = scan.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);

    }

}
