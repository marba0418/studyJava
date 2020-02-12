package kr.or.iei.controller;

import java.util.Scanner;//��ĳ�ʸ� ������.
import kr.or.iei.point.Gold;//��� Ŭ���� �ڷḦ ������.
import kr.or.iei.point.Silver;//�ǹ� Ŭ���� �ڷḦ ������.
import kr.or.iei.point.Vip;//vipŬ���� �ڷḦ ������.

public class Test {//������ /Ŭ���� ����
	Silver[] silver = new Silver[10];//ũ�Ⱑ 10�� silver �迭����
	int sIndex;//�ǹ��迭 ���� ����
	Gold[] gold = new Gold[10];//ũ�Ⱑ 10�� ��� �迭 ����
	int gIndex;//��� �迭 ���� ����
	Vip[] vip = new Vip[10];//ũ�Ⱑ 10�� vip �迭 ����
	int vIndex;//vip �迭 ���� ����
	int grade;// ����� ������ �����Ѵ�. silver ==1, gold ==2, vip ==3
	Scanner sc = new Scanner(System.in);//��ĳ�ʸ� �� �� ����

	public void main() {//��ȯ�� �޼ҵ��(�Ű�����)
		while (true) {//�Ʒ��� ������ true �϶� ����
			System.out.println("======�������� �޴�======");//~~���
			System.out.println("1.ȸ������");//~~���
			System.out.println("2.ȸ���������(��ü)");//~~���
			System.out.println("3.ȸ���������(1��)");//~~���
			System.out.println("4.ȸ����������");//~~���
			System.out.println("5.ȸ��Ż��");//~~���
			System.out.println("0.���α׷� ���� ");//~~���
			int select = sc.nextInt();//Ű���尪�� 1~6�� ������ switch ���� ���� 

			switch (select) {//Ű���尪 ���� �� �Ʒ��� ������ �ݺ����� �����Ѵ�.
			case 1://1�� Ű���尪�� ȸ�������̹Ƿ�..
				insertPeople();//�Ű������� ���ش�.
				break;//�극��ũ�� ���������� ���̽�1�� �ݺ��ϹǷ� �ɾ��ش�.
			case 2:
				printAllPeople();//�Ű������� ���ش�.
				break;//�극��ũ�� ���������� ���̽�2�� �ݺ��ϹǷ� �ɾ��ش�.
			case 3:
				printOnePeople();//�Ű������� ���ش�.
				break;//�극��ũ�� ���������� ���̽�3�� �ݺ��ϹǷ� �ɾ��ش�.
			case 4:
				modifyPeople();//�Ű������� ���ش�.
				break;//�극��ũ�� ���������� ���̽�4�� �ݺ��ϹǷ� �ɾ��ش�.
			case 5:
				deletePeople();//�Ű������� ���ش�.
				break;//�극��ũ�� ���������� ���̽�5�� �ݺ��ϹǷ� �ɾ��ش�.
			case 6:
				break;//�극��ũ�� ���������� ���̽�6�� �ݺ��ϹǷ� �ɾ��ش�.
			default://1-6���� �ش� ���� ���� ��� �Ʒ� ��¹� ����
				System.out.println("�ٽ� �Է����ּ���");
			}
		}
	}

	public void insertPeople() {//��ȯ�� �޼ҵ��(�Ű�����)
		System.out.println("=======ȸ�������Է� =======");//~~���
		System.out.println("ȸ�� ��� �Է� [Silver/Gold/Vip] : ");//~~���
		String grade = sc.next().toLowerCase();//Ű���忡 ���ڿ� ����� ���� �� ����(�ҹ��� �Է½�->�빮�ڷ� �ٲ���)

		String name = "";//name�� �������� �ʱⰪ�� �Ƚ��ָ�.. while �������ͼ� �ϴ��� name���� ���� null���� �������� �𸥴�.. �׷��� ����..
		while (true) {//�Ʒ����� ���̸� �����Ѵ�.
			System.out.println("ȸ�� �̸� �Է� : ");//~~���
			name = sc.next();//Ű���� ������ �̸��� �ִ´�.
			int result = searchPeople(name);//���� �̸��� �Ʒ� �ϴ� searchPeople���� ���Ѵ�.
			if (result == -1) {//�̷��� ���̰� ���� �ߺ��� �ƴϾ result==-1�� ǥ����
				break;//�ݺ����� �� �Ǹ�? �극��ũ�� �������´�.
			} else {//result���� -1�� �ƴ϶��
				System.out.println("�̹� ���Ե� ȸ���Դϴ�.");//~���
			}

		}
		System.out.println("ȸ�� ����Ʈ ���� �Է� : ");//~����Ʈ ���� ~���
		int point = sc.nextInt();//Ű����� ���� �Է��� �κ��� ������ ������ ���� 
		Silver person = new Silver(grade, name, point);//�Է��ؾ��� ���,�̸�,����Ʈ�� ����?���ش�
		switch (grade) {//��޺��� �����ϱ� ���� grade�� while �ݺ��� ����
		case "silver": //�ǹ��� ���
			//�ǹ����� ���, �̸� , ����Ʈ�� �ǹ� �迭�� �־��ش�.
			silver[sIndex++] = new Silver(grade, name, point);
			break;//�� �־��� ��� �극��ũ�� ��������
		case "gold"://����� ���
			//��� ���� ���, �̸�, ����Ʈ�� ��� �迭�� �־��ش�.
			gold[gIndex++] = new Gold(grade, name, point);
			break;// �� �־��� ��� �극��ũ�� ��������
		case "vip"://vip�� ���
			//vip ���� ���,����,����Ʈ�� vip�迭�� �־��ش�.
			vip[vIndex++] = new Vip(grade, name, point);
			break;
		}

	}

