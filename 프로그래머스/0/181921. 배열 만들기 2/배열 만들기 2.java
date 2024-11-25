import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> intArrayList = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if(isOnlyZeroOrFive(i)) {
                intArrayList.add(i);
            }
        }
        
        if (intArrayList.size() != 0) {
            int[] answer = new int[intArrayList.size()];
            for (int i = 0; i < intArrayList.size(); i++) {
                answer[i] = intArrayList.get(i);
            }
            return answer;
        } else {
            int [] answer = {-1};
            return answer;
        }
}
    
    public static boolean isOnlyZeroOrFive(int n) {
        String s = String.valueOf(n);

        for (char c : s.toCharArray()) {
            if (c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }
}