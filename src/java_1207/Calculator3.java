package java_1207;

public class Calculator3 {
	
	//메서드 4가지 형태
	//1. 매개변수와 반환값이 모두 없는 형태
	//메소드 실행 시 필요한 데이터(변수)를 메소드 내부에서 선언하고, 사용하고, 삭제함 
	//메소드의 연산시 필요한 데이터가 늘 같으므로 연산 결과가 늘 동일함 
	//메소드의 연산 결과를 메소드 내부에서 출력함 
	
	//2. 매개변수는 존재하고, 반환값이 없는 형태
	//메소드 실행 시 필요한 데이터를 메소드 외부에서 사용하고, 삭제함
	//메소드 연산시 필요한 데이터가 늘 변경되므로 연산 결과가 달라짐
	//메소드의 연산 결과를 메소드 내부에서 출력함 
	
	//3. 매개변수는 없고, 반환값이 존재하는 형태
	//메소드 실행 시 필요한 데이터(변수)를 메소드 내부에서 선언하고, 사용하고, 삭제함
	//메소드 실행 시 필요한 데이터가 늘 같으므로 연산 결과가 늘 동일함 
	//메소드 연산 결과를 메소드 외부로 출력하여 외부에서 활용함 
	
	//4. 매개변수와 반환값이 모두 존재하는 형태 
	//메소드 실행 시 필요한 데이터를 메소드 외부에서 사용하고, 삭제함
	//메소드 실행 시 필요한 데이터가 늘 변경되므로 연산 결과가 달라짐
	//메소드의 연산 결과를 메소드 외부로 출력하여 외부에서 활용함
	
	void sum() {
		int x=100;
		int y=200;
		int reuslt=x+y;
		
		System.out.println("두 수의 덧셈은:"+reuslt);
	}
	void sub(int x, int y) {
		int result = x-y;
		
		System.out.println("두 수의 뺄셈은:"+result);
	}
	int multi() {
		int x=100;
		int y=200;
		int result = x*y;
		
		return result;
	}
	int div(int x, int y) {
		int result= x/y;
		
		return result;
	}

}