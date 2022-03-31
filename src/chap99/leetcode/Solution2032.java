package chap99.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution2032 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }
        
        Set<Integer> set3 = new HashSet<>();
        for (int num : nums3) {
            set3.add(num);
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : set1) {
            map.put(num, 1);
        }
        
        for (Integer num : set2) {
            if (map.containsKey(num)) {
                Integer val = map.get(num);
                map.put(num, val + 1);
            } else {
                map.put(num, 1);
            }
        }
        
        for (Integer num : set3) {
            if (map.containsKey(num)) {
                Integer val = map.get(num);
                map.put(num, val + 1);
            } else {
                map.put(num, 1);
            }
        }
        
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        
        return result;
    }
}
