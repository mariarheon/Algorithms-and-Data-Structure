

/**
 *
 * @author Maria Mikhaleva
 * @veeersion dated Feb 22 2019
 */
public class MyArr {
    int[] array;
    int size;
    
    public MyArr(int size){
        this.size = size;
        array = new int[size];
    }

    public void display(){
        for (int i = 0; i < this.size; i++)
            System.out.print(this.array[i]+ " ");
        System.out.println();
    }
    
    public void fill(){
        for (int i = 0; i < this.size; i++)
            this.array[i] = (int) (Math.random() * 10);
    }
    
    public int searchLinear(int element){
        for (int i = 0; i < this.size; i++){
            if (this.array[i] == element) return i+1; //чтобы выводилась "реальная" позиция элемента(нумерация массива с 1)
        }
        return 0;
    }
    
    public int binarySearch(int element){
        int low = 0;
        int high = this.size - 1;
        int mid;
        while (low <= high){
            mid = (low + high) / 2;
            if (this.array[mid] == element)
                return mid;
            else{
                if (element < this.array[mid])
                    high = mid - 1;
                else low = mid + 1;
            }
        }
        
        return 0;
    }
    
    public void del(int element){
        int i = 0;
        for (i = 0; i < this.size; i++)
            if (this.array[i] == element)
                break;
        for ( int j = i; j < this.size-1; j++)
            this.array[j] = this.array[j+1];
        this.size--;
       
    }
    
    public void add(int i, int element){
        this.array[i] = element;
    }

    public int getSize() {
        return size;
    }

    public int[] getArray() {
        return array;
    }
    
    
}
