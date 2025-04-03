        //  remove(index)
        //  remove(3)
        //  remove(object)
        //  remove(5)


package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;


public class DeleteElementForArrayList {
    public static void main(String[] args)
    {
        ArrayList <String> stringList = new ArrayList <String> (Arrays.asList("A", "B", "C", "D", "E"));
        stringList.remove("D");
        System.out.println(stringList);    // TC: O(N) , SC: O(1)
    }
}
