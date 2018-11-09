package com.biz.method;

public class Method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1; // 선언만 된 변수는 null값을 가지고 있다고 가정
		intNum1 = 0;
		
		System.out.println(intNum1);
		
		
		String strName = "" ;// 선언만 된 변수는 null값을 가지고 있다고 가정
		System.out.println(strName);
		
		String strName1 = null;
		System.out.println(strName1);
		
		//String strName1 = null;
		/*
		 * 변수를 선언만 할 경우
		 * 변수를 읽으려고 시도하면 오류가 발생할
		 * 가능성을 내포하는 코드가 된다.
		 * 
		 * 따라서, 
		 * 당장 어떤 값을 저장하는지 않는다면
		 * 최소한 int : 0, Stirng:"", float : 0f, boolean:false 값으로
		 * 초기화를 해주는것이 좋다.
		 * */
	}
	public static int addVar(int intA, int intB) {
		return 0;
	}
	public static int addVar(float intA, float intB) {
		return 0;
	}
	public static String addVar(String intA, String intB) {
		//return "";
		return null;
	}
	
	
	
	
}
