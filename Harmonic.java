import java.util.Scanner;

public class Harmonic {
    static float nthHarmonic(int n)
    {
        float harmonic = 1;

        for (int i = 2; i <= n; i++) {
            harmonic += (float)1 / i;
        }

        return harmonic;

    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number to find harmonic value: ");
        int n = scan.nextInt();

        System.out.print(nthHarmonic(n));

    }

}
