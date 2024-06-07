import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Made by Simon Lindgren
 * 
 * Kattis: https://open.kattis.com/problems/acm
 */

public class ACMContestScoring {

    public static void main(String []args) {
    
        Scanner scanner = new Scanner(System.in);

        int min = scanner.nextInt();
        int right = 0;
        int total = 0;

        ArrayList<String> problems = new ArrayList<>();

        while(min != -1) {

            String letter = scanner.next();
            String dir = scanner.next();

            if(dir.equals("right")) {

                right++;
                total += min;
                total += 20 * (Collections.frequency(problems, letter));
            }

            else if(dir.equals("wrong")) {

                problems.add(letter);
            }

            min = scanner.nextInt();
        }

        System.out.println(right + " " + total);

        scanner.close();
    }
}
