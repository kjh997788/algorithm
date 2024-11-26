class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] charArray = my_string.toCharArray();

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            while (s < e) {
                char tmp = charArray[s];
                charArray[s] = charArray[e];
                charArray[e] = tmp;
                s++;
                e--;
            }
        }

        return new String(charArray);
    }
}