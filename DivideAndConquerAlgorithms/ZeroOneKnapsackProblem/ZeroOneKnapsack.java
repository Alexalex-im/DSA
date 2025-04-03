package DivideAndConquerAlgorithms.ZeroOneKnapsackProblem;

public class ZeroOneKnapsack {
    private int Knapsack (int[] profits, int[] weights, int capacity, int currentIndex){
        if (capacity <= 0 || currentIndex < 0 || currentIndex >= profits.length) {
            return 0;
        }
        int profit1 = 0;
        if (weights[currentIndex] <= capacity) {
            profit1 = profits[currentIndex] + Knapsack(profits, weights, capacity-weights[currentIndex], currentIndex+1); 

        }
        int profit2 = Knapsack(profits, weights, capacity, currentIndex+1);
        return Math.max(profit1, profit2);
    }

    public int KnapSack(int[] profits, int[] weights, int capacity) {
        return this.Knapsack(profits, weights, capacity, 0);
    }

}
