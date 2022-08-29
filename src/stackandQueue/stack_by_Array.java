package stackandQueue;

public class stack_by_Array {
    int[] array;
    int SIZE;
    int topIndex;
    public static void myStackarray(){
        int[] array;
        int SIZE = 0;
        int topIndex;
        array = new int[SIZE];
        topIndex=-1;
    }
    public boolean push(int val){
        if(!isFull()){
            topIndex++;
            array[topIndex]=val;
            return true;
        }
        return false;
    }
    public boolean isFull(){
        return topIndex==SIZE-1;
    }
    public boolean isEmpty(){
        return topIndex<0;
    }

    public static void main(String[] args) {
        
    }
}