package dreamschool.csourse.chapter09;

public class ProductTest {

	public static void main(String[] args) {
		Product lan = new Product("통돌이", 450000, 8);
		Television cin = new Television("시네마 TV", 3500000, 10, "화면 크기 151cm");
		
		lan.printProductInfo();
		System.out.println();
		cin.printProductInfo();
		System.out.println("비고 : " + cin.getDescription());
		
		System.out.println();
		System.out.println("[공지] 할인율이 모두 15%로 변경됩니다.");
		lan.setDiscountRate(15);
		cin.setDiscountRate(15);
		
		System.out.println(lan.getName() + "판매가 : "  + lan.calculateDiscountPrice() + "원");
		
		

	}

}
