package dreamschool.csourse.chapter05;

public class GuGu3DanTest {

	public static void main(String[] args) {
		int dan =3;
		for(int i = 1; i < 1000000000 ; i++) { //절대로  i < "10"칸의 값을 천만 이상으로 하지 마세요!!!
			System.out.println(dan + " * " + i + " = " + (dan * i) + "\t");
		}

	}

}
