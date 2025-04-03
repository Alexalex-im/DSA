    //  When we create an array, we :
    //      - Declare - creates a reference to array
    //      - Instantiation of an array - creates an array
    //      - Initialization - assigns values to cells in array


    //  dataType[] arr
    //  arr = new dataType[]
    //  arr[0] = 1
    //  arr[1] = 2

package Array;
import java.util.Arrays;

public class CreateAnArray {
    public static void main(String[] args)
    {
        int[] intArray;                    // O(1)
        intArray = new int[3];             // O(1)
        // intArray[0] = 1;                  // O(1)
        // intArray[1] = 2;                  // O(1)     // O(n)
        // intArray[2] = 3;                  // O(1)
        System.out.println(Arrays.toString(intArray));


        //All together
        String sArray[] = {"a", "b", "c"};             // O(1)
        System.out.println(Arrays.toString(sArray));

    } 
}
