package DynamicProgramming.TopDownWithMemoization;

//          Bottom Up with Tabulation
//  Tabulation is the opposite of the top-down approach and avoids recursion. In this approach, we solve the problem "bottom-up" (i.e by solving all the related subproblems first). This is done by filling up a table. Based on the results in the table, the solution to the top/original problem is then computed.

// Example : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ....
// Fibonacci(N) = Fibonacci(N-1) + Fibonacci(N-2)

import java.util.*;

public class BottomUpwithTabulation {
    public static void main(String[] args) {
        HashMap <Integer, Integer> memo = new HashMap <Integer, Integer> ();
        System.out.println(fibMemo(6, memo));
        System.out.println(fibTab(6));

    }

    // Fibanocci Memoization 

    public static int fibMemo(int n, HashMap <Integer, Integer> memo)
    {
        if (n == 1) {
            return 0;
        }

        if (n ==2) {
            return 1;
        }

        if (!memo.containsKey(n)) {
            memo.put(n, (fibMemo(n-1, memo) + fibMemo(n-2, memo)));
        }

        return memo.get(n);
    }

    // Fibonacci Series with Tabulation

    public static int fibTab (int n) {
        ArrayList <Integer> tb = new ArrayList <Integer> ();
        tb.add(0);
        tb.add(1);
        for (int i = 2; i <=n-1; i++)
        {
            int n1 = tb.get(i-1);
            int n2 = tb.get(i-2);
            tb.add(n1+n2);
        }

        return tb.get(n-1);
    }
}
