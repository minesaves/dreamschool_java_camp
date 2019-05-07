package dreamschool.csourse.chaper06;

public class Account {
	String accNam;
	String accNo;
	long balance;
	void printAccountInfo() {
		
	}
	
	void deposit(int money) {
		balance += money;
		
	}
	
	int withdraw(int money) {
		balance -= money;
		return money;
	}

}
