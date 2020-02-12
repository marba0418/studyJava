package kr.or.iei.controller;

import java.util.Scanner;//스캐너를 가져옴.
import kr.or.iei.point.Gold;//골드 클래스 자료를 가져옴.
import kr.or.iei.point.Silver;//실버 클래스 자료를 가져옴.
import kr.or.iei.point.Vip;//vip클래스 자료를 가져옴.

public class Test {//한정자 /클래스 네임
	Silver[] silver = new Silver[10];//크기가 10인 silver 배열선언
	int sIndex;//실버배열 정수 선언
	Gold[] gold = new Gold[10];//크기가 10인 골드 배열 선언
	int gIndex;//골드 배열 정수 선언
	Vip[] vip = new Vip[10];//크기가 10인 vip 배열 선언
	int vIndex;//vip 배열 정수 선언
	int grade;// 등급을 정수로 선언한다. silver ==1, gold ==2, vip ==3
	Scanner sc = new Scanner(System.in);//스캐너를 쓸 수 있음

	public void main() {//반환형 메소드명(매개변수)
		while (true) {//아래의 내용이 true 일때 진행
			System.out.println("======메인진행 메뉴======");//~~출력
			System.out.println("1.회원가입");//~~출력
			System.out.println("2.회원정보출력(전체)");//~~출력
			System.out.println("3.회원정보출력(1명)");//~~출력
			System.out.println("4.회원정보수정");//~~출력
			System.out.println("5.회원탈퇴");//~~출력
			System.out.println("0.프로그램 종료 ");//~~출력
			int select = sc.nextInt();//키보드값에 1~6을 넣으면 switch 구문 실행 

			switch (select) {//키보드값 숫자 중 아래와 맞으면 반복문을 진행한다.
			case 1://1번 키보드값은 회원가입이므로..
				insertPeople();//매개변수를 써준다.
				break;//브레이크를 걸지않으면 케이스1이 반복하므로 걸어준다.
			case 2:
				printAllPeople();//매개변수를 써준다.
				break;//브레이크를 걸지않으면 케이스2이 반복하므로 걸어준다.
			case 3:
				printOnePeople();//매개변수를 써준다.
				break;//브레이크를 걸지않으면 케이스3이 반복하므로 걸어준다.
			case 4:
				modifyPeople();//매개변수를 써준다.
				break;//브레이크를 걸지않으면 케이스4이 반복하므로 걸어준다.
			case 5:
				deletePeople();//매개변수를 써준다.
				break;//브레이크를 걸지않으면 케이스5이 반복하므로 걸어준다.
			case 6:
				break;//브레이크를 걸지않으면 케이스6이 반복하므로 걸어준다.
			default://1-6번에 해당 되지 않을 경우 아래 출력문 진행
				System.out.println("다시 입력해주세요");
			}
		}
	}

	public void insertPeople() {//반환형 메소드명(매개변수)
		System.out.println("=======회원정보입력 =======");//~~출력
		System.out.println("회원 등급 입력 [Silver/Gold/Vip] : ");//~~출력
		String grade = sc.next().toLowerCase();//키보드에 문자열 등급을 넣을 수 잇음(소문자 입력시->대문자로 바꿔줌)

		String name = "";//name을 공란으로 초기값을 안써주면.. while 빠져나와서 하단의 name에서 값이 null인지 공란인지 모른다.. 그래서 써줌..
		while (true) {//아래값이 참이면 진행한다.
			System.out.println("회원 이름 입력 : ");//~~출력
			name = sc.next();//키보드 값으로 이름을 넣는다.
			int result = searchPeople(name);//넣은 이름과 아래 하단 searchPeople값과 비교한다.
			if (result == -1) {//이렇게 차이가 나면 중복이 아니어서 result==-1로 표현함
				break;//반복문이 다 되면? 브레이크로 빠져나온다.
			} else {//result값이 -1이 아니라면
				System.out.println("이미 가입된 회원입니다.");//~출력
			}

		}
		System.out.println("회원 포인트 점수 입력 : ");//~포인트 점수 ~출력
		int point = sc.nextInt();//키보드로 점수 입력한 부분을 정수형 변수에 대입 
		Silver person = new Silver(grade, name, point);//입력해야할 등급,이름,포인트를 설정?해준다
		switch (grade) {//등급별로 정리하기 위해 grade로 while 반복문 실행
		case "silver": //실버일 경우
			//실버값에 등급, 이름 , 포인트를 실버 배열에 넣어준다.
			silver[sIndex++] = new Silver(grade, name, point);
			break;//다 넣었을 경우 브레이크로 빠져나옴
		case "gold"://골드일 경우
			//골드 값에 등급, 이름, 포인트를 골드 배열에 넣어준다.
			gold[gIndex++] = new Gold(grade, name, point);
			break;// 다 넣었을 경우 브레이크로 빠져나옴
		case "vip"://vip일 경우
			//vip 값에 등급,네임,포인트를 vip배열에 넣어준다.
			vip[vIndex++] = new Vip(grade, name, point);
			break;
		}

	}

