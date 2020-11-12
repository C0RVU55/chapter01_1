package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//조건문
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("점수: ");
		int point=sc.nextInt();

		if (point>=60) { //조건문 안() 결과는 참거짓만 나와야 됨.
			
			System.out.println("합격입니다."); //참일 때 실행해야 하는 내용 추가.
		} else { //불합격일 때 실행하는 내용
			System.out.println("불합격입니다.");
		}
		
		
		sc.close();
		
		//순서 : 문제를 세부적으로 분석 --> 순서도 작성 --> 코그 작성 후 테스트
		
		
		
		
		
	}

}
