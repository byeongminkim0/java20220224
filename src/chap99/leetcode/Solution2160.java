package chap99.leetcode;

import java.util.Arrays;

class Solution2160 {
    public int minimumSum(int num) {
//         int n1 = num % 10;
        
//         num = num / 10;
        
//         int n2 = num % 10;
        
//         num = num / 10;
        
//         int n3 = num % 10;
        
//         num = num / 10;
        
//         int n4 = num % 10;
        
//         int[] arr = {n1, n2, n3, n4};
        
        int[] arr = new int[4];
        
        for (int i = 0; i < 4; i++) {
            arr[i] = num % 10;
            num = num / 10;
        }
        
        Arrays.sort(arr);
        
        int result = arr[0] * 10 + arr[1] * 10 + arr[2] + arr[3];
        
        return result;
    }
}
