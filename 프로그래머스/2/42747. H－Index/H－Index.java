import java.util.Arrays;

public class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int left = 0, right = citations.length;

        while (left < right) {
            int mid = (left + right + 1) / 2;
            int cnt = 0;

            for (int citation : citations) {
                if (citation >= mid) cnt++;
            }

            if (cnt >= mid) left = mid;
            else right = mid - 1;
        }

        return left;
    }
}
