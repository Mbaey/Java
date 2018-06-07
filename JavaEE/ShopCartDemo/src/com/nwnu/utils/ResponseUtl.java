package com.nwnu.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class ResponseUtl {
	public static void write(HttpServletResponse response,String data) throws IOException {
		PrintWriter out = response.getWriter();
		out.write(data);
		out.flush();
		out.close();
	}
}
