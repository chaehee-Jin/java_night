package java_1214.java_1214;

public class Singleton {
	// 해당 클래스의 객체를 클래스 내부에서 생성 
	// 생성된 객체에 private 접근 제한자를 사용하여 외부에서 사용할 수 없도록 막음 
	// static 키워드를 사용하여 클래스의 멤버로 등록, 데이터를 공유
	private static Singleton singleton = new Singleton();
	
	public int value1 = 100;
	
	// 생성자에 접근제한자를 private을 사용하여 외부에서 접근할 수 없도록 막음 
	// 생성자를 호출할 수 없기 때문에 객체를 생성할 수 없음 
	private Singleton() {
		
	}
	// 정적멤버로 메소드를 생성 
	// 반환타입을 해당 클래스 타입으로 설정하여 내부에서 생성된 객체를 외부로 전달할 수 있음 
	// 정적멤버이므로 정적멤버인 singleton 객체를 새로 생성하지 않고 기존에 생성된 singleton 객체를 외부로 전달함 
	static Singleton getInstance() {
		return singleton;
		
	}
	
}
