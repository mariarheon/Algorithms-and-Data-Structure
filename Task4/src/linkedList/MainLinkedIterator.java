
package linkedList;
public class MainLinkedIterator {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkIterator iter = new LinkIterator(list);
        
        iter.insertAfter("mmm", 20);

        iter.insertBefore("lll", 40);
        iter.insertBefore("kkk", 0);
        list.print();
        System.out.println("--------");
        
        iter.deleteCurrent();
        list.print();
        System.out.println("--------");
        
        iter.getCurrent().print();
        
    }
}
