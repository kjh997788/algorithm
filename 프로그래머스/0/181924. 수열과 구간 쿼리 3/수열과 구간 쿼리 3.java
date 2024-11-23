class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int t = 0;
        for (int i = 0; i < queries.length; i++) {
            t = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = t;
        }
        return arr;
    }
}