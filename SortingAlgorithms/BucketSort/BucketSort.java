//  Bucket Sort
//     - Create buckets and distribute elements of array into bucket.
//     - Sort buckets individually
//     - Merge buckets after sorting

// - Number of buckets = round (Sqrt(number of elements))
//   round(Sqrt(9)) = 3
// - Appropriate bucket = ceil(Value * number of buckets / maxValue)
//   ceil(5*3/9) = ceil(1.6) = 2.
// Sort all buckets (using any sorting algorithm)


// Time Complexity : O(N Logn)
// Space Complexity : O(n)

// When to use Bucket Sort?
//      - When input uniformly distributed over range
//        1,2,4,5,3,8,7,9         1,2,1,91,93,95


// When to avoid Bucket Sort?
//      - When space is a concern




package SortingAlgorithms.BucketSort;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort{
    int arr[];
    
    public BucketSort (int arr[])
    {
        this.arr = arr;
    }

    public void printArray() {
        for (int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }

    // Print Buckets
    public void printBucket(ArrayList <Integer>[] buckets) {
        for (int i=0; i<buckets.length; i++)
        {
            System.out.println("\n Bucket#" + i + ":");
            for (int j=0; j<buckets[i].size(); j++) {
                System.out.println(buckets[i].get(j) + " ");
            }
        }
    }

    // Bucket Sorting
    public void bucketSort() {
        int numberOfBuckets = (int)Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for (int i=0; i<buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        } 

        for (int value : arr) {
            int bucketNumber = (int) Math.ceil(((float) value * numberOfBuckets)/(float)maxValue);
            buckets[bucketNumber - 1].add(value);
        }

        System.out.println("\n\n printing buckets before sorting...");
        printBucket(buckets);

        for (ArrayList <Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
        System.out.println("\n\n printing buckets after sorting...");
        printBucket(buckets);

        int index = 0;
        for (ArrayList <Integer> bucket : buckets) {
            for (int value : bucket)
            {
                arr[index] = value;
                index++;
            }
        }
    }
}
