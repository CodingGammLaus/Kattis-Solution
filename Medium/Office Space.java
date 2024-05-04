import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OfficeSpace {
    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()) {
            
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            scanner.nextLine();
            
            int nr_of_employees = scanner.nextInt();
            scanner.nextLine();

            //Set up empty office
            int map[][] = new int[w+1][h+1];

            //Add all employees
            ArrayList<String> employees = new ArrayList<>();

            //Employees space
            int[] employees_space = new int[nr_of_employees];
            Arrays.fill(employees_space, 0);

            int contested = 0;
            int unallocated = 0;

            //Draw the employees desired space
            for(int i = 0; i < nr_of_employees; i++) {

                String name = scanner.next();
                employees.add(name);

                int x1 = scanner.nextInt();
                int y1 = scanner.nextInt();
                int x2 = scanner.nextInt();
                int y2 = scanner.nextInt();
                scanner.nextLine();

                for(int x = x1; x < x2; x++) {
                    for(int y = y1; y < y2; y++) {

                        //Conteseted space
                        if(map[x][y] != 0) {
                            map[x][y] = -1;
                        }

                        //Free space
                        else {
                            map[x][y] = i + 1;
                        }
                    }
                }
            }

            //Check employees space, contested and unallocated
            for (int x = 0; x < w; x++) {
                for (int y = 0; y < h; y++) {
                    
                    if (map[x][y] == 0) {
                        unallocated++;
                    } 
                    
                    else if (map[x][y] == -1) {
                        contested++;
                    } 
                    
                    else {
                        int index = map[x][y] - 1; 
                        employees_space[index]++;
                    }
                }
            }

            //Print office space report
            System.out.println("Total " + (w * h));
            System.out.println("Unallocated " + unallocated);
            System.out.println("Contested " + contested);

            for (int i = 0; i < nr_of_employees; i++) {
                System.out.println(employees.get(i) + " " + employees_space[i]);
            }

            if (scanner.hasNextLine()) {
                System.out.println(); 
            }
        }
        
        scanner.close();
    } 
}