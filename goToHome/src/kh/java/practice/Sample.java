package kh.java.practice;
import java.util.Scanner;
public class Sample {
	public void sample1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String ch = sc.next();
		System.out.println("A�� �����ڵ� �� : 65");
	}	
	public void sample2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		double point = sc.nextDouble();
		System.out.print("���� ���� �Է� : ");
		double point1 = sc.nextDouble();
		System.out.print("���� ���� �Է� : ");
		double point2 = sc.nextDouble();
		System.out.println("========== ��� ==========");
		System.out.printf("���� : "+(point+point1+point2));
		System.out.printf("��� : "+(int)(point+point1+point2)/3);
		
		
	
		
		
	}

}
