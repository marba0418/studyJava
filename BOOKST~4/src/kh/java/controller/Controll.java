package kh.java.controller;

import java.util.Scanner;

import kh.java.vo.Books;
import kh.java.vo.Economics;
import kh.java.vo.EduBook;
import kh.java.vo.NAndE;

public class Controll {
	Scanner sc = new Scanner(System.in);

	// Books[] to = new Books[90];
	// int tIndex;

	NAndE[] ne = new NAndE[30];
	int nIndex;

	Economics[] eco = new Economics[30];
	int cIndex;

	EduBook[] edu = new EduBook[30];
	int dIndex;

	Books[] cart = new Books[30];
	int ctIndex;

	int point; // 회원의 point를 기록할 변수
	
	public Controll() {
		ne[nIndex++] = new NAndE("나미야 잡화점의 기적", "히가시노 게이고", "현대문학", 13320, 8);
		ne[nIndex++] = new NAndE("82년생 김지영", "조남주", "현대소설", 11000, 5);
		ne[nIndex++] = new NAndE("나는 나로 살기로 했다", "김수현", "에세이", 14850, 6);
		ne[nIndex++] = new NAndE("꽃을 보듯 너를 본다", "나태주", "시", 9000, 9);
		
		eco[cIndex++] = new Economics("부의감각", "댄 앨리얼리", "경제", 16200, 7);
		eco[cIndex++] = new Economics("1달러의 세계경제 여행", "다르니시 데이비드", "경제", 14850, 2);
		eco[cIndex++] = new Economics("미니멀 경제학", "한진수", "경제", 13500, 4);
		
		edu[dIndex++] = new EduBook("2020 시나공 정보처리기사 필기", "길벗", "수험서", 27900, 1);
		edu[dIndex++] = new EduBook("EBS 수능특강 독서+사용설명서 세트", "한국교육방송공사", "자습서", 19530, 3);
		edu[dIndex++] = new EduBook("The Python", "허진경", "BOOKK", 22000, 1);
				
	}

