package dreamschool.csourse.chaper07;

public class Chocolate {
	
	private String name;
	private String type;
	private int price;
	
	
	public Chocolate(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
	}

	String GetName() {
		return name;
	
	}
	
	int calculateTotalPrice(int count ) {
		return count * price;
		
	}
	int calculateTotalPrice(int count, int discount) {
		return count * price * (100 - discount) /100;
	}
	
	void changeChocolateInfo(String newName, int newPrice) {
		name = newName;
		price = newPrice;
		
	}
	
	void changeChocolateInfo(String newName, String newType, int newPrice) {
		name = newName;
		price = newPrice;
		type= newType;
	}
	void printChocolateInfo() {
		System.out.println("이름 : " + name + ", 종류 : " + type + ", 가격 : " + price);

	}

}
