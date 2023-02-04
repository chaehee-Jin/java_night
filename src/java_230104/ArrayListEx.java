package java_230104;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
// ArrayList 생성 
		//부모인 List 인터페이스 타입의 변수에 자식인 ArrayList 클래스 타입의 객체를 저장 
		List<String> list1 = new ArrayList<String>();
		// ArrayList 클래스 타입의 객체 생성 
		ArrayList<String> list2 = new ArrayList<>();

		// 데이터 추가하기
		list1.add("java");
		list1.add("JDBC");
		list1.add("Servlet/ JSP");
		list1.add(2, "Database"); // 기존 리스트의  2번 index에 데이터 추가 
		list1.add("MyBatis");

		// 리스트의 크기 확인 
		int size = list1.size(); // 리스트에 저장된 데이터의 수
		System.out.println("list1의 총 크기: " + size);
		System.out.println();

		// 지정한 index의 데이터 출력
		String skill = list1.get(2);
		System.out.println("2: " + skill); // Database 출력
		System.out.println();

		// list가 가지고 있는 모든 데이터 출력
		for (int i = 0; i < list1.size(); i++) {
			String str = list1.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();

		// 기존의 데이터 삭제 
		list1.remove(2); // Database 항목 삭제
		list1.remove(2);
		list1.remove("MyBatis");

		for (int i = 0; i < list1.size(); i++) {
			String str = list1.get(i);
			System.out.println(i+": "+ str);
		}
	}

}
