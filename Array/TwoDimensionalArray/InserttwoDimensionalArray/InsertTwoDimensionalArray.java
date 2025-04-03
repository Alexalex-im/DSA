        // arrayName[2][5] = 30
        //  -  Row Fist, Column second
        //  -  arrayName[2][5] - 30
        //  -  arrayName[0][0] - 50
        //  -  arrayname[0][0] - 60   --> Occupied

        // Time Complexity : O(1)
        // Space Complexity : O(1)
        


package Array.TwoDimensionalArray.InserttwoDimensionalArray;

import java.util.Arrays;

public class InsertTwoDimensionalArray {
    int arr[][] = null;

    // Constructor
    public InsertTwoDimensionalArray(int numberOfRows, int numberOfColumns)
    {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[0].length; col++)
            {
                arr[row][col] = Integer.MIN_VALUE;
            }
        } 
    }

    // Inserting value in the Array
    public void InsertValueInTheArray(int row, int col, int value)
    {
        try
        {
            if (arr[row][col] == Integer.MIN_VALUE)                          // O(1)
            {
                arr[row][col] = value;                                       // O(1)
                System.out.println("The value is successfully Inserted");  // O(1)
            } else {
                System.out.println("This cell is already occupied");      // O(1)
            }
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index for 2D array");       // O(1)
        }
    }

}
