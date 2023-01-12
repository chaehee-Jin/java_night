package java_1230;

//부모인 Vehicle 인터페이스를 상속받아 구현한 Taxi 클래스
public class Taxi implements Vehicle{

	//상속받아 구현한 run()메소드
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	
		//Taxi 클래스는 전용메소드가 없음 
	}

}
