package kh.java.func;

import java.util.Scanner;

public class MethodTest {
	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.print("�����ڸ� �Է��ϼ���[+,-,*,/] : ");
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
		

	// �Ʒ� �޼ҵ� ���ϰ� �������� int ��
	public int sum(int su1, int su2) {
		// int su1 =10;
		// int su2 =20;
		System.out.println("���� 2�� ���ϴ� �޼ҵ� �Դϴ�.");
		int result = su1 + su2;// 100��¥�� �ڵ�
		return result;
	}
	public int sum(int su1,int su2, int su3) {//�޼ҵ� �����ε� :�޼ҵ��̸��� ���� ������ Ÿ��,����,������ �޶����(����Ÿ�� ���� ����ħ)
		System.out.println("���� 3�� ���ϴ� �޼ҵ��Դϴ�.");
		int result = su1+su2+su3;
		return result;
	}
//
}
