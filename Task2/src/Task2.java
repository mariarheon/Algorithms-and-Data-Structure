
import java.util.Date;

/**
 *
 * @author Maria Mikhaleva
 * @version dated Feb 22 2019
 */
public class Task2 {
    public static final String linearSearch = "LINEAR_SEARCH";
    public static final String binarySearch = "BINARY_SEARCH";
    
    public static void main(String[] args) {
       MyArr array = new MyArr(100000);
       //array.fill(); 
       for (int i = 0; i < array.getSize(); i++){
           array.add(i, (int) (Math.random() * 1000));
       }
       array.display();
       
       array.del(20);
       
       search("LINEAR_SEARCH", array, 5);
       
      
       long before = System.nanoTime();

        
       Sort.sortBubble(array.getArray());
       //Sort.sortSelect(array.getArray());
       //Sort.sortInsert(array.getArray());
       
       long after = System.nanoTime();
       
       System.out.println("Сортировка выполнилась за " + (after-before)/1000000 + " мсек");
       array.display();
      
       search("BINARY_SEARCH", array, 5);
    }
    
    public static void search(String type, MyArr arr, int element){
        int elementNumber = 0;
        if (type == linearSearch){
            elementNumber = arr.searchLinear(element);
        }
        else if (type == binarySearch){
            elementNumber = arr.binarySearch(element);
        }  
        
        if (elementNumber == 0)
            System.out.println("Такого элемента нет");
        else System.out.println("Элемент " + elementNumber + "-й");   
    }
}
