package java_1123;

public class ArrayCreate1Ex {

	public static void main(String[] args) {
		//1.  배열 선언과 동시에 데이터 입력 
		int scores1[] = {90, 80, 70, 60, 50}; // 배열의 크기는 5, index는 0 ~ 4
	
		//2. 배열 변수만 먼저 선언 후 나중에 데이터 입력 
		int[] scores2; // 배열의 크기가 현재는 없음 
		int [] scores22 = null; // 배열의 크기가 현재는 없음 
		
		scores2 = new int[] {10, 20, 30, 40, 50}; // 배열의 크기가 결정 
		scores22 = new int[] {60, 70, 80, 90, 100};
		//3. 배열 변수및 크기를 먼저 선언 후 나중에 데이터 입력 
		int [] scores3 = new int[5]; // 배열 선언과 동시에 크기를 설정 , 크기 5, index 0 ~4
		
		scores3[0] = 10;
		scores3[1] = 20;
		scores3[2] = 30;
		scores3[3] = 40;
		scores3[4] = 50;
		
		// 배열 사용 방법:
		// 배열명[index] = 데이터; // 지정한 index에 데이터 저장 
		// 배열명 [index]; // 지정된 index에 저장된 데이터 출력 
		
		// 배열 사용시 주의사항 
		// 1. 배열 선언시 지정한 크기를 넘어서는 index에는 접근할 수 없음 
		// 2. 배열의 index는 0번부터 시작
		// 3. 배열 사용시 []를 사용함 
		// 4. 한번 선언된 배열은 크기를 변경할 수 없음 
		
		System.out.println(scores3[0]);
		System.out.println(scores3[1]);
		System.out.println(scores3[2]);
		System.out.println(scores3[3]);
		System.out.println(scores3[4]);

		System.out.println(scores3[0] + scores3[4]);
		System.out.println(scores3[1 ]- scores3[3]);
		
		for ( int i=0; i < 5;  i++) {
			System.out.println(scores3[i]);
		}
		for (int i =0; i <5; i++) {
			System.out.println(scores1[i]);
			
		}
	}

}
