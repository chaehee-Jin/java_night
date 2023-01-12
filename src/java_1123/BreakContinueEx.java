package java_1123;

public class BreakContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("-----------break/continue--------------");
		System.out.println("--------------------break---------------------");
		
		
		for (int i = 0; i < 10; i++ ) {
			if (i == 5) {
				break;
			}
			else {
			System.out.println("현재 i의 값: " + i );
	}
		}
		System.out.println("------------------continue-------------------");
		
		for(int i = 0; i< 10; i++) {
			if (i == 5) {
				continue;
		}
			else {
				System.out.println("현재 i의 값: " + i);
			}
			
		}
		System.out.println("------------while문으로 break/continue-------------- ");
		System.out.println("------------------------break-----------------------");
		
		int count = 0;
		while (count < 10) {
			count++;
			if (count ==5 ) {
				break;
			}
			else {
				System.out.println("현재 count의 값: " + count);
			}
			
		}
		System.out.println("----------------continue-----------------");
		count = 0;
		
		while(count < 10) {
			count++;
			if(count == 5) {
				continue;
			}
			else {
				System.out.println("현재의 count의 값: " + count );
			}
			//count++; // count 의 값이 3이되면 위의 if문과 continue문 때문에 무한반복 함 
		}
}
}
