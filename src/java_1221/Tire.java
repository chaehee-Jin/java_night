package java_1221;

public class Tire {
	public int maxRotation;
	public int totalRotation;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location= location;
		this.maxRotation = maxRotation;
		
	}
	public boolean roll() {
		++totalRotation;
		
		if(totalRotation < maxRotation) {
			System.out.println(location+"Tire 수명:"+(maxRotation- totalRotation)+"회");
			return true;
		}
		else {
			System.out.println("***"+location+"Tire 펑크***");
			return false;
		}
		
	}

}
