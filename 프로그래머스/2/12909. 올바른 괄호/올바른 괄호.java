class Solution {
    boolean solution(String s) {
        int right = 0, left = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') right++;
            else left++;
            if (right < left) return false;
        }
        if (right != left) return false;
        else return true;
    }
}