package kh.java.test.function;

import java.util.Scanner;

public class Exmaple {
	public void exam1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int math = sc.nextInt();
		int sum = kor + eng + math;
		double avg = sum / (double) 3;
		boolean bool1 = avg >= 60;
		boolean bool2 = kor >= 40;
		boolean bool3 = eng >= 40;
		boolean bool4 = math >= 40;
		boolean result = bool1 && bool2 && bool3 && bool4;
		System.out.println(result ? "�հ�" : "���հ�");

	}

	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int number = sc.nextInt();
		System.out.println(number % 2 == 0 ? "¦��" : "Ȧ��");
	}

	public void exam3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("10�� �Է��غ����� : ");
		int inputNumber = sc.nextInt();
		if (inputNumber == 10) {
			System.out.println("���߾��");

		}

	}

	public void exam4() {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������ �Է� �ϼ��� : ");
		int num1 = sc.nextInt();
		if (num1 > 0) {
			System.out.println("����� �Է��� �� num1��(��) ����Դϴ�.");
		}
		if (num1 == 0) {
			System.out.println("����� �Է��� ��num1��(��) 0�Դϴ�. ");
		}
		if (num1 < 0) {
			System.out.println("����� �Է��� ��num1��(��) �����Դϴ�.");
		}

	}

	public void exam5() {

		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ������ �Է� �ϼ��� : ");
		int firstnum = sc.nextInt();
		System.out.println("�ι�° ������ �Է� �ϼ��� : ");
		int secondnum = sc.nextInt();
		if (firstnum < secondnum) {
			System.out.printf("firstnum<secondnum, �ι�° ���� �� Ů�ϴ�.");
		}
		if (firstnum == secondnum) {
			System.out.printf("firstnum<secondnum, �� ���� �����ϴ�.");
		}
		if (firstnum > secondnum) {
			System.out.printf("firstnum>secondnum, ù��° ���� �� Ů�ϴ�.");
		}
	}

	public void exam6() {

		Scanner sc = new Scanner(System.in);
		System.out.println("�����ڸ� �Է��ϼ���(+,-,*,/) :");
		char ch = sc.next().charAt(0);
		int first1 = sc.nextInt();
		System.out.println("ù��° ������ �Է� �ϼ��� : ");
		int sec = sc.nextInt();
		System.out.println("�ι�° ������ �Է� �ϼ��� : ");
		if (ch == '+') {
			System.out.println(first1 + "+" + sec + "=" + (first1 + sec));
		} // ("%d%c%d=%d",first1,ch,sec,first+sec);
		if (ch == '-') {
			System.out.println(first1 + "-" + sec + "=" + (first1 - sec));
		}
		if (ch == '*') {
			System.out.println(first1 + "*" + sec + "=" + (first1 * sec));
		}
		if (ch == '/') {
			System.out.printf("%d/%d=%f", first1, sec, (double) first1 / sec);
		}

	}

	public void exam7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
		if (number % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		}
		if (number % 2 == 1) {
			System.out.println("Ȧ���Դϴ�.");
		}
	}

	public void exam8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Ͻ� �� �ο��� ����Դϱ�? : ");
		int count = sc.nextInt();
		System.out.println("��� ����Դϱ�?(1�δ� 15000��) : ");
		int adult = sc.nextInt();
		System.out.println("���̴� ����Դϱ�?(1�δ� 5000��) : ");
		int child = sc.nextInt();
		if (adult + child == 3) {
			System.out.println("�����Ͻ� �� �ݾ��� 35000�� �Դϴ�.");
		} else {
			System.out.println("�ο����� ���� �ʽ��ϴ�.");
		}
	}

	public void exam9() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("ù��° ����\n����� ����� �����ϱ��(1.apple,2.��Ƽ�� �⽺)?");
		int first = sc.nextInt();
		int count = 0;
		if (first == 1) {
			count++;
			System.out.println("����!!!");
		} else {
			System.out.println("��!!");
		}
		System.out.printf("�ι�° ����\n�ٳ����� ��� ������ ���� ������ (1.���,2.����)?");
		int banana = sc.nextInt();
		if (banana == 2) {
			count++;
			System.out.println("����!!!");
		} else {
			System.out.println("��!!");
		}
		System.out.println("��" + count + "������ ������ϴ�.");
	}

	public void exam10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���� �����մϱ�?");
		int an1 = sc.nextInt();
		if (an1 == 1) {
			System.out.print("����� ��踦 �ǿ�ϱ�?");
			int an2 = sc.nextInt();
			if (an2 == 1) {
				System.out.println("���¸��� ���� �ʽ��ϴ�.");
			} else {
				System.out.println("���� ���� ���� �ʽ��ϴ�.");
			}
		} else {
			System.out.print("�̼�ģ���� �ֽ��ϱ�?");
			int an3 = sc.nextInt();
			if (an3 == 1) {
				System.out.println("�ä�");
			} else {
				System.out.println("�Ф�");
			}
		}
	}

	public void exam11() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 ���� ���� �Է��ϼ��� : ");
		int number = sc.nextInt();
		if (number == 1) {
			System.out.println("One");
		} else if (number == 2) {
			System.out.println("Two");
		} else if (number == 3) {
			System.out.println("Three");
		} else {
			System.out.println("�߸��Է��߽��ϴ�.");
		}
	}

	public void exam12() {

		Scanner sc = new Scanner(System.in);
		System.out.println("========= ��/�ҹ��� ��ȯ ���α׷�=========");
		System.out.println("�����Է� : ");
		char ch = sc.next().charAt(0);
		if (65 <= ch && ch <= 92) {
			System.out.println("�빮�� �Է���");
			System.out.println("�ҹ��ڷ� ��ȯ" + (char) (ch ^ 32));
		} else if (97 <= ch && ch <= 122) {
			System.out.println("�ҹ��� �Է���");
			System.out.println("�빮�ڷ� ��ȯ" + (char) (ch ^ 32));
		} else {
			System.out.println("�߸��Է�");
		}
	}

	/*
	 * public void exam13() {
	 * 
	 * Scanner sc = new Scanner(System.in);//��ĳ�� ��������
	 * System.out.println("�����Է� : ");//�����Է� ���
	 * System.out.println("===== ��� =====");//��� ��� int num2 = sc.nextInt();//�Է½�
	 * num2 if((num2/3)&&(num2/4)==0) {//3�� ����̸鼭 4�� ����� ������ 3�� 4�� �������� �� 0�� ����.
	 * System.out.println(); }
	 * 
	 * Scanner sc =new Scanner(System.in); System.out.print("�����Է� : "); //3�� ��� ->
	 * 3���� ������ �� �������� 0 //4�� ��� ->4�� ������ �� �������� 0 //3&&4 -> if(num2==0) {
	 * System.out.println("�Ѵپƴ�"); }else if(num2%3==0&&num2%4==0)
	 * System.out.printf("[%d]��(��) 3�� ����̸鼭 4�� ����Դϴ�."); }else if(num2%3==0) {
	 * System.out.printf("[%d]��(��) 3�� ����Դϴ�."); }else if(num2%4==0) {
	 * System.out.printf("[%d]��(��) 4�� ����Դϴ�."); }else { System.out.println("�Ѵپƴ�");
	 * }
	 * 
	 * 
	 * public void exam14() { Scanner sc = new Scanner(System.in);
	 * System.out.print("1~3������ �� �Է� : "); int num = sc.nextInt(); switch(num) {
	 * case 1 : System.out.println("1�� �Է�"); break; case 2 :
	 * System.out.println("2�� �Է�"); break; case 3 : System.out.println("3�� �Է�");
	 * break; default : System.out.println("�߸��Է�"); } }
	 */
	public void exam15() {// �޼ҵ� ����
		Scanner sc = new Scanner(System.in);// ��ĳ�� ����
		System.out.print("�ϼ��� �˰���� ���� �Է��ϼ��� : ");// �ϼ���~�Է��ϼ��� ���
		int number = sc.nextInt();// ������ ���� ����
		
		switch (number) {//if�� ���� �� int���� number ������ �����ϰ�,switch���� number �ް�,case�� if�� ����.. �׷��� case 1�� if(number =1)�� ���..�̷������� ������ �޸��� ����..
		case 1:
			System.out.println(number + "������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 2:
			System.out.println("2������ 29�ϱ��� �ֽ��ϴ�.");
			break;
		case 3:
			System.out.println("3������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 4:
			System.out.println("4������ 30�ϱ��� �ֽ��ϴ�.");
			break;
		case 5:
			System.out.println("5������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 6:
			System.out.println("6������ 30�ϱ��� �ֽ��ϴ�.");
			break;
		case 7:
			System.out.println("7������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 8:
			System.out.println("8������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 9:
			System.out.println("9������ 30�ϱ��� �ֽ��ϴ�.");
			break;
		case 10:
			System.out.println("10������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 11:
			System.out.println("11������ 30�ϱ��� �ֽ��ϴ�.");
			break;
		case 12:
			System.out.println("12������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		}

	}

	public void exam16() {// �޼ҵ� �Է�
		Scanner sc = new Scanner(System.in);// ��ĳ�� ��������
		// ���б� ���� �ý��۰� ����ǥ���ϴ� ���� �Է��ϱ� ���� printf�Է���
		System.out.printf("���б� ���� �ý����Դϴ�\n������ �Է��ϼ���(A,B,C,D,F) : ");
		char ch = sc.next().charAt(0);// sc.next()(���� ������ ���о��).charAt(0)�� ���ؼ� ���ڸ� �Է¹޾� / ������ ���� ch�� ����
		if (ch == 'A') {	//�Է¹��� ���ڰ� A�� ���
			// ����A���� �����ϰ� �ش缺���� �ƴѰ�� B,C,D,F�� ���ǰ��� ������ �� �ְ� �Է�
			// ���� A������ �����Ͽ� ���б�100���� ���
			System.out.println("�����ϼ̽��ϴ�. ���б��� 100%�����ص帮�ڽ��ϴ�.");
		} else if (ch == 'B') {			// ����A�� �ƴ� �ش缺�� �� B������ �ش��ϴ� ���
			System.out.println("�ƽ�����. ���б��� 50%�����ص帮�ڽ��ϴ�.");
		} else if (ch == 'C') {// ������ A,B�Ѵ� �ƴѰ�� �� C�� �ش��ϴ� ���
			System.out.println("���б��� �ٶ�ø� ���� ������ ���ּ���.");// C������ �ش��ϴ� ���� ���
		} else if (ch == 'D') {// ������ A,B,C �� �� �ƴ� ��� �� D�� �ش��ϴ� ���
			System.out.println("ũ��.......");// D���� �ش� ���� ���
		} else {// ������ A,B,C,D �װ����� 1���� �ش��ϴ� ��찡 ���� ���
			System.out.println("�л����Դϴ�!!!!");// A~D���� ������ �ش����� �ʴ� ���� F�����̸� �׿� �ش��ϴ� ��� ���
		}

	}
	public void exam161(){//�޼ҵ� �Է�
		Scanner sc = new Scanner(System.in);// ��ĳ�� ��������
		//���б� ����~���� ǥ�� ���� �Է��ϱ� ���� printf�Է���
		System.out.printf("���б� ���� �ý����Դϴ�\n������ �Է��ϼ���(A,B,C,D,F) : ");
		char ch = sc.next().charAt(0);//sc.next().charAt(0)�� ���ؼ� ���ڸ� �Է¹޾�/ ������ ���� ch�� ����
		switch(ch) {//switch
		}
	}

	public void exam17() {// �޼ҵ� �Է�
		Scanner sc = new Scanner(System.in);// ��ĳ�� ��������
		System.out.print("======== ���� ���α׷� ========");// �������α׷� ���
		char ch = sc.next().charAt(0);// �����ڴ� �����̱⿡ ���� ���� ����
		System.out.println("�����ڸ� �Է��ϼ���(+,-,*,/) ");// �����ڸ� �Է��ϼ��� �ٺ������
		int num = sc.nextInt();// ù��° ���� ������ ���� ����
		int num1 = sc.nextInt();// �ι�° ���� ������ ���� ����

		if (ch == '+') {// �����ڰ� +�ΰ�츦 ����
			System.out.print("ù��° ������ �Է� �ϼ��� : " + num);// ù��° ������ �Է� �ϼ��� �� ������ ���
			System.out.print("�ι�° ������ �Է� �ϼ��� : " + num1);// �ι�° ������ �Է��ϼ���� �ش� ������ ���
			System.out.printf("%d%c%d=%d", num, ch, num1);// �����ڰ� +�ΰ�� ���� ���
		}

		else if (ch == '-') {// �����ڰ� -�ΰ�츦 ����
			System.out.print("ù��° ������ �Է� �ϼ��� : " + num);// ù��° ������ �Է��ϼ���� ������ ���
			System.out.print("�ι�° ������ �Է� �ϼ��� : " + num1);// �ι�° ������ �Է��ϼ���� �ش� ������ ���
			System.out.printf("%d%c%d=%d", num, ch, num1);// �����ڰ� -�ΰ�� ���� ���
		} else if (ch == '*') {// �����ڰ� *�ΰ�츦 ����
			System.out.print("ù��° ������ �Է� �ϼ��� : " + num);// ù��° ������ �Է��ϼ���� ������ ���
			System.out.print("�ι�° ������ �Է� �ϼ��� : " + num1);// �ι�° ������ �Է��ϼ���� �ش� ������ ���
			System.out.printf("%d%c%d=%d", num, ch, num1);// �����ڰ� *�ΰ�� ���� ���
		} else {// �����ڰ� +-*�ƴ� ���
			System.out.print("ù��° ������ �Է� �ϼ��� : " + num);// ù��° ������ �Է��ϼ���� ������ ���
			System.out.print("�ι�° ������ �Է� �ϼ��� : " + num1);// �ι�° ������ �Է��ϼ���� �ش� ������ ���
			System.out.printf("%d%c%d=%.2f(%d)", num, ch, num1);// �����ڰ� +-*�ƴ� ��� ���� ���
		}
	}

	public void exam18() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է� : ");// ���� �Է� ���
		int point = sc.nextInt();// ���� ���� �Է�
		if (point > 0 && point < 0) {// ������ 0~100���̰� �ƴ� ���
			System.out.println("�߸��� �Է�(0~100���� �Է�)");// ������0~100���� �ƴѰ� ��µ�
		} else if (point >= 90) {// ������90���̻� �� ���
			System.out.println(+point + "��==>A���"); // A��� ��µ�
		} else if (point >= 80) {// ������80���̻��� ���
			System.out.println(+point + "��==>B���");// B��� ��µ�
		} else if (point >= 70) {// ������70���̻��� ���
			System.out.println(+point + "��==>C���");// C��� ��µ�
		} else if (point >= 60) {// ������60���̻��� ���
			System.out.println(+point + "��==>D���");// D��� ��µ�
		} else {// ������ 60���̸�(������ ����)�ΰ��
			System.out.println(+point + "��==>F���");// F��� ��µ�

		}
	}

	//���̶� Ǭ��
	public void exam181() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է� : ");
		int score = sc.nextInt();
		int grade = score/10;//98�� 10���� ������?9
		if(score == 100) {//100���� ���
			System.out.println("A���");
		}else if(score>100||score<0) {
			System.out.println("�߸��� �Է�");
		}else {
		switch(grade) {//swich�ȿ� if �ᵵ ��
		case 9:
			System.out.println("A���");
			break;
		case 8:
			System.out.println("B���");
			break;
		case 7:
			System.out.println("C���");
			break;
		case 6:
			System.out.println("D���");
			break;
		case 5:
			System.out.println("F���");
			break;
		default	: System.out.println("�߸��� �Է�(0~100���� �Է�)");
		}
	}
	}
	
	
}
