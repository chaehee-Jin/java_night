package java_230104;

public class BoxEx {

	public static void main(String[] args) {
		
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();
		
		System.out.println(str);

		Box<Integer> box2 = new Box<>();
		box2.set(100);
		int ivalue = box2.get();
		
		System.out.println(ivalue);
	}

}
