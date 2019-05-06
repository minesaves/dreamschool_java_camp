package dreamschool.csourse.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lotto = 0.0000001235;
		System.out.println("로또에 당첨될 확률 : " + lotto);
		
		int intlotto = (int) lotto;
		System.out.println("로또에 당첨될 확률 int 반환 : " + intlotto);
		
		long ingu = 6973738433L;
		System.out.println("전세계 인구 수 : " + ingu);
		
		int intingu = (int) ingu;
		System.out.println("전세계 인구 수 int 변환" + intingu);

	}

}
