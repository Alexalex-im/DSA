package StackDataStructure.StackOperationUsingArrayPushPopPeekDelete;

class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(4);

        // isEmpty
        // boolean result = newStack.isEmpty();
        // System.out.println(result);

        // isFull
        // boolean result = newStack.isFull();
        // System.out.println(result);

        // push 
        // newStack.push(1);
        // newStack.push(2);
        // newStack.push(1);
        // newStack.push(2);
        // newStack.push(1);

        // Pop
        // newStack.push(1);
        // newStack.push(2);
        // newStack.push(3);
        // newStack.push(4);
        // int result = newStack.Pop();
        // System.out.println(result);
        // int result1 = newStack.Pop();
        // System.out.println(result1);

        //Peek
        // newStack.push(1);
        // newStack.push(2);
        // newStack.push(3);
        // newStack.push(4);
        // int result = newStack.Peek();
        // System.out.println(result);
        // int result1 = newStack.Peek();
        // System.out.println(result1);


        // Delete
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.deleteStack();


    }
}