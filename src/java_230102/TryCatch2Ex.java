package java_230102;

public class TryCatch2Ex {

	public static void main(String[] args) {

		String data1 = null;
		String data2 = null;

		try {
			data1 = args[0];
			data2 = args[1];
			System.out.println("data1:" + data1);
			System.out.println("data2:" + data2);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개변수의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java TryCatch2 num1 num2");
		}
		try {
			int value1 = Integer.parseInt(data1); //문자열 타입을 숫자로 변환 해주는 것을 parseInt라고 함 
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요");
		}
		System.out.println("프로그램 정상 실행 완료");
	}

}
