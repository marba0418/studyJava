package kh.java.run;

import java.util.Scanner;

import kh.java.vo.TV;

public class OOPSTart {

	public static void main(String[] args) {
		/*
		 * TV tv = new TV();//tv�� �ν��Ͻ���� �� �Ǵ� ��ü TV tv1 = new TV(); //��üȭ�ǰ� ���������� ��,
		 * tv��ü�� 2�� �� tv.power(); System.out.println(tv.power); tv.volumeUp();
		 * System.out.println(tv.volume); System.out.println(tv1.volume);
		 */
		Scanner sc = new Scanner(System.in);
		TV tv = new TV();
		//JVM �ڵ����� ������ִ� ������
		System.out.println(tv.getPower());
		tv.power();
		System.out.println(tv.getPower());
		System.out.println(tv.getChannel());
		System.out.println(tv.getVolume());
		/*while (true) {
			System.out.println("TV ��û ���̵� ");
			System.out.println("1.���� on/off");
			System.out.println("2.���� ä�� �� ���� Ȯ��");
			System.out.println("3. ä��+1");
			System.out.println("4. ä��-1");
			System.out.println("5. ���� +1");
			System.out.println("6. ���� -1");
			System.out.println("7. ä���Է�");
			System.out.println("����>");
			int sel = sc.nextInt();
			switch (sel) {
			case 7:
				if(tv.power==true) {
					System.out.println("ä���� �Է��ϼ��� : ");
					int chNum =sc.nextInt();
					tv.selChannel(chNum);
				}else {
					System.out.println("������ �������ϴ�.");
				}
				break;
			case 1:
				boolean bool=tv.power();
				if(bool) {
					System.out.println("������ �������ϴ�.");
				}else {
					System.out.println("������ �������ϴ�.");
				}
				break;// �극��ũ ������ ����:)
			case 2:
				if (tv.power == true) {
					System.out.println("ä��:  " + tv.channel);
					System.out.println("����: " + tv.volume);
				} else {
					System.out.println("������ ���ּ���");
				}
			case 3:
				if (tv.power == true) {
					tv.channelUp();
				}else {
				System.out.println("���� ����~");
				}
				break;
			case 4:
				if (tv.power == true) {
				tv.channelDown();
				}else {
				System.out.println("���� ����~");
				}
				break;
			case 5:
				if (tv.power == true) {
					tv.volumeUp();
				}else {
				System.out.println("���� ����~");
				}
				break;
			case 6:
				if (tv.power == true) {
				tv.volumeDown();
				}else {
				System.out.println("���� �� �Ф�");
				}
				break;
				
			}

		}*/
	}
}
