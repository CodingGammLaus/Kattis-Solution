import java.util.Scanner;

/**
 * Made by Simon Lindgren
 * 
 * Kattis: https://open.kattis.com/problems/aaah
 */

public class Aaah {
    
      public static void main(String []args) {
    
        Scanner scanner = new Scanner(System.in);
            
        String jon = scanner.nextLine();
        String doctor = scanner.nextLine();

        scanner.close();

        if(jon.length() >= doctor.length()) {

            System.out.println("go");
        }

        else {
            System.out.println("no");
        }
      }
}
