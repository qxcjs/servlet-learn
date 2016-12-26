package com.liss.servlet.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import com.liss.servlet.bean.User;

public class FirstServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public FirstServlet() {
		System.out.println("FirstServlet Constructor");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("FirstServlet init");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		User user = (User) getServletConfig().getServletContext().getAttribute("user");
		user.setLastname(getInitParameter("firstname"));
		System.out.println(user.toString());
		request.getRequestDispatcher("WEB-INF/page/main.jsp").forward(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("FirstServlet destroy");
	}

}
