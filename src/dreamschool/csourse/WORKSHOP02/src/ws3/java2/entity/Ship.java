package ws3.java2.entity;

public class Ship {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private int replacement;
	private boolean available;
	
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + modelName);
		System.out.println(" 최고속도 : " + maxSpeed + "km/h");
		System.out.println(" 최대정원 : " + numberLimit + "명");
		System.out.println(" 배 수 량 : " + replacement + "톤");
	}
	

	public Ship(String modelName, int maxSpeed, int numberLimit, int replacement) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
		this.replacement = replacement;
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

	public int getReplacement() {
		return replacement;
	}

	public boolean isAvailable() {
		return available;
	}
	
}
