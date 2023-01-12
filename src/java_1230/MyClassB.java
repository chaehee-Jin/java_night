package java_1230;

//인터페이스 MyInter를 상속받아 구현한 클래스
public class MyClassB implements MyInter {

	//상속받은 method1()구현 
	@Override
	public void method1() {
	System.out.println("MyClassB - method1() 실행");
		
	}
	//추가된 기능이 필요하여 오버라이딩을 진행 
	@Override
	public void method2() {
		System.out.println("MyclassB-method2()을 실행");
	}

}
