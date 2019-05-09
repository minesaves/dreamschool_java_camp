package dreamschool.csourse.chaper07;

public class TelevisonTest {

	public static void main(String[] args) {
		Televison infinia = new Televison("INFINIA", 1500000);
		Televison xcanvas = new Televison("XCANVAS", 1000000, "LCD TV");
		Televison cinema = new Televison("CINEMA", 2000000, "3D TV");
		
		infinia.printTelevisionInfo();
		xcanvas.printTelevisionInfo();
		cinema.printTelevisionInfo();
		
		System.out.println("가격의 합 : " + (infinia.price + xcanvas.price + cinema.price));
		
		
		

	}

}
