package dreamschool.csourse.chaper06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee ame = new Coffee();
		ame.name = "아메리카노";
		ame.price = 3500;
		ame.printCoffeInfo();
		
		Coffee latte = new Coffee();
		latte.name = "카페라떼";
		latte.price = 4000;
		latte.printCoffeInfo();
	
		Coffee maki = new Coffee();
		maki.name = "마끼아또";
		maki.price = 4500;
		maki.printCoffeInfo();
		
		System.out.println("총금액 : " + (ame.price + latte.price + maki.price) + " 원입니다");

	}

}
