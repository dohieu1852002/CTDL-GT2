package hashTable;

import java.util.ArrayList;

public class MyHashmap {

    private class Data{
        int key;
        int value;
        Data(int key, int value){
            this.key=key;
            this.value=value;
        }
        @Override
        public boolean equals(Object other) {
            if(other instanceof Data)
                return this.key == ((Data)other).key;
            return false;
        }
    }
    private final int SIZE=1000;
    private ArrayList<Data> myBucket[];
    public MyHashmap(){
        myBucket = new ArrayList[SIZE];
        for(int i=0; i < myBucket.length; i++){
           myBucket[i]= new ArrayList<>();
        }

    }
    private int hashfuntion(int key){
       return key % SIZE;
    }
    public void put(int key, int value){
        int hashvalueIndex = hashfuntion(key);
        ArrayList bucket = myBucket[hashvalueIndex];
        Data newData = new Data(key,value);
        int keyIndex = bucket.indexOf(newData);
        if(keyIndex >= 0){
            bucket.get(keyIndex);
        }else{
            bucket.add(newData);
        }
    }
}
