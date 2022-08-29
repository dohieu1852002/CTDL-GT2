package hashTable;

import java.util.HashMap;

import java.util.Map;

public class missingNumber{
    public static int missingNumber(int[] arr, int[] brr){
        Map< Integer, Integer> myMap = new HashMap<>();
        for (int i : arr) {
            if(myMap.containsKey(arr[i])==false){
                myMap.put(arr[i],1);
            }else{
                int solanxuathien = myMap.get(arr[i]);
                myMap.put(arr[i], solanxuathien+1);
            }
        }
        for (int i : brr) {
            if(myMap.containsKey(brr[i])==false){
                myMap.put(brr[i],1);
            }else{
                int solanxuathien = myMap.get(brr[i]);
                myMap.put(brr[i], solanxuathien+1);
            }
        }
        for(Map.Entry entry : myMap.entrySet()){
            if(myMap.get(entry.getKey()) == 1){
                System.out.println(entry.getKey());
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,9};
        int[] brr={2,3,4,5,7,8};
        missingNumber(arr,brr);
        System.out.println("done");

    }
}
