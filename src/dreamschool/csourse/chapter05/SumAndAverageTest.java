package dreamschool.csourse.chapter05;

public class SumAndAverageTest {

	public static void main(String[] args) {
		int sum = 0;
		double average = 0;
		
		for(int i =1; i<=500 ; i++) {
			sum += i;
		}
		average = sum / 500;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
		}

	}


