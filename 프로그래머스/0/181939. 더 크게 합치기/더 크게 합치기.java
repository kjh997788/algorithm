class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String x = String.valueOf(a);
        String y = String.valueOf(b);
        if(Integer.parseInt(x+y) >= Integer.parseInt(y+x)) {
            answer = Integer.parseInt(x+y);
        } else {
            answer = Integer.parseInt(y+x);
        }
        
        return answer;
    }
}