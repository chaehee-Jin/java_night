package java_1223;

	//인터페이스 선언 
public interface RemoteControl {
	//인터페이스 멤버
	//정적멤버(상수, 메소드)
	public static final int MAX_VOLUME = 10;
	public static final int MINI_VOLUME = 0;
	//추상메소드
	void turnOn(); //public abstract을 생략해도 자동으로 추가 
	public void turnOff();
	public abstract void setVolume(int Volume);
	
	//디폴트 메소드
	
	
	
	
	

}
