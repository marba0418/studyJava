package kh.java.test;

import java.util.Scanner;

public class CalcMgr {
	
	Scanner sc = new Scanner(System.in);
	public void main() {
		System.out.print("ù���� �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι��� �� �Է� : ");
		int num2 = sc.nextInt();
		Calc c = new Calc();
		int sum = c.sum(num1,num2);
		System.out.println();
	
	}
	

}
