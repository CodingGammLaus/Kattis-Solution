import java.math.BigInteger;
import java.util.Scanner;

class ADifferentProblem {

    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextBigInteger()) {
            
            BigInteger x = scanner.nextBigInteger(); 
            BigInteger y = scanner.nextBigInteger();

            BigInteger value = x.subtract(y);

            System.out.println(value.abs());
        }

        scanner.close();
    }
}