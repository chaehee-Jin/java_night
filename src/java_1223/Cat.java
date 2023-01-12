package java_1223;

//추상 클래스를 상속받은 자식 클래스는 반드시 추상 메소드를 구현해야 함 
//추상 클래스를 상속받은 후 추상 메소드를 구현하지 않으면 상속받은 자식 클래스도 추상 클래스가 됨 
public class Cat extends Animal{
	
	public Cat() {
		this.kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	

}
