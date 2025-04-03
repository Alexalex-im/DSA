//                Linear Search Pseudocode
// - Create function with two parameters which are an array and a value
// - Loop through the array and check if the current array element is equal to the value
// - If it is return the index at which the element is found
// - If the value is never found return -1 

// Time Complexity : O(N)
// Space Comnplexity : O(1)



package SearchingAlgorithm.LinearSearch;

public class LinearSearch {
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
}
