//  Finding Array Elemnt
//   myArray =  "a"  "b"  "c"  "d"  "e"  "h"
//              [0]  [1]  [2]  [3]  [4]  [5]

// myArray2 = 1  2   3   4   5   6   7   8   9 

// Time Complexity : O(n)
// Space Complexity : O(1)

package Array.SearchForarrayElement;

// import java.util.Arrays;

public class SingleDimensionArray {
        int arr[] = null;

        public SingleDimensionArray(int sizeOfArray)
        {
            arr = new int[sizeOfArray];
            for (int i=0; i<arr.length; i++)
            {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        public void insert(int location, int valueToBeInserted)
        {
            try
            {
                if (arr[location] == Integer.MIN_VALUE)         // O(1)
                {
                    arr[location] = valueToBeInserted;          // O(1)
                    System.out.println("Successfully Inserted");  // O(1)
                }
                else 
                {
                    System.out.println("This cell is already occupied");  //O(1)
    
                }
            }
            catch (ArrayIndexOutOfBoundsException e)       // O(1)
            {
                System.out.println("Invalid index to access array!");   // O(1)

            }
           
        }

        // Search for an element in the given Array
        public void searchInArray(int valueToSearch)
        {
            for (int i=0; i<arr.length; i++)           // O(n)
            {
                if (arr[i] == valueToSearch)           // O(1)
                {
                    System.out.println(" Value is found at the index of " + i);  // O(1)
                    return;         // O(1)
                }
            }
            System.out.println(valueToSearch + " is not found");   // O(1)
        }

}