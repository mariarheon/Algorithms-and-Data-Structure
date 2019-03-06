//FIFO 
public class Queue {
    private int[] queue;
    private int items;
    private int maxSize;

    private int rear;
    private int front;
    
    public Queue(int maxSize) {
        this.items = 0;
        this.maxSize = maxSize;
        this.queue = new int[this.maxSize];
        this.rear = -1;
        this.front = 0;
    }
    
   public boolean isEmpty(){
       return (items == -1);
   }
   
   public boolean isFull(){
       return (items == maxSize - 1);
   }
   
   public int remove(){
       int temp = queue[front++];
       if (front == maxSize)
           front = 0;
       items--;
       return temp;
   }
   
   public void insert(int i){
       if(rear == maxSize -  1)
           rear = -1;
       queue[++rear] = i;
       items++;
   }
   
   public int peek(){
       return queue[front];
   }

    public int getSize() {
        return items;
    }
   
   public void insertPrioruity(int item){
       int i;
       if(items == 0){
           queue[items++] = item;
       } else{
           for (i = item - 1; i >= 0; i++){
               if (item > queue[i])
                    queue[i+1] = queue[i];
               else break;
           }    
           queue[i+1] = item; 
           items++;
        }
   }
}
