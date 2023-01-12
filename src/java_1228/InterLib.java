package java_1228;

public interface InterLib {
	
	//추상메소드만 사용 
	void method1();
	void method2();
	
	//신규로 추가된 추상 메소드
	//자식 클래스에서 필수로 추가되어야 하면 추상메소드로 추가
	void method3();
	
	//신규로 추가된 추상 메소드
	//자식 클래스에서 사용은 가능하지만 필수가 아닐경우는 디폴트 메소드로 추가 
	default void method4() {
		
	}
}
