package recursion;
//call function stack 101

public class Hello {

    public static void main(String[] args) {
        hello("Maria"); //1+ 8-
    }

    private static void hello(String person) {
        System.out.println("Hello, " + person + "!"); //2+ 3-
        bye(person); //4+ 7-
    }

    private static void bye(String person) {
        System.out.println("Bye, " + person + "!"); //5+ 6-
    }
}
