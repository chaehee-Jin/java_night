package java_1209;

public class CarEx {

	public static void main(String[] args) {
		Car car1 =new Car();
		
		// 객체를 사용하기 전에 해당 객체의 필드를 모두 초기화해야 제대로된 데이터를 사용할 수 있음
		car1.name= "그랜저";
		car1.type= "세단";
		car1.size= "준대형";
		car1.color="검정";
		System.out.println("이름:"+car1.name);
		System.out.println("차종:"+car1.type);
		System.out.println("크기:"+car1.size);
		System.out.println("색상:"+car1.color);
		
		//일반 변수는 선언만 하고 초기화를 하지 않으면 시용할 수 없음 
		// String name;
		// System.out.println(name);
		
		Car car2= new Car();
		
		System.out.println("이름:"+car2.name);
		System.out.println("차종:"+car2.type);
		System.out.println("크기:"+car2.size);
		System.out.println("색상:"+car2.color);
		
		Car car3= new Car();
		car3.name = "소나타";
		car3.size="중형";
		System.out.println("이름:"+car3.name);
		System.out.println("차종:"+car3.type);
		System.out.println("크기:"+car3.size);
		System.out.println("색상:"+car3.color);
		
		System.out.println();
		
		// Car2 클래스에 매개변수가 없는 기본 생성자가 존재하지 않고, 매개변수를 사용하는 생성자가 존재하기 때문에 컴파일러가 기본생성자를 자동 생성하지 않음 
		// 아래에서는 new 키워드가 Car2클래스의 기본 생성자를 호출하여 오류가 발생함
		Car2 c1= new Car2();
		c1.ptrCarInfo();
		
		Car2 c2= new Car2("소나타");
		 c2.ptrCarInfo();
		
		Car2 c3= new Car2("펠리세이드","Suv");
		c3.ptrCarInfo();
		
		System.out.println();
		
		Car3 ca1 = new Car3();
		ca1.ptrCarInfo();
		
		Car3 ca2 =new Car3("소나타");
		ca2.ptrCarInfo();
		
		Car3 ca3 = new Car3("그랜저", "세단","검정");
		ca3.ptrCarInfo();
	}

}
