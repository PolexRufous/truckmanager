package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dispatchers.RequestDispather;


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
		
		
		
		if ((!isUserLogged(request)))
		{
			request.setAttribute("posttype", "LOGIN");
			request.setAttribute("gettype", "LOGIN");
		}
			
			checkAndDispatchRequest(request);
			doForward(request, response);
				
	}

	
	private void checkAndDispatchRequest(HttpServletRequest request)
	{
		if(!(new checkers.ParametersChecker().check(request)))
		{
			request.setAttribute("othermessage", "Wrong parameters");				
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected boolean isUserLogged(HttpServletRequest request)
	{
		return request.getSession().getAttribute("user") != null;
	}

}
