package checkers;

import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

public class ParametersChecker implements Checker{
	
	
	private static Map<String, Checker> checkers = new TreeMap<>();
	
	static
	{
		checkers.put("GET", new GetParametersChecker());
		checkers.put("POST", new PostParametersChecker());
	}


	public boolean check(HttpServletRequest request)
	{
		
		String method = request.getMethod();
		
		if(method.equalsIgnoreCase("GET"))
		{
			return new GetParametersChecker().check(request);
		}
		else if(method.equalsIgnoreCase("POST"))
		{
			return new PostParametersChecker().check(request);
		}
		else
		{
			System.out.println("Methods GET or POST was not found");
			return false;
		}

	}
	
}
