package java_1209;

public class Car {
	
	// 클래스의 필드는 초기값을 지정하지 않아도 기본값이 설정되어 있음 
	public String name;
	public String type;
	public String size;
	public String color;
	
	// 생성자
	//필드의 기본값을 설정하여 사용할 수 있는 형태로 만듬 
	// 매개변수가 없는 생성자를 기본생성자라고 함 
	// 클래스내에 생성자가 하나도 없을 경우 컴파일러가 내용이 비어있는 기본 생성자를 자동으로 생성함
	// 생성자가 1개이상 존재할 경우 컴파일러가 기본생성자를 생성하지 않음 
	public Car() {
		//name="아반떼";
		//type="세단";
	    //size= "준중형";
	    //color= "화이트";
		setupCarSuv();
	}
	public void setupCarSuv() {
		name= "쏘렌토";
		type="Suv";
		size="중형";
		color="회색";
		
	}
	
	

}
