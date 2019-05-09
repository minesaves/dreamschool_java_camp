package dreamschool.csourse.chapter10;

public class Car implements Washer{
	int oilSize;
	
	public void go(int distance) {
		System.out.println(distance + "km 이동합니다.");
		
	}

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}

	@Override
	public void wash() {
		// TODO Auto-generated method stub
		
	}
	
		
}


