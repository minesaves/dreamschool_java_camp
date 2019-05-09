package dreamschool.csourse.chapter09;

public class Cat extends Animal{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void hunt() {
		System.out.println("쥐를 잡을꺼야!!");
		
	}
	public void play() {
		System.out.println("모빌 놀이가 좋아요~");
		
	}

}
