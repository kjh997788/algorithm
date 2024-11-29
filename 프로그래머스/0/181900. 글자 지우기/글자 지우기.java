import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);
        Arrays.sort(indices);
        for (int i = 0; i < indices.length; i++) {
            answer.delete(indices[i] - i,indices[i] - i + 1);
        }
        return answer.toString();
    }
}