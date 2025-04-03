// Array Traversal
// myArray =  "a"  "b"  "c"  "d"  "e"  "f"
//            [0]  [1]  [2]  [3]  [4]  [5]
// myArray[0] = "a"
// myArray[1] = "b"
// myArray[2] = "c"
// myArray[3] = "d"
// myArray[4] = "e"
// myArray[5] = "f"

// Time Complexity : O(n)
// space Complexity : O(1)


package Array.ArrayTraversal;

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


        // Array Traversal

        public void traverseArray()
        {
            try
            {
                for (int i=0; i<arr.length; i++)    // O(n)
                {
                    System.out.println(arr[i] + " ");   // O(1)
                }
            }catch(Exception e){
                System.out.println("Array no longer exists !");  // O(1)
            }
           
        }

}
