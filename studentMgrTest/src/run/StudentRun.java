package run;

import java.util.Scanner;

public class StudentRun {
	String[] names = new String[10];
	int[] ages = new int[10];
	String[] addrs = new String[10];
	int index;
	Scanner sc = new Scanner(System.in);

	public void main() {
		while (true) {
			System.out.println("===== 학생등록프로그램 =====");
			System.out.println("1.학생등록");
			System.out.println("2.학생정보 조회 <전체>");
			System.out.println("3.학생정보 조회<1명>");
			System.out.println("4.학생정보 수정");
			System.out.println("5.학생정보 삭제");
			System.out.println("6.프로그램 종료");
			System.out.println("선택> ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				insertStudent();
				break;
			case 2:
				searchAllStudent();
				break;
			case 3:
				searchOneStudent();
				break;
			case 4:
				modifyStudent();
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
			}

		}
	}

	public void insertStudent() {
		System.out.println("\n=====학생정보 입력=====");
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("주소 입력 : ");
		String addr = sc.nextLine();// 왜 이렇게?
		names[index] = name;//
		ages[index] = age;//
		addrs[index] = addr;//
		index++;
		System.out.println("학생정보 등록 성공!!");
	}

	public void searchAllStudent() {
		System.out.println("\n=====학생 전체 정보 =====");
		System.out.println("이름 \t 나이 \t 주소 \t");
		for (int i = 0; i < index; i++) {
			System.out.println(names[i] + "\t" + ages[i] + "\t" + addrs[i] + "\t");
		}

	}

	public void searchOneStudent() {
		System.out.println("\n=====학생 정보 출력<1명> =====");
		int searchIndex = searchStudent("조회");
		if (searchIndex != -1) {
			System.out.println("이름 : " + names[searchIndex]);
			System.out.println("나이  : " + ages[searchIndex]);
			System.out.println("주소  : " + addrs[searchIndex]);
		}

	}

	public void modifyStudent() {
		System.out.println("\n=====학생정보 수정 =====");
		int searchIndex = searchStudent("수정");
		if (searchIndex != -1) {
			System.out.println("수정할 학생 이름 입력 : ");
			String name = sc.next();
			System.out.println("수정할 나이 입력 : ");
			int age = sc.nextInt();
			System.out.println("수정할 주소 입력 : ");
			sc.nextLine();
			String addr = sc.nextLine();
			names[searchIndex] = name;
			ages[searchIndex] = age;
			addrs[searchIndex] = addr;

		}
	}

	public void deleteStudent() {
		System.out.println("\n======학생정보 삭제======");
		int searchIndex = searchStudent("삭제");
		if (searchIndex != -1) {
			System.out.println("삭제할 학생 이름 입력 : ");
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

	}

	public int searchStudent(String msg) {
		System.out.println(msg + "할 학생 이름 입력 : ");
		String name = sc.next();
		for (int i = 0; i < index; i++) {
			if (names[i].equals(name)) {
				return i;

			}
		}
		System.out.println("학생정보가 없습니다.");
		return -1;

	}

}
