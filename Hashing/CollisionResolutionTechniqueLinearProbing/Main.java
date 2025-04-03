package Hashing.CollisionResolutionTechniqueLinearProbing;

public class Main {
    public static void main(String[] args)
    {
        DirectChaining directChaining = new DirectChaining(13);
        directChaining.inserthashTable("The");
        directChaining.inserthashTable("quick");
        directChaining.inserthashTable("brown");
        directChaining.inserthashTable("fox");
        directChaining.inserthashTable("over");
        directChaining.inserthashTable("dog");

        // directChaining.searchHashTable("fox");

        directChaining.deleteKeyHashTable("ox");
        directChaining.displayHashTable();

    }
}
