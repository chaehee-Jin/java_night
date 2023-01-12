package java_1118;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// 문제 1) 국어, 영어, 수학 점수의  평균을 구하고, 평균 점수를 기반으로 등급을 구하는 프로그램을 작성하세요.
		// 조건: A+ 95 이상, A 90이상, B+ 85 이상, B 80이상, C 70이상, D 60 이상, F 60미만
		// 국어, 영어, 수학 점수는 임의의 숫자로 사용
		
		// 사용자 키보드 입력을 받는 명령어
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		// nextInt() : 키보드의 입력을 정수로 받음 
		int kor = sc. nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int eng = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int math = sc.nextInt();
        
   System.out.println(kor + eng + math);
        int total = kor + eng + math;
        int  avg = total / 3;
        System.out.println("당신의 평균은 :" + avg);
        
        if ( avg >= 95) {
        	System.out.println("당신의 평균은 95점이고, 등급은 A+입니다.");
        }
        else if (avg >= 90) {
        	System.out.println("당신의 평균은 90점이고, 등급은 A입니다.");
        }
        else if( avg >= 85) {
        	System.out.println("당신의 평균은 85점이고, 등급은 B입니다.");
        }
        else if(avg >= 80) {
        	System.out.println("당신의 평균은 80점이고, 등급은 C입니다.");
        }
        else if(avg >= 70) {
        	System.out.println("당신의 평균은 70점이고, 등급은 D입니다.");
        }
        else if( avg >= 60) {
        	System.out.println("당신의 평균은 60점이고, 등급은 E입니다.");
        }
        else {
        	System.out.println("당신의 평균은 60점 미만이고, 등급은 F입니다.");
        }
      
        }
	}
