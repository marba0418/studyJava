package kh.java.function;

import java.util.Scanner;

public class Example {
	public void exam1() {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("ù�� ° ���� �Է� : ");
			int inputNumber;
			inputNumber = sc.nextInt();
			System.out.print("�ι� ° ���� �Է� : ");
			int inputNumber1;
			inputNumber1 =sc.nextInt();
			System.out.println("============= ��� =============");
			System.out.println("���ϱ� ��� : "+(inputNumber+inputNumber1));
			System.out.println("���� ��� : "+(inputNumber-inputNumber1));
			System.out.println("���ϱ� ��� : "+(inputNumber*inputNumber1));
			System.out.println("������ �� : "+(inputNumber/inputNumber1));
			System.out.println("������ ������ : "+(inputNumber%inputNumber1));
		
	}
	public void exam2() {
		    
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �Է� : ");
		double dNum;
		dNum = sc.nextDouble();
		System.out.println("���� ���� �Է� : ");
		double dNum1; 
		dNum1 = sc.nextDouble();
		System.out.println("========== ��� ==========");
		System.out.printf("���� : %.2f",(dNum*dNum1));
		System.out.printf("\n�ѷ� : %.1f",2*(dNum+dNum1));
		
	}
	public void exam3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����ܾ� �Է� : ");
		String fruit = sc.next();
		char ch = fruit.charAt(0);
		System.out.println("ù��° ���� : "+ch);
		char ch1 = fruit.charAt(1);
		System.out.println("�ι�° ���� : "+ch1);
		char ch2 = fruit.charAt(2);
		System.out.println("����° ���� : "+ch2);
		
	}

}
