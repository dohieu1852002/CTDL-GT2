package hashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class hashMapinJava {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,4,3,2,5,6};
        String[] arr1={"Hieu","Yeu", "em", "Nhieu","Hieu"};
        Map<String, Integer> myMap = new TreeMap<>();
        // key la gia tri, value la so lan xuat hien
        for (String i: arr1) {
            if(myMap.containsKey(i)==false){
                myMap.put(i,1);
                // i chua xuat hien trong map
            }else{
                // i da xuat hien
                int solanxuathien = myMap.get(i);
                solanxuathien ++;
                myMap.put(i, solanxuathien);
            }
        }
        for(Map.Entry entry  : myMap.entrySet()){
            System.out.println(entry.getKey()+" so la xuat hien "+ entry.getValue());
        }
    }
}
