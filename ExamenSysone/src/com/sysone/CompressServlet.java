package com.sysone;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CompressServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String cadena = req.getParameter("value");
		StringCompress strCompress = new StringCompress();
		String salida = strCompress.Compress(cadena);

		PrintWriter out = res.getWriter();
		out.println(salida);

		System.out.println(salida);
	}


}
