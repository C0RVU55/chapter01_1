package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		/*처음 시작할 때 꼭 써야 함. 외우셈.*/
		int myAge;
		myAge=25;
		System.out.println(myAge);
		
		myAge=26;
		System.out.println(myAge);
		
		//정수형
		//자료형(int를 정확하게 써야 한다)
		int var01 = 3;
		//int var02 = -3.4;
		double var02 = -3.4;
		
		//메모리 크기 확인
		int var03 = 12345678;
		//byte var04 = 12345678; byte는 127까지만 되는데 큰 수 넣어서 안 됨
		//short var05 = 12345678; 사이즈에 맞게 넣어야 함.
		long var06 = 12345678;
		System.out.println(var06);
		
		//long형
		//int var07 = 2147483648; int범위보다 커서 오류나는 거 맞음.
		long var08 = 2147483648L;//long형에 대입이 안 됨??? --> L 기호 붙여야 됨.
		long var09 = 2147483647; //int보다 작으면 L 안 붙여도 됨. 크면 붙여야 됨. 근데 헷갈리니까 그냥 L붙여도 됨.
		//보통 int 많이 쓰고 정확하게 쓰고 싶은 경우에 나이 같은 거 범위 제한두고 싶다 그러면 byte 쓰고 그러는 정도.
		//어떤 값이 나올지 측정불가능한 경우 long 써도 되는 거고.
		//실수는 원하는 값이 정확하게 나온다는 보장이 없음. 대체로는 맞지만 염두에 두고 있어야 함.
		//실수는 큰 값보다는 정확한 숫자를 써야할 때 큰 거 쓰는 식.
		
		
	}
	
}
