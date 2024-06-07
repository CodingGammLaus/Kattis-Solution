import java.util.Scanner;

public class Alphabet {

    public static void main(String []args) {

        String newalphabet[] = {"@", "8", "(", "|)", "3", "#", "6", "[-]", "|", "_|", "|<", "1", "[]\\/[]", "[]\\[]", 
        "0", "|D", "(,)", "|Z", "$", "']['", "|_|", "\\/", "\\/\\/", "}{", "`/", "2"};
    
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        scanner.close();

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {

            if((int)str.charAt(i) > 96 && (int)str.charAt(i) < 123) {
                System.out.print(newalphabet[(int)str.charAt(i) - 97]);
            }

            else {
                System.out.print(str.charAt(i));
            }
        }
    }
}