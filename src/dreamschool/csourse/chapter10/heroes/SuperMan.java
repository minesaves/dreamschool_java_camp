package dreamschool.csourse.chapter10.heroes;

public class SuperMan extends heroes {
	@Override
	public void action() {
		System.out.print(this.toString() + "이");
		fly();
		System.out.print(this.toString() + "이");
		Swim();
		System.out.print(this.toString() + "이");
		Fight();	
	}
	@Override
	public String toString() {
		return "슈퍼맨";
	}
}
