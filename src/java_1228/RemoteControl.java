package java_1228;

public interface RemoteControl {
	
	//인터페이스 선언
	//상수 선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드 선언 (자식 클래스에서 구현해야함) 
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드 선언
	// 디폴트 메소드: 상속시 자식클래스에서 구현하지 않아도 사용할 수 있는 메소드 
	// 인터페이스에서는 기본적으로 사용하는 메소드는 추상 메소드이기 때문에 인터페이스를 상속받는 자식클래스에서는 상속받은 추상메서드를 무조건 구현해야함 
	// 디폴트 메소드는 상속받은 자식 클래스에서 필요에 따라 오버라이딩을 함 
	
	
//사용이유: 인터페이스를 상속받아 구현한 클래스는 상속받은 추상 메소드를 모두 구현해야 하기때문에 부모인 인터페이스에 새로운 기능을 위해서 추상메서드를 해당 인터페이스를 상속받은 모든 자식 클래스에서 새로운 추상 메소드를 구현해야한다
	// 그런데 디폴트 메소드를 사용하게되면 새로 추가된 메소드를 자식 클래스에서 따라서 오버라이딩을 할지말지 결정하기 때문에 기존에 생성된 클래스내용을 수정하지 않아도 사용이가능하다
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음을 해제합니다");
		}
		
		
	}
	public static void  changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	

}
