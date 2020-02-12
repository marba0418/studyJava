package kr.or.iei.controller;

import java.util.Scanner;

import kr.or.iei.point.Gold;
import kr.or.iei.point.Grade;
import kr.or.iei.point.Silver;
import kr.or.iei.point.Vip;
import kr.or.iei.point.Vvip;

public class PointMgr {
	Grade[] members = new Grade[30];
	int index;// �ǹ��� �ش��ϴ� �迭
	int grade;// �˻���� silver ==1, gold ==2,vip==3

	Scanner sc = new Scanner(System.in);

	public PointMgr() {

	}

	public void main() {
		while (true) {
			System.out.println("=======��������޴�======="+index);
			System.out.println("1.ȸ������");
			System.out.println("2.ȸ���������(��ü)");
			System.out.println("3.ȸ���������(1��)");
			System.out.println("4.ȸ����������");
			System.out.println("5.ȸ��Ż��");
			System.out.println("6.ȸ���˻�");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				insertPeople();
				break;
			case 2:
				printAllPeople();
				break;
			case 3:
				printOnePeople();
				break;
			case 4:
				modifyPeople();
				break;
			case 5:
				deletePeople();
				break;
			case 6:
				break;
			default:
				System.out.println("�ٽ� �Է����ּ���!!");

			}

		}
	}

	public void insertPeople() {
		System.out.println("=======ȸ�� �������� �Է�=======");
		System.out.println("ȸ�� ��� �Է�[Silver/Gold/Vip/Vvip] : ");
		String grade = sc.next().toLowerCase();// ��ҹ��� Ʋ���� �ٲ���(�ҹ��ڷ� �ٲ��� ...grade�� �ҹ��ڸ� �� ����...)
		String name = " ";
		while (true) {
			System.out.println("ȸ�� �̸� �Է� : ");
			name = sc.next();
			int result = searchPeople(name);
			if (result == -1) {
				break;
			} else {
				System.out.println("�̹� ���Ե� ȸ���Դϴ�.");
			}
		}
		System.out.println("ȸ�� ����Ʈ ���� �Է� : ");
		int point = sc.nextInt();
		System.out.println(grade);
		switch (grade) {
		case "silver":
			members[index++] = new Silver(grade, name, point);
			break;
		case "gold":
			members[index++] = new Gold(grade, name, point);
			break;
		case "vip":
			members[index++] = new Vip(grade, name, point);
			break;
		case "vvip":
			members[index++] = new Vvip(grade, name, point);
			break;
			
		}
		System.out.println("��� �Ϸ�");

	}

	public void printAllPeople() {
		System.out.println("=======ȸ���������(��ü)=======");
		System.out.println(" ���\t�̸�\t����Ʈ����\t���ʽ�����Ʈ ");
		for (int i = 0; i < index; i++) {
			System.out.println(members[i].getGrade() + "\t" + members[i].getName() + "\t" + members[i].getPoint() + "\t"
					+ members[i].getDpoint());
		}

	}

	public int searchPeople(String name) {// 1�� �Ѿ���� �� �ǹ��� 1���� ����� 1����..������ �ȵ�
		for (int i = 0; i < index; i++) {
			if (members[i].getName().equals(name)) {
				// grade =1;
				return i;
			}
		}

		return -1;
	}

	public void printOnePeople() {
		System.out.println("========ȸ���������(1��)=========");
		System.out.print("��ȸ�� ȸ���� �Է����ּ���");
		String name = sc.next();
		int searchIndex = searchPeople(name);
		if (searchIndex == -1) {
			System.out.println("ȸ���� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("��� : " + members[searchIndex].getGrade());
			System.out.println("�̸� : " + members[searchIndex].getName());
			System.out.println("����Ʈ : " + members[searchIndex].getPoint());
			System.out.println("���ʽ� : " + members[searchIndex].getDpoint());

		}

	}

	public void modifyPeople() {
		System.out.println("=======ȸ����������=======");
		System.out.print("������ ȸ�� �Է� : ");
		String name = sc.next();
		int searchIndex = searchPeople(name);// ��ġ�� �˻�
		if (searchIndex == -1) {
			System.out.println("ȸ���� �������� �ʽ��ϴ�.");
		} else {// -1�� �ƴ� ���

			System.out.println("������ ��� �Է�[silver/gold/vip/vvip]");
			String nGrade = sc.next().toLowerCase();
			System.out.print("������ �̸� �Է� :");
			String nName = sc.next();
			System.out.println("������ ����Ʈ �Է� : ");
			int nPoint = sc.nextInt();
			switch (nGrade) {
			case "silver":
				members[searchIndex] = new Silver(nGrade, nName, nPoint);
				break;
			case "gold":
				members[searchIndex] = new Gold(nGrade, nName, nPoint);
				break;
			case "vip":
				members[searchIndex] = new Vip(nGrade, nName, nPoint);
				break;
			case "vvip":
				members[searchIndex] = new Vvip(nGrade,nName,nPoint);
				break;

			}

		}
	}

	public void deletePeople() {
		System.out.println("=======ȸ��Ż��=======");
		System.out.print("Ż�� �̸� �Է� : ");
		String name = sc.next();
		int searchIndex = searchPeople(name);
		if (searchIndex == -1) {
			System.out.println("ȸ���� �������� �ʽ��ϴ�.");
		} else {
			for (int i = searchIndex - 100; i < index - 1; i++) {
				members[i] = members[i + 1];
			}
			members[index - 1] = null;
			index--;
		}
	}

}
