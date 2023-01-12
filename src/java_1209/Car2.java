package java_1209;

public class Car2 {

	public String name;
	public String type;
	
	public Car2(){
		name="아반떼";
		type="세단";
		
	}
	public Car2(String name) {
		this.name= name;
		type="세단";
		
	}
	
	
	public Car2(String name, String type) {
		this.name= name;
		this.type= type;
		
	}
	
	public void ptrCarInfo() {
		System.out.println("차명:"+name);
		System.out.println("차종:"+type);
	}
}
