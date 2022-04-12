import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
		System.out.println("Enter First: ");
        int x = scan.nextInt();
        
		System.out.println("Enter second: ");
        int y = scan.nextInt();


        double dist = Math.sqrt(x*x + y*y);
			
			System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
		
    }
    
}