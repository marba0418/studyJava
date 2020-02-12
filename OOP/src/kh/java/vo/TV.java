package kh.java.vo;

public class TV {
	// 크기,전원 ,채널, 볼륨 변수
	// 전원,채널,볼륨 기능
	private int inch = 120;
	private boolean power = false;
	private int channel = 1;
	private int volume = 0;
	private int [] arr;
	//기본생성자
	public TV() {}
	//매개변수있는 생성자
	public TV(int inch,boolean power,int channel,int volume,int[]arr) {
		this.inch = inch;
		this.power = power;
		this.channel = channel;
		this.volume =volume;
		this.arr =arr;
	}
	public boolean getPower() {
		return power;
	}
	public int getInch() {
		return inch;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	//setter는 항상 void
	public void setPower(boolean power){
		this.power =power;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}

	/*public void power() {
		System.out.println("전원기능");
		power = !power;
	}*/
	public void selChannel(int number) {//int해도 됨
		channel = number;
		
		
		
	}
	public boolean power() {
		System.out.println("전원기능");
		power = !power;
		return power;
	}
	public void channelUp() {
		System.out.println("채널번호 증가");
		channel++;
		
	}
	public void channelDown() {
		System.out.println("채널번호 감소");
		channel--;
	}
	public void volumeUp() {
		System.out.println("볼륨증가");
		volume++;
	}
	public void volumeDown() {
		System.out.println("볼륨다운");
		volume--;
		
	}

}
