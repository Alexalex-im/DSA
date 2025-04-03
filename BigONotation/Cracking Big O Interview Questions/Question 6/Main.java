// - Create a method which takes an array as a parameter and reverse it.
// - Find the runtime of the created method

// input - 1,2,3,4,5  

// # Output - 5,4,3,2,1

import java.util.Arrays;

class Main {
    public static void main(String[] args)
    {
        Main main = new Main();
        int[] customArray = {1, 2, 3, 4, 5};
        main.reverse(customArray);
    }

    void reverse (int[] array)
    {
        for (int i=0; i<array.length/2; i++)        // O(N/2)
        {
            int other = array.length-i-1;   // O(1)
            int temp = array[i];            // O(1)
            array[i] = array[other];        // O(1)
            array[other] = temp;            // O(1)
        }
        System.out.println(Arrays.toString(array));  // O(n);
    }
}

// Time Complexity : O(N)
