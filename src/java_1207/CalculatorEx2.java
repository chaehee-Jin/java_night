package java_1207;

public class CalculatorEx2 {

	public static void main(String[] args) {
		Calculator2 cal1 = new Calculator2();
		
		cal1.plus();
		cal1.sub(10, 20);
		
	
		System.out.println("--------------");
		Calculator3 cal2=new Calculator3();
		
		cal2.sum();
		cal2.sub(10, 20);
		int result= cal2.multi();
		System.out.println("두 수의 곱셈은:"+result);
		result= cal2.multi();
		System.out.println("곱셈 결과에 +1000:"+(result+1000));
		
		result= cal2.div(10, 3);
		System.out.println("두 수의 나눗셈은:"+result);
		result= cal2.div(100,6);
		System.out.println("나눗셈 결과 * 10: "+result*10);
		
		//문제1) 클래스 Calculator4번을 생성하고, 사칙연산을 하기 위한 메서드 4개를 각각 생성 후 사칙연산을 진행하세요
		//메서드 명: sum, sub, multi, div
		// 메서드 형태: div 1번형태, sum 2번형태, sub 3번형태, multi 4번형태
		//변수: int x, int y, int result;
		

	}

}
