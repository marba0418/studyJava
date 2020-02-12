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
			System.out.println("=======메인진행메뉴=======");
			System.out.println("1.회원가입");
			System.out.println("2.회원정보출력(전체)");
			System.out.println("3.회원정보출력(1명)");
			System.out.println("4.회원정보수정");
			System.out.println("5.회원탈퇴");
			System.out.println("6.회원검색");
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
				System.out.println("다시 입력해주세요!!");

			}

		}
	}

	public void insertPeople() {
		System.out.println("=======회원 가입정보 입력=======");
		System.out.println("회원 등급 입력 : ");
		String grade = sc.next();
		System.out.println("회원 이름 입력 : ");
		String name = " ";
		while (true) {
			System.out.println("회원 이름 입력 : ");
			name = sc.next();
			int result = searchPeople(name);
			if (result == -1) {
				break;
			} else {
				System.out.println("이미 가입된 회원입니다.");
			}
		}
		System.out.println("회원 포인트 점수 입력 : ");
		int point = sc.nextInt();
		Silver person = new Silver(grade, name, point);
		people[index] = person;
		index++;
	}

	public void printAllPeople() {
		System.out.println("=======회원정보출력(전체)=======");
		System.out.println(" 등급\t이름\t포인트점수\t보너스포인트 ");
		
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
		System.out.println("========회원정보출력(1명)=========");
		System.out.print("조회할 회원을 입력해주세요");
		String name = sc.next();
		int searchIndex = searchPeople(name);
		if (searchIndex == -1) {
			System.out.println("회원이 존재하지 않습니다.");
		} else {
			System.out.println("등급 : " + people[searchIndex].getGrade());
			System.out.println("이름 : " + people[searchIndex].getName());
			System.out.println("포인트 점수 : " + people[searchIndex].getPoint());

		}

	}

	public void modifyPeople() {
		System.out.println("=======회원정보수정=======");
		System.out.print("수정할 회원 입력 : ");
		String name = sc.next();
		int searchIndex = searchPeople(name);
		if (searchIndex == -1) {
			System.out.println("회원이 존재하지 않습니다.");
		} else {
			System.out.print("수정할 이름 입력 : ");
			String mName = sc.next();
			System.out.print("수정할 등급 입력 : ");
			String mGrade = sc.next();
			System.out.print("수정할 포인트 입력 : ");
			int mPoint = sc.nextInt();
			people[searchIndex].getName();
			people[searchIndex].getGrade();
			people[searchIndex].getPoint();
		}
	}

	public void deletePeople() {
		System.out.println("=======회원정보 삭제 =======");
		System.out.print("삭제할 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchPeople(name);
		if (searchIndex == -1) {
			System.out.println("회원이 존재하지 않습니다.");
		} else {
			for (int i = searchIndex; i < index - 1; i++) {
				people[i] = people[i + 1];
			}
			people[index - 1] = null;
			index--;
		}
	}

}
