package java_230102;

public class TryCatch4Ex {

	public static void main(String[] args) {
		try {   
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);

			result = value1 / value2;
			System.out.println(data1 + "/" + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개변수의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatch3 num1 num2");

		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
			//다중 catch문 사용시 Exception을 가장 먼저 사용하면 Exception이 최상위 예외 클래스이므로 모든 예외를 처리할 수 있기 때문에 아래에 입력한 다른 다른 예외를 처리할 수 없음 
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");

		} 
		finally {
			System.out.println("다시 실행하세요.");

		}
		System.out.println("프로그램 정상 실행 완료");
	}


	
	
}
