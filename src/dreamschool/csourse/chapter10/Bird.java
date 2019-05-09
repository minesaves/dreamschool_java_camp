package dreamschool.csourse.chapter10;

import dreamschool.csourse.chapter09.Animal;

public class Bird extends Animal implements Flyble{
	
	private String habitat;

	public Bird(String kind, int age, String habitat) {
		super(kind, age);
		this.habitat = habitat;
	}
	
	

	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	
		
	}
	
	
}
