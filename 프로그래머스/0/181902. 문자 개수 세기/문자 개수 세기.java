class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 65; i< 91; i++) {
            int cnt = 0;
            for (int j = 0; j < my_string.length(); j++) {
                if ((byte)my_string.charAt(j) == i) cnt++;
            }
            answer[i-65] = cnt;
        }
        for (int i = 97; i< 123; i++) {
            int cnt = 0;
            for (int j = 0; j < my_string.length(); j++) {
                if ((byte)my_string.charAt(j) == i) cnt++;
            }
            answer[i-71] = cnt;
        }
        
        return answer;
    }
}