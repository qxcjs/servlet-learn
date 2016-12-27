package com.liss.servlet.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 监听容器中有多少个会话
 * @author Administrator
 *
 */
public class FirstHttpSessionListener implements HttpSessionListener{

	private static int activeSessions;
	
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		activeSessions++;
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		activeSessions--;
	}

}
