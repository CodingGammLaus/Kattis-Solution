import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.IntStream;

class Test
{
    public static void main(String []args) throws FileNotFoundException
    {
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