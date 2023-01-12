package java_230102;

public class TryCatch5Ex {

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
			// 다중 catch: 하나의 try문 안에 여러개의 catch문을 사용하는 것
			// 멀티 catch: 지정한 예외끼리 동일한 예외처리를 하도록 하는 것
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("잘못된 사용방법 입니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("오류가 발생하였습니다.");

		} finally {
			System.out.println("다시 실행하세요.");

		}
		System.out.println("프로그램 정상 실행 완료");
	}

}
