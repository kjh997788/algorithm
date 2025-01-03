class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();        
        boolean[] skipSet = new boolean[26];
        
        for (int i = 0; i < skip.length(); i++) {
            skipSet[skip.charAt(i) - 'a'] = true;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int cnt = 0;
            
            while (cnt < index) {
                c++;
                if (c > 'z') {
                    c = 'a';
                }
                if (!skipSet[c - 'a']) {
                    cnt++;
                }
            }
            
            answer.append(c);
        }
        
        return answer.toString();
    }
}
