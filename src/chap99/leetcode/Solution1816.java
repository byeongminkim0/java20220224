package chap99.leetcode;

import java.util.Arrays;

class Solution1816 {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        
        String[] res = Arrays.copyOf(arr, k);
        
        String str = String.join(" ", res);
        
        return str;
        
//    String a = "";
//    int cnt = 0;
//    for(int i = 0;i<s.length();i++) {
//        if(s.charAt(i) == ' ') {
//            cnt++;
//        }
//        if(cnt == k) {
//            break;
//        }
//        a += s.charAt(i) ;
//    }
//    return a;
    }
    
}
