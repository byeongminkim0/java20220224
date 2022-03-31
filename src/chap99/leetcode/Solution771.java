package chap99.leetcode;

import java.util.HashSet;
import java.util.Set;

class Solution771 {
	public int numJewelsInStones2(String jewels, String stones) {
		Set<Character> set = new HashSet<>();

		for (char c : jewels.toCharArray()) {
			set.add(c);
		}

		int cnt = 0;

		for (char c : stones.toCharArray()) {
			if (set.contains(c)) {
				cnt++;
			}
		}

		return cnt;

	}

	public int numJewelsInStones(String jewels, String stones) {
		int cnt = 0;
		for (int i = 0; i < jewels.length(); i++) {
			for (int j = 0; j < stones.length(); j++) {
				if (jewels.charAt(i) == stones.charAt(j)) {
					cnt++;
				}
			}
		}

		return cnt;
	}
}