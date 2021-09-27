package co.micol.prj;

import co.micol.prj.member.Member;

public class MainApp {

	public static void main(String[] args) {
//		Calculator calculator = new Calculator(); //생성, Instance 만들자
//		calculator.setFirstNum(200);
//		calculator.setSecondNum(20);
//		int sum = calculator.sum();
//		int sub = calculator.sub();
		
//		Calculator calcuator = new Calculator (20, 20);//생성자에 의한 전달 방법
//		int sum = calcuator.sum();
//		int sub = calcuator.sub();
		
//		System.out.println("덧셈의 결과 = "+sum);
//		System.out.println("뺄셈의 결과 = "+sub);
		
//		MyCalculator mycalculator = new MyCalculator();
//		mycalculator.sum(10,10);	// void
//		float f = mycalculator.sum(5.0f, 5); //float
//		System.out.println(f);
//		
//		int n = mycalculator.sum(5); // int
//		System.out.println(n);
//		
//		double d = mycalculator.sum(10.2, 10.2);
//		System.out.println(d);
//		
//		double d2 = (double) mycalculator.sum(10.1, 100);

		//compareMax
//		compareMax comparemax = new compareMax(100, 50);
//		int max = comparemax.getMax();
//		System.out.println("두수중에 큰값은 = "+max);
//		
//		Calculator calculator = new Calculator();
//		calculator.setFirstNum(200);
//		calculator.setSecondNum(500);
//		System.out.println("전달된 두 수의 합= " +calculator.sum());
		
		//Member
		Member member = new Member("hong", "1234", "홍길동", "대구광역시");
		member.run();
		
		/*
		 * 
		 *  for Test 두 두정수를 입력받아서 ex) n, m
		 * 두 정수까지의 합을 구하는 class를 만들어보세요
		 * 동작시켜보자
		 */
		
		
	}

}
