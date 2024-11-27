import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        HashMap<Integer, Long> hm = new HashMap<>();

        for (int w : weights) {
            hm.put(w, hm.getOrDefault(w, 0L) + 1);
        }

        for (int w : hm.keySet()) {
            long cnt = hm.get(w);

            answer += cnt * (cnt - 1) / 2;
            if (w % 3 == 0 && hm.containsKey(w * 2 / 3)) {
                answer += cnt * hm.get(w * 2 / 3);
            }
            if (hm.containsKey(w * 2)) {
                answer += cnt * hm.get(w * 2);
            }
            if (w % 4 == 0 && hm.containsKey(w * 3 / 4)) {
                answer += cnt * hm.get(w * 3 / 4);
            }
        }

        return answer;
    }
}