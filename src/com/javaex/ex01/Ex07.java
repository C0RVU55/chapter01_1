package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		//ppt 예제
		double z01 = 10/4; //(int)10/(int)4 라 소수점 아래 다 떨어지는 거. 결과물이 정수1인데 더블처리해야 돼서 1.0된 거.
		//double z01=(double)(10/4); 1-->1.0
		System.out.println(z01);     

		double z02 = (double)10 / 4 ;  //10을 10.0으로 계산. 10.0/4 --> 2.5
        System.out.println(z02);   

        double z03 = 10 / (double)4 ; //10/4.0 --> 2.5 
        System.out.println(z03);     

        double z04 = (double)10 / (double)4 ;  //완전 더블로 계산하고 싶으면 이게 정확한 거. 10.0/4.0
        System.out.println(z04);    

        int z05 = (int)1.3 + (int)1.8 ;  //소수점 아래 다 떨어져서 1+1=2 됨.
        System.out.println(z05);
        
        int z06=(int)(1.3+1.8);
        System.out.println(z06); //1.3+1.8 먼저하고 결과값을 int로 바꾼 거라 3.
        
      
	}

}
