package java_1216.def_pack;

public class smartTv extends tv {
	
	public String url;
	public String userId;
	
	public smartTv() {
		url= "http://www.naver.com";
		userId= "사용자 아이디";
		
	}
	public void internetOn() {
		System.out.println("인터넷을 켭니다.");
	}
	public void internetOff() {
		System.out.println("인터넷을 끕니다.");
	}
	public void urlChange(String url) {
		System.out.println(url+"주소를 변경합니다.");
	}
	public void gameStart() {
		System.out.println("게임을 시작합니다.");
	}
	public void gameEnd() {
		System.out.println("게임을 종료합니다.");
	}
	public void gamePlay() {
		System.out.println(userId+"게임을 플레이합니다.");
	}
	public void channelChange(int i) {
		System.out.println(this.channel+"번 방송으로 변경합니다.");
		
	}

}
