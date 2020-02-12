package kr.or.iei.controller;

import java.util.Scanner;

import kr.or.iei.point.Gold;
import kr.or.iei.point.Grade;
import kr.or.iei.point.Silver;
import kr.or.iei.point.Vip;
import kr.or.iei.point.Vvip;

public class PointMgr {
	Grade[] members = new Grade[30];
	int index;// 실버에 해당하는 배열
	int grade;// 검색결과 silver ==1, gold ==2,vip==3

	Scanner sc = new Scanner(System.in);

	public PointMgr() {

	}

	public void main() {
		while (true) {
			System.out.println("=======메인진행메뉴======="+index);
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
		System.out.println("회원 등급 입력[Silver/Gold/Vip/Vvip] : ");
		String grade = sc.next().toLowerCase();// 대소문자 틀려도 바꿔줌(소문자로 바꿔줌 ...grade엔 소문자만 들어가 있음...)
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
		System.out.println("등록 완료");

	}

	public void printAllPeople() {
		System.out.println("=======회원정보출력(전체)=======");
		System.out.println(" 등급\t이름\t포인트점수\t보너스포인트 ");
		for (int i = 0; i < index; i++) {
			System.out.println(members[i].getGrade() + "\t" + members[i].getName() + "\t" + members[i].getPoint() + "\t"
					+ members[i].getDpoint());
		}

	}

	public int searchPeople(String name) {// 1이 넘어왔을 때 실버의 1인지 골드의 1인지..구분이 안됨
		for (int i = 0; i < index; i++) {
			if (members[i].getName().equals(name)) {
				// grade =1;
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
			System.out.println("등급 : " + members[searchIndex].getGrade());
			System.out.println("이름 : " + members[searchIndex].getName());
			System.out.println("포인트 : " + members[searchIndex].getPoint());
			System.out.println("보너스 : " + members[searchIndex].getDpoint());

		}

	}

	public void modifyPeople() {
		System.out.println("=======회원정보수정=======");
		System.out.print("수정할 회원 입력 : ");
		String name = sc.next();
		int searchIndex = searchPeople(name);// 써치로 검색
		if (searchIndex == -1) {
			System.out.println("회원이 존재하지 않습니다.");
		} else {// -1이 아닌 경우

			System.out.println("변경할 등급 입력[silver/gold/vip/vvip]");
			String nGrade = sc.next().toLowerCase();
			System.out.print("변경할 이름 입력 :");
			String nName = sc.next();
			System.out.println("변경할 포인트 입력 : ");
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
		System.out.println("=======회원탈퇴=======");
		System.out.print("탈퇴 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchPeople(name);
		if (searchIndex == -1) {
			System.out.println("회원이 존재하지 않습니다.");
		} else {
			for (int i = searchIndex - 100; i < index - 1; i++) {
				members[i] = members[i + 1];
			}
			members[index - 1] = null;
			index--;
		}
	}

}
