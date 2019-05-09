package dreamschool.csourse.workshop02.account;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account();
		
		int num1 = getUserInput();
		acc.acc1 = 441;
		acc.acc2 = "0290";
		acc.acc3 = 1203;
		acc.balance = 500000;
		acc.yeeza = "7.3";
		acc.deposit(getUserInput());
		
		
		System.out.println(">>계좌를 생성합니다.");
		System.out.println("계좌 정보 :" + acc.acc1 + "-" + acc.acc2 + "-" + acc.acc3 + ", 잔액  : " +
		acc.balance + "원, 이자율 :" + acc.yeeza);
		System.out.println(acc.deposit);
		System.out.println(acc.deposit +"원을 입급합니다.");
		System.out.println("계좌 정보 :" + acc.acc1 + "-" + acc.acc2 + "-" + acc.acc3 + ", 잔액  : " +
				(acc.balance + acc.deposit) + "원, 이자율 :" + acc.yeeza);
		
	}

	private static int getUserInput() {
		// TODO Auto-generated method stub
		return 0;
	}






}

