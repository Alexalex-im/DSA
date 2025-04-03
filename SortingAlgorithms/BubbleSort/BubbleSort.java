//  Bubble Sort
//     - Bubble sort is also referred as Sinking sort
//     - We repeatedly compare ewach pair of adjacent items and swap then if they are in the wrong order

// Time Complexity : O(n^2)
// Space Complexity : O(1)

// When to use Bubble Sort?
//      - When the input is almost sorted
//      - Space is a concern
//      - Easy to implement

// When to avoid Bubble Sort?
//      - Average time complexity is poor




package SortingAlgorithms.BubbleSort;

public class BubbleSort {
    void bubbleSort(int arr[])
    {
        int n = arr.length;                 // O(1)
        for (int i=0; i <n-1; i++)          // O(n)
        {
            for (int j=0; j<n-i-1; j++)     // O(n)
            if (arr[j] > arr[j+1])
            {
                int temp = arr[j];          // O(1)
                arr[j] = arr[j+1];          
                arr[j+1] = temp;
            }
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
