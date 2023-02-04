package java_230106;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {

		// Set 인터페이스 타입의 변수 set에 자식 클래스인 HashSet 타입의 객체를 생성 
		Set<String> set = new HashSet<String>();

		// 총 5개의 데이터를 저장 
		// Set 타입은 중복이 없는 자료구조 
		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet/ JSP");
		set.add("JAVA"); // 기존 데이터와 중복되므로 제거
		set.add("MYBATIS");

		int size = set.size(); // 총 5개 저장했지만 1개의 중복이 있어 4개만 저장 
		System.out.println("총 객체 수: " + size);

		// 반복자인 Iterator 데이터 타입으로 데이터 타입을 변환 
		Iterator<String> iter = set.iterator();

		// hashNext(): Iterator 데이터 타입의 변수에 저장된 데이터 중 밖으로 출력할 수 있는 데이터가 있는지 확인 
		//next(): Iterator 데이터 타입의 변수에서 실제로 데이터를 가져옴 
		while (iter.hasNext()) {
			String element = iter.next();
			System.out.println("\t:" + element);

		}
		//Set 타입의 변수에 저장된 데이터를 삭제
		set.remove("JDBC");
		set.remove("MYBATIS");

		System.out.println("총 객체 수 : " + size);

		for (String element : set) {
			System.out.println("\t" + element);
		}
		//모든 데이터 삭제 
		set.clear();

		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}

}
