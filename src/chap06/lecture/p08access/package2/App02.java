package chap06.lecture.p08access.package2;

import chap06.lecture.p08access.package1.Computer;

public class App02 {
	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.str1 = "spring"; // package private 필드여서 접근 불가능
		com1.str3 = "react";
	}
}
