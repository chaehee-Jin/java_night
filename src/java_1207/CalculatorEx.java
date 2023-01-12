package java_1207;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator myCal=new Calculator();
		
		myCal.powerOn();
		
		int result1=myCal.plus(100, 200);
		System.out.println("result:"+result1);
		
		int x=10;
		int y=3;
		double result2 = myCal.divide(x, y);
		System.out.println("result:"+result2);
		
		myCal.powerOff();
		
		System.out.println("-------------");
		
		System.out.println("전원을 켭니다.");
		
		int result11 = 10+20;
		System.out.println("result:"+result11);
		
		int x1=10;
		int y1=3;
		
		double result22= (double)x1/y1;
		System.out.println("result:"+result22);
		
		System.out.println("전원을 끕니다.");
		
		
		System.out.println("------------");
	//	myCal.returnTest1();
	myCal.returnTest2(true);
	//myCal.returnTest2(false);
				
	}

}
