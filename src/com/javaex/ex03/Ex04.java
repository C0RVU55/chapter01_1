package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//조건문 예제1
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int hour=sc.nextInt(); //변하는 상황을 고려해서 int pay; int unit(10000원); 을 먼저 선언해둠.
		int money;
		
		
		if(hour>8) {
			money=12000;
			System.out.println("임금은 "+(80000+(hour-8)*money)+"원입니다"); //8시간까지는 시급 만원이고 그 후부터는 시급 만이천원.
		}else {
			money=10000;
			System.out.println("임금은 "+(hour*money)+"원입니다");
		}
		
		//예제1 해설
		/*int pay; 이고 if조건 밖에 없어서 if조건이 아닐 경우에는 pay값이 없어서 임시방편으로 pay=0을 넣어줬는데 else조건까지 정하고 나면
		 *int pay;이어도 오류 안 남. 메모리에 pay자리가 있는데 조건 충족못할 때 아무 값도 안 들어와서 오류 떴던 거.*/
	
		//예제2
		System.out.print("근무시간2: ");
		int hour2=sc.nextInt();
		double money2;
		
		if(hour2>8) { //주의 : 만약에 조건문 안에 변수 선언하면 {}안에서만 유효함. 그래서 계속 써야되는 변수는 맨 위에 먼저 선언해둠.
			money2=10000*1.5;
			System.out.println("임금2는 "+(int)(80000+(hour2-8)*money2)+"원입니다"); 
		}else {
			money2=10000;
			System.out.println("임금2는 "+(int)(hour2*money2)+"원입니다");
		}
		
		//예제3
		System.out.print("점수를 입력하세요: ");
		int point=sc.nextInt();
		double rest=point%3;
		
		if(rest==0) {
			System.out.println(point+"은(는) 3의 배수입니다");
		}else {
			System.out.println(point+"은(는) 3의 배수가 아닙니다");
		}
		
		
		sc.close();
		
	
		
		
	

	}

}
