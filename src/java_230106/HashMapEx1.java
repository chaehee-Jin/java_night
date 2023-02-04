package java_230106;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		//HashMap 타입의 객체 생성
		//Key는 String 타입, Value는 Integer 타입으로 데이터를 저장 선언 
	
		
		Map<String, Integer> map = new HashMap<>();
		
		//데이터 추가
		map.put("아이유", 90);
		map.put("유재석", 80);
		map.put("원빈", 70);
		map.put("제니",85);
		
		System.out.println("총 크기: " + map.size());
		
		System.out.println("\t아이유:" + map.get("아이유"));
		System.out.println();
		
		// map에 저장된 key 값만 모아서 Set 타입의 변수에 저장 
		Set<String> keySet = map.keySet();
		//set 타입의 변수를 반복이 가능한 Iterator 타입으로 변환 
		Iterator<String > iter = keySet.iterator();
		
		// Iterator 타입의 데이터를 모두 출력 
		while(iter.hasNext()) {
			String key = iter.next(); // 데이터 출력, 키값이 출력됨
			Integer value = map.get(key);// get()메소드값과 키값을 가지고 데이터 출력 
			System.out.println("\t" + key + " : " + value);
			
		}
		System.out.println();
		
		//지정한 키로 Map 타입의 변수에 저장된 데이터 삭제 
		map.remove("유재석");
		System.out.println("총 크기: " + map.size());
		
		// Map 타입의 변수가 가지고 있는 모든 데이터 삭제 
		map.clear();
		System.out.println("총 크기: " + map.size());
		

	}

}
