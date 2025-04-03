package Array.DeleteArrayElement;

class Main {
    public static void main(String[] args)
    {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0,10);
        sda.insert(1,20);
        sda.insert(2,30);

        sda.deleteValue(0);
        System.out.println(sda.arr[0]);

    }
}
