class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        
        StringBuilder answer = new StringBuilder();
        
        boolean isStarting = true; // 단어의 시작 여부
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if (currentChar == ' ') { // 공백인 경우
                answer.append(currentChar);
                isStarting = true; // 다음 문자는 단어의 시작
            } else if (isStarting) { // 단어의 첫 문자
                if (Character.isLetter(currentChar)) {
                    answer.append(Character.toUpperCase(currentChar));
                } else {
                    answer.append(currentChar); // 숫자일 경우 그대로 추가
                }
                isStarting = false; // 단어 시작 상태 해제
            } else { // 단어의 나머지 문자
                answer.append(currentChar);
            }
        }
        
        return answer.toString();
    }
}
