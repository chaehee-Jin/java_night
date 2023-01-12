package java_1228;

public class RadioRemoteControl implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("Radio 전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Radio 전원을 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("Radio 볼륨을" + volume +"로 설정합니다.");
		
	}
	//setMute()메소드는 디폴트 메소드이므로 인터페이스에 상속받은 그대로 사용할수 있지만 필요에 따라서 오버라이딩하여 원하는데로 변경하여 사용할수 있음  
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			setVolume(0);
		}
		else {
			setVolume(5);
		}
		
	}

}
