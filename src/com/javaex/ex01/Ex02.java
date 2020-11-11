package com.javaex.ex01;

public class Ex02 {
	public static void main(String[] args) {
		//실수형
		double var01 = 3.14;
		System.out.println(var01);
		
		float var02 = 3.14f; //무조건 F 써야 됨.
		System.out.println(var02);
		
		double var03; //메모리에 이렇게 공간을 잡음.
		float var04;
		
		var03 = 0.1234567890123456789;
		var04 = 0.1234567890123456789F; //F 표기만 들어가고 출력은 숫자만.
		System.out.println(var03); //완전 같진 않지만 가깝게 표현하고 있음.
		System.out.println(var04); //자릿수가 좁아서 더블보다 정확X
		//정수형은 큰 수, 실수형은 근사값, 좀 더 정확한 값을 구하고자 할 때.
		
		//변수표현 : 2가지 방법이 값 들어가는 순서가 달라서 이걸 조절할 수 있어야 됨.
		int var11; //변수를 정해놓고 바로 값을 넣지 못하는 경우도 있어서 형태 선언만 해놓은 거.
		var11=25; 
		System.out.println(var11);
		
		int var12 = 25;
		System.out.println(var12);
		
		/////////////////////////////////////////
		//변수 선언 --> 값 대입
		int v01; 
		int v02;
		int v03;
		
		v01=23;
		v02=24;
		v03=25; //만약에 03을 먼저 값을 넣어야 한다면 03을 먼저 배치해야 함.
		
		System.out.println(v01);
		System.out.println(v02);
		System.out.println(v03);
		
		//변수선언+값 대입
		//새 공간을 만들고 싶으면 앞에 자료형을 새로 선언해야함.
		//int v01 = 3; < 기존 v01값 변경
		//int v01 =3; < 변수명 v01 중복돼서 오류
		//v04 = 3; < 기존의 v04에 3을 넣겠다느 거라 오류남. 먼저 자료형 선언하든가 자료형을 같이 써줘야 함.
		
		/*아래처럼 표현할 수도 있음.
		int v04 = 3;
		int v05 = 4;
		int v06 = 5;
		*/
		int v04 = 3, v05 = 4, v06 = 5;
		
		System.out.println(v04);
		System.out.println(v05);
		System.out.println(v06);
		
		/*만약에 앞에 썼던 v01값 23을 출력하고 싶으면
		 * 뒤에 v01을 다시 선언해서 값을 덮어쓰면 안 되는 거임.
		 * 이걸 1번만 쓰고 말 거 같으면 뒤에 덮어써도 되는 거고
		 * 아니면 변수를 2개 선언해야 됨.
		 * 메모리 절약하면서 효율적으로 짜기 위해 개발자가 이걸 통제할 수 있어야 함.*/
	}
}
