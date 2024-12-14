import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        
        int h = hashSet.size();
        
        if (h < nums.length/2) return h;
        else return nums.length/2;
    }
}