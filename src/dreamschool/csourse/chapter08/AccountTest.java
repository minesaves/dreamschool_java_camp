package dreamschool.csourse.chapter08;

import sun.tools.tree.SuperExpression;

public class AccountTest {

	public static void main(String[] args) {
		Account[] arrAcc = {new Account("1111=2222=5551", 10000, 4.5),
				new Account("111-2222-5552", 20000, 4.5),
				new Account("111-2222-5553", 30000, 4.5),
				new Account("111-2222-5554", 40000, 4.5),
				new Account("111-2222-5555", 10000, 4.5)
		};
		for(int i = 0; i <arrAcc.length;i++) {
			System.out.println("계좌번호 : " + arrAcc[i].getNumber() + "/잔액" + 
		arrAcc[i].getBalance() + "/이율  :" + arrAcc[i].getInterestRate() + "%");
			
				
		}
		System.out.println("이율을 변경합니다.");
		
		for(int i = 0; i < arrAcc.length; i++) {
			arrAcc[i].setInterestRate(3.7);
			arrAcc[i].calculateInterest();
			System.out.println("계좌번호 : " + arrAcc[i].getNumber() + "/이율  : " +
			arrAcc[i].getInterestRate()+ "% / 잔액 : " + arrAcc[i].getBalance());
		}

	}

}
