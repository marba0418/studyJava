package kr.or.iei.point;

public class Silver {
	private String grade;
	private String name;
	private int point;
	
	
	public Silver() {
		
	}
	public Silver(String grade,String name,int point) {
		this.grade = grade;
		this.name = name;
		this.point = point;
		
	}
	public String getGrade() {
		return grade;
	}
	public String getName() {
		return name;
	}
	public int getPoint() {
		return point;
	}
	public double getDpoint() {
		return 0.02*point;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public void setPoint(int point) {
		this.point = point;
	}
	

}
