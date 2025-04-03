        // 1,2,3,4,5,6,7,8,9,10
        // 0,1,2,3,4,5,6,7,8,9,

        // Time Complexity : O(n)
        // Space Complexity : O(1)


package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TraversalOfArrayList {
    public static void main(String[] args) {
     ArrayList <String> stringList = new ArrayList <String> ();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");

        // for (int i=0; i<stringList.size(); i++)
        // {
        //     String letter = stringList.get(i);       //  TC : O(n) , SC : O(1)
        //     System.out.println(letter);       
        // }



        // for (String letter: stringList)
        // {
        //     System.out.println(letter);    //  TC : O(n) , SC : O(1)
        // }


        Iterator <String> iterator = stringList.iterator();
        while (iterator.hasNext())
        {
            String letter = iterator.next();
            System.out.println(letter);        // TC: O(n) , SC: O(1)
        }
    }
}
