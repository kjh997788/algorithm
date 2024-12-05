import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i =0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                stringArrayList.add(strArr[i]);
            }
        }
        return stringArrayList.toArray(new String[0]);
    }
}