import java.util.Scanner;

public class TwoDArray {
    public static void main(String args[]) {

        int row, col, i, j;
        int arr[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);

            System.out.print("Enter a numbers of Row: ");
            row = scan.nextInt();
            System.out.print("Enter a number of Column: ");
            col = scan.nextInt();

            System.out.println("Enter " + (row * col) + " Array Elements : ");
            
        for (i = 0; i < row; i++) {
            
            for (j = 0; j < col; j++) {
                    arr[i][j] = scan.nextInt();
                }
        }

            System.out.print("The Array is :\n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + "  ");
            }
            
            System.out.println();
        }
        
    }

}

