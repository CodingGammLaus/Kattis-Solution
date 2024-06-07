import java.util.Scanner;

/**
 * Made by Simon Lindgren
 * 
 * Kattis: https://open.kattis.com/problems/addtwonumbers
 */

public class AddTwoNumbers {
    
    public static void main(String []args) {
    
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        System.out.println((a + b));
    }
}
