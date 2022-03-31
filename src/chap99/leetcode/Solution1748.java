package chap99.leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution1748 {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.compute(num, (k, v) -> v == null ? 1 : v + 1);
        }
        
        int result = 0;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result += entry.getKey();
            }
        }
        
        return result;
    }
}
