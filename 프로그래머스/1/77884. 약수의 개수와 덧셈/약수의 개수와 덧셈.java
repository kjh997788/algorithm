class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            if (isEven(i)) answer += i; 
            else answer -= i;
        }
        
        return answer;
    }
    
    private boolean isEven(int num) {
        int sqrt = (int) Math.sqrt(num);
        
        if (sqrt * sqrt == num) {
            return false;
        }
        return true;
    }
}
