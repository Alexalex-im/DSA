// Interview Question 1

//     - Create a function which calculates the sum and product 
//         of elements of array 
//     - Find the time complexity for created method


class Main1 {
        public static void main (String[] args)
        {
            Main1 main = new Main1();
            int[] customArray = {1, 3, 4, 5};
            main.spofArray(customArray);
        }

        void spofArray (int[] array) {
            int sum = 0;        // O(1)
            int product = 1;    // O(1)
            for (int i=0; i<array.length; i++) {    // O(n)
                sum += array[i];    // O(1)
            }

            for (int i=0; i<array.length; i++) {    // O(n)
                product *= array[i];        // O(1)
            }

            System.out.println(sum + "," +product);    // O(1)
        }

    }

// Time Complexity : O(n) 
    