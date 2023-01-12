package java_1202;

public class ArrayObjEx {

	public static void main(String[] args) {
		// 기본타입으로 배열을 생성시 배열의 요소에 값(데이터 자체)가 저장 
		// 참조타입으로 배열을 생성시 배열의 요소에 주소가 저장 
		String[] strArr = new String[3];
		strArr[0]="Java";
		strArr[1]="Java";
		strArr[2]= new String("Java");
		
		// 0번 index와 1번 index에 저장된 주소가 같음 
		System.out.println(strArr[0]==strArr[1]);
		// 0번 index와 2번 index의 저장된 주소가 다름 
		System.out.println(strArr[0]==strArr[2]);
		// 0번 index와 2번 index에 저장된 주소가 가지고 있는 데이터 자체를 비교
		System.out.println(strArr[0].equals(strArr[2]));
	}

}
