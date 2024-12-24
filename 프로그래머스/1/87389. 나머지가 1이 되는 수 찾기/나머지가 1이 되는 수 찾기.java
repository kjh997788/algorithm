class Solution {
    public int solution(int n) {
        int i = 2;
        for (; i <= Math.sqrt(n); i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return n-1;
    }
}
