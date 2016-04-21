package helpers;

import javax.servlet.http.HttpServletRequest;

public class RequestAttributeSetter {

	public static void setWrongMethodAttribute(HttpServletRequest request) 
	{
		
		request.setAttribute("othermessage", "Wrong method!");
	}
	
	public static void setWrongMethodTypeAttribute(HttpServletRequest request) 
	{
		
		request.setAttribute("othermessage", "Wrong method type");
	}
	
	public static void setHelloOtherMessage(HttpServletRequest request) 
	{
		
		request.setAttribute("othermessage", "Hello! Please login before continue.");
	}
	
	public static void setForwardPageLogin(HttpServletRequest request)
	{
		request.setAttribute("forwardpage", "jsp/login.jsp");
	}
	
	public static void setNoPostTypeAttribute(HttpServletRequest request) 
	{
		
		request.setAttribute("othermessage", "No such post type avalable");
	}
	
	public static void setWrongLoginOrPasswordMessage(HttpServletRequest request)
	{
		request.setAttribute("errormessage", "Incorrect login or password");
	}
	
	public static void setForwardPageMain(HttpServletRequest request)
	{
		request.setAttribute("forwardpage", "jsp/main.jsp");
	}
	
	public static void setWrongParametersMessage(HttpServletRequest request)
	{
		request.setAttribute("othermessage", "Wrong parameters");;
	}
	
}