	public int searchPeople(String name) {//�޼ҵ� ���� �����ڷ��� (String name:�Ű�����)
		for (int i = 0; i < sIndex; i++) {//�����ڵ� i�� 0���� �����ϰ� �ǹ��� �迭�� 10�̹Ƿ� ������ ���ش�.(<10)
			if (silver[i].getName().equals(name)) {
				return i;//i���� �����Ѵ�.
			}
		}
		for (int i = 0; i < gIndex; i++) {//�����ڵ� i�� 0���� �����ϰ� ���� �迭�� 10�� �̹Ƿ� ���� ����(<10) 
			if (gold[i].getName().equals(name)) {//�̸��� ��� �迭���� ���ٸ�..
				//���⼭ 10�� ���(������ ����) i+10���� �����Ѵ�.�迭�� ���� ���� �� 1�� �ǹ��� 1���� ����� 1����  vip�� 1���� �𸣴ϱ�.. ���Ƿ� ����...���� 10���� 19����vip�� 100���� 109����.. �̰� 100���� ������..?
				return i + 10;
			}
		}
		for (int i = 0; i < vIndex; i++) {//�����ڵ�� i�� 0���� �����ϰ� vip�� �迭�� 10���̹Ƿ� ���� ����
			if (vip[i].getName().equals(name)) {//�̸��� vip �迭��? ���ٸ�...
				return i + 100;//
			}
		}
		return -1;//���ϰ��� -1�� �ش�.
	}

	public void printAllPeople() {//��� ȸ���� �� �� �ִ� �޼ҵ� ����
		System.out.println("========ȸ������ ���========");//~���
		System.out.println("���\t�̸�\t����Ʈ����\t���ʽ�����");//~���

		for (int i = 0; i < sIndex; i++) {//�ǹ� ������ 0���� 9���� �̹Ƿ� ���� �����ϰ�, �ʱⰪ�� 0����,�������� ���ش�.
			//getGrade,getName,getPoint,getDpoint�� �޼ҵ�� �����Ǿ������Ƿ� silver[i].getName �̷��� ��¹� �ۼ��Ѵ�.
			System.out.println(silver[i].getGrade() + "\t" + silver[i].getName() + "\t" + silver[i].getPoint() + "\t"
					+ silver[i].getDpoint());
		}
		for (int i = 0; i < gIndex; i++) {//��� ������ 0���� 9���� �̹Ƿ� ���� �����ϰ�, �ʱⰪ�� 0����,�������� ���ش�.
			//getGrade,getName,getPoint,getDpoint�� �޼ҵ�� �����Ǿ������Ƿ� gold[i].getName �̷��� ��¹� �ۼ��Ѵ�.
			System.out.println(gold[i].getGrade() + "\t" + gold[i].getName() + "\t" + gold[i].getPoint() + "\t"
					+ gold[i].getDpoint());
		}
		for (int i = 0; i < vIndex; i++) {//vip ������ 0���� 9���� �̹Ƿ� ���� �����ϰ�, �ʱⰪ�� 0����,�������� ���ش�.
			//getGrade,getName,getPoint,getDpoint�� �޼ҵ�� �����Ǿ������Ƿ� vip[i].getName �̷��� ��¹� �ۼ��Ѵ�.
			System.out.println(
					vip[i].getGrade() + "\t" + vip[i].getName() + "\t" + vip[i].getPoint() + "\t" + vip[i].getDpoint());
		}
	}

