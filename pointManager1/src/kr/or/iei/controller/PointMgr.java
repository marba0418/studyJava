package kr.or.iei.controller;

import java.util.Scanner;
import kr.or.iei.point.Silver;

public class PointMgr {
	public static PointMgr mgr;
	Silver[] people = new Silver[30];
	Scanner sc = new Scanner(System.in);
	int index;

	public void main() {
		while (true) {
			System.out.println("=======��������޴�=======");
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
		System.out.println("ȸ�� ��� �Է� : ");
		String grade = sc.next();
		System.out.println("ȸ�� �̸� �Է� : ");
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
		Silver person = new Silver(grade, name, point);
		people[index] = person;
		index++;
	}

	public void printAllPeople() {
		System.out.println("=======ȸ���������(��ü)=======");
		System.out.println(" ���\t�̸�\t����Ʈ����\t���ʽ�����Ʈ ");
		
		for (int i = 0; i < index; i++) {
			System.out.println(people[i].getGrade() + "\t" + people[i].getName() + "\t" + people[i].getPoint() + "\t");
			
		}
	}

	public int searchPeople(String name) {
		for (int i = 0; i < index; i++) {
			if (people[i].getName().equals(name)) {
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
			System.out.println("��� : " + people[searchIndex].getGrade());
			System.out.println("�̸� : " + people[searchIndex].getName());
			System.out.println("����Ʈ ���� : " + people[searchIndex].getPoint());

		}

	}

	public void modifyPeople() {
		System.out.println("=======ȸ����������=======");
		System.out.print("������ ȸ�� �Է� : ");
		String name = sc.next();
		int searchIndex = searchPeople(name);
		if (searchIndex == -1) {
			System.out.println("ȸ���� �������� �ʽ��ϴ�.");
		} else {
			System.out.print("������ �̸� �Է� : ");
			String mName = sc.next();
			System.out.print("������ ��� �Է� : ");
			String mGrade = sc.next();
			System.out.print("������ ����Ʈ �Է� : ");
			int mPoint = sc.nextInt();
			people[searchIndex].getName();
			people[searchIndex].getGrade();
			people[searchIndex].getPoint();
		}
	}

	public void deletePeople() {
		System.out.println("=======ȸ������ ���� =======");
		System.out.print("������ �̸� �Է� : ");
		String name = sc.next();
		int searchIndex = searchPeople(name);
		if (searchIndex == -1) {
			System.out.println("ȸ���� �������� �ʽ��ϴ�.");
		} else {
			for (int i = searchIndex; i < index - 1; i++) {
				people[i] = people[i + 1];
			}
			people[index - 1] = null;
			index--;
		}
	}

}
