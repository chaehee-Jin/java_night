package java_1230;

//인터페이스를 InterC를 상속받아 구현한 ImplC 클래스
public class ImplC implements InterC {

	//조상 인터페이스에서 상속받은 추상 메소드를 구현
	@Override
	public void methodA() {
		System.out.println("ImplC의 methodA");
		
	}

	@Override
	public void methodB() {
		System.out.println("ImplC의 methodB");
		
	}
	//부모인 InterC 인터페이스가 상속해준 추상메소드를 구현 
	@Override
	public void methodC() {
		System.out.println("ImplC의 methodC");
		
		
	}

}
