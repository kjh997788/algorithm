class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();
        char ch = alp.charAt(0);
        for (int i = 0; i < my_string.length(); i++)
            if (my_string.charAt(i) == ch) answer.append(Character.toUpperCase(my_string.charAt(i)));
            else answer.append(my_string.charAt(i));
        return answer.toString();
    }
}