	public int searchPeople(String name) {//메소드 선언 참조자료형 (String name:매개변수)
		for (int i = 0; i < sIndex; i++) {//실행코드 i는 0부터 시작하고 실버는 배열이 10이므로 범위를 써준다.(<10)
			if (silver[i].getName().equals(name)) {
				return i;//i값을 리턴한다.
			}
		}
		for (int i = 0; i < gIndex; i++) {//실행코드 i는 0부터 시작하고 골드는 배열이 10개 이므로 범위 써줌(<10) 
			if (gold[i].getName().equals(name)) {//이름과 골드 배열값이 같다면..
				//여기서 10은 상수(변하지 않음) i+10값을 리턴한다.배열의 값을 받을 때 1이 실버의 1인지 골드의 1인지  vip의 1인지 모르니까.. 임의로 지정...골드는 10부터 19까지vip는 100부터 109까지.. 이걸 100으로 나누면..?
				return i + 10;
			}
		}
		for (int i = 0; i < vIndex; i++) {//실행코드는 i는 0부터 시작하고 vip는 배열이 10개이므로 범위 써줌
			if (vip[i].getName().equals(name)) {//이름과 vip 배열값? 같다면...
				return i + 100;//
			}
		}
		return -1;//리턴값을 -1로 준다.
	}

	public void printAllPeople() {//모든 회원을 볼 수 있는 메소드 선언
		System.out.println("========회원정보 출력========");//~출력
		System.out.println("등급\t이름\t포인트점수\t보너스점수");//~출력

		for (int i = 0; i < sIndex; i++) {//실버 범위가 0부터 9까지 이므로 범위 설정하고, 초기값은 0부터,증감문을 써준다.
			//getGrade,getName,getPoint,getDpoint는 메소드로 설정되어있으므로 silver[i].getName 이렇게 출력문 작성한다.
			System.out.println(silver[i].getGrade() + "\t" + silver[i].getName() + "\t" + silver[i].getPoint() + "\t"
					+ silver[i].getDpoint());
		}
		for (int i = 0; i < gIndex; i++) {//골드 범위가 0부터 9까지 이므로 범위 설정하고, 초기값은 0부터,증감문을 써준다.
			//getGrade,getName,getPoint,getDpoint는 메소드로 설정되어있으므로 gold[i].getName 이렇게 출력문 작성한다.
			System.out.println(gold[i].getGrade() + "\t" + gold[i].getName() + "\t" + gold[i].getPoint() + "\t"
					+ gold[i].getDpoint());
		}
		for (int i = 0; i < vIndex; i++) {//vip 범위가 0부터 9까지 이므로 범위 설정하고, 초기값은 0부터,증감문을 써준다.
			//getGrade,getName,getPoint,getDpoint는 메소드로 설정되어있으므로 vip[i].getName 이렇게 출력문 작성한다.
			System.out.println(
					vip[i].getGrade() + "\t" + vip[i].getName() + "\t" + vip[i].getPoint() + "\t" + vip[i].getDpoint());
		}
	}

