package com.biz.method.classes.wrapper;

public class String01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String형(type)은 일반 변수처럼 사용이 되지만
		 * 실제로는 변수가 아니고 class이다.
		 * 다른( c언어)언어에 없는 문자열 데이터를
		 * 취급하기 위한 자료형
		 */
		String strName = "홍길동";
		String strN = "";
		System.out.println(strN);
		
		String strNation = new String();
		System.out.println(strNation);
		
		String strDog = new String("불독");
		// => String strDog = "불독" 과 같다.
		System.out.println(strDog);
		
		strNation = "대한민국";
		strName = "Tom Cruise";
		System.out.println("문자열의 길이 : " + strNation.length());
		System.out.println("문자열의 길이 : " + strName.toLowerCase()); //소문자
		
		System.out.println(strName.toUpperCase());
		if(strName.toUpperCase() == "TOM CRUISE") {
			System.out.println("탐크루즈 맞네!!!");
		}
		if(strName.toLowerCase() == "tom cruise") {
			System.out.println("탐크루즈 맞네!!!");
		}
		
		if(strName == "Tom Cruise") {
			System.out.println("탐크루즈 맞네!!!");
		}
		
		if(strName.equals("Tom Cruise")) {
			System.out.println("진짜 탐이네!!!");
		}
		
		if(strName.toUpperCase().equals("TOM CRUISE")) {
			System.out.println("대문자 탐이네!!!");
		}
		if(strName.toLowerCase().equals("tom cruise")) {
			System.out.println("소문자 탐이네!!!");
		}
		
		if(strName.equalsIgnoreCase("toM Cruise"));{
			System.out.println("섞어서 탐");
		}
		
		String strA = "A";
		if(strA == "A") {
			System.out.println("대문자 A 네!!");
		}
	}

}
