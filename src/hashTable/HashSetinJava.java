package hashTable;

import java.util.HashSet;
import java.util.Set;

public class HashSetinJava {
    //217 leetcode
    public static boolean containDuplicate(int[] nums){
        Set<Integer> mySet = new HashSet<>();
        for (int i : nums) {
            if(mySet.contains(i)==true){
                return true;
            }else{
                mySet.add(i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7,1,3,1};
        containDuplicate(nums);
        }
}

