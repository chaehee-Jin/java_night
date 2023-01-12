package java_1228;

public class RemoteControlEx {

	public static void main(String[] args) {
		TVRemoteControl tvrc = new TVRemoteControl();
		
		tvrc.turnOn();
		tvrc.setVolume(10);
		tvrc.setMute(true);
		tvrc.setMute(false);
		tvrc.setVolume(5);
		tvrc.setVolume(3);
		tvrc.turnOff();
		tvrc.turnOn();
		tvrc.setVolume(5);
		tvrc.setVolume(3);
		tvrc.turnOff();
		
		System.out.println();
		RadioRemoteControl rrc = new RadioRemoteControl();
		
		rrc.turnOn();
		rrc.setVolume(3);
		rrc.setMute(true);
		rrc.setMute(false);
		rrc.turnOff();
		
		System.out.println("-------익명 구현객체--------");
		
		//인터페이스 타입의 변수 선언 
		RemoteControl rc = null;
		//인터페이스를 구현한 클래스 타입의 객체 선언 
		TVRemoteControl tv = new TVRemoteControl();
		RadioRemoteControl radio = new RadioRemoteControl();
		
		//다형성을 사용하여 부모 타입의 변수에 자식 타입의 객체를 저장해서 사용 
		rc = tv;
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = radio;
		rc.turnOn();
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		
		 //익명구현객체를 사용하여 인터페이스로 객체를 생성함 
		//객체의 이름이 존재하지 않기 때문에 일회용으로만 사용됨 
		RemoteControl rc2 = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("전원을 켭니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다.");
				
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("볼륨을" + volume+ "로 설정합니다.");
				
			}
			
		};
		rc2.turnOn();
		rc2.setVolume(4);
		rc2.setMute(true);
		rc2.setMute(false);
		rc2.turnOff();
		
		
		
		System.out.println("--------다중상속------");
		
		SmartTV stv = new SmartTV();
		stv.turnOn();
		stv.setVolume(5);
		stv.setMute(true);
		stv.search("http://www.naver.com");
		stv.setMute(false);
		stv.turnOff();
		
		RemoteControl rc3 = stv;
		rc3.turnOn();
		rc3.setMute(false);
		rc3.turnOff();
		
		Searchable search = stv;
		search.search("http://www.daum.net");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
