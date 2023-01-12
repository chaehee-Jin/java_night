package java_1228;

public class ImplB implements InterLib{

	@Override
	public void method1() {
		System.out.println("ImplB에서 구현한 method1()");
		
	}

	@Override
	public void method2() {
		System.out.println("ImplB에서 구현한 method2()");
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	//부모인 인터페이스가 제공한 method4()를 사용하지만 기본기능 그대로 사용해도 상관없을 경우 그냥 상속받은 대로 사용 
		
	

}
