package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//입출력 예제
		
		/*
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름: ");
		String name=sc.nextLine();
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age=sc.nextInt();
		
		System.out.println("당신의 이름은 "+name+"이고 나이는 "+age+"세입니다.");
		
		sc.close();
		*/
		
		
		//이름이랑 나이 순서 바꾸기 --> 숫자 입력받고 문자 입력받을 때 버그 생겨서 작동 안 됨. 숫자 받고 엔터쳐서 생기는데 숫자 값이 계속 유지돼서 그런거.
		Scanner sc=new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		System.out.print("나이: ");
		int age=sc.nextInt();
	
		sc.nextLine(); //숫자 받고 문자 받는 거 하나 넣고 값은 날려버리면 됨.
		
		System.out.println("이름을 입력하세요");
		System.out.print("이름: ");
		String name=sc.nextLine();
		
		System.out.println("당신의 이름은"+name+"이고 나이는"+age+"입니다.");
		
		sc.close();

	}

}
