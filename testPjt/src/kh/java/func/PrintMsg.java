package kh.java.func;
import java.util.Scanner;
public class PrintMsg {
	public void printHello() {
		System.out.println("Hello");
	}
	public void printHi() {
		System.out.println("Hi");
	}
	public void test() {
		System.out.println(1+1.1);
		System.out.println(1+'1');
		System.out.println(1.1+'1');
		System.out.println("HI"+1);
	}
	public void test1() {
		int a = 10;
		int b = 10;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(++b);
		System.out.println(b);	
	
		
	}
	public void test2() {
		int a = 10;
		int b = (--a)+2;
		System.out.println(a);
		System.out.println(b);
	}
	
	public void test3() {
		int a = 10;
		int b = 10;
		int c;
		c = (a++)+(++b)+a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public void test4() {
		char ch = 'A';
		System.out.println(ch);
		System.out.println((char)(ch^32));
	}
	public void test5() {
		
		Scanner sc = new Scanner(System. in);
		int num = 10;
		int num1 = 5;
		System.out.println("ù��° �� �Է� : ");
		num = sc.nextInt();
		System.out.println("�ι�° �� �Է� : ");
		num1 = sc.nextInt();
		System.out.println("========== ��� ==========");
		System.out.println("�� ���� ���� �� : "+(num+num1));
		System.out.println("�� ���� �� �� : "+(num-num1));
		System.out.println("�� ���� ���� �� : "+(num*num1));
		System.out.printf("�� ���� ���� �� : %.2f", (double)num/num1);
			
			
	}
	public void test6() {
		int a = 40; 
		int b = 20;
		a += b;//a = 40+20;
		System.out.printf("a�� �� : %d , b�� �� : %d \n", a, b);
		a -= b;//a = 60-20;
		System.out.printf("a�� ��  : %d , b�� �� : %d \n", a, b);
		b *= a;//b = 20*40;
		System.out.printf("a�� �� : %d , b�� �� : %d \n", a, b);
		b /= a;//b = 800 / 40
		System.out.printf("a�� �� : %d , b�� �� : %d \n", a, b);
		
	}
	public void test7() {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		boolean result1, result2;
		result1 = (a < 20 && b > 10) && ( c == 20 || d == 40);//true
		result2 = (a == 10 && b != 2* 10) || ( c == 30 && d != 40);//false
		System.out.printf("ù��° ����� : %b \n" , result1);
		System.out.printf("�ι�° ����� : % \n", result2);
		
	}
	public void test8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age =sc.nextInt();
		boolean bool = age >19;
		String result = bool?"����":"��";
		//String result = "����";
		
		System.out.println(result);
		System.out.println(age>19?"����":"��");
		
	}
	
	
}
