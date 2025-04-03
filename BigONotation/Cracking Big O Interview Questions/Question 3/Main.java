// Interview Question
// What is the time complexity for this method?

public class Main {
    void printUnorderedPairs (int[] array)
    {
        for (int i=0; i<array.length; i++)
        {
            for (int j=i+1; j<array.length; j++)
            {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
}

// [1, 3, 4, 5]         13, 14, 15
//                      34, 45
//                      45

// 1.Counting the iterations

//     1st ----> n-1
//     2nd ----> n-2
//           .
//           .
//           1
//     (n-1)+(n-2)+(n-3)+ .. +2+1
//     =1+2+ ... +(n+3)+(n-2)+(n-1)
//     =n(N-1)/2

// Time Complexity : O(n2)

// 2.Average Work

// Outer loop - N times 
// Inner loop?

//     1st ---> 10
//     2nd ---> 9
//        .            =5 ---> 10/2
//        .             n ---> n/2
//        1
//  n*n/2 = n2/2  -----> O(n2)

