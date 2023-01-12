package java_1219.pack1;

public class B {
	
	public void method() {
		//같은 패키지에 속해 있는 클래스 A를 사용하여 객체를 생성했기 때문에 A의 멤버에 모두 접근이 가능 
		// 클래스 A의 멤버는 접근제한자가 default나 protected이기 때문임 
		A a= new A();
		a.field1 = "값 1";
		a.field2 = "값 2";
		a.method1();
		a.method2();
		
		
		
	}

}
