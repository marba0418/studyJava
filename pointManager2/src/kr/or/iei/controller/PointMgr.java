package kr.or.iei.controller;

import java.util.Scanner;

import kr.or.iei.point.Gold;
import kr.or.iei.point.Silver;
import kr.or.iei.point.Vip;

public class PointMgr {

	Silver[] silver = new Silver[10];// 아직 골드랑 vip못들어감->배열 다시 만들기
	int sIndex;// 실버에 해당하는 배열
	Gold[] gold = new Gold[10];
	int gIndex;// 골드에 해당하는 배열
	Vip[] vip = new Vip[10];
	int vIndex;// vip 에 해당하는 배열
	int grade;// 검색결과 silver ==1, gold ==2,vip==3

	Scanner sc = new Scanner(System.in);

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
		System.out.println("회원 등급 입력[Silver/Gold/Vip] : ");
		String grade = sc.next().toLowerCase();// 대소문자 틀려도 바꿔줌(소문자를 대문자로 바꿔줌)

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
		System.out.println("=======회원정보출력(전체)=======");
		System.out.println(" 등급\t이름\t포인트점수\t보너스포인트 ");

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

	public int searchPeople(String name) {// 1이 넘어왔을 때 실버의 1인지 골드의 1인지..구분이 안됨
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
		System.out.println("========회원정보출력(1명)=========");
		System.out.print("조회할 회원을 입력해주세요");
		String name = sc.next();
		int searchIndex = searchPeople(name);
		if (searchIndex == -1) {
			System.out.println("회원이 존재하지 않습니다.");
		} else if (searchIndex / 100 > 0) {
			searchIndex -= 100;
			System.out.println("등급 : " + vip[searchIndex].getGrade());
			System.out.println("이름 : " + vip[searchIndex].getName());
			System.out.println("포인트 : " + vip[searchIndex].getPoint());
			System.out.println("보너스 : " + vip[searchIndex].getDpoint());

		} else if (searchIndex / 10 > 0) {
			searchIndex -= 10;
			System.out.println("등급 : " + gold[searchIndex].getGrade());
			System.out.println("이름 : " + gold[searchIndex].getName());
			System.out.println("포인트 : " + gold[searchIndex].getPoint());
			System.out.println("보너스 : " + gold[searchIndex].getDpoint());
		} else {
			System.out.println("등급 : " + silver[searchIndex].getGrade());
			System.out.println("이름 : " + silver[searchIndex].getName());
			System.out.println("포인트 : " + silver[searchIndex].getPoint());
			System.out.println("보너스 : " + silver[searchIndex].getDpoint());
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
			if (searchIndex / 100 == 1) {// 기존 등급이 vip
				searchIndex -= 100;
				System.out.println("변경할 등급 입력[silver/gold/vip]");
				String nGrade = sc.next().toLowerCase();
				System.out.print("변경할 이름 입력 :");
				String nName = sc.next();
				System.out.println("변경할 포인트 입력 : ");
				int nPoint = sc.nextInt();
				if (nGrade.equals("vip")) {// 기존등급과 변경등급이 같은 경우
					// 등급 변화가 없으므로 grade의 setter는 호출하지 않음
					vip[searchIndex].setName(nName);
					vip[searchIndex].setPoint(nPoint);
				} else {// 기존등급과 변경등급이 다른 경우
						// vip배열에서 해당 회원 삭제
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
			} else if (searchIndex / 10 == 1) {// 기존 등급이 골드
				searchIndex -= 10;
				System.out.println("변경할 등급 입력[silver/gold/vip]");
				String nGrade = sc.next().toLowerCase();
				System.out.print("변경할 이름 입력 :");
				String nName = sc.next();
				System.out.println("변경할 포인트 입력 : ");
				int nPoint = sc.nextInt();
				if (nGrade.equals("gold")) {// 기존등급과 변경등급이 같은 경우
					// 등급 변화가 없으므로 grade의 setter는 호출하지 않음
					gold[searchIndex].setName(nName);
					gold[searchIndex].setPoint(nPoint);
				} else {// 기존등급과 변경등급이 다른 경우
						// gold배열에서 해당 회원 삭제
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

			else {// 기존등급이 실버
				System.out.println("변경할 등급 입력[silver/gold/vip]");
				String nGrade = sc.next().toLowerCase();
				System.out.print("변경할 이름 입력 :");
				String nName = sc.next();
				System.out.println("변경할 포인트 입력 : ");
				int nPoint = sc.nextInt();
				if (nGrade.equals("silver")) {// 기존등급과 변경등급이 같은 경우
					// 등급 변화가 없으므로 grade의 setter는 호출하지 않음
					gold[searchIndex].setName(nName);
					gold[searchIndex].setPoint(nPoint);
				} else {// 기존등급과 변경등급이 다른 경우
						// gold배열에서 해당 회원 삭제
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
		System.out.println("=======회원탈퇴=======");
		System.out.print("탈퇴 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchPeople(name);
		if (searchIndex == -1) {
			System.out.println("회원이 존재하지 않습니다.");
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
