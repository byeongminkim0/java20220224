package chap99.leetcode;

class Solution2000 {
    public String reversePrefix(String word, char ch) {
        int index = 0;
        char[] arr = word.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                index = i;
                break;
            }
        }
        
        int left = 0;
        int right = index;
        
        while (left < right) {
            // 바꾸기
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
                
            left++;
            right--;
        }
        
        return new String(arr);
    }
}

