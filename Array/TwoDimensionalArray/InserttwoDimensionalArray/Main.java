package Array.TwoDimensionalArray.InserttwoDimensionalArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
        {
            InsertTwoDimensionalArray sda = new InsertTwoDimensionalArray(3,3);
            sda.InsertValueInTheArray(0, 0, 10);
            sda.InsertValueInTheArray(0, 0, 10);

            System.out.println(Arrays.deepToString(sda.arr));

        }
    }

    
