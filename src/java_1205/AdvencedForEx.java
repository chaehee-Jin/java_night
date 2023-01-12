package java_1205;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AdvencedForEx {

	public static void main(String[] args) {
		int[] scores= {97,29,60,80,90};
		
		System.out.println("----기존의 for문을 사용하여 출력----");
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores["+i+"]:"+scores[i]);
		}
		
		System.out.println("----향상된 for문으로 출력-----");
		
		
		for(int score:scores) {
			System.out.println("score:"+score);
		}
		// 컬렉션 데이터 타입 중 하나인 HashMap을 사용
		
		Map<String, String>map=new HashMap<>();
		map.put("이름","아이유");
		map.put("직업", "가수");
		map.put("성별", "여성");
		map.put("주소", "서울");
		
		System.out.println(map.get("이름"));
		System.out.println(map.get("직업"));
		// HashMap 타입은 index가 없기 때문에 향상된 for문을 사용하여 데이터를 출력
		
		for(Entry<String, String>entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		

	}

}
	
