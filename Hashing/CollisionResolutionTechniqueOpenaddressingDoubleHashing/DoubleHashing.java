//              Collision Resolution techniques

//      Open Addressing : Colliding elements are stored on other vacant buckets. During storage and lookup these are found through so called probing.

//      Double Hashing : Interval between probes is computed by another hash function

//          ABCD        2               2 + 4 = 6
//          EFGH        2               2 + 4 = 6
//          IJKLM       2               2 + (2*4) = 8

//          EFGH        4
//          IJKLM       4







package Hashing.CollisionResolutionTechniqueOpenaddressingDoubleHashing;

import java.util.ArrayList;

public class DoubleHashing {
    String[] hashTable;
    int noOfCellsUsedInHashTable;

    
    // Constructor
    DoubleHashing(int size) {
        hashTable = new String[size];
        noOfCellsUsedInHashTable = 0;
    }

    // HashFunction to be used on keys
    public int simpleASCIIHashFunction(String x, int M) {
        char ch[];
        ch = x.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < x.length(); i++)
        {
        sum += ch[i];
            }
        return sum % M;
    }

    // Create a new HasTable and does Rehashing
    public void rehashkeys(String newStringToBeInserted) {
        noOfCellsUsedInHashTable = 0;
        ArrayList<String> data = new ArrayList<String>();
        for (String s : hashTable) {
            if (s != null) 
                data.add(s);
        }
            data.add(newStringToBeInserted);
            hashTable = new String[hashTable.length * 2];
            for(String s : data) {
                insertKeyInHashTable(s);
            }
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


    private int addAllDigitsTogether(int sum) {
        int value = 0;
        while (sum > 0) {
            value = sum % 10;
            sum = sum / 10;
        }
        return value;
    }


    public int secondHashFunction(String x, int M) {
        char ch[];
        ch = x.toCharArray();
        int i, sum;
        for (sum = 0, i = 0; i < x.length(); i++)
        {
            sum += ch[i];
        }
        while (sum > hashTable.length) {
            sum = addAllDigitsTogether(sum);
        }

        return sum % M;
    }


    public double getLoadFactor() {
        return noOfCellsUsedInHashTable * 1.0 / hashTable.length;
    }


    public void insertKeyInHashTable(String value) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashkeys(value);
        } else {
            int x = simpleASCIIHashFunction(value, hashTable.length);
            int y = secondHashFunction(value, hashTable.length);
            for (int i=0; i<hashTable.length; i++)
            {
                int newIndex = (x + i*y) % hashTable.length;
                if (hashTable[newIndex] == null)
                {
                    hashTable[newIndex] = value;
                    System.out.println(value + " inserted at location: " + newIndex);
                    break;
                } else {
                    System.out.println(newIndex + " is occupied. Trying next empty index...");
                }
            }
        }
        noOfCellsUsedInHashTable++;
    }

}


