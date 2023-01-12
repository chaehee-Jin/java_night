package java_1216.def_pack;

public class CarEx {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println("내 차의 현재속도:"+myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("내 차의 현재속도:"+myCar.getSpeed());
		
		if(myCar.isStop()== false) {
			myCar.setStop(true);
		}
		System.out.println("내 차의 현재속도:" + myCar.getSpeed());	
		}

	}


