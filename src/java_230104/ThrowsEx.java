package java_230104;

public class ThrowsEx {

	public static void main(String[] args) {
		//throws : 메소드의 매개변수 뒤에 throws Exception 을 사용하면 예외가 발생하는 메소드에서 try ~ catch 를 통해서 예외처리를 하는 것이 아니라 해당 메소드를 실행하는 곳에서 try ~ catch 를 사용하여 예외처리를 대신 함 
		// throws를 사용시 각각의 메소드에서 예외처리를 하던 것을 한곳에서 예외처리를 할 수 있기 때문에 각각의 메소드의 소스코드가 간단해짐 
		
		System.out.println("-----ㅡmain 메소드------");
		try {
			method1(10, 0);
		}
		catch(Exception e) {
			System.out.println("main 메소드 실행 시 오류가 발생했습니다.");
		}

		System.out.println("-----main 메소드 정상 실행 완료------");

	}

	public static void method1(int a, int b) throws Exception {
		System.out.println("-----method1-----");

		try {
			int result = 0;
			result = a / b;
			System.out.println("method1의 result 값: " + result);

		} catch (Exception e) {
			System.out.println("method1에서 연산 시 오류가 발생했습니다.");

		}

		System.out.println("----method1 실행 완료-----");

	}

}
