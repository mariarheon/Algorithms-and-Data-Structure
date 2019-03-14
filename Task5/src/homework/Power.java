package homework;

/**
 * @author Maria Mikhaleva
 * @version dated Mar 14 2019
 */
public class Power {

    public static void main(String[] args) {
        System.out.println(power(14, 6));
    }

    public static int power(int a, int n) {
        if (n == 1)
            return a;
        return power(a, --n) * a;
    }
}
