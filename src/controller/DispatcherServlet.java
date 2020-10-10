package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/front")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.handleRequest(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		this.handleRequest(request, response);
	}
	/*	1. 에러 발생시 error.jsp로 redirect 한다
	 *  2. client가 보낸 command를 받는다 
	 *  3. command를 이용해 HandlerMapping의 create를 호출 , 컨트롤러를 반환받는다 
	 *  4. 컨트롤러를 실행한다 
	 *  5. 컨트롤러가 실행 한 후 반환하는 String 정보를 이용해 
	 *      forward 또는 redirect 방식으로 응답하도록 view로 이동시킨다. 
	 */
	protected void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String command=request.getParameter("command");
		//	System.out.println("command:"+command);
			Controller controller=HandlerMapping.getInstance().create(command);
		//	System.out.println("controller:"+controller);
			String url=controller.execute(request, response);
		//	System.out.println("url:"+url);
			if(url.startsWith("redirect:"))
				response.sendRedirect(url.substring(9));
			else
				request.getRequestDispatcher(url).forward(request, response);
		}catch (Exception e) {
			e.printStackTrace(); // 예외 메세지와 발생 경로를 모두  콘솔에 출력한다 
			response.sendRedirect("error.jsp");
		}
	}
}













