
package dreamschool.csourse.chaper07;

public class ScoreArrayTest {

	public static void main(String[] args) {
	int[] scores = new int[3];
	String[] subjects = new String[3];
	scores[0] = 93;
	scores[1] = 87;
	scores[2] = 90;
	
	subjects[0] ="국어";
	subjects[1] ="영어";
	subjects[2] ="수학";
	
	double avg = 0;
	int sum = 0;
	for(int i = 0;i<scores.length;i++) {
		sum += scores[i];
		System.out.println(subjects[i] + " : " + scores[i]);
	}
	
	avg = (double)sum / scores.length;
	System.out.println("총점 : " + sum);
	System.out.println("평균  : " + avg);
	    
	

	}

}
