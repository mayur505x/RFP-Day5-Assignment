import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Temperature t = ");
        double t = scan.nextInt();

        System.out.print("Wind Speed v = ");
        double v = scan.nextInt();

        if ( t > 50 ||  v < 120) {

            if (v > 3) {

                double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
                System.out.println("Wind chill  = " + w);

            }

            else {
                System.out.println("Invalid input: if t is larger than 50 in absolute value or if v is larger\n" +
                        "than 120 or less than 3");
            }

        }

    }

}
