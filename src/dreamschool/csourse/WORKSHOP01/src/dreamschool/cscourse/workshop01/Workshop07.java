package dreamschool.cscourse.workshop01;

import java.util.Random;
import java.util.Scanner;

public class Workshop07 {

	public static void main(String[] args) {
		
		int compNo = getHiddenNumber();
		System.out.println(compNo);
		
		
		int userNo = getUserInput();
		for(int i =1; i <=10; i++) {
			//컴퓨터와넘버와 사용자 입력 정보가 같으면 break;
		}

	}
	public static int getHiddenNumber() {
		Random random = new Random();
		int num = random.nextInt(100);
		return num;
	}
	public static int getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    }

}
