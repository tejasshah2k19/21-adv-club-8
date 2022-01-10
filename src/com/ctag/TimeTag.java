package com.ctag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TimeTag extends TagSupport {

	public int doStartTag() throws JspException {

		// doTag
		JspWriter out = pageContext.getOut();
		Date d = new Date();
		int h = d.getHours();
		int m = d.getMinutes();
		int s = d.getSeconds();
		try {
			out.print(h + ":" + m + ":" + s);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return super.doStartTag();
	}

	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_PAGE;
	}
}
