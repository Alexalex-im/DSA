// Interview Question 2

    // - Create a function which prints to the console the pairs from given array
    // - Find the time complexity for created method

    // [1, 3, 4, 5]  - 11, 13, 14, 15
    //               - 31, 33, 34, 35
    //               - 41, 43, 44, 45
    //               - 51, 53, 54, 55

class Main {
    public static void main(String[] args)
    {
        Main main = new Main();
        int[] customArray = {1, 3, 4, 5};
        main.printPairs(customArray);
    }
    void printPairs(int[] array) 
    {
        for (int i=0; i<array.length; i++)      // O(n)
        {
            for (int j=0; j<array.length; j++)  // O(n)
            {
                System.out.println(array[i] + ", "+ array[j]);  // O(1)
            }
        }
    }
}

// Time Complexity : O(n2)
