class Solution {
    public int solution(int n) {
        int answer = 0, m = 1;
        
        while (m != n) {
            int sum = 0;
            for (int i = m; i < n; i++) {
                sum += i;
                if (sum == n) {
                    answer++;
                    break;
                }
                if (sum > n) break;
            }
            m++;
        }
        
        return ++answer;
    }
}