package controller2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model2.MemberDAO2;
import model2.MemberVO2;

public class registerController implements Controller2 {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		MemberVO2 vo= new MemberVO2(name, id, password,address);
		MemberDAO2.getInstance().registerMember(vo);
		
		return "index2.jsp";
	}

}
