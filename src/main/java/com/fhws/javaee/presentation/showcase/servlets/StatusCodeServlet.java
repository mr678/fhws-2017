package com.fhws.javaee.presentation.showcase.servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("statuscode")
public class StatusCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setStatus(HttpServletResponse.SC_PAYMENT_REQUIRED);
		response.getWriter().append("Hallo hallo");
		
	}
}
