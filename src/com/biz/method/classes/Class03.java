package com.biz.method.classes;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ScoreVO라는 클래스를 사용해서
		// ScoreVO라는 객체 인스턴스(객체, 인스턴스)를 선언하라.
		// 그리고 객체를 초기화 하라.
		
		// 대문자로 시작된 키워드는 전부 '클래스'다.
		
		
		ScoreVO scoreVO = new ScoreVO();
		// 첫글자가 대문자인 method를
		//문장은 new ScoreVO()는 '객체 생성자'다.
		// 클래스를 이용해 선언된 객체를 초기화하는 용도로 사용한다.
		
		ScoreVO scoreVO01 = new ScoreVO();
		
		int intNum;
		intNum = 10;
		
		ScoreVO sVO = new ScoreVO();
		sVO = new ScoreVO();
		
		sVO.strName = "이준수";
		sVO.strName = "이몽룡";
		sVO.intKor = 80;
		
		
		sVO = new ScoreVO();
		System.out.println(sVO.intKor);
		System.out.println(sVO.strName);
		
	}

}
