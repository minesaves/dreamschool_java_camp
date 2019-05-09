package dreamschool.csourse.chapter10.heroes;

public class HeroTest {

	public static void main(String[] args) {
		heroes[] heros = {
				new SuperMan(), new BatMan(), new Spidermen()
		};
		
		System.out.println("Hero 목록 : " + heros[0] + "," + heros[1] + "," + heros[2]);

		for(heroes heroes : heros) {
			heroes.action();
			
		}
	}
	

}
