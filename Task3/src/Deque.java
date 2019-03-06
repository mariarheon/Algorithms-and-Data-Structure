
import java.util.Arrays;


public class Deque {
    private int[] deque;
    private int size;
    private int items;
    
    private int head;
    private int tail;
    
    public Deque(int size){
        this.size = size;
        this.deque = new int[size];
        items = 0;
        head = 0;
        tail = -1;
        
    }
    
    public boolean isEmpty(){
        return (items == 0);
    }
    
    public boolean isFull(){
        return (size == items);
    }
    
    public void insertLeft(int i){
        if (--head < 0)
            head = size - 1;
        deque[head] = i;
        items++;
    }
    
    public void insertRight(int i){
        if (++tail > size)
            tail = 0;
        deque[tail - 1] = i;
        items++;
    }
    
    public int removeLeft(){
        if (++head > size - 1)
            head = 0;
        items--;
        return deque[head-1];
    }
    
    public int removeRigt(){
        if (--tail < 0)
            tail = size - 1;
        items--;
        return deque[tail];
    }
    
    @Override
    public String toString(){
        return "deque = " + Arrays.toString(deque);
    }
    
}
