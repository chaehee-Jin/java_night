package java_230106;

public class Member {

	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
// 최상위 클래스인 Object의 멤버인 equals(), hashCode() 함수로 오버라이딩하여 동일한 값이 들어왔으면 메모리의 위치와 상관이 같다고 처리하고 있음
	// equals() 함수는 Object 클래스의 멤버 메소드로 객체가 서로 같은지 확인하는 메소드
	// 해당 함수를 오버라이딩하여 멤버 변수의 데이터만 서로 같으면 같은 객체인 것으로 하는 로직으로 변경함
	
	@Override
	public boolean equals(Object obj) {
		// 매개변수로 받은 Object 타입의 변수 obj가 Member 클래스 타입으로 만들어진 것인지 확인 
		if (obj instanceof Member) {
			// 매개변수로 받은 객체를 Member 클래스 타입의 변수로 강제 형변환 
			Member member = (Member) obj;
			// 매개변수로 받아 형변환한 객체의 멤버와 현재 객체의 멤버를 비교하여 값만 같은 경우 같다고 처리 
			return member.name.equals(name) && (member.age == age);

		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

}
