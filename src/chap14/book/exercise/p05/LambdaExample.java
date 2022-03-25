package chap14.book.exercise.p05;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
	private static int[] scores = {10, 50, 3};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin((a, b) -> Math.max(a, b));
		System.out.println("최댓값: " + max);
		
		// 최소값 얻기
		int min = maxOrMin((a, b) -> Math.min(a, b));
		System.out.println("최소값: " + min);
	}
}
