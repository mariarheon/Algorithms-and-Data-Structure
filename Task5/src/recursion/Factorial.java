
package recursion;

/**
 *
 * @author Maria Mikhaleva
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    
    public static int factorial(int i){
        if (i==1)
            return 1;
        return factorial(i-1) * i;
    }
    
    
}
