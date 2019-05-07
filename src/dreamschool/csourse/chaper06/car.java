package dreamschool.csourse.chaper06;

public class car {
	String carName;
	int oilAmount;
	double distance;
	
	void addOil(int amount) {
		oilAmount += amount;
		System.out.println("휘발유를" + amount + "L 주유합니다");
	}

	void printCarInfo() {
		System.out.println("[" + carName + "] 남은 기름양 : " + oilAmount + 
				"L, 총주행거리 : " + distance + "km");
		
	}
	void dirveCar(String startPoint, String endPoint, double driveDistance) {
		System.out.println(startPoint + " 에서 " + endPoint +
				" 까지" + driveDistance + " Km 주행하였습니다.");
		distance += driveDistance;
		oilAmount -= (int)(driveDistance / 20);
		
	}
	
	void distanceCheek() {
		System.out.println("주행가능 거리는 약 " + (oilAmount * 20) + "Km입니다");
	}
}
