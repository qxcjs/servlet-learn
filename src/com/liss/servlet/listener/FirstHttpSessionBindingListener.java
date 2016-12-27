package com.liss.servlet.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * HttpSessionBindingListener 不需要在web.xml中配置
 * @author Administrator
 *
 */
public class FirstHttpSessionBindingListener implements HttpSessionBindingListener{

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		
	}

}
