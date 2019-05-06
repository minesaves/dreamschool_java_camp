package dreamschool.csourse.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {
		int num = 2;
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		int num4 = 6;
		
		double result = 0;
		result = result + num + num1 /2 * 0.6;
		result = result + (num2 + num3) /2 * 0.13;
		result = result + num4 *0.27;
		
		System.out.println("시험자 " + "평가점수 : " + result);
		
		if (result >95) {
			System.out.println("클래스 : Special Class");
		}else if (result >90 && result <95) {
			System.out.println("클래스 : Gold Class");
		}else if (result >85 && result <90) {
			System.out.println("클래스 : Silver Class");
		}else if (result >85 && result <80) {
			System.out.println("클래스 : Brinze Class");
		}else if (result <80 && result >20) {
			System.out.println("클래스 : Member");
		}else if (result <20) {
			System.out.println("클래스 : no humen");
		}else if (result <-100) {
			System.out.println("클래스 : Alien");
		}
		

	}

}
