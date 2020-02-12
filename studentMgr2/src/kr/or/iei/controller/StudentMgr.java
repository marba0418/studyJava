package kr.or.iei.controller;

import java.util.Scanner;

import kr.or.iei.vo.Student;

public class StudentMgr {
	public static StudentMgr mgr;
	// �л��迭,��ĳ��,�ε���
	Student[] students = new Student[10];
	Scanner sc = new Scanner(System.in);
	int index;

	public void main() {
		while (true) {
			System.out.println("======�л����� ���α׷� v1.1======");
			System.out.println("1. �л� ���� �Է�");
			System.out.println("2.�л� ���� ���<��ü>");
			System.out.println("3.�л� ���� ���<1��>");
			System.out.println("4.�л� ���� ����");
			System.out.println("5.�л� ���� ����");
			System.out.println("0.���α׷� ����");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				insertStudent();
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
			case 0:
				return;
			default:
				System.out.println("�ٽ� �Է����ּ���!");
			}
		}
		

	}
	public void insertStudent() {
		System.out.println("\n======�л����� �Է� =======");
		System.out.print("�л� �̸� �Է� : ");
		String name = sc.next();
		System.out.print("�л� ���� �Է� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("�л� �ּ� �Է�: ");
		String addr = sc.nextLine();
		Student stu = new Student(name,age,addr);
		/*
		 �⺻�����ڸ�  ���ؼ� ��ü ������ setter�� �̿��� �� ���� 
		Student stu = new Student();
		stu.setName(name);
		stu.setAge(age);
		stu.setAddr(addr);
		*/
		students[index] =stu;
		index++;
	}
	public void printAllStudent() {
		System.out.println("======�л� ��ü ���� ���======");
		System.out.println("�̸�\t����\t�ּ�");
		for(int i =0;i<index;i++) {
			System.out.println(students[i].getName()+"\t"+students[i].getAge()+"\t"+students[i].getAddr());
		}
		
	}
	public int searchStudent(String name) {
		for(int i=0;i<index;i++) {
			if(students[i].getName().equals(name)) {
				return i;
			}
		}
		return-1;
		
	}
	public void printOneStudent() {
		System.out.println("======�л����� ���(1��)======");
		System.out.print("��ȸ�� �л� �̸��� �Է��ϼ���: ");
		String name = sc.next();
		int searchIndex = searchStudent(name);
		if(searchIndex ==-1) {
			System.out.println("�л��� �������� �ʽ��ϴ�.");
		}else {
			System.out.println("�̸� : "+students[searchIndex].getName());
			System.out.println("���� : "+students[searchIndex].getAge());
			System.out.println("�ּ� : "+students[searchIndex].getAddr());
		}
	}
	public void modifyStudent() {
		System.out.println("======�л� ���� ���� =======");
		System.out.print("������ �л�  �̸� �Է� : ");
		String name = sc.next();
		int searchIndex = searchStudent(name);
		if(searchIndex==-1) {
			System.out.println("�л� ������ �����ϴ�.");
		}else {
			System.out.print("���� �̸� �Է� : ");
			String mName = sc.next();
			System.out.print("���� ���� �Է� : ");
			int mAge = sc.nextInt();
			sc.nextLine();
			System.out.print("���� �ּ� �Է� : ");
			String mAddr = sc.nextLine();
			students[searchIndex].setName(mName);
			students[searchIndex].setAddr(mAddr);
			students[searchIndex].setAge(mAge);
		}
	}
	public void deleteStudent() {
		System.out.println("========�л� ���� ���� ========");
		System.out.print("������ �л� �̸� �Է� : ");
		String name = sc.next();
		int searchIndex = searchStudent(name);
		if(searchIndex ==-1) {
			System.out.println("�л��� �������� �ʽ��ϴ�.");
			}else {
				for(int i =searchIndex;i<index-1;i++) {
					students[i]= students[i+1];
					
				}
				students[index-1] = null;
				index--;
						
				
			}
	}
	
}
