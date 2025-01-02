class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split(" ", -1);

        for (String str : arr) {
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    answer.append(Character.toUpperCase(str.charAt(i)));
                } else {
                    answer.append(Character.toLowerCase(str.charAt(i)));
                }
            }
            answer.append(" ");
        }

        return answer.toString().substring(0, answer.length() - 1);
    }
}
