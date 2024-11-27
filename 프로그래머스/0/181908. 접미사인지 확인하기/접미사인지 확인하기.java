class Solution {
    public int solution(String my_string, String is_suffix) {
        if (is_suffix.length() > my_string.length()) {
            return 0;
        }
        if (my_string.endsWith(is_suffix)) {
            return 1;
        } else {
            return 0;
        }
    }
}