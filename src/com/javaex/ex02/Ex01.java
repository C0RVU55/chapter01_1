package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		//콘솔 입출력
		
		int i=2345;
		double d=3.14;
		String str="굿모닝";
		char c='한';
		String s="한";
		
		String name="이다현";
		
		System.out.println("문자열 출력하고 싶으면 프린트문에 큰따옴표로 넣어도 됨.");
		System.out.println(str);
		
		System.out.print("안녕"); //개행 안 됨.
		System.out.print("하세요!");
		System.out.println("11/11 빼빼로데이"); //println이면 다음 단으로 넘어감.
		
		System.out.println(2+5);
		System.out.println(i+5); //사칙연산 바로 가능.
		System.out.println(i+i);
		
		System.out.println(i+d); //자동형변형 int --> double
		double result=i+d; //변수 새로 선언한다고 해서 더 좋고 그런 건 아니고 쓰임에 따라 선언할지 말지 정하는 거.
		System.out.println(result);
		
		System.out.println(str+str+str); //문자끼리 더해줌.
		System.out.println(i+str); //int를 문자처리함.
		System.out.println(str+d); //더블을 문자처리함.
		String qwe=str+d;
		System.out.println(qwe);
	
		
		//굿모닝 랑 2345
		System.out.print(str); //한번에 하려고 하지말고 세부적으로 끊어서 진행해야 오류가 났을 때 파악하기 쉬움.
		System.out.println(" 랑 "+i); //" 랑 "을 변수 선언해도 되는데 1번 쓰고 말거면 이렇게 하는 게 나음.
		System.out.println(str+" 랑 "+i);
		
		//제 이름은 이다현입니다.
		System.out.println("제 이름은 이다현입니다.");
		System.out.println("제 이름은 "+name+"입니다."); //변수와 문자를 구분해야 함.
		
		//char : char은 문자가 아니라 메모리에서 문자코드표 숫자로 저장됨. 그래서 사칙연산하면 숫자로 인식해서 숫자로 계산해줌.
		char a='a';
		char e='e';
		//char는 a+e가 들어간 변수 선언이 안 되고 더해도 문자가 아닌 숫자로 나옴.
		System.out.println(a+e);
	
		System.out.println(c);
		System.out.println(c+c);
		System.out.println(c+s); //String이 와서 다 문자열 취급함.
		
		//안녕"하"세요
		System.out.println("안녕\"하\"세요");	//큰따옴표 기호 --> \"
		System.out.println("안녕\\하\\세요"); // 역슬래시 --> \\
		System.out.println("제 이름은\n이다현입니다."); //개행 --> \n
		System.out.println("\t안녕\t하세요"); //탭 들여쓰기 --> \t
		
		
	}

}
