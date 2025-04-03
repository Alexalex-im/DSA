package StackDataStructure.StackOperationUsingArrayCreateisEmptyisFull;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack (int size) {
        this.arr = new int[size];           // O(1)
        this.topOfStack = -1;               // O(1)
        System.out.println(" The Stack is created with size of: " + size);  // O(1)

        // Time Complexity : O(1)
        // Space Complexity : O(n)

    }

    //  isEmpty
    public boolean isEmpty() {
        if (topOfStack == -1) {     // O(1)
            return true;            // O(1)
        } else {
            return false;           // O(1)
        }

        // Time Complexity : O(1)
        // Space Complexity : O(1)

    }

    // isFull
    public boolean isFull() {
        if (topOfStack == arr.length - 1) {     // O(1)
            System.out.println("The stack is full !");
            return true;        // O(1)
        } else {
            return false;       // O(1)
        }

        //  Time Complexiy : O(1)
        //  Space Complexity : O(1)

    }

    // Push

    public void push(int value) {           // O(1)
        if (isFull()) {
            System.out.println("The Stack is full !");
        } else {
            arr[topOfStack + 1] = value;        // O(1)
            topOfStack ++;                      // O(1)
            System.out.println("The value is successfully inserted");   // O(1)
        }

        //  Time Complexiy : O(1)
        //  Space Complexity : O(1)


    }


}

        


