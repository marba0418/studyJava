package kr.or.iei.student;

import java.util.Scanner;

public class StudentMgr {

	String[] names = new String[10];// �л� �̸� ������ �迭
	int[] ages = new int[10];
	String[] addrs = new String[10];
	int index; // �迭 �ε��� ������;
	Scanner sc = new Scanner(System.in);

	public void main() {
		while (true) {
			System.out.println("==�л�������α׷�==");
			System.out.println("1.�л����");
			System.out.println("2.�л����� ��ȸ(��ü)");
			System.out.println("3.�л����� ��ȸ(1��)");
			System.out.println("4.�л����� ����");
			System.out.println("5.�л����� ����");
			System.out.println("6.���α׷� ����");
			System.out.println("����> ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				insertStudent();// �޼ҵ��
				break;
			case 2:
				printAllStudent();
				break;
			case 3:
				printOneStudent();
				break;
			case 4:
				modifyStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 6:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}
	}

	public void insertStudent() {
		System.out.println("\n======�л������Է�======");
		System.out.print("�̸� �Է�:");
		String name = sc.next();
		System.out.print("���� �Է�:");
		int age = sc.nextInt();
		sc.nextLine();// ����ó������ ���ſ� �ڵ�
		System.out.print("�ּ��Է�:");
		String addr = sc.nextLine();
		names[index] = name;
		ages[index] = age;
		addrs[index] = addr;
		index++;
		System.out.println("�л� ������� ����!");

	}

	public void printAllStudent() {
		System.out.println("\n=====�л���ü ����=====");
		System.out.println("�̸�\t����\t�ּ�");
		for (int i = 0; i < index; i++) {
			System.out.println(names[i] + "\t" + ages[i] + "\t" + addrs[i]);
		}
	}

	public void printOneStudent() {
		System.out.println("\n=====�л����� ���(1��) =====");

		int searchIndex = searchStudent("��ȸ");
		if (searchIndex != -1) {

			System.out.println("�̸�: " + names[searchIndex]);
			System.out.println("����: " + ages[searchIndex]);
			System.out.println("�ּ�: " + addrs[searchIndex]);
		}
	}

	public void modifyStudent() {
		System.out.println("\n=====�л����� ����=====");
		int searchIndex = searchStudent("����");
		if (searchIndex != -1) {
			System.out.print("������ �л� �̸� �Է� :");
			String name = sc.next();
			System.out.print("������ ���� �Է� :");
			int age = sc.nextInt();
			System.out.print("������ �ּ� �Է�: ");
			sc.nextLine();
			String addr = sc.nextLine();
			names[searchIndex] = name;
			ages[searchIndex] = age;
			addrs[searchIndex] = addr;
		}
	}

	public void deleteStudent() {
		System.out.println("\n=====�л����� ���� =====");
		int searchIndex = searchStudent("����");
		if (searchIndex != -1) {
			for (int i = searchIndex; i < index - 1; i++) {
				names[i] = names[i + 1];
				ages[i] = ages[i + 1];
				addrs[i] = addrs[i + 1];
			}
			names[index - 1] = null;
			ages[index - 1] = 0;
			addrs[index - 1] = null;
			index--;
		}
	}

	public int searchStudent(String msg) {
		System.out.print(msg + "�� �л� �̸� �Է� : ");
		String name = sc.next();
		for (int i = 0; i < index; i++) {
			if (names[i].equals(name)) {
				return i;

			}
		}
		System.out.println("�л� ������ �����ϴ�.");
		return -1;// �ƹ� �͵� �߰ߵ��� �ʾ�����

	}

}
