package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import jdk.internal.org.xml.sax.InputSource;

/**
 *
 * @author Maria Mikhaleva
 * @version date Mar 14 2019
 */
public class Anagramm {

    static int size;
    static int count;
    static char[] arr = new char[7];

    public static void main(String[] args) throws IOException {
        String in = getString();
        size = in.length();
        for (int i = 0; i < size; i++) {
            arr[i] = in.charAt(i);
        }
        getAnagramm(size);
    }

    private static void getAnagramm(int size) {
        if (size == 1) {
            return;
        }

        for (int i = 0; i < size; i++) {
            getAnagramm(size - 1);
            if (size == 2) {
                print();
            }
            rotate(size);
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        return br.readLine();
    }

    private static void print() {
        for (int i = 0; i < size; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    private static void rotate(int nSize) {
        int i;
        int position = size - nSize;
        char temp = arr[position];
        for (i = position + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        arr[i - 1] = temp;
    }
}
