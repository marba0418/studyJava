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
		System.out.println("첫번째 수 입력 : ");
		num = sc.nextInt();
		System.out.println("두번째 수 입력 : ");
		num1 = sc.nextInt();
		System.out.println("========== 결과 ==========");
		System.out.println("두 수를 더한 수 : "+(num+num1));
		System.out.println("두 수를 뺀 수 : "+(num-num1));
		System.out.println("두 수를 곱한 수 : "+(num*num1));
		System.out.printf("두 수를 나눈 수 : %.2f", (double)num/num1);
			
			
	}
	public void test6() {
		int a = 40; 
		int b = 20;
		a += b;//a = 40+20;
		System.out.printf("a의 값 : %d , b의 값 : %d \n", a, b);
		a -= b;//a = 60-20;
		System.out.printf("a의 값  : %d , b의 값 : %d \n", a, b);
		b *= a;//b = 20*40;
		System.out.printf("a의 값 : %d , b의 값 : %d \n", a, b);
		b /= a;//b = 800 / 40
		System.out.printf("a의 값 : %d , b의 값 : %d \n", a, b);
		
	}
	public void test7() {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		boolean result1, result2;
		result1 = (a < 20 && b > 10) && ( c == 20 || d == 40);//true
		result2 = (a == 10 && b != 2* 10) || ( c == 30 && d != 40);//false
		System.out.printf("첫번째 결과값 : %b \n" , result1);
		System.out.printf("두번째 결과값 : % \n", result2);
		
	}
	public void test8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age =sc.nextInt();
		boolean bool = age >19;
		String result = bool?"성인":"애";
		//String result = "성인";
		
		System.out.println(result);
		System.out.println(age>19?"성인":"애");
		
	}
	
	
}
