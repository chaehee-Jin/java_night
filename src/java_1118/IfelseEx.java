package java_1118;

public class IfelseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int score = 85;

if (score >= 90) {
	System.out.println("점수가 90보다 큽니다.");
	System.out.println("등급은 A입니다.");
}
else {
	System.out.println("점수가 90보다 작습니다.");
	System.out.println("등급은 B입니다.");
}
System.out.println("------------------------------------");

String menu ="자장면";
System.out.println("중화요리 전문점에 갔습니다.");
System.out.println("메뉴를 확인합니다.");

// 비교연산자로 비교가 가능한 데이터는 기본 데이터 타입만 가능 
// 문자열은 레퍼런스 타입이기 때문에 비교연산자로 연산 불가능
// 문자열의 비교는 전용 메서드를 사용하여 진행해야 함.
if (menu.equals("짬뽕")) {
	System.out.println("짬뽕을 주문합니다.");
}
else {
System.out.println("자장면을 주문합니다.");
}
System.out.println("음식을 맛있게 먹습니다.");
	}
}

