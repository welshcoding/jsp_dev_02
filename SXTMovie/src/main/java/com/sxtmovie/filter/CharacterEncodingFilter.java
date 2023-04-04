package com.sxtmovie.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("*.mo")
public class CharacterEncodingFilter implements javax.servlet.Filter {

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		arg0.setCharacterEncoding("UTF-8");
		arg1.setCharacterEncoding("UTF-8");
		arg1.setContentType("text/html; charset=UTF-8");
	
//		System.out.println("before filter");
		// filterChain으로 다음 작업 진행 여부를 정함
		
		arg2.doFilter(arg0, arg1);
//		System.out.println("after filter");
		
		
	}
	
}
