class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String p = "" + a + b;
        answer = Integer.parseInt(p) >= 2*a*b ? Integer.parseInt(p) : 2*a*b;
        return answer;
    }
}