import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> intArr = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) intArr.add(i);
        }

        if (intArr.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[intArr.get(intArr.size() - 1) - intArr.get(0) + 1];
        int idx = 0;
        for (int i = intArr.get(0); i <= intArr.get(intArr.size() - 1); i++) {
            answer[idx] = arr[i];
            idx++;
        }

        return answer;
    }
}
