package chap99.codingbat;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
	public String[] firstSwap(String[] strings) {
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < strings.length; i++) {
			Character key = strings[i].charAt(0);

			if (map.containsKey(key)) {
				Integer prevIndex = map.get(key);

				if (prevIndex != -1) {
					String temp = strings[prevIndex];
					strings[prevIndex] = strings[i];
					strings[i] = temp;
					// map.remove(key);
					map.put(key, -1);
				}
			} else {
				map.put(key, i);
			}
		}

		return strings;
	}

	public String[] allSwap(String[] strings) {
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < strings.length; i++) {
			String str = strings[i];
			Character key = str.charAt(0);

			if (map.containsKey(key)) {
				Integer prevIndex = map.get(key);

				String temp = strings[prevIndex];
				strings[prevIndex] = strings[i];
				strings[i] = temp;

				map.remove(key);
			} else {
				map.put(key, i);
			}

		}

		return strings;
	}

	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> map = new HashMap<>();

		for (String str : strings) {
			map.put(str, map.containsKey(str));
		}

		return map;
	}

	public String wordAppend(String[] strings) {
		String result = "";
		Map<String, Integer> map = new HashMap<>();

		for (String str : strings) {
			String key = str;

			if (map.containsKey(key)) {
				Integer prev = map.get(key);
				map.put(key, prev + 1);
			} else {
				map.put(key, 1);
			}

			Integer cur = map.get(key);

			if (cur % 2 == 0) {
				result += key;
			}
		}

		return result;

	}

	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> map = new HashMap<>();

		for (String str : strings) {
			String key = str.substring(0, 1);

			if (map.containsKey(key)) {
				String prev = map.get(key);
				map.put(key, prev + str);
			} else {
				map.put(key, str);
			}
		}

		return map;
	}

	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		for (String str : strings) {
			if (map.containsKey(str)) {
				int val = map.get(str);
				map.put(str, val + 1);
			} else {
				map.put(str, 1);
			}
		}
		/*
		for (String str : strings) {
			map.compute(str, (k, v) -> v == null ? 1 : v + 1);
		}
		*/

		return map;
	}

	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<>();

		for (String str : strings) {
			String key = str.substring(0, 1);
			String value = str.substring(str.length() - 1);

			map.put(key, value);
		}

		return map;
	}

	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		for (String str : strings) {
			map.put(str, str.length());
		}

		return map;
	}

	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		for (String str : strings) {
			map.put(str, 0);
		}

		return map;
	}
}
