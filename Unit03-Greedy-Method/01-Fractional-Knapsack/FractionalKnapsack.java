import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    static class Item {
        int weight, value;

        Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }

    public static void main(String[] args) {

        Item[] items = {
            new Item(10, 60),
            new Item(20, 100),
            new Item(30, 120)
        };

        int capacity = 50;
        double totalValue = 0;

        Arrays.sort(items, new Comparator<Item>() {
            public int compare(Item a, Item b) {
                double r1 = (double) a.value / a.weight;
                double r2 = (double) b.value / b.weight;
                return Double.compare(r2, r1);
            }
        });

        for (Item item : items) {

            if (capacity == 0)
                break;

            int take = Math.min(capacity, item.weight);

            totalValue += (double) take * item.value / item.weight;

            capacity -= take;
        }

        System.out.println("Maximum Value = " + totalValue);
    }
}
