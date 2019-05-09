package dreamschool.csourse.chapter10;

public class Polymophis {

	public static void main(String[] args) {
		Persons[] persons = new Person[4];
		Person[0] new Person("홍길동", "111-2222");
		Person[1] new Person("홍길순", "111-2345", "컴퓨터공학과");
		Person[2] new Person("홍길동", "222-3333", "JAVA");
		
		for(int i = 0; i < persons.legth; i++) {
			persons[i].eat();
			persons[i].sleep();
			System.out.println();
		}

	}

}
