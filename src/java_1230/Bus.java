package java_1230;

//부모 인터페이스인 Vehicle을 상속받아 구현한 Bus 클래스
public class Bus implements Vehicle {

	// 상속받은 추상메서드 run()을 구현
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
		
		
	}
	//버스 클래스 전용 메소드
	public void checkFare() {
		System.out.println("승차요금을 확인합니다.");
	}

}
