package kh.java.func;

import java.util.Scanner;

public class MethodTest {
	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를 입력하세요[+,-,*,/] : ");
		char oper =sc.next().charAt(0);
		switch(oper) {
		
		case'+': System.out.println(sum(num1,num2));
			break;
		case'-': System.out.println(sub(num1, num2));
			break;
		case '*':System.out.println(multi(num1,num2));
			break;
		case '/':System.out.println(div(num1,num2));
			break;
		}
	}
	public double div(int num1,int num2) {
		return num1/(double)num2;
	}
	
	public int multi(int num1,int num2) {
		return num1*num2;
	}

	public int sub(int su1, int su2) {
		return su1-su2;
		
	}
		

	// 아래 메소드 리턴값 받으려고 int 씀
	public int sum(int su1, int su2) {
		// int su1 =10;
		// int su2 =20;
		System.out.println("정수 2개 더하는 메소드 입니다.");
		int result = su1 + su2;// 100줄짜리 코드
		return result;
	}
	public int sum(int su1,int su2, int su3) {//메소드 오버로딩 :메소드이름이 같고 데이터 타입,개수,순서가 달라야함(리턴타입 영향 못미침)
		System.out.println("정수 3개 더하는 메소드입니다.");
		int result = su1+su2+su3;
		return result;
	}
//
}
