class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            int c = (int)s.charAt(i);
            int cesar = c + n;
            if (c == 32) answer.append(' ');
            else if (c < 91 && cesar > 90) answer.append((char)(cesar - 26));
            else if (c > 96 && cesar > 122) answer.append((char)(cesar - 26));
            else answer.append((char)cesar);
        }
        
        return answer.toString();
    }
}