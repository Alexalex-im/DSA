// Accessing Array Element
// <arrayName> [index]

// For Example :
//         myArray =  "a"  "b"  "c"  "d"  "e"  "f"
//                    [0]  [1]  [2]  [3]  [4]  [5]
//                  myArray[0] = "a"
//                  myArray[3] = "d"


// Time Complexity : O(1)
// Space Complexity : O(1)



package Array.AccessingElementInArray;

class Main {
    public static void main(String[] args)
    {
        SingleDimensionArray sda = new SingleDimensionArray(3);
        sda.insert(0,10);
        sda.insert(1,20);
        sda.insert(2,30);

        var firstElement = sda.arr[0];        // O(1)
        System.out.println(firstElement);

        var thirdElement = sda.arr[2];        // O(1)
        System.out.println(thirdElement);

    }
}
