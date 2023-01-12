package java_1214.java_1214;

public class Television {
	
	// 정적 멤버
	static String company = "LG"; // 기본값, 정적 멤버 선언과 동시에 초기화
	static String model= "OLED"; 
	static String info; // 정적 멤버 선언만 진행함 
	
	// 정적 멤버 초기화 블록 
	static {
		info= company +"-"+model;
	}
	

}
