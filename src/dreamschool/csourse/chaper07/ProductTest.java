package dreamschool.csourse.chaper07;

public class ProductTest {

	public static void main(String[] args) {
		System.out.println("=====커피믹스=====");
		Product mix = new Product("커피믹스", 12000, 20);
		Product cup = new Product("종이컵", 3000);
		mix.printProductinfo();
		cup.printProductinfo();
		

	}

}
