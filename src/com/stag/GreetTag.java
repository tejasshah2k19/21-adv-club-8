package com.stag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class GreetTag extends SimpleTagSupport {
	public void doTag() throws JspException, IOException {

		Date d = new Date();
		JspWriter out = getJspContext().getOut();

		int h = d.getHours();

		if (h >= 0 && h <= 11) {
			out.print("Good Morning");
		} else if (h >= 12 && h <= 17) {
			out.print("Good Noon");
		} else {
			out.print("Good Evening");
		}

	}
}
