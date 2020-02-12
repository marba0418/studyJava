package kr.or.iei.start;
import kr.or.iei.controller.StudentMgr;
public class StudentStart {

	private static StudentMgr mgr;

	public static void main(String[] args) {
		StudentMgr.mgr = new StudentMgr();
		mgr.main();
	
		

	}

}
