package kh.java.controller;

import java.util.Scanner;

import kh.java.vo.Drink;
import kh.java.vo.Goods;
import kh.java.vo.InstantFood;
import kh.java.vo.Medicine;
import kh.java.vo.Snack;

public class ConMgr {
	Scanner sc = new Scanner(System.in);
	Drink[] d = new Drink[10];
	int dIndex;
	//�迭�� iFood
	InstantFood[] iFood = new InstantFood[10];
	int iIndex;
	Snack[] s = new Snack[10];
	int sIndex;
	Medicine[] m = new Medicine[10];
	int mIndex;
	Goods[] etc = new Goods[10];
	int eIndex;
	// ī�� ���� �� ���?���� �迭�� ī��� ���鲨�� ��ٱ��� �迭
	// �����ϴ� ���忡���� stock��
	Goods[] cart = new Goods[10];
	int cIndex;

	public ConMgr() {
		d[dIndex++] = new Drink(2000, 100, "��������Ʈ", false, 550, 300);
		d[dIndex++] = new Drink(3000, 50, "������ũ", false, 500, 0);
		d[dIndex++] = new Drink(5000, 80, "Ŭ����", true, 350, 400);// Ŭ����� �����̴ϱ� true�� üũ��

		iFood[iIndex++] = new InstantFood(4000, 5, "�������ö�", false, "2020-02-12", 550);
		iFood[iIndex++] = new InstantFood(1200, 50, "ƴ�����", false, "2022-02-12", 500);
		iFood[iIndex++] = new InstantFood(3000, 5, "�Ｎ������", false, "2020-02-11", 550);

		s[sIndex++] = new Snack(1000, 20, "����Ĩ", false, 340, 80);
		s[sIndex++] = new Snack(2000, 17, "Ȩ����", false, 240, 50);
		s[sIndex++] = new Snack(1700, 20, "��Ĩ", false, 315, 40);

		m[mIndex++] = new Medicine(3500, 25, "Ÿ�̷���", false, "2020-07-02");
		m[mIndex++] = new Medicine(1200, 20, "��äǥ!", false, "2020-07-02");

		etc[eIndex++] = new Goods(5000, 27, "���", false);
		etc[eIndex++] = new Goods(2000, 30, "��Ƽ��", false);
	}

	public void main() {
		// ���� ����� �˹��ΰ� �մ��ΰ�
		while (true) {
			System.out.println("----------GS25--------------");
			System.out.println("1.�˹�");
			System.out.println("2.�մ�");
			System.out.println("0.���α׷� ����");
			System.out.println("����> ");
			int select = sc.nextInt();
			System.out.println();
			switch (select) {
			case 1:
				alba();
				break;
			case 2:
				client();
				break;
			case 0:
				return;
			}
		}

	}
	public void client() {
		System.out.println("�������~");
		while(true) {
			System.out.println("1.�����ϱ�");
			System.out.println("2.��ٱ��� ����");
			System.out.println("0.�ڷΰ���");
			System.out.print("���� > ");
			int select =sc.nextInt();
			switch(select) {
			case 1:
				shopping();
				break;
			case 2:
				shoppingList();			
				break;
			case 0 :
				return;
			}
		}
	}
	public void shoppingList() {
		System.out.println("-------��ٱ��� --------");
		System.out.println("��ǰ��\t����\t����");
		int totalPrice = 0;
		for(int i =0;i<cIndex;i++) {
			System.out.println(cart[i].getName()+"\t"+cart[i].getPrice()+"\t"+cart[i].getStock());
			
			totalPrice +=cart[i].getPrice()*cart[i].getStock();//�����̶� ��� ���ϸ� �� �ݾ��� ����
		}
		System.out.println("�� ���űݾ���"+totalPrice);
	}
	public void shopping() {
		while(true) {
			System.out.println("-------�����ϱ� -------");
			System.out.println("1. ����");
			System.out.println("2.�Ｎ ��ǰ");
			System.out.println("3.����");
			System.out.println("4.�Ǿ�ǰ");
			System.out.println("5.��Ÿ");
			System.out.println("0. ��������");
			System.out.print("������ ��ǰ ī�װ��� �����ϼ���>");
			int select = sc.nextInt();
			switch(select) {//�Ű������� ���� �迭��
			case 1:
				printDrink();
				buing(d);
				break;
			case 2:
				printInstantFood();
				buing(iFood);
				break;
			case 3:
				printSnack();
				buing(s);
				break;
			case 4:
				printMedicine();
				buing(m);
				break;
			case 5:
				printEtc();
				buing(etc);
				break;
			case 0:
				return;
			}
		}
	}
	public void buing(Goods[]product) {
		System.out.print("������ ��ǰ ��ȣ �Է� : ");
		int index = sc.nextInt()-1;
		System.out.print("���� ������ �Է� : ");
		int count = sc.nextInt();
		if(product[index].getStock()<count) {
			System.out.println("��� �����մϴ�.");
			System.out.println("���� �޴��� ���ư��ϴ�.");
			return;
		}
		System.out.println("["+product[index].getName()+"] ��ǰ"+count+"���� �����ϼ̽��ϴ�.");
		System.out.print("��ٱ��Ͽ� �����ðڽ��ϱ�?[y/n]");
		char sel = sc.next().charAt(0);
		if(sel =='y') {//īƮ�� Ÿ���� ����
			//����,���,��ǰ�̸�,�������� �ʿ� ����
			int price = product[index].getPrice();
			int stock =count;
			String name = product[index].getName();
			boolean adult = product[index].getAdult();
			cart[cIndex++] = new Goods(price,stock,name,adult);
			product[index].setStock(product[index].getStock()-count);//�����ϰ�  ���� ����
		}
	}

