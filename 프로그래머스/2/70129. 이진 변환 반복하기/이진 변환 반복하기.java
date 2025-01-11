class Solution {
    static int[] answer = {0, 0};
    
    public int[] solution(String s) {
        while (!s.equals("1")) {
            s = binaryString(s);
        }
        
        return answer;
    }
    
    public static String binaryString(String s) {
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            } else {
                answer[1]++;
            }
        }

        answer[0]++;
        
        return Integer.toBinaryString(cnt);
    }
}
