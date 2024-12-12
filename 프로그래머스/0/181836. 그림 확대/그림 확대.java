class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int cnt = 0;
        
        for (int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < picture[i].length(); j++) {
                for (int l = 0; l < k; l++) {
                    sb.append(picture[i].charAt(j));
                }
            }
            String duplicated = sb.toString();
            
            for (int j = 0; j < k; j++) {
                answer[cnt] = duplicated;
                cnt++;
            }
        }
        return answer;
    }
}
