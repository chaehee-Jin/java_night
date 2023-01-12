package java_1216.def_pack;

public class Access1Ex {

	public static void main(String[] args) {
		
		Access1 acc1 = new Access1();
		acc1.ptrMember();
		//str1은 접근제한자가 public으로 설정되어있어 제한없이 사용이 가능함 
		System.out.println("str1:"+acc1.str1);
		System.out.println("str2:"+acc1.str2);
		
		//str2는 접근제한자가 default로 설정되어 있어 동일한 패키지 내에서는 직접 호출이 가능함 
		//str3는 접근제한자가 private로 설정되어 있어 해당 객체 외부에서 직접 호출 할 수 없음
		//System.out.println("str3:"acc1.str3);

	}

}
