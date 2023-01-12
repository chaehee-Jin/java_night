package java_1118;

public class LogicOpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int charCode = 'A';
  if ((charCode >= 97) && (charCode <= 122)) {
	  System.out.println("소문자 입니다.");
	  

	}
if (! (charCode < 48)  && !(charCode > 57)) {
System.out.println("0 ~ 9 숫자 입니다.");
}

int vlaue = 6;

if ((vlaue % 2 == 0) || (vlaue % 3 == 0)) {
	System.out.println("2 또는 3의 배수 입니다.");
}
	}
}