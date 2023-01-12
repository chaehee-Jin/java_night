package java_1209;

import java.util.Scanner;

public class calculatorEx {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		Calculator cal1 = new Calculator();
		
		cal1.sum();
		cal1.plus(10,20);
		cal1.plusDouble(10.0,20.5);
		
		System.out.println();
		Carculator2 cal2= new Carculator2();
		cal2.sum();
		cal2.sum(10,20);
		cal2.sum(5.5,10.3);
		cal2.sum(5,10.3);
		cal2.sum(5.5,10);

	}

}
