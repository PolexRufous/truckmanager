package dispatchers;

import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

public class RequestDispather implements Dispatcher {

	private static Map<String, Dispatcher> dispatchers = new TreeMap<String, Dispatcher>();
	
	static
	{
		dispatchers.put("GET", new GetDispatcher());
		dispatchers.put("POST", new PostDispatcher());
	}
	
	@Override
	public void dispatch(HttpServletRequest request) {
		
		String method = request.getMethod().toUpperCase();
		
		switch (method) {
		case "GET": dispatchers.get("GET").dispatch(request);			
			break;
		case "POST": dispatchers.get("POST").dispatch(request);			
			break; 
		default: 	helpers.RequestAttributeSetter.setWrongMethodAttribute(request);
					helpers.RequestAttributeSetter.setForwardPageLogin(request);
			break;
		}
		
	}

}
