package homework;

/**
 *
 * @author Maria Mikhaleva
 * @version date Mar 14 2019
 */
public class BagLauncher {

    public static void main(String[] args) {

        Bag bag = new Bag(5,
                new Bag.Item(1, 15),
                new Bag.Item(3, 12),
                new Bag.Item(2, 30));

        System.out.println(bag.getBag());
    }
}
