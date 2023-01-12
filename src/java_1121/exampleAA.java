package java_1121;

import java.util.Scanner;

public class exampleAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 1번 for문을 사용하여 1 ~ 100까지를 출력하는 프로그램을 작성하세요
		System.out.println("---------------문제1-----------");
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		//문제 2번 반복문을 사용하여 1 ~ 10까지의 총합을 구하는 프로그램을 작성하세요
		// 총합을 저장할 변수가 1개 추가로 필요함 (int total)
			System.out.println("--------------문제 2---------------");
			int total = 0;
			
			for (int i =  1; i <= 10; i++) {
				total = total + i;
				System.out.println("합계" + total);
			}
			
		
		// 문제 3번 키보드로 숫자를 하나 입력받아 입력받은 숫자의 구구단을 출력하는 프로그램을 작성하세요.
			System.out.println("------------------문제 3-----------------");
			
			Scanner sc = new Scanner (System.in);
			System.out.print("출력할 단수의 구구단을 입력하세요: ");
			int dan = sc. nextInt();
			
			for (int i = 1; i <10; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));
				
			}
	}

}
