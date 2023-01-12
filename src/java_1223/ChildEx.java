package java_1223;

public class ChildEx {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.field1 = "부모 클래스의 field1";
		parent.method1();
		parent.method2();
		
		System.out.println("-----------------");
		Child child = new Child();
		child.field1 = "부모에게서 상속받은 field1";
		child.field2 = "자식 클래스 고유의 field2";
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		
		//부모 클래스인 Parent 클래스 타입의 변수 parent에 자식 클래스인 Child의 객체 child를 대입
		parent = child;
		parent.field1 = "부모 클래스의 field1";
		parent.method1();
		parent.method2();
		
		//접근할 수 없음 , 자식클래스 타입의 객체를 부모 클래스 타입의 변수에 대입하면 부모 클래스의 멤버에만 접근이 가능함 
		//parent.field2 = "";
		//parent.method3();	
		
		System.out.println();
		Child child2 = (Child)parent;
		child.field1 = "부모 클래스에게 상속받은 필드";
		child.field2 = "자식 클래스 고유의 필드";
		child.method1();
		child.method2();
		child.method3();
		
	}

}
