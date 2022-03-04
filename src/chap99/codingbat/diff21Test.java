package chap99.codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class diff21Test {

	@Test
	void test() {
		assertEquals(0, diff21(21));
		assertEquals(2, diff21(19));
		assertEquals(2, diff21(22));
		assertEquals(18, diff21(30));
	}

	public int diff21(int n) {
		
		if (n > 21) {
			return (n - 21) * 2;
		} else {
			return 21 - n;
		}
		
	}

}
