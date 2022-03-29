package com.flyaway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.URegistration.dao.Logindao;

/**
 * Servlet implementation class ULogin
 */
@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		PrintWriter out = response.getWriter();
		
		//out.println(email+" "+pass);
		Logindao logindao = new Logindao();
		if(logindao.check(name,email)){				
			response.sendRedirect("SearchFlight.jsp");	
		}
		else{
			out.println("User Not Logged In");
		}	
	}
}
