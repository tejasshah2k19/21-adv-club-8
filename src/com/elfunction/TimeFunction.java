package com.elfunction;

import java.util.Date;

public class TimeFunction {

	public static String time() {

		Date d = new Date();
		int h = d.getHours();
		int m = d.getMinutes();
		int s = d.getSeconds();
		return h + ":" + m + ":" + s;
	}
	//

	//
	//
	//

}
