package java_1230;

public class Car2 {
	
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			
	};
	public void run() {
		for(int i=0; i<tires.length; i++) {
			tires[i].roll();
		}
	}

}
