package java_1223;

class InstanceOfEx {
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		//method2(parentB);
		method1(parentB);
		
		
	}
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("메소드1 - child로 변환 성공 ");	
		}
		else {
			System.out.println("메소드1 - child로 변환되지 않음");
		}
	}
	public  static void method2(Parent parent) {
		Child child = (Child)parent;
		System.out.println("메소드2 - child로 변환 성공");
	}
}
