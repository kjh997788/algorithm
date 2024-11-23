class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
                int target = 1000000;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2] && arr[j] < target) {
                    target = arr[j];
                }
                if (target != 1000000) {
                    answer[i] = target;
                } else {
                    answer[i] = -1;
                }
            } 
        }        
        
        return answer;
    }
}