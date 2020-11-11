package com.javaex.ex01;

public class Ex04 {
	public static void main(String[] args) {
		//클래스 이름 바꾸기 : 여기서 바꾸는 게 아니라 클래스 우클릭>refactor로 바꿈.
		//그리고 클래스 만들 때 옵션에 체크하면 퍼블릭 스태틱- 자동으로 써줌.
		
		//문자형
		char ch01='A'; //1글자만 넣을 수 있음.
		System.out.println(ch01);
		
		char ch02='한';
		System.out.println(ch02);
		
		//비교
		char ch03='6'; //''안이면 무조건 글자로 인식.
		//그냥 65 넣으면 A나오는데 코드표로 인식해서 오류 안 나는데다 A출력함.
		System.out.println(ch03);
		
		//문자열
		String str="안녕하세ㅐ여ㅛ"; //문자 여러개는 무조건 큰따옴표. 자료형도 char 아니고 String
		System.out.println(str);
		
		char str01='안';
		String str02="안"; //색도 안 바뀌는데 예외적인 거임.
		System.out.println(str01);
		System.out.println(str02);
		//같은 문자형인데 글자수 차이인듯. 1글자 확정이면 char 아님 String.
		//00으로 시작하는 건 int 안 되고 String.
		//근데 주민번호 같은 건 숫자로 구분할 수 있는게 있어서 문자열 일부를 뽑아서 숫자로 바꾸기 이런 식으로 씀.
	
		//sysout 치고 컨트롤+스페이스바 >>> System.out.println();
		
	}
}
