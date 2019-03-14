package homework;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Maria Mikhaleva
 * @version dated Mar 14 2019
 */
public class Bag {

    private int size;
    private Item[] items;
    private List<Integer> list = new LinkedList<>();

    public Bag(int size, Item... items) {
        this.size = size;
        this.items = items;
    }

    public int getBag() {
        return getBag(items.length - 1, size);
    }

    public int getBag(int i, int size) {
        if (i < 0) {
            return 0;
        }
        if (items[i].weight > size) {
            return getBag(i - 1, size);
        } else {
            return Math.max(getBag(i-1, size), getBag(i-1, size - items[i].weight) + items[i].cost);
        }
    }

    public static class Item {

        private int weight;
        private int cost;

        public Item(int weight, int cost) {
            this.weight = weight;
            this.cost = cost;
        }

    }
}
