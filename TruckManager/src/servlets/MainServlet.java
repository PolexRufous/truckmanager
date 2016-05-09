package servlets;

import java.io.IOException;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dispatchers.RequestDispather;
import entityes.persons.User;


/**
 * Servlet implementation class MainServlet
 */
@WebServlet(description = "Servlet of main dispacherize", urlPatterns = { "/MainServlet" })
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logRequest(request);
		checkLogin(request);
		checkAndDispatchRequest(request);
		doForward(request, response);		
	}

	
	private void checkLogin(HttpServletRequest request) 
	{
		if ((!isUserLogged(request)))
		{
			request.setAttribute("posttype", "LOGIN");
			request.setAttribute("gettype", "LOGIN");
			request.setAttribute("forwardpage", "jsp/login.jsp");
		}
		else if (request.getParameter("gettype") == null)
		{
			request.setAttribute("gettype", "MAIN");
		}
	}

	private void logRequest(HttpServletRequest request) {
		
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(System.currentTimeMillis());
		
		User user = (User)request.getSession().getAttribute("user");
		String username;
		if (user != null)
		{
			username = user.getFirstName() + " " + user.getLastName();
		}
		else
		{
			username = request.getParameter("userlogin");
			if (username == null)
			{
				username = "Undefind";
			}
		}
		
		String methodtype = request.getParameter("gettype");
		if (methodtype == null)
		{
			methodtype = request.getParameter("posttype");
			if (methodtype == null)
			{
				methodtype = "Undefind";
			}
		}
		
		System.out.println("Log connection/ Method - " + request.getMethod() + ", "
			+ "method type - " + methodtype + ", "
			+ "time - " + calendar.getTime() + ", user - " + username);		
	}

	private void checkAndDispatchRequest(HttpServletRequest request)
	{
		if(!(new checkers.ParametersChecker().check(request)))
		{
			helpers.RequestAttributeSetter.setWrongParametersMessage(request);				
		}
		else
		{
			new RequestDispather().dispatch(request);
		}
	}
	
	private void doForward(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String forwardpage = (String)request.getAttribute("forwardpage");
		if(forwardpage != null && forwardpage.length() > 0)
		{
			request.getRequestDispatcher(forwardpage).forward(request, response);				
		}
		else
		{
			request.getRequestDispatcher("jsp/login.jsp").forward(request, response);
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected boolean isUserLogged(HttpServletRequest request)
	{
		return request.getSession().getAttribute("user") != null;
	}

}
