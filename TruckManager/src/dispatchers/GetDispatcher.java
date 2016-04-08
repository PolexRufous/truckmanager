package dispatchers;

import javax.servlet.http.HttpServletRequest;

public class GetDispatcher implements Dispatcher {

	@Override
	public void dispatch(HttpServletRequest request) {
		// TODO Auto-generated method stub
		helpers.RequestAttributeSetter.setForwardPageLogin(request);
	}

}
