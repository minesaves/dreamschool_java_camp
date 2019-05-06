package dreamschool.csourse.chapter05;

public class ScoreTest {

	public static void main(String[] args) {
		int first = 85;
		int second = 72;
		int third = 94;
		int fourth = 88;
		int fifth = 92;
		int sixth = 76;
		int seventh = 83;
		int eighth = 92;
		int student = 8;
		int totalscore = first + second + third + fourth + fifth + sixth + seventh + eighth;
		
		System.out.println("반의 학생 수는? :" + student);
		System.out.println("1번 점수 : " + first);
		System.out.println("2번 점수 : " + second);
		System.out.println("3번 점수 : " + third);
		System.out.println("4번 점수 : " + fourth);
		System.out.println("5번 점수 : " + fifth);
		System.out.println("6번 점수 : " + sixth);
		System.out.println("7번 점수 : " + seventh);
		System.out.println("8번 점수 : " + eighth);
		System.out.println("==========================");
		System.out.println("8명의 총점 : " + totalscore + "점");
		System.out.println("8명의 평균 : " + (totalscore - 596.75) + "점");
		System.out.println("==========================");
		
		
	}

}
