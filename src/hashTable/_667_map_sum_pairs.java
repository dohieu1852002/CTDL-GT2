package hashTable;

import java.util.HashMap;
import java.util.Map;

public class _667_map_sum_pairs {
    private final Map<String, Integer> myMap = new HashMap<>();
    public  void insert(String key, int val) {
        myMap.put(key, val);
    }

    public int sum(String prefix) {
        int sum = 0;
        for(Map.Entry entry:myMap.entrySet()){
            String key = (String)entry.getKey();
            if(key.startsWith(prefix)){
                sum += (int)entry.getValue();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();

    }
}

