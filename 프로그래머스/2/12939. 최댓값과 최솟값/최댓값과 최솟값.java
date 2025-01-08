import java.util.*;

class Solution {
    public String solution(String s) {
        String[] StrArr = s.split(" ");
        int[] intArr = new int[StrArr.length];
        
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(StrArr[i]);
        }
        
        Arrays.sort(intArr);
        
        String answer = intArr[0] + " " + intArr[intArr.length - 1];
        
        return answer;
    }
}