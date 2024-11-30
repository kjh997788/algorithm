class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int size = intervals[0][1] - intervals[0][0] + intervals[1][1] - intervals[1][0] + 2;
        int[] answer = new int[size];
        int idx = intervals[0][0];
        for (int i = 0; i <= intervals[0][1] - intervals[0][0]; i++) {
            answer[i] = arr[idx];
            idx++;
        }
        idx = intervals[1][0];
        for (int i = intervals[0][1] - intervals[0][0] + 1; i < size; i++) {
            answer[i] = arr[idx];
            idx++;
        }
        return answer;
    }
}