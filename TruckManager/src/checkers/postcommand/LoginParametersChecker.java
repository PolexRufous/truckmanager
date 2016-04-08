package checkers.postcommand;

import javax.servlet.http.HttpServletRequest;

public class LoginParametersChecker implements checkers.ConcreteChecker {

	@Override
	public boolean check(HttpServletRequest request) 
	{
		
		if(request.getParameter("userlogin") == null || request.getParameter("userlogin").isEmpty()) 
		{
			return false;
		}
		
		if(request.getParameter("userpassword") == null || request.getParameter("userpassword").isEmpty()) 
		{
			return false;
		}		
		
		return true;
	}

}
