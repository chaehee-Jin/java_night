package java_1223;

public class SmartPhoneEx {

	public static void main(String[] args) {
		//Phone 클래스는 추상 클래스
		//Phone 클래스 타입의 변수 선언 
		Phone phone;
		
		//Phone 클래스는 추상클래스이기 때문에 new 키워드를 사용할 수 없음
		//객체 생성이 안됨 
		//phone = new Phone("홍길동");
		
		//추상클래스 Phone을 상속받은 SmartPhone 클래스의 객체 생성 
		SmartPhone sp = new SmartPhone("홍길동");
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();

	}

}
