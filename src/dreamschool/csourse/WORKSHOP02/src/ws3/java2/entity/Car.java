package ws3.java2.entity;

public class Car {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private int mileage;
	private boolean available;
	
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + modelName);
		System.out.println(" 최고속도 : " + maxSpeed + "km/h");
		System.out.println(" 최대정원 : " + numberLimit + "명");
		System.out.println(" 평균연비 : " + mileage + "km/l");
	}
	

	public Car(String modelName, int maxSpeed, int numberLimit, int mileage) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
		this.mileage = mileage;
	}


	public String getModelName() {
		return modelName;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getNumberLimit() {
		return numberLimit;
	}

	public int getMileage() {
		return mileage;
	}

	public boolean isAvailable() {
		return available;
	}
	
}
