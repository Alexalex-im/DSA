    // add(1)
    // add(2)
    // add(3)


package ArrayList;

import java.util.ArrayList;

public class InsertionArrayList {
    public static void main(String[] args)
    {
        ArrayList <Integer> numbers = new ArrayList <Integer> ();
        numbers.add(1);     // Time and Space Complexity Amortized O(1)
        numbers.add(2);
        numbers.add(3);
        numbers.add(2,4);  // add(index, element) - add(2, 4)  ||  add(5, 6)[no element] - throws java.lang.indexOutOfBoundsException
        System.out.println(numbers);


        ArrayList <String> stringList = new ArrayList <String> ();
        stringList.add("A");
        stringList.add("B");
        stringList.add(2,"C");  // add(index, element)  || TC: O(n), SC : Amortized O(1)
        System.out.println(stringList);

    }
}

    // Complexity
     //  Time Complexity : O(1)
     //  Space Complexity : O(1)