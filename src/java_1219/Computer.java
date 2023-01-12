package java_1219;

public class Computer extends Calculator {
	
	//오버라이딩: 상속받은 클래스의 메소드의 소스코드를 수정하여 사용하는 것 
	//오버라이딩 시 상속받은 형태 그대로 사용해야 함 
	//오버라이딩 시 상속받은 형태 그대로 사용하지 않을 경우 오버라이딩이 아닌 다른 메소드로 인식할 수 있음(오버로딩된 메소드로 인식할 수 있음 )
	//오버라이딩 시 @Override 어노테이션을 사용하여 오버라이딩으로 사용할 메소드인지 아니면 새로 추가된 메소드인지 명확하게 하는 것이 필요함 
	//@Override
	double areaCircle (double r, double l) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*l;
	}

	

}
