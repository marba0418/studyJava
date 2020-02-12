package kr.or.iei.controller;

import java.util.Scanner;

import kr.or.iei.point.Gold;
import kr.or.iei.point.Silver;
import kr.or.iei.point.Vip;

public class PointMgr {

	Silver[] silver = new Silver[10];// ���� ���� vip����->�迭 �ٽ� �����
	int sIndex;// �ǹ��� �ش��ϴ� �迭
	Gold[] gold = new Gold[10];
	int gIndex;// ��忡 �ش��ϴ� �迭
	Vip[] vip = new Vip[10];
	int vIndex;// vip �� �ش��ϴ� �迭
	int grade;// �˻���� silver ==1, gold ==2,vip==3

	Scanner sc = new Scanner(System.in);

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
		System.out.println("ȸ�� ��� �Է�[Silver/Gold/Vip] : ");
		String grade = sc.next().toLowerCase();// ��ҹ��� Ʋ���� �ٲ���(�ҹ��ڸ� �빮�ڷ� �ٲ���)

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
		switch (grade) {
		case "silver":
			silver[sIndex++] = new Silver(grade, name, point);
			break;
		case "gold":
			gold[gIndex++] = new Gold(grade, name, point);
			break;
		case "vip":
			vip[vIndex++] = new Vip(grade, name, point);
			break;
		}

	}

	public void printAllPeople() {
		System.out.println("=======ȸ���������(��ü)=======");
		System.out.println(" ���\t�̸�\t����Ʈ����\t���ʽ�����Ʈ ");

		for (int i = 0; i < sIndex; i++) {
			System.out.println(silver[i].getGrade() + "\t" + silver[i].getName() + "\t" + silver[i].getPoint() + "\t"
					+ silver[i].getDpoint());
		}
		for (int i = 0; i < gIndex; i++) {
			System.out.println(gold[i].getGrade() + "\t" + gold[i].getName() + "\t" + gold[i].getPoint() + "\t"
					+ gold[i].getDpoint());
		}
		for (int i = 0; i < vIndex; i++) {
			System.out.println(
					vip[i].getGrade() + "\t" + vip[i].getName() + "\t" + vip[i].getPoint() + "\t" + vip[i].getDpoint());
		}
	}

	public int searchPeople(String name) {// 1�� �Ѿ���� �� �ǹ��� 1���� ����� 1����..������ �ȵ�
		for (int i = 0; i < sIndex; i++) {
			if (silver[i].getName().equals(name)) {
				// grade =1;
				return i;
			}
		}
		for (int i = 0; i < gIndex; i++) {
			if (gold[i].getName().equals(name)) {
				// grade =2;
				return i + 10;
			}

		}
		for (int i = 0; i < vIndex; i++) {
			if (vip[i].getName().equals(name)) {
				// grade =3;
				return i + 100;
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
		} else if (searchIndex / 100 > 0) {
			searchIndex -= 100;
			System.out.println("��� : " + vip[searchIndex].getGrade());
			System.out.println("�̸� : " + vip[searchIndex].getName());
			System.out.println("����Ʈ : " + vip[searchIndex].getPoint());
			System.out.println("���ʽ� : " + vip[searchIndex].getDpoint());

		} else if (searchIndex / 10 > 0) {
			searchIndex -= 10;
			System.out.println("��� : " + gold[searchIndex].getGrade());
			System.out.println("�̸� : " + gold[searchIndex].getName());
			System.out.println("����Ʈ : " + gold[searchIndex].getPoint());
			System.out.println("���ʽ� : " + gold[searchIndex].getDpoint());
		} else {
			System.out.println("��� : " + silver[searchIndex].getGrade());
			System.out.println("�̸� : " + silver[searchIndex].getName());
			System.out.println("����Ʈ : " + silver[searchIndex].getPoint());
			System.out.println("���ʽ� : " + silver[searchIndex].getDpoint());
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
			if (searchIndex / 100 == 1) {// ���� ����� vip
				searchIndex -= 100;
				System.out.println("������ ��� �Է�[silver/gold/vip]");
				String nGrade = sc.next().toLowerCase();
				System.out.print("������ �̸� �Է� :");
				String nName = sc.next();
				System.out.println("������ ����Ʈ �Է� : ");
				int nPoint = sc.nextInt();
				if (nGrade.equals("vip")) {// ������ް� �������� ���� ���
					// ��� ��ȭ�� �����Ƿ� grade�� setter�� ȣ������ ����
					vip[searchIndex].setName(nName);
					vip[searchIndex].setPoint(nPoint);
				} else {// ������ް� �������� �ٸ� ���
						// vip�迭���� �ش� ȸ�� ����
					for (int i = searchIndex; i < vIndex-1; i++) {
						vip[i] = vip[i + 1];
					}
					vip[--vIndex] = null;
					switch (nGrade) {
					case "gold":
						gold[gIndex] = new Gold(nGrade, nName, nPoint);
						gIndex++;
						break;
					case "silver":
						silver[sIndex++] = new Silver(nGrade, nName, nPoint);

						break;

					}

				}
			} else if (searchIndex / 10 == 1) {// ���� ����� ���
				searchIndex -= 10;
				System.out.println("������ ��� �Է�[silver/gold/vip]");
				String nGrade = sc.next().toLowerCase();
				System.out.print("������ �̸� �Է� :");
				String nName = sc.next();
				System.out.println("������ ����Ʈ �Է� : ");
				int nPoint = sc.nextInt();
				if (nGrade.equals("gold")) {// ������ް� �������� ���� ���
					// ��� ��ȭ�� �����Ƿ� grade�� setter�� ȣ������ ����
					gold[searchIndex].setName(nName);
					gold[searchIndex].setPoint(nPoint);
				} else {// ������ް� �������� �ٸ� ���
						// gold�迭���� �ش� ȸ�� ����
					for (int i = searchIndex; i < gIndex-1; i++) {
						gold[i] = gold[i + 1];
					}
					gold[--gIndex] = null;
					switch (nGrade) {
					case "vip":
						vip[vIndex] = new Vip(nGrade, nName, nPoint);
						vIndex++;
						break;
					case "silver":
						silver[sIndex++] = new Silver(nGrade, nName, nPoint);

						break;
					}
				}

			}

			else {// ��������� �ǹ�
				System.out.println("������ ��� �Է�[silver/gold/vip]");
				String nGrade = sc.next().toLowerCase();
				System.out.print("������ �̸� �Է� :");
				String nName = sc.next();
				System.out.println("������ ����Ʈ �Է� : ");
				int nPoint = sc.nextInt();
				if (nGrade.equals("silver")) {// ������ް� �������� ���� ���
					// ��� ��ȭ�� �����Ƿ� grade�� setter�� ȣ������ ����
					gold[searchIndex].setName(nName);
					gold[searchIndex].setPoint(nPoint);
				} else {// ������ް� �������� �ٸ� ���
						// gold�迭���� �ش� ȸ�� ����
					for (int i = searchIndex; i < sIndex-1; i++) {
						silver[i] = silver[i + 1];
					}
					silver[--sIndex] = null;
					switch (nGrade) {
					case "vip":
						vip[vIndex] = new Vip(nGrade, nName, nPoint);
						vIndex++;
						break;
					case "gold":
						silver[sIndex++] = new Gold(nGrade, nName, nPoint);

						break;

					}
				}
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
		}
		else if (searchIndex / 100 > 0) {
			for (int i = searchIndex - 100; i < vIndex - 1; i++) {
				vip[i] = vip[i + 1];
			}
			vip[vIndex - 1] = null;
			vIndex--;
		}
		else if(searchIndex / 10 > 0) {
			for (int i = searchIndex - 10; i < gIndex - 1; i++) {
				gold[i] = gold[i + 1];
			}
			gold[gIndex - 1] = null;
			gIndex--;
		}

		else {
			for (int i = searchIndex; i < sIndex - 1; i++) {
				silver[i] = silver[i + 1];
			}
			silver[sIndex - 1] = null;
			sIndex--;
		}
	}

}
