package java_1216.def_pack;

public class Access1 {
	
	public String str1 = "public 접근제한자 사용";
	String str2= "defautl 접근제한자 사용 ";
	private String str3 = "private 접근제한자 사용";
	
	public void ptrMember() {
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		System.out.println("str3:"+str3);
	}

}
