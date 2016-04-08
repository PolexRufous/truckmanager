package checkers;

import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

public class PostParametersChecker implements Checker {

	private static Map<String, ConcreteChecker> checkers = new TreeMap<>();
	
	static
	{
		checkers.put("LOGIN", new checkers.postcommand.LoginParametersChecker());
	}

	@Override
	public boolean check(HttpServletRequest request) {
		
		String type = null;

		if
		(
				request.getParameter("posttype") != null
				&&
				request.getParameter("posttype").length() > 0
		)
		{
			type = request.getParameter("posttype").toUpperCase();
		}
		
		switch (dispatchers.PostTypes.valueOf(type))
		{
			case LOGIN: return checkers.get(type).check(request);
			case LOGOUT: return true;
			default: return false;
		}			

	}

	
}
