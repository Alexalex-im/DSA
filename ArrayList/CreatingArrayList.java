        // ArrayList <Type> arrayListName = new arrayList <Type> ()

        // ArrayList arrayListName = new ArrayList()

        // Type - string, integer, any

        // null, null, null, null, null, null, null, null, null, null

        // ArrayList <String> names = new ArrayList <String> (Arrays.asList("John", "Jane", "Doe"));

        // John, jane, doe, null, null, null, null, null, null, null


package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class CreatingArrayList {
    public static void main(String[] args)
    {
        ArrayList <Integer> numbers = new ArrayList <Integer> (Arrays.asList(30,10, 20));
        System.out.println(numbers);
    }
}

    // Complexity

     //  Time Complexity : O(1)
     //  Space Complexity : O(1)

     // when initialize array
     //  Time Complexity : O(1)
     //  Space Complexity : O(n)



        