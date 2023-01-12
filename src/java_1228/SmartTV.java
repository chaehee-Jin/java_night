package java_1228;

public class SmartTV implements RemoteControl, Searchable {
	//멤버 변수 선언
	private int volume;

	//인터페이스 Searchable에서 상속받은 추상메소드
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
		
	}
	
	//인터페이스 RemoteControl에서 상속받은 추상메소드
	@Override
	public void turnOn() {
		System.out.println("스마트 TV 전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV 전원을 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
			
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
			
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 스마트 TV 볼륨: " + volume);
	}
	

}
