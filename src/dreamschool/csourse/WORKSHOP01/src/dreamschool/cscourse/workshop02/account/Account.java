package dreamschool.csourse.workshop02.account;

public class Account {
	int balance;
	double interestRate;
	String accNam;
	String accNo;
	int acc1 = 441;
	String acc2 = "0290";
	int acc3 = 1203;
	String yeeza = "7.3";
	int deposit;
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
