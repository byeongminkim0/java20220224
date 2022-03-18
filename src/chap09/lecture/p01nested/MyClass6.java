package chap09.lecture.p01nested;

public class MyClass6 {
	int outField1;
	void outMethod1() {
		
	}
	
	void method1() {
		class LocalClass {
			int outField1;
			
			void outMethod1() {
				
			}
			
			void method1() {
				outField1 = 3;
				this.outField1 = 4;
				MyClass6.this.outField1 = 5;
				outMethod1();
				this.outMethod1();
				MyClass6.this.outMethod1();
			}
		}
	}
}
