//             Binary Search Pseudocode 
//  - Create function with two parameters which are a sorted array and a value
//  - Create two pointers : a left pointer at the start of the array and a right pointer at the end of the array.
//  - Based on left and right pointers calculate middle pointer
// While middle is not equal to the value and start <= end loop :
//          - If the middle is greater than the value move the right pointer down
//          - If the middle is less than the value move the left pointer up
//  - If the value is never found return - 1
    
        
    

package SearchingAlgorithm.BinarySearch;

public class BinarySearch {
    public static int linearSearch(int arr[], int value)
    {
        for (int i=0; i<arr.length; i++)                    // O(n)
        {
            if (arr[i] == value) {                          // O(1)
                System.out.println(" The element is found at the index : " + i);  // O(1)
                return i;                                   // O(1)
            }
        }

        System.out.println(" The element " + value + " not found.");  // O(1)
        return -1;                                          // O(1)
    }

    // Binary Search

    public static int binarySearch(int arr[], int value)
    {
        int start = 0;
        int end = arr.length-1;
        int middle = (start+end)/2;
        // System.out.println(start + " " + middle + " " + end);
        while (arr[middle] != value && start <= end)
        {
            if (value < arr[middle])
            {
                end = middle -1;
            }else{
                start = middle + 1;
            }
            middle = (start+end)/2;
            // System.out.println(start + " " + middle + " " + end);

        }
        if (arr[middle] == value) {
            System.out.println(" The element is found at the index : " + middle);
            return middle; 
        }else{
            System.out.println(" The element " + value + " not found.");
        return -1;
        }

    }
}

// {8, 9, 12, 15, 17, 19, 20, 21, 28}
//  s             m                E
//  s  m       E
//         sm  E

// 0 4 8                          
// 0 1 3
// 2 2 3
// 3 3 3