package java_1221;

public class HankookTire extends Tire {
	
	public HankookTire(String location, int maxRotation) {
		
		//부모 클래스의 생성자 호출 
		super(location, maxRotation);
		
	}
	
	@Override
	public boolean roll() {
		++totalRotation;
		
		
		if (totalRotation < maxRotation) {
			System.out.println(location+"HankookTire 수명:"+(maxRotation-totalRotation)+"회");
			return true;
		}
		else {
			System.out.println("***"+location+"HankookTire 펑크***");
			return false;
		}
	}
	
	

}
