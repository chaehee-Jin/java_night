package java_1230;

//인터페이스 선언
//부모 인터페이스 InterA, InterB를 상속받고 있음 
public interface InterC extends InterA, InterB {
	//부모인 InterA에서 추상메소드 methodA()를 상속
	//부모인 InterB에서 추상메소드 methodB()를 상속 
	//추상메소드를 상속 받았지만 InterC자체가 인터페이스이기 때문에 상속받은 추상메소드를 구현할 수 없음 
	//인터페이스인 InterC를 구현하는 클래스에서 상속받은 모든 추상 메소드를 다 구현해야 함 
	
	//추상메소드 methodC()선언 
	public void methodC();

}
