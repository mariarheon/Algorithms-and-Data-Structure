package linkedList;




/** Linked List
 *
 * @author Maria Mikhaleva
 * @version dated Mar 06 2019
 */
public class Task4 {

    public static void main(String[] args) {
       LinkedList list = new LinkedList();
       list.insert("Maria", 20);
       list.insert("Vadim", 50);
       list.insert("Slava", 30);
       
       list.print();
       
       if(!list.isEmpty()){
           list.delete();
       }
        System.out.println("-----------");
       list.print();
    } 
    
}
