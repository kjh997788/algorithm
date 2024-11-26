class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        String[] stringArray = my_string.split("");
        
        for (int i = 0; i < index_list.length; i++) {
            answer.append(stringArray[index_list[i]]);
        }
        
        return answer.toString();
    }
}