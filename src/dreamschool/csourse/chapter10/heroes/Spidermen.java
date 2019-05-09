package dreamschool.csourse.chapter10.heroes;

public class Spidermen extends heroes{
	@Override
	public void action() {
		System.out.print(this.toString() + "이");
		Fight();
	}
	@Override
	public String toString() {
		return "스파이더맨";
	}
}
