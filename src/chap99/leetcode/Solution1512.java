package chap99.leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution1512 {
	public int numIdenticalPairs2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        
        int result = 0;
        java.util.Collection<Integer> values = map.values();
        for (Integer value : values) {
            result += (value) * (value-1) / 2;
        }   
        
        return result;
    }
    public int numIdenticalPairs(int[] nums) {
        
        int count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
