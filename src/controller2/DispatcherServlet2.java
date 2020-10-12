package controller2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet2
 */
@WebServlet("/front2")
public class DispatcherServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DispatcherServlet2() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.handleRequest(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.handleRequest(request, response);
	}
	protected void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("utf-8");
		try {
			String command = request.getParameter("command");
			Controller2 controller = HandlerMapping2.getInstance().create(command);
			String url =controller.execute(request, response);
			if(url.startsWith("redirect:")) {
				response.sendRedirect(url.substring(9));
			}else {
				request.getRequestDispatcher(url).forward(request, response);
			}
		}catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp");
		}
	}
}
