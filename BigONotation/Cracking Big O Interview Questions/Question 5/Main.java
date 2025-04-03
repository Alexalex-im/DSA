void printUnorderPairs (int[] arrayA, int[] arrayB)
{
    for (int i=0; i<arrayA.length; i++)
    {
        for (int j=0; j<arrayB.length; j++)         // O(ab)
        {
            for (int k=0; k<1000000; k++)              // O(1)
            {
                System.out.println(arrayA[i] + "," + arrayB[j]);  // O(1)           
            }
        }
    }
}

// a = arrayA.length;
// b = arrayB.length;