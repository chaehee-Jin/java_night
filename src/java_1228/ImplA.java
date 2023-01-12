package java_1228;

public class ImplA implements InterLib {

	@Override
	public void method1() {
		System.out.println("ImplA에서 상속 후 구현한 mehtod1()");
		
	}

	@Override
	public void method2() {
		System.out.println("ImplA에서 상속 후 구현한 method2()");
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	// 부모인 인터페이스가 제공하는 디폴트 메소드가 필요했기 때문에 오버라이딩하여 사용 
	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}

}
