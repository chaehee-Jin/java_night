package java_1123;

public class ArrayCreate2Ex {

	public static void main(String[] args) {
		//문제 1) 이름이 numbers 이고, 크기가 10인 int 타입의 배열을  1개 선언하고 원하는 숫자를 10개 입력한 후  배열의 내용을 모두 출력하는 프로그램을 작성하세요
		// 배열을 선언과 동시에 데이터를 입력 
		
		int numbers [] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i =0; i<10; i++) {
		System.out.println(numbers[i]);
		
		
	}
		
		System.out.println("-----------------------");
		
		
	//문제 2) 이름이 numArr이고 크기가 5인 int타입의 배열을 1개 선언하고, 원하는 숫자를 입력 후 반복문을 사용하여 모든 내용을 출력하는 프로그램을 작성하세요
				// 배열을 선언과 동시에 크기를 지정, 데이터는 따로 입력 
				int []numArr =new int[5];
				
				numArr[0] = 40;
				numArr[1] = 50;
				numArr[2] = 60;
				numArr[3] = 70;
				numArr[4] = 80;
			
			    for (int i=0; i<5; i++) {
			    	System.out.println(numArr[i]);			    	
			    	}
			    
			    System.out.println("----------------------");
			    int [] numArr2 = new int [5];
			    System.out.println(numArr2[0]);
			    System.out.println(numArr2[1]);
			    
			    String[] strArr = new String[5];
			    System.out.println(strArr[0]);
			    
			    System.out.println("---------------------");
			    
			    // 배열의 길이: 배열 이름.length;
			   int size = numArr2. length;
			   System.out.println(size);
			   
			   System.out.println(numbers.length);
			   
			   System.out.println("------------------------");
			   
			   for (int i = 0; i < numbers.length; i++) {
				   System.out.println(numbers[i]);
			   }
	    }
	 
}

