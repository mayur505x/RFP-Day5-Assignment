import java.util.Scanner;

public class LeapYear {
    public static void main(String []args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Year in YYYY format: ");
        int year = scan.nextInt();

        if (year < 1000 ) {
            System.out.println("Invalid Input, Please enter year in YYYY format");
        }

        if( year % 4 == 0 ) {
            System.out.println("Leap");
            if (year % 100 == 0) {
                System.out.println("Leap");
                if (year % 400 == 0) {
                    System.out.println("Leap");
                }
            }
        }

        else {
            System.out.println("This year is not leap year");
        }

    }

}
