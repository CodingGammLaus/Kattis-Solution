import java.text.DecimalFormat;
import java.util.Scanner;

public class AboveAverage {

    public static void main(String []args) {
    
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        int c = scanner.nextInt();
        double arr[] = new double[c];

        for(int i = 0; i < c; i++) {

            int n = scanner.nextInt();
            double avg[] = new double[n];
            double procent = (double) 100 / n;
            double average = 0;

            for(int k = 0; k < n; k++) {

                int grade = scanner.nextInt();
                avg[k] = grade;
                average += grade;
            }

            average = average / n;
            int above = 0;

            for(int k = 0; k < n; k++) { 

                if(avg[k] > average) {

                    above++;
                }
            }

            arr[i] = procent * above;
        }

        for(int i = 0; i < c; i++) {
           
            System.out.println(df.format(arr[i]) + "%");
        }

        scanner.close();
    }
}