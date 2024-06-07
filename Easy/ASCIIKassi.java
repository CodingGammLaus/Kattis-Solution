import java.util.Scanner;

/**
 * Made by Simon Lindgren
 * 
 * Kattis: https://open.kattis.com/problems/asciikassi
 */

public class ASCIIKassi {
    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        scanner.close();

        if(number > 0) {

            String prints = "|" + " ".repeat(number) + "|";

            System.out.println("+" + "-".repeat(number) + "+");

            for(int i = 0; i < number; i++) {
                System.out.println(prints);
            }

            System.out.println("+" + "-".repeat(number) + "+");
        }

        else {
            System.out.println("++");
            System.out.println("++");
        }
    }
};