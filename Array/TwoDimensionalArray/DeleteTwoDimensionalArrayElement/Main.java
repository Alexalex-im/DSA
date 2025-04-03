package Array.TwoDimensionalArray.DeleteTwoDimensionalArrayElement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
        {
            DeleteTwoDimensionalArray sda = new DeleteTwoDimensionalArray(3,3);
            sda.InsertValueInTheArray(0, 0 , 10);
            sda.InsertValueInTheArray(0, 1 , 20);
            sda.InsertValueInTheArray(1, 0 , 30);
            sda.InsertValueInTheArray(2, 0 , 40);

            // sda.accessCell(0,1);

            // sda.SearchingValue(20);

            System.out.println(Arrays.deepToString(sda.arr));
            sda.deleteValuefromArray(0, 0);
            System.out.println(Arrays.deepToString(sda.arr));

        }
    }

    
