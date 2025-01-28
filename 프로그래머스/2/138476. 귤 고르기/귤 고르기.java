import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }

        List<Integer> count = new ArrayList<>(map.values());
        count.sort(Collections.reverseOrder());

        int total = 0;
        int answer = 0;
        for (int c : count) {
            total += c;
            answer++;
            if (total >= k) {
                break;
            }
        }

        return answer;
    }
}