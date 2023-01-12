package java_1116;

public class opEx {

	public static void main(String[] args) {
		// main 메서드 : 프로그램의 시작 점, 프로그램의 끝 
		// TODO Auto-generated method stub
		
		// 연산자
 int a = 100;
 int b = 30;
 
 int c = a + b;
 System.out.println(c);
 
 c = a - b;
 System.out.println(c);
 
 
 c = a * b;
 System.out.println(c);
 
 c = a / b;
 System.out.println(c);
 
 c = a % b;
 System.out.println(c);

 // 문자열 연사자 
 String str1 = "안녕하세요";
 String str2 = "자바 저녁 강의 입니다.";
 System.out.println(str2);
 System.out.println(str1);
 
 String str3 = str2 + str1;
 System.out.println(str3);
 
 System.out.println("이제 곧 9시 50분입니다." + "종료 시간이네요. ");
 
 
 //  숫자이지만 실제 데이터 타입은 문자열 타입인 데이터 
 str1 = "100";
 str2 = "200";
 
 // 문자열은 연산이 불가능함, 연결만 가능함 
 str3 = str1 + str2;
 System.out.println(str3);
 
 // 문자열과 숫자 연산시 문자 열을 연산 할 수 없으니, 둘다 문자열로 변경하여 문자열을 연결함 
 System.out.println("100" + 200 );
 
	}

}
