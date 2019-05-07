package dreamschool.csourse.chaper06;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.accNam = "홍길동";
		acc.accNo ="123-456789";
		acc.balance = getUserInput();
		
		acc.printAccountInfo();
			
		System.out.println("잔액 : "+ acc.balance + "원");
		
		System.out.println("20000원을 입급합니다.");
		acc.deposit(20000);
		System.out.println("잔액 : "+ acc.balance + "원");
		
		System.out.println("45000원을 출금합니다.");
		acc.withdraw(45000);
		System.out.println("잔액 : " + acc.balance + "원");
		
		int withdraw(int money) {
			if(money < 0) {
			System.out.println("[에러] 잔액이 부족합니다.");//getUserInput();
		}
		
		

	}

	private static long getUserInput() {
		// TODO Auto-generated method stub
		return 0;
	}

	}
