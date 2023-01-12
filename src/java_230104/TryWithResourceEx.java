package java_230104;

public class TryWithResourceEx {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("C:\\Users\\zltpf\\Desktop\\Java\\a.txt")) {
			fis.read();
			throw new Exception(); //강제로 예외 발생시키기
		} catch (Exception e) {
			System.out.println("예외처리 코드가 실행되었습니다.");
		}
		System.out.println("정상 실행 완료");
	}

}
