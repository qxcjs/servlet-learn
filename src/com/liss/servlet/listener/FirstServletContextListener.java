package com.liss.servlet.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.liss.servlet.bean.User;

public class FirstServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("FirstServletContextListener destroyed !!!");

	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("FirstServletContextListener initialized !!!");
		ServletContext sc = event.getServletContext();
		String name = sc.getInitParameter("name");
		int age = Integer.valueOf(sc.getInitParameter("age"));
		User user = new User();
		user.setName(name);
		user.setAge(age);
		sc.setAttribute("user", user);
	}

}
