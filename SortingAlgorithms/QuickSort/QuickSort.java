//  Quick Sort
//     - Quick sort is a divide and conquer algorithm
//     - Find pivot number and make sure smaller numbers located at the left of pivot and bigger numbers are located at the right of the pivot.
//     - Unlike merge sort extra space is not required.  


// Time Complexity : O(N logn)
// Space Complexity : O(n)

// When to use Quick Sort?
//      - When average expected time is O(N logn)


// When to avoid Quick Sort?
//      - When time is a concern
//      - When you need stable sort




package SortingAlgorithms.QuickSort;

public class QuickSort{
    static int partition(int[] array, int start, int end) {
        int pivot = end;                        // O(1)
        int i = start - 1;                      // O(1)      
        for (int j=start; j<=end; j++) {        // O(n)
            if (array[j] <= array[pivot]) {     // O(1)
                i++;
                int temp = array[i];
                array[i] = array[j];            // O(1)
                array[j] = temp;
            }
        }
        return i;                               // O(1)
    }

    public static void quickSort(int[] array, int start, int end) { // T(n)
        if (start < end) {                                      
            int pivot = partition(array, start, end);           // O(n)
            quickSort(array, start, pivot - 1);                 // T(N/2)
            quickSort(array, pivot+1, end);                     // T(N/2)
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
