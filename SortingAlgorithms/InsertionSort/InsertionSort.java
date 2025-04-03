//  Insertion Sort
// - Divide the given array into two part.
// - Take first element unsorted array and find its correct position in sorted array
// - Repeat until unsorted array is empty.
 
// Time Complexity : O(n^2)
// Space Complexity : O(1)

// When to use Insertion Sort?
//      - When we have insufficient memory.
//      - Easy to implement.
//      - When we have continuous inflow of numbers and we want to keep them sorted.

// When to avoid Insertion Sort?
//      - When time is a concern.


package SortingAlgorithms.InsertionSort;

public class InsertionSort{
    static void insertionSort(int[] arr)
    {
        for (int i=1; i<arr.length; i++)        // O(n)
        {
            int temp = arr[i], j=i;             // O(1)
            while (j>0 && arr[j - 1] > temp)    // O(n)
            {
                arr[j] = arr[j-1];              // O(1)
                j--;                            
            }
            arr[j] = temp;                      // O(1)
        }
    }


    public static void printArray(int[] array)
            {
                for (int i=0; i<array.length; i++)
                {
                    System.out.print(array[i] + " ");
                }
            }
}
