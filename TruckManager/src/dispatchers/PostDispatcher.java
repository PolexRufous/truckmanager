package dispatchers;

import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import helpers.RequestAttributeSetter;

public class PostDispatcher implements Dispatcher {

	private static Map<String, ConcreteDispatcher> dispatchersMap = new TreeMap<String, ConcreteDispatcher>();
	
	static
	{
		dispatchersMap.put("LOGIN", new dispatchers.postdispatchers.LoginDispatcher());
		dispatchersMap.put("LOGOUT", new dispatchers.postdispatchers.LogoutDispatcher());
	}
	
	
	@Override
	public void dispatch(HttpServletRequest request) {
		
		String posttype = request.getParameter("posttype").toUpperCase();
		
		switch(dispatchers.PostTypes.valueOf(posttype))
		{
			case LOGIN: dispatchersMap.get("LOGIN").dispatch(request);
				break;
			case LOGOUT: dispatchersMap.get("LOGOUT").dispatch(request);
			break;
				
			default:
				RequestAttributeSetter.setNoPostTypeAttribute(request);
				RequestAttributeSetter.setForwardPageLogin(request);
		}
		
		
	}

}
