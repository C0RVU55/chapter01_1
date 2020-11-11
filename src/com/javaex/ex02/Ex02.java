package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//스캐너 클래스
		
		//변수는 잡아놓는데 값은 없음. 외부에서 입력받아야 하기 때문.
		
		Scanner sc = new Scanner(System.in); //키보드입력 받는 문법. 변수 sc에 복합기 같은 게 들어있는 거.
		//Scanner를 자바 안에 있는 거랑 연결시켜줘야 됨. 위치 알려주는 거. Scanner 누르면 import할 수 있는 거 뜸.
		
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름: "); //커서가 내려가지 않도록
		
		String name=sc.nextLine(); //사용자가 입력한 값을 넣을 변수. sc.nextline이 문자열을 받아주는 거임.
		
		System.out.println("당신의 이름은 "+name+"입니다");
		
		
		
		
		sc.close();//sc기능을 꺼줌. sc. 누르면 가능한 명령?들이 뜸. 
	}

}
