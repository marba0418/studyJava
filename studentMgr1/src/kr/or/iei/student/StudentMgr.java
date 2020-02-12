package kr.or.iei.student;

import java.util.Scanner;

public class StudentMgr {

	String[] names = new String[10];// 학생 이름 저장할 배열
	int[] ages = new int[10];
	String[] addrs = new String[10];
	int index; // 배열 인데스 관리용;
	Scanner sc = new Scanner(System.in);

	public void main() {
		while (true) {
			System.out.println("==학생등록프로그램==");
			System.out.println("1.학생등록");
			System.out.println("2.학생정보 조회(전체)");
			System.out.println("3.학생정보 조회(1명)");
			System.out.println("4.학생정보 수정");
			System.out.println("5.학생정보 삭제");
			System.out.println("6.프로그램 종료");
			System.out.println("선택> ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				insertStudent();// 메소드명
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
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("다시 입력하세요");
			}
		}
	}

	public void insertStudent() {
		System.out.println("\n======학생정보입력======");
		System.out.print("이름 입력:");
		String name = sc.next();
		System.out.print("나이 입력:");
		int age = sc.nextInt();
		sc.nextLine();// 개행처리문자 제거용 코드
		System.out.print("주소입력:");
		String addr = sc.nextLine();
		names[index] = name;
		ages[index] = age;
		addrs[index] = addr;
		index++;
		System.out.println("학생 정보등록 성공!");

	}

	public void printAllStudent() {
		System.out.println("\n=====학생전체 정보=====");
		System.out.println("이름\t나이\t주소");
		for (int i = 0; i < index; i++) {
			System.out.println(names[i] + "\t" + ages[i] + "\t" + addrs[i]);
		}
	}

	public void printOneStudent() {
		System.out.println("\n=====학생정보 출력(1명) =====");

		int searchIndex = searchStudent("조회");
		if (searchIndex != -1) {

			System.out.println("이름: " + names[searchIndex]);
			System.out.println("나이: " + ages[searchIndex]);
			System.out.println("주소: " + addrs[searchIndex]);
		}
	}

	public void modifyStudent() {
		System.out.println("\n=====학생정보 수정=====");
		int searchIndex = searchStudent("수정");
		if (searchIndex != -1) {
			System.out.print("수정할 학생 이름 입력 :");
			String name = sc.next();
			System.out.print("수정할 나이 입력 :");
			int age = sc.nextInt();
			System.out.print("수정할 주소 입력: ");
			sc.nextLine();
			String addr = sc.nextLine();
			names[searchIndex] = name;
			ages[searchIndex] = age;
			addrs[searchIndex] = addr;
		}
	}

	public void deleteStudent() {
		System.out.println("\n=====학생정보 삭제 =====");
		int searchIndex = searchStudent("삭제");
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
		System.out.print(msg + "할 학생 이름 입력 : ");
		String name = sc.next();
		for (int i = 0; i < index; i++) {
			if (names[i].equals(name)) {
				return i;

			}
		}
		System.out.println("학생 정보가 없습니다.");
		return -1;// 아무 것도 발견되지 않았을때

	}

}
