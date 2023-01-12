package java_1219.pack2;

import java_1219.pack1.A;

public class D extends A{
	
	public D(){
		super();
		
		//클래스 A의 멤버 field2 및 method2()의 접근제한자는 protected로 클래스 A를 상속한 클래스 D가 접근이 가능함 
		this.field2 = "값 2";
		this.method2();
		
		//클래스 A의 멤버 field1과 method1()의 접근제한자는 default이므로 다른 패키지에 있는 클래스 D가 클래스 A를 상속받았더라도 접근이 불가능함 
		//this.field1 = "값 1";
		//this.method1();
		
		
		
	}
	public void method() {
		A a = new A();
		//클래스 A를 상속받은 클래스 D에서 클래스 A의 객체를 생성하더라도 A의 객체 멤버가 protected로 되어 있으면 접근이 불가능함 
		//a.field1  = "값 1";
		//a.field2 = "값 2";
	}
	

}
