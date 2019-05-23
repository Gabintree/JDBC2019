package java20190403;

public class Person {

	private int regiNum;
	private int passNum;
	
	Person(int rnum, int pnum) {
		regiNum = rnum;
		passNum = pnum;
	}
	
	Person(int rnum) {
		regiNum = rnum;
		passNum = 0;
	}
	void showPersonlInfo() {
	}
}
