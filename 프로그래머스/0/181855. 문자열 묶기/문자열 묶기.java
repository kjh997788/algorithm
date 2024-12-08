import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for (String str : strArr) {
            int length = str.length();
            hashMap.put(length, hashMap.getOrDefault(length, 0) + 1);
        }
        
        int groupSize = 0;
        for (int count : hashMap.values()) {
            groupSize = Math.max(groupSize, count);
        }
        
        return groupSize;
    }
}
