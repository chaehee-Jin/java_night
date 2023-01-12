package java_1216.def_pack;

public class DmbCellphoneEX {

	public static void main(String[] args) {
		Dmbcellphone dcp= new Dmbcellphone("자바폰", "검정", 10);
		//cellphone 클래스에서 상속받은 필드사용 
		System.out.println("모델:"+ dcp.model);
		
		System.out.println("색상:"+dcp.color);
		//Dmbcellphone 클래스 자체적으로 존재하는 필드 사용 
		System.out.println("채널:"+ dcp.channel);
		
		//cellphone 클래스에서 상속받은 메소드 실행 
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("여보세요.");
		dcp.receiveVoice("안녕하세요!!저는 홍길동입니다.");
		dcp.sendVoice("아...네...반갑습니다.");
		dcp.hangUp();
		
		
		// DmbCellphone 클래스가 자체적으로 가지고 있는 메소드 실행 
		dcp.turnOnDmb();
		dcp.changeChannelDmb(11);
		dcp.turnOffDmb();
		
		// 문제1) smart tv를 만들기 위해 app실행 메소드와 internet 메소드를 생성하고,tv의 기본기능을 구현하기 위해 tv클래스를 생성하여 전체기능을가지고 있는 smart tv를 만들어 출력하세요
		// tv 클래스: 필드 -channel, volumn, state, 메서드- power on/off, channel up/down, volumn up/down 
		// 스마트 티비 클래스: 필드 url, userld, 메소드- internet on/off, url change, game start/ end/ play
		}
		

	}


