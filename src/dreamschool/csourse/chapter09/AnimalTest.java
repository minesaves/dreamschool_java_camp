package dreamschool.csourse.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat c = new Cat();
		
		c.setName("야옹이");
		c.setAge(3);
		c.setKind("페르시안");
		
		System.out.println("이름 : " + c.getName());
		System.out.println("나이  : " + c.getAge() + "살");
		System.out.println("종류 : " + c.getKind());
		c.run();
		c.hunt();
		c.play();
		

	}

}
