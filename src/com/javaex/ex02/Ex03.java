package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//입출력
		
		Scanner sc=new Scanner(System.in); //sc.close 해야 오류 안 남.
		
		System.out.println("숫자를 입력해주세요");
		System.out.print("숫자: ");
		
		int num=sc.nextInt(); //받는 게 정수라서 int, char랑 String은 nextLine으로 받음.
		
		System.out.println("입력된 숫자는 "+num+"입니다");
		
		
		
		sc.close(); //닫기 전까지 몇번이고 쓸 수 있음.
	}

}
