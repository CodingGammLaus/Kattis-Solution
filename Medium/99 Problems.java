import java.util.Scanner;

public class Nine {

    public static void main(String []args) {
    
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int higher = ((n / 100) + 1) * 100 - 1;

        int lower = (n / 100) * 100 - 1;

        if (lower < 0) {
            lower += 100;
        }

        if((higher - n) > (n - lower)) {

            System.out.println(lower);
        }

        else {
            System.out.println(higher);
        }
    }
}
