import java.util.Scanner;

class CheckVowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write an Alphabet: ");

        char x = scan.next().charAt(0);
        String y = " is Vowel";
        
        switch (x) {
            case 'a':
                System.out.println(x + y);
                break;
                
            case 'e':
                System.out.println(x + y);
                break;

            case 'i':
                System.out.println(x + y);
                break;
                
            case 'o':
                System.out.println(x + y);
                break;

            case 'u':
                System.out.println(x + y);
                break;


            default:
                System.out.println(x + " is Consonant");
				
        }

    }

}