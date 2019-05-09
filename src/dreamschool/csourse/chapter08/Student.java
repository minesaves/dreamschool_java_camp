package dreamschool.csourse.chapter08;

public class Student {
	private  String name;
	private String StudentId;
	private String phoneNo;
	
	
	
	public Student(String name, String studentId, String phoneNo) {
		this.name = name;
		StudentId = studentId;
		this.phoneNo = phoneNo;
	}
		public void setName(String name) {
		this.name = name;
	}



	public void setStudentId(String studentId) {
		StudentId = studentId;
	}



	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public String getStudentId() {
		return StudentId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void printStudentInfo() {
		System.out.println(this.name + "(" + this.StudentId + ") / 전화번호 : " +  this.phoneNo);
	}
}
