package dreamschool.csourse.chapter10.heroes;


public class BatMan extends heroes{
	@Override
	public void action() {
		System.out.print(this.toString() + "이");
		Swim();
		System.out.print(this.toString() + "이");
		Fight();
	}
	@Override
	public String toString() {
		return "배트맨";
	}
}
