package java_1121;

public class While1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while문 사용시 주의 사항:
		// 1. 카운트 변수를 while문 외부에 생성(무한 반복 가능성이 존재)
		// 2. 카운트 변수의 값을 while문 내부에서 연산( 무한 반복 가능성이 존재)
		//3. while문을 중지 할 수 있는 로직을 반드시 마련해야 함 (무한 반복)
		//4. 카운트 연산의 위치에 따라 출력되는 결과가 달라짐
		//5. 2개 이상의 while문을 연달아 사용 시 카운트 변수의 이름이 동일하면 하나의 while문이 종료된 후
		// 카운트 변수의 값을 반드시 초기화해야 함 
		
		
		System.out.println("-----------------while문으로 1 ~ 10까지 출력----------------");
		
		int count = 1;
		
		while (count < 11) {
			System.out.println(count);
			count++;
			
			
	// do ~ while문 : 기본적으로 while문과 동일한 반복문,  무조건 1번은 실행하는 반복문 
			
			System.out.println("----------------do ~ while--------------");
			count = 10;
			do {
				System.out.println("현재 카운트 :" + count );
				count++;
			} while (count < 10);
			
			System.out.println("-----------------while------------------");
			count = 10;
			while (count < 10) {
				System.out.println("현재 카운트 :" + count );
				count++;
			}
		}
	}

}
