package java_1230;

//인터페이스 Tire을 구현한 HankookTire 클래스 
public class HankookTire implements Tire {

	//상속받은 추상 메소드 roll() 오버라이딩 
	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");

	}

}
