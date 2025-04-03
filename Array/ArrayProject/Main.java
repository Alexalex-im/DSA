    //  Array Project

    //  Find Number of Days Above Average Temperature
    //  How many day's temperature?     2
    //  Day 1's high temp: 1
    //  Day 2's high temp: 2

    // Output
    // Average = 1.5
    // 1 day(s) above average

package Array.ArrayProject;
    

import java.util.*;

class Main {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("How many day's tempeature? ");
        int numDays = console.nextInt();
        int[] temps = new int[numDays];

        // record temperature and find average
        int sum = 0;
        for (int i=0; i<numDays; i++)
        {
            System.out.print( "Day" + (i+1) + "'s high temp: ");
            // int next = console.nextInt();
            temps[i] = console.nextInt();
            sum += temps[i];

            // sum += next;
        }

        double average = sum / numDays;

        // count days above average
        int above = 0;
        for (int i=0; i<temps.length; i++)
        {
            if (temps[i] > average)
            {
                above++;
            }
        }
        System.out.println();
        System.out.println(" Average Temp = " + average);
        System.out.println(above +" days above average");
    }
}



