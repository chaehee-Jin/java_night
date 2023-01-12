package java_1221;

public class KumhoTire extends Tire {
	
	public KumhoTire(String location, int maxRotation) {
		super (location, maxRotation);
		
		
	}
	@Override
	public boolean roll() {
		++totalRotation;
		
		if (totalRotation < maxRotation) {
			System.out.println(location+"KumhoTire 수명:"+(maxRotation-totalRotation)+"회");
			return true;
		}
		else {
			System.out.println("***"+location+"KumhoTire 펑크***");
			return false;
		}
	}

}
