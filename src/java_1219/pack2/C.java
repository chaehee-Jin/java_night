package java_1219.pack2;

import java_1219.pack1.A;

public class C {
	
	public void method() {
		A a = new A();
		
		//클래스 A의 멤버 중 field1과 method1()은 접근제한자가 default로 동일한 패키지가 아니면 접근할 수 없음 
		//클래스 A의 멤버 중 field2와 method2()는 접근제한자가 동일한 패키지나 상속받은 자식 클래스가 아니면 접근할 수 없음 
		//a.field1 = "값 1";
		//a.field2 = "값 2";
		//a.method1();
		//a.method2();
		}

}
