package java_1216.def_pack;

public class smartTvEx {

	public static void main(String[] args) {
		smartTv stv = new smartTv();
		
		stv.powerOn();
		stv.volumnUp();
		stv.volumnUp();
		stv.channelUp();
		stv.channelChange(20);
		stv.channelDown();
		
		stv.internetOn();
		stv.urlChange("http://www.daum.net");
		stv.internetOff();
		
		stv.gameStart();
		stv.gamePlay();
		stv.gameEnd();
		
		stv.powerOff();
		

	}

}
