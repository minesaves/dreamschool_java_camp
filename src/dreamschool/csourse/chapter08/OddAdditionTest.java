package dreamschool.csourse.chapter08;

public class OddAdditionTest {

	public static void main(String[] args) {
		int[] numbers = {10, 21,33, 42, 51, 64, 79, 80};
		int odd = 0;
		numbers[1] = 21;
		numbers[2] = 33;
		numbers[3] = 51;
		numbers[4] = 79;
		for (int i = 1; i <= 100; i++) {
				odd += i;
				
				
			}
		System.out.println("21   " + "33   " + "51   " + "79");
		System.out.println(numbers[1] + numbers[2] + numbers[3] + numbers[4]);
		System.out.println("홀수들의 합계는" + (numbers [1] + numbers[2] + numbers[3] + numbers[4]) + "입니다.");
		}

	}
