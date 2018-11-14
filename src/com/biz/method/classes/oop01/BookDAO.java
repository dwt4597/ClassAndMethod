package com.biz.method.classes.oop01;

public class BookDAO {
	BookVO vo;

	// 클래스와 이름이 같기때문에 - > 생성자 매소드이다.
	public BookDAO() {
		this.vo = new BookVO();

	}

	public void viewBook() {
		System.out.println("========");
		System.out.println("책 정보");
		System.out.println("--------");
		System.out.println("책이름:" + vo.strName);
		System.out.println("저자:" + vo.strAuth);
		System.out.println("출판사:" + vo.strComp);
		System.out.println("가격:" + vo.intPrice);
		System.out.println("할인:" + vo.intDC);
	}

	// 책을 구매할 때, 계산을 수행하는 method
	public void priceCacl(int intCount) {
		int intSum = (vo.intPrice - vo.intDC) * intCount;
		System.out.println("==========================");
		System.out.println("구매권수 : " + vo.strName);
		System.out.println("구매권수 : " + intCount);
		System.out.println("합	계 : " + intSum);
		System.out.println("==========================");
	}

}
