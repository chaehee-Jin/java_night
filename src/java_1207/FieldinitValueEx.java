package java_1207;

public class FieldinitValueEx {

	public static void main(String[] args) {
		FieldinitValue fiv=new FieldinitValue();
		FieldinitValue fiv2=new FieldinitValue();
		
		System.out.println("byteField:"+fiv.byteField);
		System.out.println("shortField:"+fiv.shortField);
		System.out.println("intField:"+fiv.intField);
		System.out.println("longField:"+fiv.longField);
		System.out.println("charField:"+fiv.charField);
		
		System.out.println("booleanField:"+fiv.booleanField);
		
		System.out.println("floatField:"+fiv.floatField);
		System.out.println("doubleField:"+fiv.doubleField);
		
		System.out.println("arrField:"+fiv.arrField);
		System.out.println("StringField:"+fiv.StringField);
		
		//필드 (객체의 멤버 변수)초기값이 존재하지만 일반 변수는 초기값이 없음 
		// 변수의 초기화: 변수를 사용하기 위해서 선언 후 해당 변수의 데이터를 처음으로 저장하는 행위
		
		byte byteValue=0;
		short shortValue=0;
		int intValue=0;
		long longValue=0L;
		char charValue='0';
		
		boolean booleanValue=false;
		
        float floatValue= 0.0F;
		double doubleValue=0.0;
		
		int[] arrValue=null;
		String StringValue="";
		// 일반적인 변수는 초기화를 하지 않으면 사용할 수 없음 
		System.out.println("byteField:"+fiv.byteField);
		System.out.println("shortField:"+fiv.shortField);
		System.out.println("intField:"+fiv.intField);
		System.out.println("longField:"+fiv.longField);
		System.out.println("charField:"+fiv.charField);
		
		System.out.println("booleanField:"+fiv.booleanField);
		
		System.out.println("floatField:"+fiv.floatField);
		System.out.println("doubleField:"+fiv.doubleField);
		
		System.out.println("arrField:"+fiv.arrField);
		System.out.println("StringField:"+fiv.StringField);

	}

}
