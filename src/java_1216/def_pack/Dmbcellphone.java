package java_1216.def_pack;

public class Dmbcellphone extends Cellphone {
	
	public int channel;
	
	public Dmbcellphone(String model, String color, int channel) {
		this.model= model;
		this.color= color;
		this.channel= channel;
		
	}
	public void turnOnDmb() {
		System.out.println("채널:"+channel+"번 Dmb 방송을 수신합니다.");
	}
	public void turnOffDmb() {
		System.out.println("Dmb 방송을 종료합니다.");
	}
	public void changeChannelDmb(int channel) {
		this.channel= channel;
		System.out.println("채널:"+ channel+"번 방송으로 변경합니다.");
	}

}
