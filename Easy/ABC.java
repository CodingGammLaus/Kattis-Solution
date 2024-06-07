import java.util.Arrays;
import java.util.Scanner;

/**
 * Made by Simon Lindgren
 * 
 * Kattis: https://open.kattis.com/problems/abc
 */

public class ABC {

    public static void main(String []args) {
    
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int arr[] = {a, b, c};

        Arrays.sort(arr);

        String line = scanner.next();


        if(line.charAt(0) == 'A') {

            if(line.charAt(1) == 'B') {

                System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
            }

            else {

                System.out.println(arr[0] + " " + arr[2] + " " + arr[1]);
            }
        }

        else if(line.charAt(0) == 'B') {
            
            if(line.charAt(1) == 'C') {

                System.out.println(arr[1] + " " + arr[2] + " " + arr[0]);
            }

            else {

                System.out.println(arr[1] + " " + arr[0] + " " + arr[2]);
            }
        }

        else {
            
            if(line.charAt(1) == 'A') {

                System.out.println(arr[2] + " " + arr[0] + " " + arr[1]);
            }

            else {

                System.out.println(arr[2] + " " + arr[1] + " " + arr[0]);
            }
        }

        scanner.close();
    }
}
