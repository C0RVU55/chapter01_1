package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		//예제3 해설

		Scanner sc=new Scanner(System.in);
		
			System.out.print("점수를 입력하세요: ");
			int point=sc.nextInt();
			double rest=point%3;
			
			if(rest==0) { //변수 넣을 필요 없고 바로 point%==0해도 됨.
				System.out.println(point+"은(는) 3의 배수입니다");
			}else {
				System.out.println(point+"은(는) 3의 배수가 아닙니다");
			}
		
		sc.close();
	}

}