	public void main() {
		while (true) {
			System.out.println("서점 관리 프로그램");
			System.out.println("1. 직원");
			System.out.println("2. 손님");
			System.out.print("선택 > ");
			int slt = sc.nextInt();

			switch (slt) {
			case 1:
				staff();
				break;

			case 2:
				customer();
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	public void staff() {

		while (true) {
			System.out.println("===== 직원 메뉴 =====");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 현황");
			System.out.println("3. 도서 관리");
			System.out.println("4. 도서 삭제");
			System.out.println("0. 뒤로가기");
			System.out.print("선택 > ");
			int slt = sc.nextInt();

			switch (slt) {
			case 1: // 도서 등록
				insertBook();
				break;

			case 2: // 도서 현황
				break;

			case 3: // 도서 관리
				modBook();
				break;

			case 4: // 도서 삭제
				deleteBook();
				break;

			case 0: // 뒤로가기
				System.out.println("이전으로 이동합니다");
				return;

			default:
				System.out.println("잘못 입력하셨습니다.");
			}

		}

	}

	public void customer() {

		while (true) {

			System.out.println("===== 손님 메뉴 =====");
			System.out.println("1. 쇼핑하기");
			System.out.println("2. 장바구니");
			System.out.println("3. 포인트 보기");
			System.out.println("0. 뒤로가기");
			System.out.print("선택 > ");
			int slt = sc.nextInt();

			switch (slt) {
			case 1: // 쇼핑하기
				shoppingBook();
				break;

			case 2: // 장바구니
				showCart();
				break;

			case 3: // 포인트 보기
				showPoint();
				break;

			case 0: // 뒤로가기
				System.out.println("이전으로 이동합니다");
				return;

			default:
				System.out.println("잘못 입력하셨습니다.");

			}
		}
	}

	public void insertBook() {

		while (true) {

			System.out.println("======== 도서 등록 카테고리 ========");
			System.out.println("1. 소설 or 에세이");
			System.out.println("2. 경제");
			System.out.println("3. 학습서");
			System.out.println("0. 뒤로가기");
			int slt = sc.nextInt();

			System.out.println("등록할 도서의 정보를 입력해주세요.");

			sc.nextLine();
			System.out.print("도서 이름 : ");
			String name = sc.nextLine();

			System.out.print("저자명 : ");
			String writer = sc.next();

			System.out.print("장르 : ");
			String genre = sc.next();

			System.out.print("가격 : ");
			int price = sc.nextInt();

			System.out.print("수량 : ");
			int stock = sc.nextInt();

			switch (slt) {
			case 1: // 소설 or 에세이 ne 배열
				ne[nIndex++] = new NAndE(name, writer, genre, price, stock);
				return;

			case 2: // 경제 eco 배열
				eco[cIndex++] = new Economics(name, writer, genre, price, stock);
				return;

			case 3: // 학습서 edu 배열
				edu[dIndex++] = new EduBook(name, writer, genre, price, stock);
				return;

			case 0:
				System.out.println("이전 메뉴로 이동합니다");
				return;
			}
		}
	}

	public void modBook() {

		while (true) {

			System.out.println("======== 도서 관리 카테고리 ========");
			System.out.println("1. 소설 or 에세이");
			System.out.println("2. 경제");
			System.out.println("3. 학습서");
			System.out.println("0. 뒤로가기");
			int num1 = sc.nextInt();

			int num2;

			int index = 0;

			switch (num1) {
			case 1:
				printNE();
				System.out.print("수정할 도서의 no.를 입력하세요 : ");
				num2 = sc.nextInt() - 1;
				modDetail(ne, num2);
				break;

			case 2:
				printEco();
				System.out.print("수정할 도서의 no.를 입력하세요 : ");
				num2 = sc.nextInt() - 1;
				modDetail(eco, num2);
				break;

			case 3:
				printEdu();
				System.out.print("수정할 도서의 no.를 입력하세요 : ");
				num2 = sc.nextInt() - 1;
				modDetail(edu, num2);
				break;

			case 0:
				System.out.println("이전 메뉴로 이동합니다.");
				return;

			default:
				System.out.println("잘못 입력하셨습니다.");
			}

		}
	}

	public void modDetail(Books[] book, int index) {

		while (true) {
			System.out.println("[" + book[index].getName() + "]을 선택하셨습니다.");
			System.out.println("무엇을 수정하시겠습니까 ?");
			System.out.println("1. 도서 이름");
			System.out.println("2. 도서 저자");
			System.out.println("3. 도서 장르");
			System.out.println("4. 도서 가격");
			System.out.println("5. 도서 수량");
			System.out.println("0. 뒤로가기");
			System.out.print("선택 > ");

			int slt = sc.nextInt();

			switch (slt) {
			case 1:
				sc.nextLine();
				System.out.println("현재 도서명: " + book[index].getName());
				System.out.print("수정할 도서명을 입력하세요 : ");
				book[index].setName(sc.nextLine());
				break;

			case 2:
				System.out.println("현재 저자: " + book[index].getWriter());
				System.out.print("수정할 저자명을 입력하세요 : ");
				book[index].setWriter(sc.next());
				break;

			case 3:
				sc.nextLine();
				System.out.println("현재 장르: " + book[index].getGenre());
				System.out.print("수정할 장르를 입력하세요 : ");
				book[index].setGenre(sc.nextLine());
				break;

			case 4:
				System.out.println("현재 가격 : " + book[index].getPrice());
				System.out.print("수정할 가격을 입력하세요 : ");
				book[index].setPrice(sc.nextInt());
				break;

			case 5:
				System.out.println("현재 수량 : " + book[index].getStock());
				System.out.print("수정할 가격을 입력하세요 : ");
				book[index].setStock(sc.nextInt());
				break;

			case 0:
				return;

			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}

			System.out.println("수정이 완료되었습니다.");

		}

	}

	public void deleteBook() {
		while (true) {
			System.out.println("===== 도서 삭제 =====");
			System.out.println("1. 소설/에세이");
			System.out.println("2. 경제");
			System.out.println("3. 학습서");
			System.out.println("0. 뒤로가기");
			System.out.print("삭제할 도서의 카테고리를 선택하세요 : ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				printNE();
				nIndex = deleteBook(ne, nIndex);
				break;

			case 2:
				printEco();
				cIndex = deleteBook(eco, cIndex);
				break;

			case 3:
				printEdu();
				dIndex = deleteBook(edu, dIndex);
				break;

			case 0:
				return;

			default:
				System.out.println("잘못 입력하셨습니다.");
			}

		}
	}

	public int deleteBook(Books[] product, int index) {
		System.out.print("삭제할 제품의 No를 입력하세요 : ");
		int selIndex = sc.nextInt() - 1;
		System.out.println("[" + ne[selIndex].getName() + "]을 선택하셨습니다.");
		System.out.print("[" + ne[selIndex].getName() + "]을 삭제하시겠습니까? [y/n]");
		char ch = sc.next().charAt(0);
		if (ch == 'y') {
			for (int i = selIndex; i < index - 1; i++) {
				product[i] = product[i + 1];
				product[index--] = null;
			}
		} else {
			System.out.println("삭제 취소");
		}
		return index;
	}

	public void printNE() {
		System.out.println("===== 소설/에세이 =====");
		System.out.println("NO\t도서명\t저자\t가격\t수량\t장르");
		for (int i = 0; i < nIndex; i++) {
			System.out.println((i + 1) + "\t" + ne[i].getName() + "\t" + ne[i].getWriter() + "\t" + ne[i].getPrice()
					+ "\t" + ne[i].getStock() + "\t" + ne[i].getGenre());

		}
	}

	public void printEco() {
		System.out.println("===== 경제 =====");
		System.out.println("NO\t도서명\t저자\t가격\t수량");
		for (int i = 0; i < cIndex; i++) {
			System.out.println((i + 1) + "\t" + eco[i].getName() + "\t" + eco[i].getWriter() + "\t" + eco[i].getPrice()
					+ "\t" + eco[i].getStock() + "\t");
		}
	}

	public void printEdu() {
		System.out.println("===== 학습서 =====");
		System.out.println("NO\t도서명\t저자\t가격\t수량");
		for (int i = 0; i < dIndex; i++) {
			System.out.println((i + 1) + "\t" + edu[i].getName() + "\t" + edu[i].getWriter() + "\t" + edu[i].getPrice()
					+ "\t" + edu[i].getStock() + "\t");
		}

	}

	public void showCart() {

		int totalPrice = 0;

		while (true) {
			System.out.println("===== 현재 장바구니 =====");
			System.out.println("no.\t도서명\t저자\t장르\t가격\t수량\t");
			for (int i = 0; i < ctIndex; i++) {
				System.out.println((i + 1) + "\t" + cart[i].getName() + "\t" + cart[i].getWriter() + "\t"
						+ cart[i].getGenre() + "\t" + cart[i].getPrice() + "\t" + cart[i].getStock());
				totalPrice += cart[i].getPrice();
			}

			System.out.println("합계 금액 : " + totalPrice + "원");

			System.out.print("이대로 구매 하시겠습니까? [y/n] : ");
			char ans = sc.next().charAt(0);

			switch (ans) {
			case 'y':
				System.out.println(totalPrice + "원을 지불하셨습니다.");
				System.out.println("적립 포인트 : " + (totalPrice * 0.05));
				point += totalPrice * 0.05;
				break;

			case 'n':
				System.out.println("장바구니를 비우시겠습니까? [y/n]");
				char ans2 = sc.next().charAt(0);

				if (ans2 == 'y') {
					clearCart();
					System.out.println("장바구니를 비웠습니다.");
				} else {
					System.out.println("이전 메뉴로 돌아갑니다.");
					return;
				}

				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}

	}

	public void clearCart() {

		while (ctIndex >= 0) {

			for (int j = 0; j < nIndex; j++) {
				if (ne[j].getName().equals(cart[ctIndex - 1].getName())) {
					ne[j].setStock(ne[j].getStock() + 1);
					cart[ctIndex - 1] = null;
					ctIndex--;
					continue;
				}
			}

			for (int j = 0; j < cIndex; j++) {
				if (eco[j].getName().equals(cart[ctIndex - 1].getName())) {
					eco[j].setStock(eco[j].getStock() + 1);
					cart[ctIndex - 1] = null;
					ctIndex--;
					continue;
				}
			}

			for (int j = 0; j < dIndex; j++) {
				if (edu[j].getName().equals(cart[ctIndex - 1].getName())) {
					edu[j].setStock(edu[j].getStock() + 1);
					cart[ctIndex - 1] = null;
					ctIndex--;
					continue;
				}
			}
		}

	}

	private void shoppingBook() {

		int index;

		while (true) {
			System.out.println("=======쇼핑하기 =======");
			System.out.println("어떤 종류의 책을 찾으십니까?");
			System.out.println("1.소설/에세이류\t2.경제\3.학습서\0.뒤로가기");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				printNE();
				System.out.println("구입 하실 책의 no.를 입력하세요 : ");
				index = sc.nextInt();
				if(index<0 ||index>nIndex) {
					System.out.println("해당하는 책이 없습니다.");
					continue;
				}
				if (ne[index - 1].getStock() == 0) {
					System.out.println("현재 재고가 없습니다.");
				} else {
					cart[ctIndex] = ne[index - 1];
					ne[index - 1].setStock(ne[index - 1].getStock() - 1);
					System.out.println("장바구니에 책 1권을 담았습니다.");
				}
				break;
				
			case 2:
				printEco();
				System.out.println("구입 하실 책의 no.를 입력하세요 : ");
				index = sc.nextInt();
				if(index<0||index>cIndex) {
					System.out.println("해당하는 책이 없습니다.");
					continue;
				}
				if (eco[index - 1].getStock() == 0) {
					System.out.println("현재 재고가 없습니다.");
				} else {
					cart[ctIndex] = eco[index - 1];
					eco[index - 1].setStock(eco[index - 1].getStock() - 1);
					System.out.println("장바구니에 책 1권을 담았습니다.");
				}
				break;
				
			case 3:
				printEdu();
				System.out.println("구입하실 책의 no.를 입력하세요 : ");
				index = sc.nextInt();
				if(index<0||index>dIndex) {
					System.out.println("해당하는 책이 없습니다.");
					continue;
				}
				if (edu[index - 1].getStock() == 0) {
					System.out.println("현재 재고가 없습니다.");
				} else {
					cart[ctIndex] = edu[index - 1];
					edu[index - 1].setStock(edu[index - 1].getStock() - 1);
				}

				break;
			case 0:
				return;

			}
		}

	}

	public void showPoint() {
		
		while (true) {
			System.out.println("====== 포인트 보기======");
			System.out.println("포인트를 보시겠습니까?[y/n]");
			char sel = sc.next().charAt(0);
			if (sel == 'y') {
				System.out.println("포인트 보기 : " + point);
				return;
			} else {
				System.out.println("포인트 보기 취소");
				continue;
			}

		}

	}
}
