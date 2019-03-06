package doubleLinkedList;

public class Task4 {

    public static void main(String[] args) {
        doubleLinkedList list = new doubleLinkedList();
        list.insertFirst("Maria", 20);
        list.insertFirst("Ivan", 100);
        list.insertFirst("Olegs", 900);

        list.insertLast("Ursula", 10);
        list.insertLast("Doctor", 10000);

        list.print();
        System.out.println("----------");
        
        list.delete("Ivan");
        list.print();
        
        
    }
}
