package kh.java.vo;

public class TV {
	// ũ��,���� ,ä��, ���� ����
	// ����,ä��,���� ���
	private int inch = 120;
	private boolean power = false;
	private int channel = 1;
	private int volume = 0;
	private int [] arr;
	//�⺻������
	public TV() {}
	//�Ű������ִ� ������
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
	//setter�� �׻� void
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
		System.out.println("�������");
		power = !power;
	}*/
	public void selChannel(int number) {//int�ص� ��
		channel = number;
		
		
		
	}
	public boolean power() {
		System.out.println("�������");
		power = !power;
		return power;
	}
	public void channelUp() {
		System.out.println("ä�ι�ȣ ����");
		channel++;
		
	}
	public void channelDown() {
		System.out.println("ä�ι�ȣ ����");
		channel--;
	}
	public void volumeUp() {
		System.out.println("��������");
		volume++;
	}
	public void volumeDown() {
		System.out.println("�����ٿ�");
		volume--;
		
	}

}
