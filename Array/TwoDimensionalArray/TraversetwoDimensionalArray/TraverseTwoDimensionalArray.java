// Traversing Two Dimensional Array
//  1   33   55   91
//  5   4    10   11
//  24  50   37   40

// Time Complexity : O(MN)
// Space Complexity : O(1)



package Array.TwoDimensionalArray.TraversetwoDimensionalArray;

import java.util.Arrays;
    
public class TraverseTwoDimensionalArray {
        int arr[][] = null;
    
        // Constructor
        public TraverseTwoDimensionalArray(int numberOfRows, int numberOfColumns)
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

        // Traverse 2D array

        public void traverse2DArray()
        {
            for (int row = 0; row < arr.length; row++)      // O(n)
            {
                for (int col = 0; col < arr[0].length; col++)       //O(n)
                {
                    System.out.println(arr[row][col] + " ");    // O(1)
                }
                System.out.println();           // O(1)
            }
        }
        }
    
    
    



