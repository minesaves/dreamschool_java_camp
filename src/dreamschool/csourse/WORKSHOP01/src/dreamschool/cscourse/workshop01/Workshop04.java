package dreamschool.cscourse.workshop01;

import java.util.Scanner;

//문제 4.
//커피 주문을 하려고 한다.
//메뉴를 보고, 각 메뉴 별로 몇 개씩 주문할 것인지 입력 받아 지불해야 할 총 금액을 계산해 보자.
//그리고 총 금액이 일정 금액을 넘어서면 포인트를 적립해 준다.
//총 금액 12000원 이상 : 구매 금액의 1% 적립
//총 금액 30000원 이상 : 구매 금액의 2% 적립
public class Workshop04 {
 
 public static void main( String[] args ) {
	 int AM = 2000;
	 int KF = 3000;
	 int BE = 1500;
	 int CR = 500;
     
     System.out.println( "========= 메뉴 =========" );
     System.out.println( " 1. 아메리카노   2000원" );
     System.out.println( " 2. 카페라떼   3000원" );
     System.out.println( " 3. 베이글   1500원" );
     System.out.println( " 4. 크림치즈   500원\n" );
     
     System.out.println( "========= 주문 =========" );
     System.out.print( " 아메리카노 주문 수량 : " );
     int ahme = getUserInput();
     System.out.println(ahme);
     System.out.print( " 카페라떼 주문 수량 : " );
     int kafe = getUserInput();
     System.out.println(kafe);
     System.out.print( " 베이글 주문 수량 : " );
     int beg = getUserInput();
     System.out.println(beg);
     System.out.print( " 크림치즈 주문 수량 : " );
     int cream = getUserInput();
     System.out.println(cream);
     System.out.println("========= 금액 =========");
     System.out.println("아메리카노 : " + AM * ahme + "원");
     System.out.println("카페라떼 : " + KF* kafe + "원");
     System.out.println("베이글 : " + BE* beg + "원");
     System.out.println("크림치즈 : " + CR* cream + "원");
     
     int ahmetotal = AM * ahme;
     int kafetotal = KF* kafe;
     
     int begtotal = BE* beg;
     int creamtotal = CR* cream;
     int total = ahmetotal + kafetotal + begtotal + creamtotal;
    int point1 = 230;
    int point2 = 620;
     System.out.println("======================");
     
	System.out.println("총 구매 금액 : " + total + "원");
	if(total == 23000) {
		System.out.println("포인트 적립 : " + point1 + "점");
	}else if(total == 31000) {
		System.out.println("포인트 적립 : " + point2 + "점");
	}

 }
 
 private static int getHiddenNumber() {
	// TODO Auto-generated method stub
	return 0;
}

public static int getUserInput() {
     
 	Scanner scanner = new Scanner(System.in);
 	int value = scanner.nextInt();
 	return value;
 	
 }
}