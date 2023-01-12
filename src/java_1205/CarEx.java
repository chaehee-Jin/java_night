package java_1205;

public class CarEx {

	public static void main(String[] args) {
		Car myCar=new Car();
		Car yourCar= new Car();
		yourCar.model="쏘랜토";
		yourCar.color="은색";
		yourCar.Speed= 100;
		
		System.out.println("제작회사:"+ myCar.company);
		System.out.println("모델:"+ myCar.model);
		System.out.println("색깔:"+myCar.color);
		System.out.println("최고속도:"+myCar.maxSpeed);
		System.out.println("현재속도:"+myCar.Speed);
		
		myCar.Speed = 50;
		System.out.println("현재속도:"+myCar.Speed);
		
		
		System.out.println("제작회사:"+ yourCar.company);
		System.out.println("모델:"+yourCar.model);
		System.out.println("색깔:"+yourCar.color);
		System.out.println("최고속도:"+yourCar.maxSpeed);
		System.out.println("현재속도:"+yourCar.Speed);

	}

}
