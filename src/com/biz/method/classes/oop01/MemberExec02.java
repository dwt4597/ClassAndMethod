package com.biz.method.classes.oop01;
import com.biz.method.classes.dao.MemberDAO;
public class MemberExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberDAO dao = new MemberDAO();
		dao.viewMember();
		
		dao.memberVO.strid = "111";
		dao.memberVO.strName = "이준수";
		dao.memberVO.setStrTel("111-111-111");
		dao.memberVO.setStrAddr("서울특별시");
		dao.memberVO.setIntAge(30);
		dao.viewMember();
	
	
	}
	

}
