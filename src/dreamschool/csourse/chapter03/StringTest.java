package dreamschool.csourse.chapter03;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		String department = "도서관";
		String mathScore = "86";
		int intmathScore = Integer.parseInt(mathScore) + 1;
		
		System.out.println(name);
		System.out.println(department);
		
		System.out.println(name + department);
		System.out.println(name + " : " + department);
		System.out.println("수학점수 : " + mathScore);

	}

}
