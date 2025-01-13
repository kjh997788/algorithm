class Solution {
    public int solution(int n) {
        // 이진수에서 1의 갯수
        int cnt = Integer.bitCount(n);
        int nextNum = n + 1;
        
        while (true) {
            if (Integer.bitCount(nextNum) == cnt) {
                return nextNum;
            }
            nextNum++;
        }
    }
}
