package chap99.leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution2006 {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.compute(num, (key, v) -> v == null ? 1 : v + 1);
        }
        
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer target = entry.getKey() + k;
            
            if (map.containsKey(target)) {
                result += entry.getValue() * map.get(target);
            }
        }
        
        return result;
    }
}
