package dispatchers;

import javax.servlet.http.HttpServletRequest;

public interface ConcreteDispatcher {

	void dispatch(HttpServletRequest request);
	
}
