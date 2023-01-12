package java_1230;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		
		myCar.run();
		System.out.println();
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
		
		System.out.println();
		Car2 myCar2 =new Car2();
		myCar2.run();
		
		System.out.println();
		myCar2.tires[0] = new KumhoTire();
		myCar2.tires[1] = new KumhoTire();
		myCar2.run();

	}

}
