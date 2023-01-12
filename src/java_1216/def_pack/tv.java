package java_1216.def_pack;

public class tv {
	public boolean state;
	public int channel;
	public int volumn;
	
	public tv() {
		this(2,0);
		
	}
	public tv(int channel, int volumn) {
		this.state= false;
		this.channel= channel;
		this.volumn= volumn;
		
	}
	public void powerOn() {
		System.out.println("전원을 켭니다.");
		this.state= true;
	}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
		 this.state= false;
	}
	public void channelUp() {
		System.out.println(channel+"번 채널은"+(++channel)+"번으로 올라갑니다.");
	}
	public void channelDown() {
		System.out.println(channel+"번 채널은"+(--channel)+"번으로 내려갑니다.");
	}
	public void changeChanneltv() {
		System.out.println(this.channel+"번 방송으로 변경합니다.");
	}
	public void volumnUp() {
		System.out.println("볼륨을 늘입니다.");
		volumn++;
	}
	public void volumnDown() {
		System.out.println("볼륨을 줄입니다.");
		volumn--;
	}

}