	public void printOnePeople() {//ȸ�� �Ѹ� �� �� �ִ� �޼ҵ� ����
		System.out.println("=======ȸ���������(1��)=======");//~���
		System.out.println("��ȸ�� ȸ���� �Է����ּ���");//~���
		String name = sc.next();//Ű���忡 ���� ���� �̸��� ����
		int searchIndex = searchPeople(name);//�� �̸��� searchIndex�� ���� 
		if (searchIndex == -1) {//??searchIndex�� -1�� ���ٸ�
			System.out.println("ȸ���� �������� �ʽ��ϴ�.");//ȸ���� ���� ���� ����
		} else if (searchIndex / 100 > 0) {// ���� searchIndex�� 100���� ���� ���� 0���� ũ�ٸ�
			searchIndex -= 100;//searchIndex���� 100�� �� ���� searchIndex�� ����
			System.out.println("��� : " + vip[searchIndex].getGrade());//���~
			System.out.println("�̸� : " + vip[searchIndex].getName());//���~
			System.out.println("����Ʈ : " + vip[searchIndex].getPoint());//���~
			System.out.println("���ʽ� : " + vip[searchIndex].getBonus());//���~
		} else if (searchIndex / 10 > 0) {//���� searchIndex�� 10���� ���� ���� 0���� ũ�ٸ�
			searchIndex -= 10;//searchIndex���� 10�� �� ���� searchIndex�� ����
			System.out.println("��� : " + gold[searchIndex].getGrade());//���~~
			System.out.println("�̸� : " + gold[searchIndex].getName());//���~~
			System.out.println("����Ʈ : " + gold[searchIndex].getPoint());//���~~
			System.out.println("���ʽ� : " + gold[searchIndex].getBonus());//���~~
		} else {//�� �� ������ �ش���� �����Ƿ� silver���� 
			System.out.println("��� : " + silver[searchIndex].getGrade());//���~~
			System.out.println("�̸� : " + silver[searchIndex].getName());//���~~
			System.out.println("����Ʈ : " + silver[searchIndex].getPoint());//���~~
			System.out.println("���ʽ� : " + silver[searchIndex].getBonus());//���~~
		}
	}

	public void deletePeople() {//ȸ�� ���� �� �� �ִ¸޼ҵ� ����
		System.out.println("=======ȸ��Ż��=======");//~���
		System.out.print("Ż�� �̸� �Է� : ");//ȸ�� Ż�� ���� ���
		String name = sc.next();//Ż�� Ű���尪 ����
		int searchIndex = searchPeople(name);//�̸��� ���ָ� �ε��� ������ ã�´� 
		if (searchIndex == -1) {
			System.out.println("ȸ���� �������� �ʽ��ϴ�.");
		} else if (searchIndex / 100 > 0) {
			for (int i = searchIndex - 100; i < vIndex - 1; i++) {
				vip[i] = vip[i + 1];
			}
			vip[vIndex - 1] = null;
			vIndex--;
		} else if (searchIndex / 10 > 0) {
			for (int i = searchIndex - 10; i < gIndex - 1; i++) {
				gold[i] = gold[i + 1];
			}
			gold[gIndex - 1] = null;//������ �迭 ���� �����ִ� �� 
			gIndex--;
		} else {
			for (int i = searchIndex; i < sIndex - 1; i++) {
				silver[i] = silver[i + 1];

			}
			silver[sIndex - 1] = null;
			sIndex--;
		}
	}

	public void modifyPeople() {
		System.out.println("======= ȸ�� ���� ���� =======");
		System.out.println("������ ȸ�� �Է� : ");
		String name = sc.next();
		int searchIndex = searchPeople(name);
		if (searchIndex == -1) {
			System.out.println("ȸ���� ���� ���� �ʽ��ϴ�.");
		} else {
			if (searchIndex / 100 == 1) {
				searchIndex -= 100;
				System.out.println("������ ��� �Է� [silver/gold/vip] : ");
				String nGrade = sc.next().toLowerCase();
				System.out.println("������ �̸� �Է� : ");
				String nName = sc.next();
				System.out.println("������ ����Ʈ �Է� : ");
				int nPoint = sc.nextInt();
				if (nGrade.equals("vip")) {
					vip[searchIndex].setName(nName);
					vip[searchIndex].setPoint(nPoint);

				} else {
					for (int i = searchIndex; i < vIndex; i++) {
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
			} else if (searchIndex / 10 == 1) {
				searchIndex -= 10;
				System.out.println(" ������ ��� �Է� [silver/gold/vip] : ");
				String nGrade = sc.next().toLowerCase();
				System.out.print("������ �̸� �Է� : ");
				String nName = sc.next();
				System.out.println("������ ����Ʈ �Է� : ");
				int nPoint = sc.nextInt();
				if (nGrade.equals("gold")) {
					gold[searchIndex].setName(nName);
					gold[searchIndex].setPoint(nPoint);
				} else {
					for (int i = searchIndex; i < gIndex; i++) {
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
			} else {
				System.out.println("������ ��� �Է� [silver/gold/vip]");
				String nGrade = sc.next().toLowerCase();
				System.out.print("������ �̸� �Է� : ");
				String nName = sc.next();
				System.out.println("������ ����Ʈ �Է� : ");
				int nPoint = sc.nextInt();
				if (nGrade.equals("silver")) {
					gold[searchIndex].setName(nName);
					gold[searchIndex].setPoint(nPoint);
				} else {
					for (int i = searchIndex; i < sIndex; i++) {
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

}
