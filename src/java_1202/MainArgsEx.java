package java_1202;

public class MainArgsEx {

	public static void main(String[] args) {
		System.out.println("main method...");
		
		for (int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "] :" + args[i]);
		}

	}

}
