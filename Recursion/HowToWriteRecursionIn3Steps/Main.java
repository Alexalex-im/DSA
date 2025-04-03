//              Write Recursion in 3 Steps
//  Factorial 
//      - It is the product of all positive integers less than or equal to n.
//      - Denoted by n! (Christian Kramp in 1808).
//      - Only positive numbers.
//      - 0!= 1.

//          Example 1
//              4! = 4*3*2*1 = 24
//          Example 2
//              10! = 10*9*8*7*6*5*4*3*2*1 = 36,28,800
//              n! = n*(n-1)*(n-2)*...*2*1

// Step 1: Recursive case - the flow
//         n! = n*(n-1)*(n-2)*...*2*1   --------> n! = n*(n-1)!

// (n-1)! = (n-1)*(n-1-1)*(n-1-2)*...*2*1 = (n-1)*(n-2)*(n-3)*...*2*1


// Step 2 : Base case - the stopping criterion
//          - 0! = 1
//          - 1! = 1

// Step 3 : Unintentional case - the constraint 
//          - factorial(-1) ??
//          - factorial(-2) ??


// public int factorial(int n) {
// if (n<0) {
//     return -1;
// }
// if (n==0 || n==1) {
//     return 1;
// }
// return n * factorial(n-1);
//  }

package Recursion.HowToWriteRecursionIn3Steps;


public class Main {
    public static void main(String[] args) {
        Main recursion = new Main();
        var rec = recursion.factorial(-2);   // 3
        System.out.println(rec);
    }

    public int factorial(int n) {
        // if (n==0 || n==1)
         if (n<1) {
            // return 1;
            return -1;
        }
        // System.out.println(n);
        return n * factorial(n-1);
    }

}


