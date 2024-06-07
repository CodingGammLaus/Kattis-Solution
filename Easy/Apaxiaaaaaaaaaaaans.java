import java.util.Scanner;

/**
 * Made by Simon Lindgren
 * 
 * Kattis: https://open.kattis.com/problems/apaxiaaans
 */

public class Apaxiaaaaaaaaaaaans {

    public static void main(String []args) {
    
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();       
        scanner.close();

        for(int i = 0; i < str.length(); i++) {

            if(i == 0) {

                System.out.print(str.charAt(i));
            }

            else if(str.charAt(i - 1) != str.charAt(i)) {

                System.out.print(str.charAt(i));
            }
        }

        System.out.println();
    }
}