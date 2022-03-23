package chap11.book.exercise.p12;

public class StringConvertExample {
	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		int intData2 = Integer.valueOf(strData1);
		
		int intData3 = 150;
		String strData2 = Integer.toString(intData3);
		String strData3 = "" + intData3;
		String strData4 = String.valueOf(intData3);
		
	}
}
