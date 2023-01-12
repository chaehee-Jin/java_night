package java_1230;

public class ImplEx {

	public static void main(String[] args) {
		//객체 생성 
		ImplC impl = new ImplC();
		//상속받은 모든 메소드를 다 사용 가능
		impl.methodA();
		impl.methodB();
		impl.methodC();
		
		System.out.println();
		
		//인터페이스타입의 변수 ia를 생성, 해당 변수에 자식객체를 저장
		//InterA 타입이 가지고 있는 멤버만 사용이 가능 
		InterA ia = impl;
		ia.methodA();
		//ia.methodB(); // 오류 발생 
		System.out.println();
		
		//InterB 타입이 가지고 있는 멤버만 사용이 가능 
		InterB ib = impl;
		ib.methodB();
		System.out.println();
		
		//InterC 타입이 가지고 있는 멤버만 사용이 가능 
		InterC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
