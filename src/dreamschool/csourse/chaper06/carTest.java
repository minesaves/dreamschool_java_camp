package dreamschool.csourse.chaper06;

public class carTest {

	public static void main(String[] args) {
		car car = new car();
		car.carName ="ICE 카~";
		car.oilAmount = 5;
		car.distance = 140;
		
		car.printCarInfo();
		
		car.addOil(10);
		
		car.printCarInfo();
		
		car.dirveCar("IT센터", "인천공항", 10.17);
		
		car.printCarInfo();
		
		car.dirveCar("인천공항", "곤지암 리조트", 60.21);
		
		car.printCarInfo();
		
		car.distanceCheek();
		
		

	}

}

