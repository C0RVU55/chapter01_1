package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//조건문 예제4
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int point=sc.nextInt();
		
		if(point>=90) {
			System.out.println("A등급");
		}else if(point<90&&point>=80) { //90>point>=80 이렇게 못 씀.  && 쓰면 정확하긴 하겠지만 point>=90이 있으니까 꼭 point<90을 쓸 필요없음.
			System.out.println("B등급");
		}else if(point<80&&point>=70) {
			System.out.println("C등급");
		}else if(point<70&&point>=60) {
			System.out.println("D등급");
		}else {
			System.out.println("F등급");
		}
		
		//예제5
		
		System.out.print("숫자: "); //짝홀 음수 0
		int num=sc.nextInt();

		if(num>0&&num%2==0) { //if문 안에 또 if문 쓸 수 있음.
			System.out.println("짝수입니다.");
		}else if(num>0&&num%2==1) {
			System.out.println("홀수입니다."); //else if로 끝내도 되나?
		}else if(num==0) {
		System.out.println("0입니다.");
		}else if(num<0) {
			System.out.println("음수입니다.");
		}
		
		/*if(point>0){
		 * if(point%2==0){
		 * 	짝수 일때}
		 * else{
		 * 	홀수 일때(짝수 아닌 나머지)
		 * }
		 * }else if(point<0){
		 * 	음수 일때}
		 * 	else{
		 * 	0일 때}	
		 * */

		
		//예제6
		
		System.out.print("과목을 선택하세요\n(1.자바 2.C 3.C++ 4.파이썬)\n과목번호: ");
		int sub_num=sc.nextInt();
		
		if(sub_num==1) {
			System.out.println("R101호");
		}else if(sub_num==2) {
			System.out.println("R202호");
		}else if(sub_num==3) {
			System.out.println("R303호");
		}else if(sub_num==4) {
			System.out.println("R404호");
		}else {
			System.out.println("상담원에서 문의하세요.");
		}
		
		
		sc.close();

	}

}
