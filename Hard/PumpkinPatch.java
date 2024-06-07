import java.util.Arrays;
import java.util.Scanner;

/**
 * Made by Simon Lindgren
 * 
 * Kattis: https://open.kattis.com/problems/pumpkinpatch
 */

public class PumpkinPatch {

    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        int map[][] = new int[n][n];
        Arrays.stream(map).forEach(a -> Arrays.fill(a, -1));

        int pumpkins[][] = new int[p][4];

        for(int i = 0; i < p; i++) {

            int r = scanner.nextInt();
            int c = scanner.nextInt();
            pumpkins[i] = new int[]{r, c, 1, 1};

            map[r][c] = i;
        }

        // Grow pumpkin
        for(int day = 1; day <= d; day++) {

            for(int i = 0; i < p; i++) {

                int row = pumpkins[i][0];
                int col = pumpkins[i][1];

                if(map[row][col] == i && pumpkins[i][3] != 0) {

                    //Grow top
                    if(row - day >= 0 && map[row-day][col] < 0) {
                        map[row-day][col]--;
                    }

                    //Grow bottom
                    if(row + day < n && map[row+day][col] < 0) {
                        map[row+day][col]--;
                    }

                    //Grow left
                    if(col - day >= 0 && map[row][col-day] < 0) {
                        map[row][col-day]--;
                    }

                    //Grow rigth
                    if(col + day < n && map[row][col+day] < 0) {      
                        map[row][col+day]--;
                    }
                }
            }

            // Check pumpkin
            for(int i = 0; i < p; i++) {

                int row = pumpkins[i][0];
                int col = pumpkins[i][1];

                if(map[row][col] == i && pumpkins[i][3] != 0) {

                    //Check out of bounds
                    if(row - day < 0 || row + day >= n || col - day < 0 || col + day >= n) {

                        pumpkins[i][3] = 0;
                    }

                    //Check top
                    if(row - day >= 0 && (map[row-day][col] < -2 || map[row-day][col] > -1)) {
                        pumpkins[i][3] = 0;
                    }

                    //Check bottom
                    if(row + day < n && (map[row+day][col] < -2 || map[row+day][col] > -1)) {
                        pumpkins[i][3] = 0;
                    }

                    //Check left
                    if(col - day >= 0 && (map[row][col-day] < -2 || map[row][col-day] > -1)) {
                        pumpkins[i][3] = 0;
                    }

                    //Check rigth
                    if(col + day < n && (map[row][col+day] < -2 || map[row][col+day] > -1)) {
                        pumpkins[i][3] = 0;
                    }

                    if(pumpkins[i][3] != 0) {
                        pumpkins[i][2]++;
                    }
                }
            }
        }

        //Print pumpkins success
        for(int i = 0; i < p; i++) {
            System.out.println((pumpkins[i][3] == 1) ? "ALIVE" : pumpkins[i][2]);
        }
    	
        scanner.close();
    }  
}
