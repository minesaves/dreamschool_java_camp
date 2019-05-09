package dreamschool.csourse.workshop02;

import java.util.Random;
import java.util.Scanner;

public class BaseBallgameInternet {

	public static void main(String[] args) {
		{}}
			  static int strike =0; //스트라이크 변수 선언
			  static int ball = 0; //볼 변수 선언
			   
			  public static void main1 (String[] args) throws java.lang.Exception
			  {
			    int computer[] = new int[3]; //컴퓨터가 정한 값
			    int user[] = new int[3]; //유저가 정한 값
			     
			    Random random = new Random();
			     
			     
			    //여기서부터 컴퓨터가 정할 값
			    //중복방지.
			    //random.nextInt(10); 이것은 1~9사이에 랜덤
			     
			    //computer 3중에 1번째가 0이면 랜덤 값 넣음
			    while(computer[0] == 0){
			      computer[0] = random.nextInt(10);
			    }
			     
			    //computer 3중에 1번째와 2번째가 중복되거나,
			    //2번째가 0이라면 랜덤 값 넣음
			    while(computer[0] == computer[1] || computer[1] == 0){
			      computer[1] = random.nextInt(10);
			    }
			     
			    //computer 3중에 1번째와 3번째가 중복되거나,
			    //2번째와 3번째가 중복되거나,
			    //3번째가 0이라면 랜덤 값 넣음
			    while(computer[0] == computer[2] || computer[1] == computer[2] || computer[2] == 0){
			      computer[2] = random.nextInt(10);
			    }
			     
			     
			     
			    //유저가 정한 값
			     
			    //입력 s 변수 선언
			    Scanner s= new Scanner(System.in);
			     
			    while(strike < 3){ //스트라이크 3이 될 때 까지 무한 루프
			     
			      //3번 반복하여 유저 입력 받음.
			      for(int i = 0; i < user.length; i++){
			        System.out.print("\n"+(i+1) + "번째 수: ");
			        user[i]=s.nextInt();
			         
			        //만약 10이상이거나, 0이하면 오류 출력
			        while(user[i] >=10 || user[i] <= 0){
			          System.out.println("error: 1~9사이에 입력 하세요.");
			          System.out.print(i+1 + "번째 수: ");
			          user[i]=s.nextInt();
			        }
			      }
			       
			      //여기서 결과 체크
			       
			      //strike, ball 체크
			      for(int i = 0; i< 3; i++){
			        for(int j=0; j<3; j++){
			           
			          //컴퓨터 정한 값과
			          //유저가 정한 값을 같으면
			          if(computer[i] == user[j]){
			            //computer i번째와
			            //user j번째가 같으면
			            //스트라이크!
			            if(i==j){
			              strike+=1;
			            }else{  //아니면 볼!
			              ball+=1;
			            }
			          }
			        }
			      }
			       
			      //만약 strike, ball 아무도 못맞췄다면
			      if(strike == 0 && ball==0){
			        System.out.println("\n아웃!!\n");
			      }else if(strike == 3){ //만약 스트라이크 3개라면
			        System.out.print("\n스트라이크!!");
			        System.exit(0); //무한루프 탈출하여 종료!
			      }else{
			        System.out.println("\n"+strike+" 스트라이크"+ball+" 볼\n");
			        strike=0;
			        ball=0;
			      }
			    }
			  }
			}