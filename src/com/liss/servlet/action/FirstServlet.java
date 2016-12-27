package com.liss.servlet.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.isNew()){
			
		}
		session.getCreationTime();//返回第一次创建会话的时间
		session.getLastAccessedTime();//返回容器最后一次包含sessionid的请求后过去了多长时间
		session.getMaxInactiveInterval();//返回对于这个会话客户请求的最大间隔时间
		session.invalidate();
		User user = (User) getServletConfig().getServletContext().getAttribute("user");
		user.setLastname(getInitParameter("firstname"));
		System.out.println(user.toString());
		synchronized (getServletContext()) {
			getServletContext().setAttribute("", "");
		}
		request.getRequestDispatcher("WEB-INF/page/main.jsp").forward(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("FirstServlet destroy");
	}

}
