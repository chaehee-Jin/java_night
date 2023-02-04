package java_230106;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {

		Set<Member> set = new HashSet<Member>();

		// String 클래스 타입은 거의 기본 타입처럼 사용하기 때문에 = 연산자로 데이터를 저징했을 경우 두 변수의 데이터가 같으면 동일한 주소를
		// 지정함
		set.add(new Member("아이유", 30));
		set.add(new Member("아이유", 30));

		System.out.println("총 객체 수 :" + set.size());

		String str1 = "아이유";
		String str2 = "아이유";
		String str3 = new String("아이유");

		if (str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		if (str1 == str3) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		// 클래스를 인스턴스화(객체 생성) 하면 동일한 데이터를 입력하더라도 서로 메모리에 존재하기 때문에 서로 다른 것으로 인식함 
		Set<Board> set2 = new HashSet<Board>();
		set2.add(new Board("제목1", "내용1", "글쓴이1"));
		set2.add(new Board("제목1", "내용1", "글쓴이1"));
		System.out.println(set2.size());

	}

}
