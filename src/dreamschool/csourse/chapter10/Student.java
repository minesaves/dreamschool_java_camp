package dreamschool.csourse.chapter10;

public class Student extends Person {
	private String department;
	
	
	public Student(String name, String phoneNumber, String department) {
		super(name, phoneNumber);
		this.department = department;
	}



      
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}


	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
	}


	public void study() {
		System.out.println("공부를 해요.");
		
		
	}

}
