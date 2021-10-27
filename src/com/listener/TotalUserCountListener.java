package com.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//session --> create ++  destroy -- 
public class TotalUserCountListener implements HttpSessionListener {

	int totalOnlineUsers = 0;

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		// ++
		totalOnlineUsers++;
		System.out.println("user loggedIn");
		System.out.println("Total Online Users " + totalOnlineUsers);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		// --
		totalOnlineUsers--;
		System.out.println("user loggedOut");
		System.out.println("Total Online Users " + totalOnlineUsers);

	}
}
