package java_1230;

//인터페이스 MyInter를 상속받아 구현한 클래스
public class MyClassA implements MyInter {

	//상속받은 method1() 구현
	@Override
	public void method1() {
		System.out.println("MyClassA -method1() 실행");
		
	}
	//추가된 기능이 필요없는 MyclassA이기 때문에 따로 구현하지 않음 

}
