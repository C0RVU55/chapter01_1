package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		//대입연산자
		int a=7;
		int b=2;
		
		//산술연산자
		System.out.println("산술연산자");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(b-a);
		System.out.println(a*b);
		
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("=========");
		System.out.println(7/2); //정수끼리라 알아서 소수점 삭제
		System.out.println(7.0/2.0); //소수점값 얻고 싶을 때 이렇게
		System.out.println(7.0%2.0);
		System.out.println("=========");
		
		//부호연산자
		int var01=-3;
		System.out.println(var01);
		System.out.println(-var01);
		System.out.println(+var01);
		System.out.println("=========");
		
		//증감연산자
		System.out.println(a);
		System.out.println(++a); //실제 변수 a값이 변경됨 7-->8 출력.
		System.out.println(a); //이미 더해진 값으로 변한 상태. 출력할 때만 더한 값을 보여주는 게 아니라 메모리 속 값을 바꾼다음 그걸 출력함.
		
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b);
		System.out.println("=========");
		
		System.out.println(a);
		System.out.println(a++); //다른 거 하고 더함. 출력 후 값이 변하게 됨.
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		
		b++; //근데 다른 일이 없으면 그냥 하나 올림. 꼭 출력할 필요는 없을 거임. 이런 형태로 많이 쓰게 되기도 할 것.
		System.out.println(b);
		
		
		
	}

}
