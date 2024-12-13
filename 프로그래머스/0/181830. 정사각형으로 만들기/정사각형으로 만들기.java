class Solution {
    public int[][] solution(int[][] arr) {
        int rows = arr[0].length;
        int cols = arr.length;
        
        if (cols > rows) {
            int[][] answer = new int[cols][cols];
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < cols; j++) {
                    if (j >= rows) answer[i][j] = 0;
                    else answer[i][j] = arr[i][j];
                }
            }
            return answer;
        } else if (cols < rows) {
            int[][] answer = new int[rows][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows; j++) {
                    if (i >= cols) answer[i][j] = 0;
                    else answer[i][j] = arr[i][j];
                }
            }
            return answer;
        } else {
            return arr;
        }
    }
}