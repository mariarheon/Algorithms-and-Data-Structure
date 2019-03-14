package recursion;

/**
 *
 * @author Maria Mikhaleva
 * @version dated Mar 14 2019
 */
public class App {

    public static void main(String[] args) {
         count(3);
    }

// хвостовая рекурсия   
    public static int count(int i) {
        System.out.println(i);
        if (i == 1) {
            return 1;
        }
        return count(i - 1);
    }
}
