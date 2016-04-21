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
		
		
		if (checkers.get(method) != null)
		{
			return checkers.get(method).check(request);
		}
		else
		{
			System.out.println("Asked methog cann't be executed");
			return false;
		}

	}
	
}
