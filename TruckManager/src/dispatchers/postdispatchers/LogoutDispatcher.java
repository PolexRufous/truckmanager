package dispatchers.postdispatchers;

import javax.servlet.http.HttpServletRequest;

import dispatchers.ConcreteDispatcher;
import helpers.RequestAttributeSetter;

public class LogoutDispatcher implements ConcreteDispatcher {

	@Override
	public void dispatch(HttpServletRequest request) {
		
		request.getSession().removeAttribute("user");
		request.getSession().removeAttribute("userpic");
		RequestAttributeSetter.setForwardPageLogin(request);
		
	}

}
