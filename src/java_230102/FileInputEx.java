package java_230102;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;

public class FileInputEx {

	public static void main(String[] args) {
		// 파일의 내용을 가져오기 위한 FileInputStream 클래스 타입의 변수 선언 
		
		FileInputStream input = null;
		
		//외부 리소스 사용을 위해서 예외처리 구문을 사용 
		try {
			// File 클래스 타입의 객체를 생성하여 실제 사용하고자 하는 파일의 위치를 지정함 
			File file = new File("C:\\Users\\zltpf\\Desktop\\Java\\a.txt");
			// 파일 내용을 가져오기 위한 객체 생성 
			input = new FileInputStream(file);// 데이터 가져오기 
			
			int i=0;
			// While문과 read() 함수를 통해서 파일의 내용을 처음부터 끝까지 가져온다 
			while((i=input.read()) != -1){
				System.out.write(i);;
			}
		}
		catch(IOException e){
			System.out.println(e);
			
		}
		finally {
			try {
				input.close();
				
			}
			catch(IOException io) {}
				
			}
		}

	}


