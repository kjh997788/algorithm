class Solution {
    public String solution(int[] food) {
        StringBuilder forward = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                forward.append(String.valueOf(i));
            }
        }

        String backward = new StringBuilder(forward).reverse().toString();

        forward.append("0");
        forward.append(backward);

        return forward.toString();
    }
}
