package kr.or.iei.func;
import java.util.Scanner;
public class Example {
	public void exam1() {
		int num1;
		num1 = 20;
		char ch1 = '1';
		long num2 = 10000L;
		float fNum = 3.14f;
		final double PI = 3.14;
		System.out.println("������� : " + (num1 + num1));
		num1 = 200;
		ch1 = '2';
		System.out.println("������� : " + (num1 + num1));
		System.out.println("������� :" + (ch1 + ch1));
		System.out.println(num2);
		System.out.println(fNum);

	}

	public void exam2() {
			String name = "Ȳ����";
			int age;
			age = 32;
			String address = "��⵵ ���� ���籸 ȭ����";
			char gender = '��';
			System.out.print("�̸� : "+name);
			System.out.print("����: "+age);
			System.out.print("�ּ�: "+address);
			System.out.print("����: "+gender);
						
			
		}
	
	public void exam3() {
		int num = 2147483647;
		long result = (long)num + 1;
		System.out.println(result);
	}
	public void exam4() {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		System.out.println(num1 +"+"+ num2+"="+(num1+num2)+"�Դϴ�.");
		System.out.printf("%d+%d=\t%d�Դϴ�.\n\n",num1,num2,num3);
		double d =1.123454688431;
		System.out.println(d);
		System.out.printf("%.2f",d);
	
	//	System.out.println("������ ���� num�ȿ� ����ִ� ���� "+num+"�Դϴ�.");
	
	//	System.out.printf("������ ���� num�ȿ� ����ִ� ���� %d�Դϴ�.",num);
	}
	public void exam5() {
		int num = 100;
		long num1 = 999900000000L;
		float fNum = 486.520f;
		double d = 5697.890123;
		char ch = 'A';
		String str = "Hello JAVA";
		boolean bool = true;
		
		System.out.println(num);
		System.out.println();
		System.out.println(fNum);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(bool);
	}
	public void exam6() {
		String name = "Ȳ����";
		String name1 = "������";
	    int age = 32;
	    int age1 = 28;
		char gender = '��';
		char gender1 = '��';
		String address = "��⵵ ���� ���籸 ȭ����";
		String address1 = "��⵵ ���� �ϻ꼭��";
		String cell = "01087964211";
		String cell1 = "01071417433";
		String mail = "marba0418@gmail.com";  
		String mail1 = "hanmail.you@gmail.com";
		
		System.out.println("�̸�\t����\t����\t����\t��ȭ��ȣ\t�̸���");
	}
	public void scan() {
		Scanner sc = new Scanner(System.in);
		//������ �Է¹޴� ���
		System.out.print("�����Է� : ");//�����Է� ����Ѵ�.
		int inputNumber;//������ ������ �����Ѵ�.
		
		inputNumber = sc.nextInt();//
		System.out.println("����ڰ� �Է��� �� : "+inputNumber);
		//�Ǽ��� �Է¹޴� ���
		System.out.println("�Ǽ� �Է� : ");
		double dNum = sc.nextDouble();
		System.out.println("����ڰ� �Է��� �Ǽ� �� : "+dNum);
		//���ڿ� �Է¹޴� ���
		System.out.print("ù��° ���ڿ� �Է� : ");
		String str1 = sc.next();
		System.out.println("str1 : "+str1);
		sc.nextLine();
		System.out.print("�ι�° ���ڿ� �Է� : ");
		String str2 = sc.nextLine();
		System.out.println("str2 : "+str2.charAt(1));
		//�����Է� �޴� ���
		System.out.print("���� �Է� : ");
		char ch = sc.next().charAt(0);
		System.out.println("�Է��� ���ڴ� : "+ch);
	
		
	}
	public void scan1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է�: ");
		String name = sc.next();
		System.out.print("���� �Է�: ");
		int age = sc.nextInt();
		sc.nextLine();//����ó����
		System.out.print("�ּ� �Է� : ");
		String addr = sc.nextLine();
		System.out.print("Ű �Է� : ");
		double height = sc.nextDouble();
		System.out.print("������ �Է� : ");
		double weight = sc.nextDouble();
		System.out.print("���� �Է� : ");
		char gender = sc.next().charAt(0);
		System.out.printf("%s,%d,%s,%d,%.1f,%c",name,age,addr,(int)height,weight,gender);
		
	}
	public void scan2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է� : ");
		int point = sc.nextInt();
		System.out.print("�������� �Է� : ");
		int point2 = sc.nextInt();
		System.out.print("�������� �Է� : ");
		int point3 =sc.nextInt();
		int point4 =point + point2 + point3;
		System.out.println("��� ������ �� ���� point4 �̰� ����� point4/(double)3 �Դϴ�.");
		
	}
	
	

}
