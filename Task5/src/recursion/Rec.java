package recursion;

public class Rec {

    public static void main(String[] args) {
        iterPrint(5);
        System.out.println();
        recPrint(5);
    }

    private static void iterPrint(int i) {
        while (i >= 0) {
            System.out.print(i-- + " ");
        }
        System.out.println("We are done");
    }

    private static void recPrint(int i) {
        if (i >= 0) {
            System.out.print(i + " ");
            recPrint(--i);
        }
        System.out.print("rec: " + i + ". ");
    }
}