	public void printOnePeople() {//회원 한명만 볼 수 있는 메소드 선언
		System.out.println("=======회원정보출력(1명)=======");//~출력
		System.out.println("조회할 회원을 입력해주세요");//~출력
		String name = sc.next();//키보드에 써준 값을 이름에 대입
		int searchIndex = searchPeople(name);//그 이름을 searchIndex에 대입 
		if (searchIndex == -1) {//??searchIndex가 -1과 같다면
			System.out.println("회원이 존재하지 않습니다.");//회원이 존재 하지 않음
		} else if (searchIndex / 100 > 0) {// 만약 searchIndex를 100으로 나눈 값이 0보다 크다면
			searchIndex -= 100;//searchIndex에서 100을 뺀 값을 searchIndex에 대입
			System.out.println("등급 : " + vip[searchIndex].getGrade());//출력~
			System.out.println("이름 : " + vip[searchIndex].getName());//출력~
			System.out.println("포인트 : " + vip[searchIndex].getPoint());//출력~
			System.out.println("보너스 : " + vip[searchIndex].getBonus());//출력~
		} else if (searchIndex / 10 > 0) {//만약 searchIndex를 10으로 나눈 값이 0보다 크다면
			searchIndex -= 10;//searchIndex에서 10을 뺀 값을 searchIndex에 대입
			System.out.println("등급 : " + gold[searchIndex].getGrade());//출력~~
			System.out.println("이름 : " + gold[searchIndex].getName());//출력~~
			System.out.println("포인트 : " + gold[searchIndex].getPoint());//출력~~
			System.out.println("보너스 : " + gold[searchIndex].getBonus());//출력~~
		} else {//위 두 가지에 해당되지 않으므로 silver맞음 
			System.out.println("등급 : " + silver[searchIndex].getGrade());//출력~~
			System.out.println("이름 : " + silver[searchIndex].getName());//출력~~
			System.out.println("포인트 : " + silver[searchIndex].getPoint());//출력~~
			System.out.println("보너스 : " + silver[searchIndex].getBonus());//출력~~
		}
	}

	public void deletePeople() {//회원 삭제 할 수 있는메소드 선언
		System.out.println("=======회원탈퇴=======");//~출력
		System.out.print("탈퇴 이름 입력 : ");//회원 탈퇴 문구 출력
		String name = sc.next();//탈퇴 키보드값 선언
		int searchIndex = searchPeople(name);//이름을 써주면 인덱스 값에서 찾는다 
		if (searchIndex == -1) {
			System.out.println("회원이 존재하지 않습니다.");
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
			gold[gIndex - 1] = null;//마지막 배열 값을 지워주는 것 
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
		System.out.println("======= 회원 정보 수정 =======");
		System.out.println("수정할 회원 입력 : ");
		String name = sc.next();
		int searchIndex = searchPeople(name);
		if (searchIndex == -1) {
			System.out.println("회원이 존재 하지 않습니다.");
		} else {
			if (searchIndex / 100 == 1) {
				searchIndex -= 100;
				System.out.println("변경할 등급 입력 [silver/gold/vip] : ");
				String nGrade = sc.next().toLowerCase();
				System.out.println("변경할 이름 입력 : ");
				String nName = sc.next();
				System.out.println("변경할 포인트 입력 : ");
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
				System.out.println(" 변경할 등급 입력 [silver/gold/vip] : ");
				String nGrade = sc.next().toLowerCase();
				System.out.print("변경할 이름 입력 : ");
				String nName = sc.next();
				System.out.println("변경할 포인트 입력 : ");
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
				System.out.println("변경할 등급 입력 [silver/gold/vip]");
				String nGrade = sc.next().toLowerCase();
				System.out.print("변경할 이름 입력 : ");
				String nName = sc.next();
				System.out.println("변경할 포인트 입력 : ");
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
