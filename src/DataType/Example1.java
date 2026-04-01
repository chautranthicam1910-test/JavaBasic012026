package DataType;

public class Example1 {
    public static void main(String[] args) {
        int items = 50;
        float costPerItem = 9.99F;
        float totalCost = items / costPerItem;
        char currency = '$';

        System.out.println("Number of items: " + items);
        System.out.println("Cost per items: " + costPerItem + currency);
        System.out.println("Total cost: " + totalCost);
    }
}
