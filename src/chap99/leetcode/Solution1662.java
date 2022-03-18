package chap99.leetcode;

class Solution1662 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "ja";
		String str3 = "va";
		String str4 = str2 + str3;
		
		System.out.println(str1);
		System.out.println(str4);
		
		System.out.println(str1 == str4);
	}
	
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        
        for (String s : word1) {
            str1 += s;
        }
        
        for (String s : word2) {
            str2 += s;
        }
        
        
        return str1 == str2;
    }
}
