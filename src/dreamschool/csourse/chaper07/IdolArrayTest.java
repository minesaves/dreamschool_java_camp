package dreamschool.csourse.chaper07;

public class IdolArrayTest {

	public static void main(String[] args) {
		Idol Id = new Idol(group + name);
		Chocolate[] chocos = new Chocolate[3];
		Idol [0] = new Idol ("소녀시대","태연");
		Idol [1] = new Idol ("씨스타", "보라");
		Idol [2] = new Idol ("빅뱅","지드래곤");
		
		Idol [0].printIdolInfo();
		Idol [1].printIdolInfo();
		Idol [2].printIdolInfo();
		
		System.out.println();
		
		for(int i = 0; i < chocos.length; i++) {
			chocos[i].printChocolateInfo();
		}
		

	}

}