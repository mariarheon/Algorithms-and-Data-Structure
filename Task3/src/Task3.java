
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 *
 * @author Maria Mikhaleva
 * @version dated Feb 28 2018
 */
public class Task3 {

    public static void main(String[] args) throws IOException {
        String input;
        /*while(true){
            input = getStr();
            if (input == "") break;
            
            reverseWithBuilder(input);
            reverseWithStack(input);
        }*/
        //deque test
        Deque deque= new Deque(10);
        for (int i = 0; i < 10; i++)
            deque.insertLeft(i);
        
        System.out.println(deque);
        
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeLeft());
        
        System.out.println(deque.removeRigt());
        System.out.println(deque.removeRigt());
        
        System.out.println(deque);
        
        deque.insertRight(100);
        deque.insertRight(200);
        System.out.println(deque);
    }
    
    private static String getStr() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
    
    private static void reverseWithBuilder(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            sb.append(str.charAt(i));
        System.out.println(sb);
    }
    
    private static void reverseWithStack(String str){
        char[] array = str.toCharArray();
        Stack stack = new Stack (100);
        for (int i = 0; i < array.length; i++)
            stack.push(array[i]);
        for (int i = 0; i < array.length; i++)
            array[i] = stack.pop();
        System.out.println(Arrays.toString(array));
    }
    
}
