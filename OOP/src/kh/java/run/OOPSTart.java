package kh.java.run;

import java.util.Scanner;

import kh.java.vo.TV;

public class OOPSTart {

	public static void main(String[] args) {
		/*
		 * TV tv = new TV();//tv를 인스턴스라고 함 또는 객체 TV tv1 = new TV(); //객체화되고 독립적으로 됨,
		 * tv객체가 2개 됨 tv.power(); System.out.println(tv.power); tv.volumeUp();
		 * System.out.println(tv.volume); System.out.println(tv1.volume);
		 */
		Scanner sc = new Scanner(System.in);
		TV tv = new TV();
		//JVM 자동으로 만들어주는 생성자
		System.out.println(tv.getPower());
		tv.power();
		System.out.println(tv.getPower());
		System.out.println(tv.getChannel());
		System.out.println(tv.getVolume());
		/*while (true) {
			System.out.println("TV 시청 가이드 ");
			System.out.println("1.전원 on/off");
			System.out.println("2.현재 채널 및 볼륨 확인");
			System.out.println("3. 채널+1");
			System.out.println("4. 채널-1");
			System.out.println("5. 볼륨 +1");
			System.out.println("6. 볼륨 -1");
			System.out.println("7. 채널입력");
			System.out.println("선택>");
			int sel = sc.nextInt();
			switch (sel) {
			case 7:
				if(tv.power==true) {
					System.out.println("채널을 입력하세요 : ");
					int chNum =sc.nextInt();
					tv.selChannel(chNum);
				}else {
					System.out.println("전원이 꺼졌습니다.");
				}
				break;
			case 1:
				boolean bool=tv.power();
				if(bool) {
					System.out.println("전원이 켜졌습니다.");
				}else {
					System.out.println("전원이 꺼졌습니다.");
				}
				break;// 브레이크 빼먹지 말기:)
			case 2:
				if (tv.power == true) {
					System.out.println("채널:  " + tv.channel);
					System.out.println("볼륨: " + tv.volume);
				} else {
					System.out.println("전원을 켜주세요");
				}
			case 3:
				if (tv.power == true) {
					tv.channelUp();
				}else {
				System.out.println("전원 켜줘~");
				}
				break;
			case 4:
				if (tv.power == true) {
				tv.channelDown();
				}else {
				System.out.println("전원 켜줘~");
				}
				break;
			case 5:
				if (tv.power == true) {
					tv.volumeUp();
				}else {
				System.out.println("전원 켜줘~");
				}
				break;
			case 6:
				if (tv.power == true) {
				tv.volumeDown();
				}else {
				System.out.println("전원 좀 ㅠㅠ");
				}
				break;
				
			}

		}*/
	}
}
