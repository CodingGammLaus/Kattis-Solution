import java.util.Scanner;

/**
 * Made by Simon Lindgren
 * 
 * Kattis: https://open.kattis.com/problems/afjormun
 */

public class Afjörmun {
 
    public static void main(String []args) {
    
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String arr[] = new String[n];
        scanner.nextLine();

        for(int i = 0; i < n; i++) {

            String str = scanner.nextLine();

            str = str.toLowerCase();
            str = str.substring(0, 1).toUpperCase() + str.substring(1); 

            arr[i] = str;
        }

        for(int i = 0; i < n; i++) {

            System.out.println(arr[i]);
        }

        scanner.close();
    }
}
