class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        myString = myString.toLowerCase();
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'a') answer.append('A');
            else answer.append(myString.charAt(i));
        }
        return answer.toString();
    }
}