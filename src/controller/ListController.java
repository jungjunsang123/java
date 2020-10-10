package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;

public class ListController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int count = MemberDAO.getInstance().AllCountMember();
		request.setAttribute("count", count);
				
		return "home.jsp";
	}

}
