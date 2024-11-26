import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] numbers = {a,b,c,d};
        Arrays.sort(numbers);
        
        if (numbers[0] == numbers[3]) {
            answer = 1111 * numbers[0];
        } else if (numbers[0] == numbers[2]) {
            answer = (10 * numbers[0] + numbers[3]) * (10 * numbers[0] + numbers[3]);
        } else if (numbers[1] == numbers[3]) {
            answer = (10 * numbers[1] + numbers[0]) * (10 * numbers[1] + numbers[0]);
        } else if (numbers[0] == numbers[1] && numbers[2] == numbers[3]) {
            answer = (numbers[0] + numbers[2]) * (numbers[2] - numbers[0]);
        } else if (numbers[0] == numbers[1]) {
            answer = numbers[2] * numbers[3];
        } else if (numbers[1] == numbers[2]) {
            answer = numbers[0] * numbers[3];
        } else if (numbers[2] == numbers[3]) {
            answer = numbers[0] * numbers[1];
        } else {
            answer =numbers[0];
        }        
        return answer;
    }
}