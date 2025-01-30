import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        // 10일씩 끊어서 연속 상품 체크 <- 슬라이딩 윈도우
        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> tempMap = new HashMap<>(map);

            for (int j = i; j < i + 10; j++) {
                if (tempMap.containsKey(discount[j])) {
                    tempMap.put(discount[j], tempMap.get(discount[j]) - 1);
                    if (tempMap.get(discount[j]) == 0) {
                        tempMap.remove(discount[j]);
                    }
                }
            }

            if (tempMap.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
