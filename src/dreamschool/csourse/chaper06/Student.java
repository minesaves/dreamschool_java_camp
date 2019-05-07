package dreamschool.csourse.chaper06;

public class Student {
	String StudentName;
	String studentd;
	int korean;
	int english;
	int math;
	
	int calculateAverage() {
		int avg = (korean + english + math) / (int)3;
		return avg;
	}
	
	void printStudentInfo() {
		System.out.println("학생명 : " + StudentName);
		System.out.println("학번 : " + studentd);
		System.out.println("국어점수 : " + korean);
		System.out.println("영어점수 : " + english);
		System.out.println("수학점수 : "+ math);
		System.out.println("평균점수 : " + calculateAverage());
		
	}
	 void changeStudentId(String newId) {
		 studentd = newId;
	 }

}
