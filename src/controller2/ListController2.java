package controller2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model2.MemberDAO2;

public class ListController2 implements Controller2 {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int count = MemberDAO2.getInstance().getMemberCount();
		request.setAttribute("count", count);
		return "home.jsp";
	}

}
