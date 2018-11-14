package com.biz.method.classes.oop01;

public class BookExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		  String strName = "열혈 자바"; String strAuth = "윤성우"; String strComp = "오렌지 미디어";
//		  int intPrice = 30000; int intDC = 3000;
//		  viewBook(strName,strAuth,strComp,intPrice,intDC);
//		  
//		  strName = "데이터베이스"; strAuth = "이상우"; strComp = "오렌지 미디어"; intPrice = 45000;
//		  intDC = 4500; viewBook(strName,strAuth,strComp,intPrice,intDC);
//	

		// BookVO 클래스를 이용해서
		// book 객체 인스턴스를 생성 (선언 및 초기화)
		BookVO book = new BookVO();
		book.strName = "열혈 자바";
		book.strAuth = "윤성우";
		book.strComp = "오렌지 미디어";
		book.intPrice = 30000;
		book.intDC = 3000;

		// 지금 세팅한 book 객체의 속성들을 콘솔에
		// 보이기위해 method를 호출
		viewBook(book);
	}

	public static void viewBook(BookVO vo) {
		System.out.println("========");
		System.out.println("책 정보");
		System.out.println("--------");
		System.out.println("책이름:" + vo.strName);
		System.out.println("저자:" + vo.strAuth);
		System.out.println("출판사:" + vo.strComp);
		System.out.println("가격:" + vo.intPrice);
		System.out.println("할인:" + vo.intDC);
	}

	// book 객체(인스턴스)의 각 속성(변수)에
	// 값(Data)들을 저장(세팅)한다.
	/*public static void viewBook(String strName, String strAuth, 
								String strComp, int intPrice, int intDC) {
		System.out.println("========");
		System.out.println("책 정보");
		System.out.println("--------");
		System.out.println("책이름:" + strName);
		System.out.println("저자:" + strAuth);
		System.out.println("출판사:" + strComp);
		System.out.println("가격:" + intPrice);
		System.out.println("할인:" + intDC);
	}
*/
}