	public void alba() {
		while (true) {
			System.out.println("------���ض�------");
			System.out.println("1.�� ��ǰ ���");
			System.out.println("2.���� ��� ��Ȳ ����");
			System.out.println("3.��� ����");
			System.out.println("4.��ǰ ����");
			System.out.println("0. �ڷΰ���");
			System.out.println("���� > ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				insertProduct();
				break;
			case 2:
				printDrink();
				printInstantFood();
				printSnack();
				printMedicine();
				printEtc();
				break;
			case 3:
				updateProduct();
				break;
			case 4:
				deleteProduct();
				break;
			case 0:
				return;
			default:
			}

		}

	}
	public void deleteProduct() {
		while(true) {
			System.out.println("=======��ǰ ���� ======");
			System.out.println("1.����");
			System.out.println("2.�Ｎ ��ǰ");
			System.out.println("3.����");
			System.out.println("4.�Ǿ�ǰ");
			System.out.println("5.��Ÿ");
			System.out.println("0.�ڷΰ���");
			System.out.print("������ ��ǰ ī�װ��� �����ϼ���");
			int select = sc.nextInt();//���ﶧ �ε��� �迭 ��� �ִ��� ã�ƾ���
			switch(select) {
			case 1:
				printDrink();
				dIndex = deleteProduct(d,dIndex);
				break;
			case 2:
				printInstantFood();
				iIndex =deleteProduct(iFood, iIndex);
				break;
			case 3:
				printSnack();
				sIndex = deleteProduct(s, sIndex);
				break;
			case 4:
				printMedicine();
				mIndex =deleteProduct(m, mIndex);
				break;
			case 5:
				printEtc();
				eIndex = deleteProduct(etc, eIndex);
				break;
			case 0 :
				return;
			}
		}
	}
	public int deleteProduct(Goods[]product,int index) {//��ǰ �迭�� ��ǰ �迭�� �ش��ϴ� �ε��� ��ȣ
		System.out.print("������ ��ǰ��  No�� �Է��ϼ���");
		int selIndex = sc.nextInt()-1;//�迭�̶� -1���ִ� ����
		System.out.println("["+product[selIndex].getName()+"] ��ǰ�� �����ϼ̽��ϴ�.");
		System.out.print("�ش� ��ǰ�� �����Ͻðڽ��ϱ�? [y/n]");
		char real = sc.next().charAt(0);
		if(real=='y') {
			for(int i =selIndex;i<index-1;i++) {
				product[i]=product[i+1];
			}
			product[index-1] = null;
			index--;
		}else {
			System.out.println("�����۾����");
		}
		return index;
		
	}

	public void updateProduct() {//������ �̿�
		while(true) {
			System.out.println("=======�����=======");
			System.out.println("1.���� ��� ����");
			System.out.println("2.�Ｎ ��ǰ ��� ����");
			System.out.println("3.���� ��� ����");
			System.out.println("4.�Ǿ�ǰ ��� ����");
			System.out.println("5.��Ÿ ��ǰ ��� ����");
			System.out.println("0.�ڷ� ����");
			System.out.print("����> ");
			int select =sc.nextInt();
			switch(select) {
			case 1:
				printDrink();
				updateProduct(d);//d �Ű�����,�����ε� ����
				
				break;
			case 2:
				printInstantFood();
				updateProduct(iFood);
				break;
			case 3:
				printSnack();
				updateProduct(s);
				break;
			case 4:
				printMedicine();
				updateProduct(m);
				break;
			case 5:
				printEtc();
				updateProduct(etc);
				break;
			case 0:
				return;
			}
		}
		// TODO Auto-generated method stub
		
	}

	public void updateProduct(Goods[] product) {//�迭�� 5�� ������ �ѹ��� ó���� �� �ִ�.(�� �޼ҵ� �ٽ���)
		//��� ��ӹ޾Ƽ� �帵ũ���� ����� ����
		System.out.print("��� ������ ��ǰ�� NO�� �������ּ��� > ");
		int index = sc.nextInt()-1;//���ڴ� 1���� �ε� �迭�� 0���ʹϱ� �迭 �����ַ��� -1
		System.out.println("["+product[index].getName()+"]�� �����Ͽ����ϴ�.");
		System.out.println("���� ���� "+product[index].getStock()+"�� �Դϴ�.");
		System.out.println("������ ����� �Է����ּ���");
		int nStock = sc.nextInt();
		product[index].setStock(nStock);//���� set���� ���� ,�������̱⶧���� ���� 
		System.out.println("����� �Ϸ�");
		// TODO Auto-generated method stub
		
	}

