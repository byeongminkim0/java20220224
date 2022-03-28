package chap99.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> list = Arrays.stream(candies).boxed().collect(Collectors.toList());;
        
        Integer max = Integer.MIN_VALUE;
        
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        
        List<Boolean> result = new ArrayList<>();
        
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i) + extraCandies >= max);
        }
        
        return result;
    }
}
