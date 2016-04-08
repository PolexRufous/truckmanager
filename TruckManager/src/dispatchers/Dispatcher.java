package dispatchers;

import javax.servlet.http.HttpServletRequest;

public interface Dispatcher {

	void dispatch(HttpServletRequest request);
	
}
