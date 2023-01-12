package java_1216.package2;

import java_1216.package1.A;

public class D {
	
	public static void main(String[] args) {
		
		C c = new C();
		System.out.println(c.classCvalA);
		System.out.println(c.classCvalB);
		
		
		A a = new A();
		System.out.println(a.classAvalA);
		// A 클래스의 멤버 변수의 classAvalB의 접근제한자 default 이므로 다른 패키지에서 클래스 A를 호출하여 사용시 해당 변수에 접근할 수 없음
		// System.out.println(a.classAvalB);
		
	}

}
