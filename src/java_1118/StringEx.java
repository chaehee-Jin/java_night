package java_1118;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // 문자열:  자바 언어에서 레퍼런스 타입으로 구성되어 있는 여러개의 문자를 출력하기 위해 존재하는 데이터 타입
		//  문자열은 워낙 많이 사용하기 때문에 레퍼런스 타입이지만 기본타입처럼 사용
		// 자바 언어에서 "" 사이에 존재하는 데이터는 모두 문자열이다.
		// 문자열 연결 연산자( + ):  2개 이상의 문자열을 하나의 문자열로 연결하는 연산자
		// 문자열과 다른 데이터 타입을 +로 연산 할 경우 둘다 문자열로 변환됨.
		
		
		// 문자열 사용 방법:
		// String 변수명;   // 문자열 변수를 선언만 함, 사용전 초기화 필수
		// String 변수명 = "문자열 데이터"; // 선언과 동시에 데이터 저장 
		// String 변수명 = new String ("문자열 데이터"); // 클래스 객체타입으로 사용 
		
		// 문자열 변수명; // 사용
		// 문자열 변수명 = "문자열 데이터";   // 문자열 변수에 데이터 저장 
		
		String str1;
		String str2 = "자바 강의 3일째 날";
		String str3 = new String ("불금이라 사람이 적네요..");
		
		str1 = "문자열 변수 초기화";
		System.out.println(str1);  // str1은 초기화되지 않았기 때문에 에러 발생 
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println();
		System.out.println(str2 + str3);
		System.out.println(2022 + "GStar 개막");
		
		System.out.println("G-Star" +( 2000 + 22));
}
}