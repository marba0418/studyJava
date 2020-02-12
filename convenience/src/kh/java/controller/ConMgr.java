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
	//배열명 iFood
	InstantFood[] iFood = new InstantFood[10];
	int iIndex;
	Snack[] s = new Snack[10];
	int sIndex;
	Medicine[] m = new Medicine[10];
	int mIndex;
	Goods[] etc = new Goods[10];
	int eIndex;
	// 카드 만든 데 어떻게?굿즈 배열로 카드로 만들꺼임 장바구니 배열
	// 구매하는 입장에서는 stock이
	Goods[] cart = new Goods[10];
	int cIndex;

	public ConMgr() {
		d[dIndex++] = new Drink(2000, 100, "스프라이트", false, 550, 300);
		d[dIndex++] = new Drink(3000, 50, "제로코크", false, 500, 0);
		d[dIndex++] = new Drink(5000, 80, "클라우드", true, 350, 400);// 클라우드는 성인이니까 true로 체크함

		iFood[iIndex++] = new InstantFood(4000, 5, "혜리도시락", false, "2020-02-12", 550);
		iFood[iIndex++] = new InstantFood(1200, 50, "틈새라면", false, "2022-02-12", 500);
		iFood[iIndex++] = new InstantFood(3000, 5, "즉석떡볶이", false, "2020-02-11", 550);

		s[sIndex++] = new Snack(1000, 20, "꼬북칩", false, 340, 80);
		s[sIndex++] = new Snack(2000, 17, "홈런볼", false, 240, 50);
		s[sIndex++] = new Snack(1700, 20, "썬칩", false, 315, 40);

		m[mIndex++] = new Medicine(3500, 25, "타이레놀", false, "2020-07-02");
		m[mIndex++] = new Medicine(1200, 20, "부채표!", false, "2020-07-02");

		etc[eIndex++] = new Goods(5000, 27, "우산", false);
		etc[eIndex++] = new Goods(2000, 30, "물티슈", false);
	}

	public void main() {
		// 들어온 사람이 알바인가 손님인가
		while (true) {
			System.out.println("----------GS25--------------");
			System.out.println("1.알바");
			System.out.println("2.손님");
			System.out.println("0.프로그램 종료");
			System.out.println("선택> ");
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
		System.out.println("어서오세요~");
		while(true) {
			System.out.println("1.쇼핑하기");
			System.out.println("2.장바구니 보기");
			System.out.println("0.뒤로가기");
			System.out.print("선택 > ");
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
		System.out.println("-------장바구니 --------");
		System.out.println("제품명\t가격\t수량");
		int totalPrice = 0;
		for(int i =0;i<cIndex;i++) {
			System.out.println(cart[i].getName()+"\t"+cart[i].getPrice()+"\t"+cart[i].getStock());
			
			totalPrice +=cart[i].getPrice()*cart[i].getStock();//가격이랑 재고를 곱하면 총 금액이 나옴
		}
		System.out.println("총 구매금액은"+totalPrice);
	}
	public void shopping() {
		while(true) {
			System.out.println("-------쇼핑하기 -------");
			System.out.println("1. 음료");
			System.out.println("2.즉석 식품");
			System.out.println("3.과자");
			System.out.println("4.의약품");
			System.out.println("5.기타");
			System.out.println("0. 이전으로");
			System.out.print("구매할 제품 카테고리를 선택하세요>");
			int select = sc.nextInt();
			switch(select) {//매개변수는 굿즈 배열로
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
		System.out.print("구매할 제품 번호 입력 : ");
		int index = sc.nextInt()-1;
		System.out.print("구매 개수를 입력 : ");
		int count = sc.nextInt();
		if(product[index].getStock()<count) {
			System.out.println("재고가 부족합니다.");
			System.out.println("이전 메뉴로 돌아갑니다.");
			return;
		}
		System.out.println("["+product[index].getName()+"] 제품"+count+"개를 선택하셨습니다.");
		System.out.print("장바구니에 담으시겠습니까?[y/n]");
		char sel = sc.next().charAt(0);
		if(sel =='y') {//카트의 타입은 굿즈
			//가격,재고,상품이름,성인인증 필요 유무
			int price = product[index].getPrice();
			int stock =count;
			String name = product[index].getName();
			boolean adult = product[index].getAdult();
			cart[cIndex++] = new Goods(price,stock,name,adult);
			product[index].setStock(product[index].getStock()-count);//구매하고  남은 개수
		}
	}

	public void alba() {
		while (true) {
			System.out.println("------일해라------");
			System.out.println("1.새 제품 등록");
			System.out.println("2.현재 재고 현황 보유");
			System.out.println("3.재고 변경");
			System.out.println("4.제품 삭제");
			System.out.println("0. 뒤로가기");
			System.out.println("선택 > ");
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
			System.out.println("=======제품 삭제 ======");
			System.out.println("1.음료");
			System.out.println("2.즉석 식품");
			System.out.println("3.과자");
			System.out.println("4.의약품");
			System.out.println("5.기타");
			System.out.println("0.뒤로가기");
			System.out.print("삭제할 제품 카테고리를 선택하세요");
			int select = sc.nextInt();//지울때 인덱스 배열 어디에 있는지 찾아야함
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
	public int deleteProduct(Goods[]product,int index) {//제품 배열과 제품 배열에 해당하는 인덱스 번호
		System.out.print("삭제할 제품의  No를 입력하세요");
		int selIndex = sc.nextInt()-1;//배열이라서 -1빼주는 거임
		System.out.println("["+product[selIndex].getName()+"] 제품을 선택하셨습니다.");
		System.out.print("해당 제품을 삭제하시겠습니까? [y/n]");
		char real = sc.next().charAt(0);
		if(real=='y') {
			for(int i =selIndex;i<index-1;i++) {
				product[i]=product[i+1];
			}
			product[index-1] = null;
			index--;
		}else {
			System.out.println("삭제작업취소");
		}
		return index;
		
	}

	public void updateProduct() {//다형성 이용
		while(true) {
			System.out.println("=======재고변경=======");
			System.out.println("1.음료 재고 변경");
			System.out.println("2.즉석 식품 재고 변경");
			System.out.println("3.과자 재고 변경");
			System.out.println("4.의약품 재고 변경");
			System.out.println("5.기타 상품 재고 변경");
			System.out.println("0.뒤로 가기");
			System.out.print("선택> ");
			int select =sc.nextInt();
			switch(select) {
			case 1:
				printDrink();
				updateProduct(d);//d 매개변경,오버로딩 개념
				
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

	public void updateProduct(Goods[] product) {//배열이 5개 있지만 한번에 처리할 수 있다.(이 메소드 핵심임)
		//굿즈를 상속받아서 드링크지만 굿즈로 써줌
		System.out.print("재고를 변경할 상품의 NO를 선택해주세요 > ");
		int index = sc.nextInt()-1;//숫자는 1부터 인데 배열은 0부터니까 배열 맞춰주려고 -1
		System.out.println("["+product[index].getName()+"]을 선택하였습니다.");
		System.out.println("현재 재고는 "+product[index].getStock()+"개 입니다.");
		System.out.println("수정할 재고량을 입력해주세요");
		int nStock = sc.nextInt();
		product[index].setStock(nStock);//재고는 set으로 받음 ,다형성이기때문에 가능 
		System.out.println("재고변경 완료");
		// TODO Auto-generated method stub
		
	}

	private void insertProduct() {


		while (true) {
			System.out.println("------상품등록--------");
			System.out.println("1.음료 등록");
			System.out.println("2.즉석 식품 등록");
			System.out.println("3.과자 등록");
			System.out.println("4.의약품 등록");
			System.out.println("5.기타 상품 등록");
			System.out.println("0.이전으로");
			System.out.print("선택 >");
			int select = sc.nextInt();
			if(select==0) {
				return;
			}else if(0<select&&select<6) {
				System.out.print("상품명을 입력하세요 : ");
				String name = sc.next();
				System.out.print("상품 가격을 입력하세요 : ");
				int price = sc.nextInt();
				System.out.println("수량을 입력하세요 : ");
				int stock = sc.nextInt();
				System.out.print("술입니까?[y/n]");
				char ch = sc.next().charAt(0);
				boolean adult = (ch=='y')?true:false;//삼항 연산자
				switch(select) {
				case 1 :
					System.out.println("음료의 용량을 입력하세요(ml) : " );
					int amount = sc.nextInt();
					System.out.println("칼로리를 입력하세요(kcal) : ");
					int kcal = sc.nextInt();
					d[dIndex++] = new Drink(price,stock,name,adult,amount,kcal);
					break;
				case 2 :
					System.out.print("유통기한을 입력하세요(yyyy-mm-dd) : ");
					String expired = sc.next();
					System.out.print("칼로리를 입력하세요(kcal) : ");
					int kcal1 = sc.nextInt();
					iFood[iIndex++] = new InstantFood(price,stock, name, adult, expired, kcal1);
					break;
				case 3 :
					System.out.print("칼로리를 입력하세요(kcal) : ");
					int kcal2 = sc.nextInt();
					System.out.println("무게를 입력하세요 (g) : ");
					int weight = sc.nextInt();
					s[sIndex++] = new Snack(price, stock, name, adult, kcal2, weight);
					break;
				case 4 :
					System.out.println("유통기한을 입력하세요(yyyy-mm-dd) : ");
					String expired1 = sc.next();
					m[mIndex++] = new Medicine(price, stock, name, adult, expired1);
					break;
				case 5 :
					etc[eIndex++] = new Goods(price, stock, name, adult);
					
					break;
				}
			}else {
				System.out.println("잘못입력하셨습니다.");
			}

		}

	}
	public void printDrink() {
		System.out.println("=====음료 =====");
		System.out.println("NO\t제품명\t가격\t재고\t성인여부\t용량\t칼로리");
		for(int i =0;i<dIndex;i++) {//(d[i].getAdult()?"o":"x")
			System.out.println((i+1)+"\t"+d[i].getName()+"\t"+d[i].getPrice()+"\t"+d[i].getStock()+"\t"+d[i].getAdult()+"\t"+d[i].getAmount()+"\t"+d[i].getKcal());
		}
		
	}
	public void printInstantFood() {
		System.out.println("=======즉석음식==========");
		System.out.println("NO\t제품명\t가격\t재고\t성인여부\t유통기한\t칼로리");
		for(int  i= 0;i<iIndex;i++) {
			System.out.println((i+1)+"\t"+iFood[i].getName()+"\t"+iFood[i].getPrice()+"\t"+iFood[i].getStock()+"\t"+iFood[i].getAdult()+"\t"+iFood[i].getExpired()+"\t"+iFood[i].getKcal());
		}
		
	}
	public void printSnack() {
		System.out.println("=======과자==========");
		System.out.println("NO\t제품명\t가격\t재고\t성인여부\t칼로리\t무게");
		for(int i = 0;i<sIndex;i++) {
			System.out.println((i+1)+"\t"+s[i].getName()+"\t"+s[i].getPrice()+"\t"+s[i].getStock()+"\t"+s[i].getAdult()+"\t"+s[i].getKcal()+"\t"+s[i].getWeight());
			
		}
	}
	public void printMedicine() {
		System.out.println("=======의약품 ========");
		System.out.println("NO\t제품명\t가격\t재고\t성인여부\t유통기한");
		for(int i = 0;i<mIndex;i++) {
			System.out.println((i+1)+"\t"+m[i].getName()+"\t"+m[i].getPrice()+"\t"+m[i].getStock()+"\t"+m[i].getAdult()+"\t"+m[i].getExpired());
		}
		
		
	}
	public void printEtc() {
		System.out.println("=======기타 ========");
		System.out.println("NO\t제품명\t가격\t재고\t성인여부\t");
		for(int i = 0;i<eIndex;i++) {
			System.out.println((i+1)+"\t"+etc[i].getName()+"\t"+etc[i].getPrice()+"\t"+etc[i].getStock()+"\t"+etc[i].getAdult());
		}
		
		
	}
	

}
