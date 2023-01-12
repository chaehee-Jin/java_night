package java_1223;

public class AnimalEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("------------");
		
		//Animal 클래스는 추상 클래스이기 때문에 객체생성은 불가능 
		//Animal 클래스 타입의 변수선언은 문제가 없음 
		Animal animal = null;
		
		
		
		animal = new Dog();
		animal.sound();
		
		animal= new Cat();
		animal.sound();
		
		System.out.println("--------------");
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(cat);
		animalSound(dog);
		
	}
	public static void animalSound(Animal animal) {
		animal.sound();
		
	}
	
	
	
	

}
