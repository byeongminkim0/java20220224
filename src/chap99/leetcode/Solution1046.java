package chap99.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution1046 {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int stone : stones) {
            list.add(stone);
        }
        
        while (list.size() > 1) {
            Collections.sort(list);
            int max1 = list.remove(list.size() -1);
            int max2 = list.remove(list.size() -1);
            
            if (max1 != max2) {
                list.add(max1 - max2);
            }
        }
        
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.get(0);            
        }
    }
}
