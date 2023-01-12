package java_1219;

public class SportCar extends Car {
	
	
	@Override
	public void speedUp() {
		speed +=10;
		//mexSpeed는 final필드이기 때문에 수정이 불가능함 
		//maxSpeed = 300;
		
	}
	//부모 클래스인 Car의 멤버 메소드인 stop()이 final메소드 이므로 오버라이딩이 불가능함 
	//@Override
	//public void stop() {
		
	//}

}
