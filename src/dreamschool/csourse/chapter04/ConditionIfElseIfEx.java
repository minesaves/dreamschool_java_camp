package dreamschool.csourse.chapter04;

public class ConditionIfElseIfEx {

	public static void main(String[] args) {
		int age = 20;
		
		if(age >=19) {
			System.out.println("성인입니다");
			System.out.println("입장하세요");
		}else if (age >=13) {
			System.out.println("청소년입니다");
			System.out.println("조금만 기다려주세요");
		}else if (age >=8) {
			System.out.println("아동입니다");
			System.out.println("나가노세요");
		}

	}

}
