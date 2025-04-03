

package Array.AccessingElementInArray;

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
