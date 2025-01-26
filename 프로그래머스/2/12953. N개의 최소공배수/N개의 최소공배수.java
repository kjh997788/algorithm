class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            answer = LCM(answer, arr[i]);
        }
        
        return answer;
    }
    
    public static int LCM(int a, int b) {
        int GCD = a;
        int B = b;
        
        while (B != 0) {
            int temp = B;
            B = GCD % B;
            GCD = temp;
        }
        
        return a * b / GCD;
    }
}