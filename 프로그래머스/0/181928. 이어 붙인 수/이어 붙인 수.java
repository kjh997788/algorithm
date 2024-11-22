class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i]%2 == 0) {
                s1.append(num_list[i]);
            } else {
                s2.append(num_list[i]);
            }
        }
        answer = Integer.parseInt(s1.toString()) + Integer.parseInt(s2.toString());
        
        return answer;
    }
}