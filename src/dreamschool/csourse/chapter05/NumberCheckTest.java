package dreamschool.csourse.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int sik = 2 * 3;
		
		if(sik < 9) {
			System.out.println("한자리 수입니다");
		}else if(sik < 99) {
			System.out.println("두자리 수입니다");
		}else if(sik < 999) {
			System.out.println("세자리 수 이상입니다");
		}else {
			System.out.println("음수는 확인하지 않습니다");
		}
		sik = 4 * 5;
		
		if(sik < 9) {
			System.out.println("한자리 수입니다");
		}else if(sik < 99) {
			System.out.println("두자리 수입니다");
		}else if(sik < 999) {
			System.out.println("세자리 수 이상입니다");
		}else {
			System.out.println("음수는 확인하지 않습니다");
		}
		sik = 23 * 96;
		
		if(sik < 9) {
			System.out.println("한자리 수입니다");
		}else if(sik < 99) {
			System.out.println("두자리 수입니다");
		}else if(sik < 999) {
			System.out.println("세자리 수 이상입니다");
		}else {
			System.out.println("음수는 확인하지 않습니다");
		}
		sik = 4* -3;
		
		if(sik < 9) {
			System.out.println("한자리 수입니다");
		}else if(sik < 99) {
			System.out.println("두자리 수입니다");
		}else if(sik < 999) {
			System.out.println("세자리 수 이상입니다");
		}else {
			System.out.println("음수는 확인하지 않습니다");
		}

	}

}
