package java_1230;

public class VehicleEx {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//Vehicle 인터페이스 타입의 변수에 Bus클래스 객체를 저장하였기 때문에 부모인 Vehicle 인터페이스의 멤버만 사용할 수 있기 때문 
		//vehicle.checkFare();
		
		System.out.println();
		Bus bus = new Bus();
		bus.run();
		bus.checkFare();
		
		System.out.println("---강제형변환----");
		//부모인 Vehicle타입의 변수에 저장된 자식 클래스(Bus) 타입의 객체를 다시 자식 클래스타입의 변수에 저장 
		//강제 형변환을 할 데이터 타입을 지정, 해당 부모를 상속받은 클래스가 여러개있을 수 있기 때문에 어떠한 데이터 타입으로 형변환을 할 것인지 지정해야함 
		Bus bus2 = (Bus)vehicle;
		bus2.run();
		bus2.checkFare();
		
		System.out.println("----instanceof로 객체확인----");
		//instanceof 연산자: 지정한 데이터가 지목한 데이터타입의 변수인지 확인하는 연산자

		
		Driver driver = new Driver();
		Bus bus3 = new Bus();
		Taxi taxi3 = new Taxi();
		
		driver.drive(bus3);
		driver.drive(taxi3);
	}

}
