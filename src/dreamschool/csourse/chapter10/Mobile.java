package dreamschool.csourse.chapter10;

public class Mobile{
	private String Production;
	private int price;
	
	
	
	public void call(int time) {
		System.out.println(Production + " : " + time + "분 통화했습니다");
		
		
	}
	public void charge(int time) {
		System.out.println(this.Production + " : " + time + "분 충전했습니다.");
		
	}

}
