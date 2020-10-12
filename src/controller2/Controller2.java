package controller2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller2 {
	String execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
