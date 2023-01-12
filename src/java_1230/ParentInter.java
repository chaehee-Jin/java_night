package java_1230;

//부모 인터페이스로 사용
public interface ParentInter {
	
	//추상 메소드선언
	public void method1();
	//디폴트 메소드로 선언 
	public default void method2() {
		System.out.println("ParentInter- method2()");
	}

}
