class Solution {
    public int solution(String number) {
        int answer = 0;
        
        String[] stringArray = number.split("");
        int sum = 0;
        for (String idx : stringArray) {
            sum += Integer.parseInt(idx);
        }
        answer = sum % 9;
        
        return answer;
    }
}