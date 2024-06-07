import java.util.Scanner;

/**
 * Made by Simon Lindgren
 * 
 * Kattis: https://open.kattis.com/problems/autori
 */

public class Autori {
    public static void main(String []args) {
    
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();      
        scanner.close();

        System.out.print(str.charAt(0));

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == '-') {

                System.out.print(str.charAt(i+1));
            }
        }

        System.out.println();
    }
}
