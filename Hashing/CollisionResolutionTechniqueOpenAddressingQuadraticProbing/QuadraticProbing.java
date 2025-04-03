//          Collision Resolution Techniques

//      Open Addressing : 
//              Colliding elements are stored in other vacant buckets. During storage and lookup these are found through so called probing.

//      Quadratic probing : 
//              Adding arbitrary quadratic polynomial to the index until an empty cell is found.

// ABCD     2                       1^2, 2^2, 3^2, 4^2...
// EFGH     2                       2 + 1^2 = 3
// IJKLM    2                       2 + 2^2 = 6



package Hashing.CollisionResolutionTechniqueOpenAddressingQuadraticProbing;

import java.util.ArrayList;

public class QuadraticProbing {
    String[] hashTable;
    int usedCellNumber;

    
    // Constructor
    QuadraticProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    // HashFunction to be used on keys
    public int modASCIIHashFunction(String x, int M) {
        char ch[];
        ch = x.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < x.length(); i++) {
            sum += ch[i];
        }
        return sum % M;
    }

    // Returns LoadFactor of HashTable
    public double getLoadFactor() {
        return usedCellNumber * 1.0 / hashTable.length;
    }

    public void rehashKeys(String newStringToBeInserted) {
        usedCellNumber = 0;
        ArrayList <String> data = new ArrayList <String> ();
        for (String s : hashTable) {
            if (s != null)
            data.add(s);
        }

        data.add(newStringToBeInserted);
        hashTable = new String[hashTable.length * 2];
        for (String s : data) {
            insertKeyInHashTable(s);
        }
    }

    public void insertKeyInHashTable(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(word);
        } else {
            int index = modASCIIHashFunction(word, hashTable.length);
            int counter = 0;
            for (int i =index; i < index+hashTable.length; i++) {
                int newIndex = (index + (counter * counter)) % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = word;
                    System.out.println(word + " has been inserted successfuly");
                    break;
                } else {
                    System.out.println(newIndex + " is already occupied. Trying next one...");
                }
                counter++;
            }
        }
        usedCellNumber++;
    }


    // Display The HashTable
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

        System.out.println(" \n ");
    }

}
