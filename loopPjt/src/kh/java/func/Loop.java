package kh.java.func;

import java.util.Scanner;

public class Loop {
	public void forTest() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "��° ���");

		}
		for (int i = 1; i <= 5; i++) {// i�� �����ϸ� ��� ���� �ִ�?
			int test = 30;
		}
	}

	public void forTest1() {
		for (int i = 5; i > 0; i--) {
			System.out.println(i + "��° ���");

		}
	}

	public void forTest2() {// �޼ҵ� ����
		for (int i = 1; i <= 5; i++)// for������ �ʱ⹮ int i=
			System.out.println("�ȳ��ϼ���");

	}

	public void whileTest() {
		int i = 1;
		while (i <= 5) {
			System.out.println("�ȳ��ϼ���");
			i++;
		}
	}

	public void forTest3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ����Ͻðڽ��ϱ�? ");
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.println("�ȳ��ϼ���");
		}
	}

	public void whileTest1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ����Ͻðڽ��ϱ�? ");
		int number = sc.nextInt();
		int i =1;
		while(i<=number) {
			System.out.println("�ȳ��ϼ���");
			i++;
		}
		

	}

	public void forTest4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("2���Դϴ�.");

		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + "=" + (2 * i));
		}
	}
	public void whileTest2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("2���Դϴ�.");
		int i =1;
		while(i<=9) {
			System.out.println("2 *" +i+ "=" +(2*i));
			i++;
		}
	}

	public void forTest5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ����Ͻðڽ��ϱ�? ");
		int num2 = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(num2 + " * " + i + "=" + (num2 * i));

		}

	}
	public void whileTest5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ����Ͻðڽ��ϱ�? ");
		int num2 = sc.nextInt();
		int i = 1;
		while(i<=9) {
			System.out.println(num2 + "*" + i + "=" +(num2*i));
			i++;
		}
	}

	public void forTest6() {
		Scanner sc = new Scanner(System.in);
		// �ʱ�ȭ ���� �����ؾ���. ���� (�ϳ��� �����)��� ���ϴ� �Ű� �׷��� 0���� �ʱ�ȭ�ؾ� �հ谡 ��Ȯ��
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("���� ���� �Է��Ͻÿ� : ");
			int num = sc.nextInt();
			sum += num;

		}
		// for������ ���;� sys~�����, num�� for������ ��⶧���� �ٸ� ���� �����
		System.out.println("�Է��� 5���� ������ �� : " + (sum));
		
	}
	public void whileTest6() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i = 1;
		
		while(i<=5) {
			System.out.println("���� ���� �Է��Ͻÿ� : ");
			int num = sc.nextInt();
			i++;
			sum += num;
		}System.out.println("�Է��� 5���� ������ �� : "+(sum));
	}

	public void forTest7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° �� �Է� : ");
		int num = sc.nextInt();
		System.out.println("�ι�° �� �Է� : ");
		int num1 = sc.nextInt();
		int sum = 0;
		for (int i = num; i <= num1; i++) {
			sum += i;

		}
		System.out.println("10~20��  ������ �� : " + (sum));

	}
	public void whileTest7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° �� �Է� : ");
		int num = sc.nextInt();
		System.out.println("�ι�° �� �Է� : ");
		int num1 = sc.nextInt();
		int sum = 0;
		int i = num;
		while(i<=num1) {
			sum += i;
			i++;
		}
		System.out.println("10~20�� ������ ��  "+(sum));
	}
		
		
		
		
	
	

	public void forTest8() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println("i = " + i + "/ j = " + j);
			}
		}
	}
	

	public void loopTest() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("�ݺ�");
			System.out.print("�ѹ���[y/n]?");
			char ch = sc.next().charAt(0);
			if (ch == 'n') {
				break;
			}

		}
		System.out.println("test");
	}

	public void loopTest2() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ".���");
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("Ȧ��");
		}
		System.out.println("test2");
	}

	public void forTest9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int sum = 0;
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if(i%2==0) {
				sum +=i;
			}
		}
		System.out.println("¦������ ���� : " + (sum));

	}
	public void whileTest9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
			while(i<=num) {
				if(i%2==0) {
				sum +=i;
				}
				i++;
			}
		System.out.println("¦������ ���� : "+(sum));
		}
		

	//��ø for�� ������ ����� �ܺ��� Ƚ����ŭ �ݺ�	,ǥ��for(�ʱ⹮;���ǹ�;������)
	public void dfor1() {//�޼ҵ带 �����Ѵ�.
		//������ ������ 2�����̹Ƿ� �������� int i=2�� �����ϰ�
		//������ 2���� 9���� ���ų� �����Ƿ� <=9�� ������ �Ǵ�.
		//�������� �������� 2�̰� 2���� 
		for(int i=2;i<=9;i++) {
			//i�� 1���� 9���� ���ϱ� ���� �����ϴ� ������ int j=1�� �����ϰ�,
			//������ 9���� ���ų� �����Ƿ� <=9�� ������ �Ǵ�.
			//�������� �������� 1�̰� 1���� 9���� ���� �� 
			//2�� ���۵Ǿ�� �ϹǷ� j++�� �������� �Է��Ѵ�.
			for(int j=1;j<=9;j++) {
				//��°��� ���ٿ� ���ְ� ����\t�� ���ش�.
				System.out.print(i+"*"+j+"=" +(i*j)+"\t");
			//2���� ��ġ�� 3���� ��µǵ��� println�� �־��ش�.	
			}System.out.println();
		}
		
		
	}
	public void dfor2() {//�޼ҵ带 �����Ѵ�.
		//1���� ���ؾ� �ϹǷ� �������� 1�� �Ѵ�.
		//������ 1���� 9���� ���ϴ� ���̹Ƿ� 1���� 9���� ������ ���� ������ �ִ´�.
		//1���� 9���� ���ʴ�� +1��  �����ϹǷ� i++�� ǥ���Ѵ�.
		for(int i=1;i<=9;i++) {
			//������ �ݴ�� �ϱ� ���� ? 2���� ���������� ������ �����Ѵ�.
			//������ 2���� 9���� �̹Ƿ� ������ �����Ѵ�.
			//2���� 9���� +1�� �����ϱ� ���� j++�� ǥ���Ѵ�.
			for(int j=2;j<=9;j++) {
				//��°��� ���ٿ� ���ְ� ����\t�� ���ش�.
			System.out.print(j+"*"+i+"="+(j*i)+"\t");
			//2���� ��ġ�� 3���� �� �� �ְ� println�� �־��ش�.
			}System.out.println();
		}
	}
	public void dfor3() {//�޼ҵ带 �����Ѵ�.
		//��°��� *****�̹Ƿ� �ݺ� Ƚ���� 5���� �������� �Ѵ�.
		//�������� 1���ͷ� �����Ѵ�.
		//������ 1���� 5���� 5�� �ݺ� �ؾ��ϹǷ� 1-5����
		//i�� 5���� �۰ų� �������� ������ �Ǵ�.
		//������ 1�� �ְ� ������ ������ ���ʴ�� +1�� �����ϹǷ� i++�� �������� �ִ´�.
		for(int i =1;i<=5 ;i++ ) {
			for(int j =1;j<=5;j++) {
				System.out.print("*");//��°��� *�� ������ ���ٷ� ����ϱ� ���� print�� ����.
			}
			System.out.println();// 			
		}
		
	}
	public void dfor4() {//�޼ҵ带 �����Ѵ�.
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}System.out.println();
		}
		
	}
	public void dfor5() {
		  for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);	
			}
			System.out.println(" ");
			
		}
		
	}
	public void dfor6() {//�޼ҵ带 �����Ѵ�.
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
	




