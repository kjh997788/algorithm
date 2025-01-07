import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        char[] XCharArr = X.toCharArray();
        char[] YCharArr = Y.toCharArray();
        Arrays.sort(XCharArr);
        Arrays.sort(YCharArr);

        int xIdx = XCharArr.length - 1;
        int yIdx = YCharArr.length - 1;

        StringBuilder answer = new StringBuilder();

        while (xIdx >= 0 && yIdx >= 0) {
            if (XCharArr[xIdx] == YCharArr[yIdx]) {
                answer.append(XCharArr[xIdx]);
                xIdx--;
                yIdx--;
            } else if (XCharArr[xIdx] > YCharArr[yIdx]) {
                xIdx--;
            } else {
                yIdx--;
            }
        }

        if (answer.length() == 0) {
            return "-1";
        }
        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer.toString();
    }
}
