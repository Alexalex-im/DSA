//          Collision Resolution Techniques
// ABCD 2
// EFGH 2
// IJKLM

//          Resolution Technique
//    Direct Chaining       Open Addressing
//                              - Linear probing
//                              - Quadratic Probing
//                              - Double Hashing

// Direct Chaining: Implements the buckets as Linked List. Colliding elements are stored in this lists.
// ABCD 2
// EFGH 2
// IJKLM 2
// Miller 2

package Hashing.TypesofCollisionResolutionTechniques;

import java.util.LinkedList;

public class DirectChaining {
    LinkedList <String>[] hashTable;
    int maxChainSize = 5;

    public DirectChaining(int size) {
        hashTable = new LinkedList[size];
    }

    public int modASCIIHashFunction(String word, int M)
    {
        char ch[];
        ch = word.toCharArray();
        int i,sum;
        for (sum=0,i=0; i<word.length(); i++)
        {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    public void inserthashTable(String word) {
        int newIndex = modASCIIHashFunction(word, hashTable.length);
        if(hashTable[newIndex] == null) {
            hashTable[newIndex] = new LinkedList<String>();
            hashTable[newIndex].add(word);
        } else {
            hashTable[newIndex].add(word);
        }
    }

    public void displayHashTable()
    {
        if (hashTable == null) {
            System.out.println("\n HashTale does not exist");
            return;
        } else {
            System.out.println("\n --------------HashTable---------------");
            for (int i=0; i<hashTable.length; i++) {
                System.out.println("Index" + i + ", key :" + hashTable[i]);
            }
        }
    }
    
}
