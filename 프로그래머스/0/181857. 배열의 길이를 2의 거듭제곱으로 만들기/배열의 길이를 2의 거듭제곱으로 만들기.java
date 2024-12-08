import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int answerLength = 1;
        
        while (answerLength < arr.length) {
            answerLength *= 2;
        }
        
        int[] answer = new int[answerLength];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}
