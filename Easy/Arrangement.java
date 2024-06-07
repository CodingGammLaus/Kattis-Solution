import java.util.Scanner;

/**
 * Made by Simon Lindgren
 * 
 * Kattis: https://open.kattis.com/problems/upprodun
 */

public class Arrangement {

    public static void main(String []args) {
    
        Scanner scanner = new Scanner(System.in);

        int rooms = scanner.nextInt();
        int teams = scanner.nextInt();       
        scanner.close();

        int stars = teams / rooms;
        boolean extra = true;

        for(int i = 0; i < rooms; i++) {

            for(int j = 0; j < stars; j++) {

                if(stars * rooms != teams && extra) {

                    System.out.print("*");
                    teams--;
                    extra = false;
                }

                System.out.print("*");
            }

            extra = true;
            System.out.println();
        }
    }
}