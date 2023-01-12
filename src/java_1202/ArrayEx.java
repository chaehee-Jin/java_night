package java_1202;

public class ArrayEx {

	public static void main(String[] args) {
		// 배열 만들기
		
		// 배열을 선언과 동시에 데이터 저장 
		int[] intArray1  = {10, 20, 30, 40,50};
		// 배열을 크기와 함께 먼저 선언하고 나중에 데이터 저장 
		int [] intArray2 = new int [5];
		
		intArray2 [0] = 10;
		intArray2 [1] = 20;
		intArray2 [2] = 30;
		intArray2 [3] = 40;
		intArray2 [4] = 50;
		
		//배열만 먼저 선언하고 나중에 해당 배열에 데이터를 일괄 적용하는 것은 안됨
		// int[] intArray3;
		// intArray3 = { 10, 20, 30, 40, 50}; // 에러발생
		
		// 배열만 먼저 선언하고 나중에 new 키워드를 사용하여 배열의 크기를 지정하는 방식은 상관 없음  
		int [] intArray4;
		intArray4 = new int [5];
		
System.out.println("intArray 1의 크기: " + intArray1. length);

for (int i=0; i < intArray1.length; i++) {
	System.out.println("intArray["+ i +"]:"+ intArray1[i]);
}
	}

}
