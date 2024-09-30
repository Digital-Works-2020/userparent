package com.digitalworks2020.user.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.digitalworks2020.bo.UserBO;
import com.digitalworks2020.bo.UserBOImpl;
import com.digitalworks2020.uto.User;

import java.io.InvalidObjectException;



public class DisplayUserListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		UserBO bo = new UserBOImpl();
		User user = bo.findUser(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out = response.getWriter();
		out.print("User Details");
		out.print("User ID: " + user.getId());
		out.print("User Name: "+ user.getName());
		out.print("User Email: " + user.getEmail());
	}
	
}
