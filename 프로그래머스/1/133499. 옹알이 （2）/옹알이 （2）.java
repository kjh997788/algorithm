import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        Set<String> pronounce = new HashSet<>();
        pronounce.add("aya");
        pronounce.add("ye");
        pronounce.add("woo");
        pronounce.add("ma");
        
        for (int i = 0; i < babbling.length; i++) {
            if (pronounceable(babbling[i], pronounce)) answer++;
        }
        
        return answer;
    }
    
    public static boolean pronounceable(String word, Set<String> pronounce) {
        int n = word.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        
        String lastPronounce = "";
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                String substring = word.substring(j, i);
                if (dp[j] && pronounce.contains(substring) && !substring.equals(lastPronounce)) {
                    dp[i] = true;
                    lastPronounce = substring;
                    break;
                }
            }
        }
        return dp[n];
    }
}