	private void insertProduct() {


		while (true) {
			System.out.println("------��ǰ���--------");
			System.out.println("1.���� ���");
			System.out.println("2.�Ｎ ��ǰ ���");
			System.out.println("3.���� ���");
			System.out.println("4.�Ǿ�ǰ ���");
			System.out.println("5.��Ÿ ��ǰ ���");
			System.out.println("0.��������");
			System.out.print("���� >");
			int select = sc.nextInt();
			if(select==0) {
				return;
			}else if(0<select&&select<6) {
				System.out.print("��ǰ���� �Է��ϼ��� : ");
				String name = sc.next();
				System.out.print("��ǰ ������ �Է��ϼ��� : ");
				int price = sc.nextInt();
				System.out.println("������ �Է��ϼ��� : ");
				int stock = sc.nextInt();
				System.out.print("���Դϱ�?[y/n]");
				char ch = sc.next().charAt(0);
				boolean adult = (ch=='y')?true:false;//���� ������
				switch(select) {
				case 1 :
					System.out.println("������ �뷮�� �Է��ϼ���(ml) : " );
					int amount = sc.nextInt();
					System.out.println("Į�θ��� �Է��ϼ���(kcal) : ");
					int kcal = sc.nextInt();
					d[dIndex++] = new Drink(price,stock,name,adult,amount,kcal);
					break;
				case 2 :
					System.out.print("��������� �Է��ϼ���(yyyy-mm-dd) : ");
					String expired = sc.next();
					System.out.print("Į�θ��� �Է��ϼ���(kcal) : ");
					int kcal1 = sc.nextInt();
					iFood[iIndex++] = new InstantFood(price,stock, name, adult, expired, kcal1);
					break;
				case 3 :
					System.out.print("Į�θ��� �Է��ϼ���(kcal) : ");
					int kcal2 = sc.nextInt();
					System.out.println("���Ը� �Է��ϼ��� (g) : ");
					int weight = sc.nextInt();
					s[sIndex++] = new Snack(price, stock, name, adult, kcal2, weight);
					break;
				case 4 :
					System.out.println("��������� �Է��ϼ���(yyyy-mm-dd) : ");
					String expired1 = sc.next();
					m[mIndex++] = new Medicine(price, stock, name, adult, expired1);
					break;
				case 5 :
					etc[eIndex++] = new Goods(price, stock, name, adult);
					
					break;
				}
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}

		}

	}
	public void printDrink() {
		System.out.println("=====���� =====");
		System.out.println("NO\t��ǰ��\t����\t���\t���ο���\t�뷮\tĮ�θ�");
		for(int i =0;i<dIndex;i++) {//(d[i].getAdult()?"o":"x")
			System.out.println((i+1)+"\t"+d[i].getName()+"\t"+d[i].getPrice()+"\t"+d[i].getStock()+"\t"+d[i].getAdult()+"\t"+d[i].getAmount()+"\t"+d[i].getKcal());
		}
		
	}
	public void printInstantFood() {
		System.out.println("=======�Ｎ����==========");
		System.out.println("NO\t��ǰ��\t����\t���\t���ο���\t�������\tĮ�θ�");
		for(int  i= 0;i<iIndex;i++) {
			System.out.println((i+1)+"\t"+iFood[i].getName()+"\t"+iFood[i].getPrice()+"\t"+iFood[i].getStock()+"\t"+iFood[i].getAdult()+"\t"+iFood[i].getExpired()+"\t"+iFood[i].getKcal());
		}
		
	}
	public void printSnack() {
		System.out.println("=======����==========");
		System.out.println("NO\t��ǰ��\t����\t���\t���ο���\tĮ�θ�\t����");
		for(int i = 0;i<sIndex;i++) {
			System.out.println((i+1)+"\t"+s[i].getName()+"\t"+s[i].getPrice()+"\t"+s[i].getStock()+"\t"+s[i].getAdult()+"\t"+s[i].getKcal()+"\t"+s[i].getWeight());
			
		}
	}
	public void printMedicine() {
		System.out.println("=======�Ǿ�ǰ ========");
		System.out.println("NO\t��ǰ��\t����\t���\t���ο���\t�������");
		for(int i = 0;i<mIndex;i++) {
			System.out.println((i+1)+"\t"+m[i].getName()+"\t"+m[i].getPrice()+"\t"+m[i].getStock()+"\t"+m[i].getAdult()+"\t"+m[i].getExpired());
		}
		
		
	}
	public void printEtc() {
		System.out.println("=======��Ÿ ========");
		System.out.println("NO\t��ǰ��\t����\t���\t���ο���\t");
		for(int i = 0;i<eIndex;i++) {
			System.out.println((i+1)+"\t"+etc[i].getName()+"\t"+etc[i].getPrice()+"\t"+etc[i].getStock()+"\t"+etc[i].getAdult());
		}
		
		
	}
	

}
