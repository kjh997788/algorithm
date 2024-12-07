import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        
        int[] answer = new int[k];
        var iterator = set.iterator();
        for (int i = 0; i < k; i++) {
            if (iterator.hasNext()) answer[i] = iterator.next();
            else answer[i] = -1;
        }
        
        return answer;
    }
}