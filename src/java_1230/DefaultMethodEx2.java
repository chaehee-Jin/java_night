package java_1230;

public class DefaultMethodEx2 {

	public static void main(String[] args) {
		//익명 객체를 사용하여 인터페이스를 1회용 객체로 생성함 
	
		//ChildInter1은 ParentInter를 상속받아 메소드 method1, method2를 상속받음 
		ChildInter1 ci1 = new ChildInter1() {

			//상속받은 메소드가 추상메소드이기 때문에 객체 생성시 구현해야함 
			@Override
			public void method1() {
				System.out.println("객체 ci1- method1()");
				
			}
			//method2()는 디폴트 메소드이기 때문에 따로 구현하지 않아도 됨 
			//ChildInter1의 자체 추상 메소드이기 때문에 구현해야함
			@Override
			public void method3() {
				System.out.println("객체 cil- method2()");
				
			}
			
		};
		ci1.method1();
		ci1.method2();
		ci1.method3();
		
		System.out.println("-------------");
		ChildInter2 ci2 = new ChildInter2() {
			// 조상으로부터 상속받은 메소드가 상속받아 method1, method2를 구현함 
			@Override
			public void method1() {
				System.out.println("객체2 - method1()");
				
			}
			//method2()는 디폴트 메소드이기 때문에 따로 구현하지 않아도 됨 
			//ChildInter2의 자체 추상 메소드이기 때문에 구현해야함 
			@Override
			public void method3() {
				System.out.println("객체2 - method2()");
				
			}
			
		};
		System.out.println("------------------");
		ci2.method1();
		ci2.method2();
		ci2.method2();
		
	

	}

	ChildInter3 ci3 = new ChildInter3() {
// 조상으로부터 상속받은 메소드가 상속받아 method1과 method2를 구현함 
		@Override
		public void method1() {
			System.out.println("객체3 - method1()");
			
		}
//조상으로 부터 상속받은 디폴트 메서드를 오버라이딩 하여 childinter3의 자체 추상메소드로 재선언하였기 때문에 구현하여 사용해야함 
		@Override
		public void method2() {
			System.out.println("객체3- method2()");
			
		}
		//method2()는 디폴트 메소드이기 때문에 따로 구현하지 않아도 됨 
		//ChildInter3의 자체 추상 메소드이기 때문에 구현해야함
		@Override
		public void method3() {
			System.out.println("객체3 - method3()");
			
		}
		
		
	
	};
	//ci3.method1();
	//ci3.method2();
	//ci3.method3();
	
}

