import java.util.Scanner;

/**
 * Made by Simon Lindgren
 * 
 * Kattis: https://open.kattis.com/problems/asciikassi2
 */

public class ASCIIKassi2 {
    
    public static void main(String []args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        System.out.println(" ".repeat(n) + " x");

        if(n > 0) {

            for(int i = 1; i <= n; i++) {

                System.out.println(" ".repeat(n +1 - i) + "/" + " ".repeat(i*2-1) + "\\");
            }

            System.out.println("x" + " ".repeat((n*2)+1) + "x");

            for(int i = n; i > 0; i--) {

                System.out.println(" ".repeat(n +1 - i) + "\\" + " ".repeat(i*2-1) + "/");
            }
        }

        else {

            System.out.println("x x");
        }

        System.out.println(" ".repeat(n) + " x");
    }
}
