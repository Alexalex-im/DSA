package DynamicProgramming.TopDownWithMemoization;


//      Top Down with Memoization 

//  Solve the bigger problem by recursively finding the solution to smaller subproblems. Whenever we solve a sub-problem, we cache its result so that we dont end up solving it repeatedly if its called multiple times. This technique of storing the result of already solved subproblems is called Memoization.

// Example : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ....
//          Fibocci(N) = Fibonacci(N-1) + Fibonacci(N-2)

//  Fibonacci(n) :
//      if n < 1 return error message 
//      if n = 1 return 0
//      if n = 2 return 1
//      if not n in memo:
//          memo[n] = Fibonnaci(n-1, memo) + Fibonacci(n-2, memo)
//      return memo[n]

// Time Complexity : O(n)
// Space Complexity : O(n)


import java.util.*;

public class TopDownwithMemoization {
    public static void main(String[] args) {
        HashMap <Integer, Integer> memo = new HashMap <Integer, Integer> ();
        System.out.println(fibMemo(6, memo));
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
}