import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        List<String> stringList = new ArrayList<>();
        
        for (String idx : arr) {
            if (!idx.isEmpty()) {
                stringList.add(idx);
            }
        }
        
        String[] answer = stringList.toArray(new String[0]);
        Arrays.sort(answer);
        
        return answer;
    }
}
