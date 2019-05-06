package dreamschool.csourse.chapter04;

public class SalaryTast {

	public static void main(String[] args) {
		int totalAnnualSalary = 1000000 * 12;//연봉
		int annualSalaryAfterTex = 10800000;//세후 연봉
		int bonus = 800000;//보너스
		int bonusAfterTex = 75600;//세후 보너스
		int totalIncome = 11556000;//지급액
		
		System.out.println("연봉 : " + totalAnnualSalary + ", " + "세후 연봉 : " + annualSalaryAfterTex);
		System.out.println("보너스 : " + bonus + ", " + "세후 보너스 : " + bonusAfterTex);
		System.out.println("지급액 : " + totalIncome);

	}

}
