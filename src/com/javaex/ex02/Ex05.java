package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//입출력 예제
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age=sc.nextInt();
		
		sc.nextLine();		//이름이랑 나이 순서 바꿔보기.
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름: ");
		String name=sc.nextLine();
		
		
		
		System.out.println("키를 입력해주세요");
		System.out.print("키: ");
		double height=sc.nextDouble();
		
		System.out.println("당신의 이름은 "+name+", 나이는 "+age+", 키는 "+height+"(cm)입니다.");
		
		System.out.println("sdfsdfsdf");
		System.out.println("sdfsdfsdf");
		System.out.println("sdfsdfsdf");
		
		sc.close();

	}

}
