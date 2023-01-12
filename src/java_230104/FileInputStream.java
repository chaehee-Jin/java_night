package java_230104;

public class FileInputStream implements AutoCloseable{

	// 파일명을 저장할 멤버 변수 
	private String file;
	
	//생성자 
	public FileInputStream(String file) {
		this.file = file;
		
	}
	//Autocloseable 인터페이스를 상속받아 구현한 파일을 닫을 때 실행하는 메소드
	@Override
	public void close() throws Exception {
		System.out.println(file + "을 닫습니다.");
		
	}
	// 지정한 파일을 읽을 때 출력될 내용 
	public void read() {
		System.out.println(file + "을 읽습니다.");
	}
}	 
