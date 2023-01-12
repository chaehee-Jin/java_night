package java_1123;

public class StringEqualEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVal1 = "아이유";
		String strVal2 ="아이유";
		System.out.println("strVal1 :" + strVal1);
		System.out.println("strVal2 :" + strVal2);
		
		
		if (strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 참조가 같음");
			
		}
		else {
			System.out.println("strVal1과 strVal2는 참조가 다름");
		}
		if (strVal1.equals(strVal2)) {
			System.out.println("strVal과 strVal2는 문자열이 같음");
		}
		else {
			System.out.println("strVal1과 strVal2는 문자열이 다름");
		}
		String strVal3 = new String("아이유");
		String strVal4 = new String("아이유");
		System.out.println("strVal3 : " + strVal3);
		System.out.println("strVal4 :" + strVal4);
		
		if (strVal3 == strVal4) {
			System.out.println("strVal3과 strVal4는 참조가 같음");
			
		}
		else {
			System.out.println("strVal3과 strVal4는 참조가 다름");
		}
		if (strVal3.equals(strVal4)) {
			System.out.println("strVal3과 strVal4는 문자열이 같음");
		}
		else {
			System.out.println("strVal3과 strVal4는 문자열이 다름");
		}
	}

}
