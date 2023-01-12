package java_1202;

public class ArraycopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1= 10;
		int num2= 0;
		
		// 기본데이터 타입은 값을 저장하고 있고 대입 연산시 값을 복사하여 전달함 
		System.out.println("num1:"+num1+",num2:"+num2);
		num2 =num1;
		System.out.println("num1:"+num1+",num2:"+num2);
		num1=100;
		System.out.println("num1:"+num1+",num2:"+num2);
		
		// 배열은 참조타입임 
		
		int[]arr1= {10,20,30};
		int[]arr2= new int [3];
		
		for (int i=0; i<arr1.length; i++) {
			System.out.println("arr1["+i+"]:"+arr1[i]);
			
		}
		for (int i=0; i<arr2.length; i++) {
			System.out.println("arr2["+i+"]:"+arr2[i]);
			
	}
		//배열 arr2에 배열 arr1을 대입 
		// 배열의 데이터를 복사한 것이 아니라 주소를 복사함 
		//arr2와 arr1이 동일한 주소를 참조하고 있음 
		arr2=arr1;
		
		for (int i=0; i<arr1.length; i++) {
			System.out.println("arr1["+i+"]:"+arr1[i]);
			
		}
		for (int i=0; i<arr2.length; i++) {
			System.out.println("arr2["+i+"]:"+arr2[i]);
	}
		//배열 arr1의 요소의 값을 모두 변경 
		// arr1의 요소 값을 변경하면 arr2도 같은 주소를 보고 있기 때문에 동일하게 수정된 데이터를 출력함 
		arr1[0]=100;
		arr1[1]=200;
		arr1[2]=300;
		
		for (int i=0; i<arr1.length; i++) {
			System.out.println("arr1["+i+"]:"+arr1[i]);
			
		}
		//배열 arr2의 요소도 모두 변경 
		for (int i=0; i<arr2.length; i++) {
			System.out.println("arr2["+i+"]:"+arr2[i]);
	}
		// 실제 복사 방법
		//1. 배열의 모든 요소를 하나씩 대입하여 복사 (반복문 사용)
		
		System.out.println("----for문을 사용한 복사----");
		int[]arr3= {10,20,30};
		int[]arr4=new int[3];
		
		System.out.println("----원본 배열----");
		for (int i=0; i<arr3.length; i++) {
			System.out.println("arr3["+i+"]:"+arr3[i]);
			
		}
	
		for (int i=0; i<arr4.length; i++) {
			System.out.println("arr4["+i+"]:"+arr4[i]);
		}
		System.out.println("----배열 복사----");
		
		// arr4[0]=arr3[0];
		// arr4[1]=arr3[1];
		// arr4[2]=arr3[2];
		
		for (int i=0; i<arr3.length; i++) {
			//arr3의 각각 요소값을 가져와서 arr4에 각각 입력 
			arr4[i]=arr3[i];
			
		}
			for (int i=0; i<arr3.length; i++) {
				System.out.println("arr3["+i+"]:"+arr3[i]);
				
			}
		
			for (int i=0; i<arr4.length; i++) {
				System.out.println("arr4["+i+"]:"+arr4[i]);
		}
			arr3[0]=100;
			arr3[1]=200;
			arr3[2]=300;
			System.out.println("배열 arr3의 요소값 변경후");
			for (int i=0; i<arr3.length; i++) {
				System.out.println("arr3["+i+"]:"+arr3[i]);
				
			}
		
			for (int i=0; i<arr4.length; i++) {
				System.out.println("arr4["+i+"]:"+arr4[i]);		
	
				
}
			//2. System.arrayCopy()사용
			System.out.println("arrayCopy()사용");
			
			arr3= new int[] {10,20,30};
			arr4= new int [3];
			
			for (int i=0; i<arr3.length; i++) {
				System.out.println("arr3["+i+"]:"+arr3[i]);
				
			}
		
			for (int i=0; i<arr4.length; i++) {
				System.out.println("arr4["+i+"]:"+arr4[i]);	
			}
		     System.out.println("arrayCopy() 사용 후");
			
			System.arraycopy(arr3, 0, arr4, 0, arr3.length);
			
			for (int i=0; i<arr3.length; i++) {
				System.out.println("arr3["+i+"]:"+arr3[i]);
				
			}
		
			for (int i=0; i<arr4.length; i++) {
				System.out.println("arr4["+i+"]:"+arr4[i]);	
				
			}
				
				arr3[0]=100;
				arr3[1]=200;
				arr3[2]=300;
				System.out.println("배열 arr3의 요소값 변경후");
				for (int i=0; i<arr3.length; i++) {
					System.out.println("arr3["+i+"]:"+arr3[i]);
					
				}
			
				for (int i=0; i<arr4.length; i++) {
					System.out.println("arr4["+i+"]:"+arr4[i]);		
				
			//3.Array클래스 이용
}
}
}


