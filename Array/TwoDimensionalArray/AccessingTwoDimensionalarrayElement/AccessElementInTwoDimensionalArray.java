// Access an Element of two Dimensional Array
    // a[i][j] -> i is row index and j is column index

    //     [0]  [1]  [2]  [3]  [4]  [5]  [6]  [7]  [8]    
    // [0]   1   33   55   91   20   51   62   74   13
    // [1]   5   4    10   11   8    11   68   87   12
    // [2]   24  50   37   40   48   30   59   81   93

    // Time Complexity : O(1)
    // Space Complexity : O(1)

package Array.TwoDimensionalArray.AccessingTwoDimensionalarrayElement;

import java.util.Arrays;

public class AccessElementInTwoDimensionalArray {
    int arr[][] = null;

    // Constructor
    public AccessElementInTwoDimensionalArray(int numberOfRows, int numberOfColumns)
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

    // Accessing cell value from given array
    public void accessCell(int row, int col)
    {
        System.out.println("\n Accessing Rows" + row + ",col#" + col);    // O(1)
        try
        {
           System.out.println("cell value is :" + arr[row][col]);       // O(1)
        } 
        catch (ArrayIndexOutOfBoundsException e)                        
        {
            System.out.println("Invalid index for 2D array");           // O(1)
        }
    }
    }


