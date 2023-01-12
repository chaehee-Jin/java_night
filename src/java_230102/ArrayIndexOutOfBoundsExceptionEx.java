package java_230102;

public class ArrayIndexOutOfBoundsExceptionEx {

	public static void main(String[] args) {

		// args: 메인 메소드의 매개변수, 프로그램 실행시 추가되는 실행 옵션을 배열로 받음

		// 실행시 사용된 옵션에 따라서 오류가 발생
		// args로 추가된 옵션은 1개이나 실제로 사용된 index는 1까지 사용되어 오류가 발생

		// 옛날 방식 (if ~ else), 예외처리 프로세스가 없었을경우
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];

			System.out.println("args[0]:" + data1);
			System.out.println("args[1]: " + data2);
		} else {
			System.out.println("[실행방법]");
			System.out.println("java ArrayIndexOutOfBoundsExceptionEx");
			System.out.println("값1 값2");
		}

		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat);

	}

	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		} else {
			System.out.println("잘못된 변환입니다.");
		}
	}

}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
