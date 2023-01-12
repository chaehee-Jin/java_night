package java_1118;

public class elseifEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// else if 문의 else는 생략이 가능하다.
		// else가 나오기 전의 조건문에서 모든 조건을 다 사용하였을 경우 
		// 특정 영역까지만 사용하고자 할 경우 
		
		// else if 문 사용시 주의사항
		// 조건문을 단계적으로 사용해야 함. 
  int score = 75;
  
  if  (score  >= 90 )  {
	  System.out.println("당신의 점수는 90보다 크고, 등급은 A입니다.");

  }
  else if (score >= 80 ) {
	  System.out.println("당신의 점수는 80보다 크고, 등급은 B입니다.");
  }
  else if (score >= 70) {
	  System.out.println("당신의 점수는 70보다 크고, 등급은 C입니다.");
	}
  else if (score >= 60) {
	  System.out.println("당신의 점수는 60보다 크고, 등급은 D입니다.");
	 
  }
  else {
	  System.out.println("당신의 점수는 60보다 작고, 등급은 F입니다.");
}
	}
}
