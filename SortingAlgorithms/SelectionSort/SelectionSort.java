//  Selection Sort
//     - In case of selection sort we repeatedly find the minimum element and move it to the sorted part of array to make unsorted part sorted. 


// Time Complexity : O(n^2)
// Space Complexity : O(1)

// When to use Selection Sort?
//      - When we have insufficient memory
//      - Easy to implement

// When to avoid Bubble Sort?
//      - When time is a concern




package SortingAlgorithms.SelectionSort;

public class SelectionSort{
    static void selectionSort(int[] a)
    {
        for (int j=0; j<a.length; j++)      //O(n)
        {
            int minimumIndex = j;           //O(1)
            for (int i=j+1; i<a.length; i++)    // O(n)
            {
                if (a[i] < a[minimumIndex])     // O(1)
                {
                    minimumIndex = i;           // O(1)
                }
            }
            if (minimumIndex !=j){              // O(1)
                int temp = a[j];
                a[j] = a[minimumIndex];         // O(1)
                a[minimumIndex] = temp;
            }
 
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
