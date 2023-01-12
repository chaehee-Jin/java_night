package java_1214.java_1214;

public class PersonEx {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println("국적:"+ p1.nation);
		System.out.println("주민번호:"+p1.ssn);
		System.out.println("이름:"+p1.name);
		
		//p1.nation = "USA";
		//p1.ssn= "192837- 5647382";
		p1.name= "임꺽정";
		
		System.out.println("이름:"+p1.name);

	}

}
