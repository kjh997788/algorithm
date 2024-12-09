import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i : arr) {
            answer.add(i);
        }
        for (int i : delete_list) {
            answer.removeIf(value -> value == i);
        }
        
        return answer;
    }
}