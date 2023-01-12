package java_1209;

public class Carculator2 {
	// 두 정수의 덧셈 결과를 출력하는 메소드
	public void sum() {
		int x=10;
		int y=20;
		int result = x+y;
		System.out.println("두 수의 덧셈은:"+ result);
	}
	// 두 정수를 매개변수로 받아 덧셈 결과를 출력하는 메서드
	public void sum(int x, int y) {
		int result = x+y;
		System.out.println("두 수의 덧셈은:"+result);
		
	}
	
	// 두 실수를 매개변수로 받아 덧셈 결과를 출력하는 메소드
	public void sum(double x, double y) {
		double result = x+y;
		System.out.println("두 수의 덧셈은:"+result);
		
	}
	public void sum(int x, double y) {
		double result = x+y;
		System.out.println("두 수의 덧셈은:"+result);
		
	}
	public void sum(double x, int y) {
		double result = x+y;
		System.out.println("두 수의 덧셈은:"+result);
	}
	
	// 문제1) 뺄셈을 위한 sub 메소드를 생성하여 사용 할 수 있도록 하세요
	// 조건) 정수 2개를 매개변수로 사용하는 메서드 1개, 실수 2개를 매개변수로 사용하는 메서드 1개, 정수와 실수를 각각 1개씩 사용하는 메서드 1개 추가하기
	
	
	public void sub(int x, int y) {
		int result = x-y;
		System.out.println("두 수의 뺄셈은:"+result);
	}
	public void sub(double x, double y) {
		double result = x-y;
		System.out.println("두 수의 뺄셈은:"+result);
	}
	public void sub(int x, double y) {
		double result = x-y;
		System.out.println("두 수의 뺄셈은:"+result);
	}

}
