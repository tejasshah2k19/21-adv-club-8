package com.ctag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class UpperTag extends BodyTagSupport {
 
	@Override
	public int doStartTag() throws JspException {

		return EVAL_BODY_BUFFERED;//doinitbody setbodycontent 
	}

 
	@Override
	public int doAfterBody() throws JspException {
		JspWriter out =   getBodyContent().getEnclosingWriter();
		String data = getBodyContent().getString().toUpperCase();
		try {
			out.print(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_PAGE;
	}
}
