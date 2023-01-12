package java_1230;

public interface ChildInter3 extends ParentInter {
	
	// 부모 인터페이스에서 상속받은 추상메소드와 디폴트 메소드가 존재
	
	//상속받은 디폴트 메소드를 추상메소드로 재선언함
	@Override
	public void method2();
	
	//전용 추상메소드 선언
	public void method3();

}
