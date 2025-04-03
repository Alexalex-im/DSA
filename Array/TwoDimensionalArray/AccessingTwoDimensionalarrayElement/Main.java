package Array.TwoDimensionalArray.AccessingTwoDimensionalarrayElement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
        {
            AccessElementInTwoDimensionalArray sda = new AccessElementInTwoDimensionalArray(3,3);
            sda.InsertValueInTheArray(0, 0 , 10);
            sda.InsertValueInTheArray(0, 1, 20);
            sda.accessCell(0,1);

            // System.out.println(Arrays.deepToString(sda.arr));

        }
    }

    
