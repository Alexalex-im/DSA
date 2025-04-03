        // myArray = "a"  "b"  "c"  "d"
        //           [0]   [1]  [2]  [3]  [4]  [5]
        // myArray[3] = "d"
        // myArray[4] = "e"
        // myarray[5] = "f"


        // Wait a minute! What happens if the Array id Full?

        // Insertion, when an array is full

        // myArray = "a"  "b"  "c"  "d"
        //           [0]   [1]  [2]  [3]  [4]  [5]
        // myArray = "a"  "b"  "c"  "d"   "e"  "f"
        //           [0]   [1]  [2]  [3]  [4]  [5]  [6]  [7]  [8]  [9]  [10]


        // Time Complexity : O(1)



package Array.InsertionInArray;

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

}
