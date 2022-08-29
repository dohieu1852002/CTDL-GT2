package hashTable;


import java.util.ArrayList;

public class MyHashset {
    private final int SIZE = 1000;
    private ArrayList<Integer> myBucket[];
    MyHashset(){
        myBucket = new ArrayList[SIZE];
        for(int i=0; i<myBucket.length; i++){
            myBucket[i]= new ArrayList<>();
        }
    }
    private int hashFuntion(int key){
        return key % SIZE;
    }
    public  void add(int key) {
        int hashValueIndex = hashFuntion(key);
        ArrayList bucket = myBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex < 0) {
            bucket.add(key);
        }
    }
    public void remove(int key){
        int hashValueIndex = hashFuntion(key);
        ArrayList bucket = myBucket[hashValueIndex];

    int keyIndex = bucket.indexOf(key);
        if(keyIndex >= 0){
        bucket.remove(keyIndex);
    }
    }
    public boolean contains(int key){
        int hashValueIndex = hashFuntion(key);
        ArrayList bucket = myBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        return keyIndex >= 0;
    }

    public static void main(String[] args) {
        MyHashset myset = new MyHashset();
        myset.add(1);
        myset.add(1002);
        System.out.println("mySet.contains(1): " + myset.contains(1));
        myset.remove(1);
        System.out.println("mySet.contains(1): " + myset.contains(1));


    }

}
