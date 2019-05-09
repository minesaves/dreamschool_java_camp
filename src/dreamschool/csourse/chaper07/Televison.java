package dreamschool.csourse.chaper07;

public class Televison {
	String name;
	int price;
	String description;
	public Televison(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public Televison(String name, int price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	void printTelevisionInfo() {
		if(description != null) {
			System.out.println(this.name + "(" + this.description + ")" + this.price);
		}else {
			System.out.println(this.name + " : " + this.price);
		}
	}

}
