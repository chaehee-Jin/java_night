package java_1230;

//인터페이스 ParentInter 를 상속받은 인터페이스
public interface ChildInter1 extends ParentInter {
	//부모 인터페이스에서 상속받은 추상 메소드 및 디폴트 메소드가 존재함 
	//디폴트 메소드를 부모가 상속해준 그대로 사용 
	
	//전용 추상메소드 선언 
	public void method3();

}
