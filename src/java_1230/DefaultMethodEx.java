package java_1230;

public class DefaultMethodEx {

	public static void main(String[] args) {
		
		MyInter m1 = new MyClassA();
		m1.method1();
		m1.method2();
		
		System.out.println();
		MyInter m2 = new MyClassB();
		m2.method1();
		m2.method2();

	}

}
