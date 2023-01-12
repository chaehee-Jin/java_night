package java_1207;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 켭니다.");
		
	}
	int plus(int x,int y) {
		int result= x+y;
		return result;
	}
	
	double divide(int x,int y) {
		double result =(double) x/ (double) y;
		return result;
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void returnTest1() {
		System.out.println("returnTest1 메소드 실행");
		System.out.println("두번째 줄 실행");
		System.out.println("return 키워드 실행");
		
		return;
	}
	
	void returnTest2(boolean flag) {
		
		if (flag==true) {
			System.out.println("flag 값이 true");
			System.out.println("return을 만남");
			return;
		}
		System.out.println("flag 겂이 false");
		System.out.println("return을 만나지 않음");
	}
}
