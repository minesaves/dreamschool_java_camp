package dreamschool.csourse.chapter09;

public class AccoutTest {

	public static void main(String[] args) {
		FundAccount fun1 = new FundAccount("111-2222", "홍길동", 5000000, 4.7);
		FundAccount fun2 = new FundAccount("666-7777", "홍길순", 1000000, 2.9);
		
		fun1.openAccount();
		System.out.println("수익이 발생했습니다.");
		
		System.out.println();
		fun2.openAccount();
		System.out.println("수익이 발생했습니다.");
	}
}
		
		