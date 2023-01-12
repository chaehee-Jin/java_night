package java_1221;

public class PromotionEx {

	public static void main(String[] args) {
		B b=  new B();
		C c=  new C();
		D d = new D();
		E e = new E();
		
		//부모 클래스(A) 타입의 변수 a1에 B 클래스 타입 객체 b를 대입함 
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d;
		C c1 = e;
		
		
	}

}
