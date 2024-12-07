import java.util.*;

class Solution {
    public List<Integer> solution(int n, long left, long right) {
        List<Integer> answer = new ArrayList<>();
        
        for (long k = left; k <= right; k++) {
            int row = (int) (k / n);
            int col = (int) (k % n);
            answer.add(Math.max(row + 1, col + 1));
        }
        
        return answer;
    }
}