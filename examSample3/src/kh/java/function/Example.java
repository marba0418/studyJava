package kh.java.function;

import java.util.Scanner;

public class Example {
	public void exam1() {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("첫번 째 정수 입력 : ");
			int inputNumber;
			inputNumber = sc.nextInt();
			System.out.print("두번 째 정수 입력 : ");
			int inputNumber1;
			inputNumber1 =sc.nextInt();
			System.out.println("============= 결과 =============");
			System.out.println("더하기 결과 : "+(inputNumber+inputNumber1));
			System.out.println("빼기 결과 : "+(inputNumber-inputNumber1));
			System.out.println("곱하기 결과 : "+(inputNumber*inputNumber1));
			System.out.println("나누기 몫 : "+(inputNumber/inputNumber1));
			System.out.println("나누기 나머지 : "+(inputNumber%inputNumber1));
		
	}
	public void exam2() {
		    
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 길이 입력 : ");
		double dNum;
		dNum = sc.nextDouble();
		System.out.println("세로 길이 입력 : ");
		double dNum1; 
		dNum1 = sc.nextDouble();
		System.out.println("========== 결과 ==========");
		System.out.printf("면적 : %.2f",(dNum*dNum1));
		System.out.printf("\n둘레 : %.1f",2*(dNum+dNum1));
		
	}
	public void exam3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("영어단어 입력 : ");
		String fruit = sc.next();
		char ch = fruit.charAt(0);
		System.out.println("첫번째 문자 : "+ch);
		char ch1 = fruit.charAt(1);
		System.out.println("두번째 문자 : "+ch1);
		char ch2 = fruit.charAt(2);
		System.out.println("세번째 문자 : "+ch2);
		
	}

}
