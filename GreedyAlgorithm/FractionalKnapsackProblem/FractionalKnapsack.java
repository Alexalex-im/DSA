package GreedyAlgorithm.FractionalKnapsackProblem;

import java.util.*;

public class FractionalKnapsack {
    static void knapSack (ArrayList <KnapsackItem> items, int capacity) {
        Comparator <KnapsackItem> comparator = new Comparator <KnapsackItem> () {
            @Override 
            public int compare(KnapsackItem o1, KnapsackItem o2) {
                if (o2.getRatio() > o1.getRatio()) return 1;
                else return -1;         // O(1)
            }
        };

        Collections.sort(items, comparator);        // O(NLogn)
        int usedCapacity = 0;
        double totalValue = 0;          // O(1)

        for (KnapsackItem item : items) {
            if (usedCapacity + item.getWeight() <= capacity) {
                usedCapacity += item.getWeight();
                System.out.println("Taken: " + item);
                totalValue += item.getValue();          // O(n)
            } else {
                int usedWeight = capacity - usedCapacity;
                double value = item.getRatio() * usedWeight;
                System.out.println("Taken : item index = " + item.getIndex()+ ", obtained value = " + value + ", used Weight =" + usedWeight+ ", ratio = " + item.getRatio());
                usedCapacity += usedWeight;
                totalValue += value;                    // O(1)
            }
            if (usedCapacity == capacity) break;        // O(1)
        }

        System.out.println("\n Total value obtained: " + totalValue);       // O(1)

        // Time Complexity : O(Logn)
        // Space Complexity : O(1)
    }
}
