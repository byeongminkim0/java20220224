package chap05.book.exercise;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int cnt = 0;
		for(int[] item : array) {
			for(int num : item) {
				sum += num;
				cnt++;
			}
		}
		
		avg = sum/(double)cnt;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
