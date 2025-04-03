package Array.SearchForarrayElement;

class Main {
    public static void main(String[] args)
    {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0,10);
        sda.insert(1,20);
        sda.insert(2,30);

        sda.searchInArray(40);

    }
}
