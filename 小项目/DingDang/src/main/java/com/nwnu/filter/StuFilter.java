package com.nwnu.filter;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/stu/*")
public class StuFilter implements Filter {
	public StuFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		Object stu =  request.getSession().getAttribute("stu");
		if (stu == null) {
//			request.setAttribute("");
//			request.getRequestDispatcher("success.html").forward(request, response);
			response.sendRedirect("../index.jsp");
			return;
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}
}
