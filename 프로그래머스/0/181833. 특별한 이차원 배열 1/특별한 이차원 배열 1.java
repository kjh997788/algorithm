class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            answer[i][j] = 1;
            j++;
        }
        return answer;
    }
}