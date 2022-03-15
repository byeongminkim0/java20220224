package chap07.lecture.p03protected.package2;

import chap07.lecture.p03protected.package1.SuperClass1;

public class SubClass1 extends SuperClass1 {
	
	public void subMethod() {
		super.publicMethod();
		super.protectedMethod(); // 다른 패키지에 있지만 상속 받아서 사용 가능
//		super.defaltMethod(); // 같은 패키지에 있지 않아서 사용 불가
	}
}
