package kh.java.practice;
import java.util.Scanner;
public class Sample {
	public void sample1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String ch = sc.next();
		System.out.println("A의 유니코드 값 : 65");
	}	
	public void sample2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		double point = sc.nextDouble();
		System.out.print("수학 점수 입력 : ");
		double point1 = sc.nextDouble();
		System.out.print("영어 점수 입력 : ");
		double point2 = sc.nextDouble();
		System.out.println("========== 결과 ==========");
		System.out.printf("총점 : "+(point+point1+point2));
		System.out.printf("평균 : "+(int)(point+point1+point2)/3);
		
		
	
		
		
	}

}
