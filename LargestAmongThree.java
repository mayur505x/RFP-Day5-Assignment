
public class LargestAmongThree {
    public static void main(String[] args) {

        double n1= 110, n2 = 304, n3 = 505.5;

        if( n1 >= n2 && n1 >= n3)
            System.out.println("Largest Number= " + n1);

        else if (n2 >= n1 && n2 >= n3)
            System.out.println("Largest Number= " + n2);

        else
            System.out.println("Largest Number= " + n3);

    }

}
