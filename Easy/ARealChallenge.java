import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;

/**
 * Made by Simon Lindgren
 * 
 * Kattis: https://open.kattis.com/problems/areal
 */

public class ARealChallenge {
    
    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger n = scanner.nextBigInteger();

        MathContext mc = new MathContext(21); 

        BigDecimal k = new BigDecimal(n);
        BigDecimal four = new BigDecimal("4");
        k = k.sqrt(mc);

        k = k.multiply(four);

        k = k.stripTrailingZeros();

        System.out.println(k);

        scanner.close();
    }
}
