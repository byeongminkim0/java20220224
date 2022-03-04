package chap99.codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MissingCharTest {

	@Test
	void test() {
		assertEquals("ktten", missingChar("kitten", 1));
		assertEquals("itten", missingChar("kitten", 0));
	}

	public String missingChar(String str, int n) {
		String left = str.substring(0, n);
		String right = str.substring(n + 1);
		
		return left + right;
	}

}
