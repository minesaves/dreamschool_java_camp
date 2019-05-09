package dreamschool.csourse.chaper07;

public class Book {
	String title;
	String author;
	int price;
	Book() {
	}
	Book(String Title, String author){
		this.title = Title;
		this.author = author;
	}
	Book(String author){
		this.author = author;
		
		
	}
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
		
	}
	
	void printBookInfo() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
}
