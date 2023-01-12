package java_1205;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		// Arrays 클래스를 사용한 배열 복사
		
		int[] arr1= {10,20,30};
		int[] arr2= new int[3];
		
		System.out.println("-----원본 배열의 내용-----");
		for (int i=0; i<arr1.length; i++) {
			System.out.println("arr1["+i+"]:"+arr1[i]);
		}
		for (int i=0; i<arr2.length; i++) {
			System.out.println("arr2["+i+"]:"+arr2[i]);
		}
		arr2=arr1;
		System.out.println("----arr2에 arr1을 복사(단순 대입)----");
	
	arr2[0]=100;
	arr2[1]=200;
	arr2[2]=300;
	
	System.out.println("----arr2의 요소를 모두 변경-----");
	
	for (int i=0; i<arr1.length; i++) {
		System.out.println("arr1["+i+"]:"+arr1[i]);
	}
	for (int i=0; i<arr2.length; i++) {
		System.out.println("arr2["+i+"]:"+arr2[i]);
	}
	arr1=new int[] {10,20,30};
	arr2=new int [3];
	
	System.out.println("-----원본 배열의 내용-----");
	for (int i=0; i<arr1.length; i++) {
		System.out.println("arr1["+i+"]:"+arr1[i]);
	}
	for (int i=0; i<arr2.length; i++) {
		System.out.println("arr2["+i+"]:"+arr2[i]);
	}
	arr2=Arrays.copyOf(arr1,arr1.length);
	
	
	// Arrays.copyOf(원본 배열, 복사할 크기): 매개 변수로 사용한 배열을 지정한 크기만큼 복사하여 반환
	
	System.out.println("---Arrays.copyOf()를 사용하여 배열 복사---- ");
	for (int i=0; i<arr1.length; i++) {
		System.out.println("arr1["+i+"]:"+arr1[i]);
	}
	for (int i=0; i<arr2.length; i++) {
		System.out.println("arr2["+i+"]:"+arr2[i]);
	}
	arr2[0]=100;
	arr2[1]=200;
	arr2[2]=300;
	
	System.out.println("----arr2의 요소 값 변경----");
	for (int i=0; i<arr1.length; i++) {
		System.out.println("arr1["+i+"]:"+arr1[i]);
	}
	for (int i=0; i<arr2.length; i++) {
		System.out.println("arr2["+i+"]:"+arr2[i]);
	}
}
}