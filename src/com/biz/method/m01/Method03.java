package com.biz.method.m01;

public class Method03 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			// 임의숫자를 무작위로 생성하는 명령문
			
			Math.random();
			for(int i = 0; i<10; i++) {
				System.out.println(Math.random());
			}
			System.out.println("0~9까지 정수인 난수 구하기");
			for(int i = 0; i<10; i++) {
				int intNum = (int)(Math.random()*10);
				System.out.println(intNum);
			}
			System.out.println("0~100까지 정수인 난수 구하기");
			for(int i = 0; i<10; i++) {
				int intNum = (int)(Math.random()*100);
				System.out.println(intNum);
			}
			System.out.println("1~100까지 정수인 난수 구하기");
			for(int i = 0; i<10; i++) {
				int intNum = (int)(Math.random()*100)+1;
				System.out.println(intNum);
			}
			
			System.out.println("10~109까지 정수인 난수 구하기");
			for(int i = 0; i<10; i++) {
				int intNum = (int)(Math.random()*100)+10;
				System.out.println(intNum);
			}
			
			System.out.println("50~100까지 정수인 난수 구하기");
			for(int i = 0; i<10; i++) {
				int intNum = (int)(Math.random()*100-50+1)+50;
				System.out.println(intNum);
			}
			
			int intStart = 50;
			int intEnd = 100;
			
			int rand = (int)Math.random() * (intEnd - intStart +1) + intStart;
			
			int intStars = (int)Math.random()*(10-5+1) +5;
			makeStars(intStars);
			
			
			/*int intStars = (int)8.0;
			for (int i = 0; i < intStars; i++) {
				for (int j = 0; j < intStars; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}*/
			makeStars(6);
			
		}
		public static void makeStars(int intStars) {
		// int intStars = 6;
		for (int i = 0; i < intStars; i++) {
			for (int j = 0; j < intStars; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	

}
