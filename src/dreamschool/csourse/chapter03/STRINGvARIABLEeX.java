package dreamschool.csourse.chapter03;

public class STRINGvARIABLEeX {

	public static void main(String[] args) {
		String name = "홍길동";
		String mathScore = "96";
		int englishScore = 82;
		
		int inMathScore = Integer.parseInt(mathScore);
		
		System.out.println("이름 : " + name);
		System.out.println("수학점수 : " + mathScore);
		System.out.println("영어점수 : " + englishScore);
		System.out.println("-------------------------");
		System.out.println(mathScore + englishScore);
		System.out.println(inMathScore + englishScore);
		

	}

}
