import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                treeMap.put(rank[i], i);
            }
        }

        List<Integer> top3 = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            top3.add(entry.getValue());
            if (top3.size() == 3) {
                break;
            }
        }

        return 10000 * top3.get(0) + 100 * top3.get(1) + top3.get(2);
    }
}
