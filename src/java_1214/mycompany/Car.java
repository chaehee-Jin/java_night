package java_1214.mycompany;

import java_1214.hankook.SnowTire;
import java_1214.hankook.Tire;
import java_1214.hyndai.Engine;
import java_1214.kumho.BigWidthTire;

//동일한 이름의 클래스를 import할 경우 클래스의 이름이 중복되어 어떠한 클래스를 사용하는지 알 수 없어 오류가 발생함 
// 동일한 클래스 명을 가지고 있을 경우 하나만 import하고, 나머지는 전체 패키지 이름을 다 입력함
//import kumho.Tire;// 이름이 중복됨 


public class Car {
	
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	Tire tire3 =new Tire();
	java_1214.kumho.Tire tire4 = new java_1214.kumho.Tire();
	

}
