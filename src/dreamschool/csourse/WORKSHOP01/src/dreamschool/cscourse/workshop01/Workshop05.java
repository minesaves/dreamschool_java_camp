package dreamschool.cscourse.workshop01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 문제 5.
// A대학의 학기말이 되었다. 각과목별로 성적을 입력 받아 장학금을 받을 학생을 선별하려고 한다.
// 장학금을 받을 수 있는 조건은 아래와 같다.
//   1) 평점이 3.7 이상   2) 각 과목별 성적이 2.5 이상 (한 과목이라도 2.5 미만인 과목이 있다면, 과락으로 장학금 탈락)
public class Workshop05 {
    
    public static void main( String[] args ) {
        
        System.out.print( "Computer Science 성적을 입력하세요 : " );
        double ComputerScience = getUserInput();
        System.out.println("Computer Science점수 : " + ComputerScience);
        System.out.print( "Java Programming 성적을 입력하세요 : " );
        double JavaProgramming = getUserInput();
        System.out.println("Computer Science점수 : " + JavaProgramming);
        System.out.print( "공학수학 성적을 입력하세요 : " );
        double 공학수학 = getUserInput();
        System.out.println("Computer Science점수 : " + 공학수학);
        System.out.print( "오페라의 이해 성적을 입력하세요 : " );
        double 오페라의이해 = getUserInput();
        System.out.println("Computer Science점수 : " + 오페라의이해);
        System.out.print( "배드민턴 성적을 입력하세요 : " );
        double 배드민턴성적 = getUserInput();
        System.out.println("Computer Science점수 : " + 배드민턴성적);
        System.out.println( "==============================" );
        double 평점 = ((ComputerScience + JavaProgramming + 공학수학 + 오페라의이해 + 배드민턴성적) / 5);
        System.out.println( "평점은" + 평점 + "점 입니다." );
        
        if(평점 >= 3.7 && ComputerScience >= 2.5 && JavaProgramming >= 2.5 && 공학수학 >= 2.5 &&오페라의이해 >= 2.5 && 배드민턴성적 >= 2.5 ){
        	System.out.println("다음 학기 장학금 대상자 입니다.");
        } else{
        	System.out.println("다음 학기 장학금 대상자가 아닙니다.");
        }

    }
    
    public static double getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	double value = scanner.nextDouble();
    	return value;
    }
}