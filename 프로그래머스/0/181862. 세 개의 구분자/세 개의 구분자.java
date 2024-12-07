import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.split("[abc]");
        
        List<String> answer = new ArrayList<>();
        for (String idx : arr) {
            if (!idx.isEmpty()) {
                answer.add(idx);
            }
        }
        
        if (answer.isEmpty()) {
            return new String[] {"EMPTY"};
        }
        return answer.toArray(new String[0]);
    }
}