class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n%2 == 1) {
            for (int i = 1; i <= n/2 +1; i++) {
                answer += (2*i - 1);
            }
        } else {
            for (int i = 1; i <= n/2; i++) {
                answer += (2*i)*(2*i);
            }
        }
        return answer;
    }
}