        // Search for 4



package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class SearchingForAnElement {
    public static void main(String[] args)
    {
        ArrayList <String> stringList = new ArrayList <String> (Arrays.asList("A", "B", "C", "D","E"));
        for (String letter: stringList)
        {
            if (letter.equals("F"))
            {
                System.out.println("The element is found");
                break;
            }
        } 


        // indexOf
        int index = stringList.indexOf("C");
        System.out.println("The element is found at index :" + index);  // TC: O(n) , SC: O(1)


    }
}
