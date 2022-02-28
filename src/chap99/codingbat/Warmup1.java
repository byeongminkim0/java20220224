package chap99.codingbat;

public class Warmup1 {
	public boolean makes10(int a, int b) {

		int sum = a + b;

		return (sum == 10) || (a == 10) || (b == 10);
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
	}

	public int diff21(int n) {
		int diff = 21 - n;
		return (diff < 0) ? diff * -2 : diff;
	}

	public int sumDouble(int a, int b) {
		int sum = a + b;

		return (a == b) ? sum * 2 : sum;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return !(aSmile ^ bSmile);
	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}
}
