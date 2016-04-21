package dispatchers;

import javax.servlet.http.HttpServletRequest;

public class GetDispatcher implements Dispatcher {

	@Override
	public void dispatch(HttpServletRequest request) {
		
		String gettype = (String)request.getAttribute("gettype");
		
		if (gettype != null)
		{
			if (gettype.equals("LOGIN"))
			{
				helpers.RequestAttributeSetter.setHelloOtherMessage(request);
				helpers.RequestAttributeSetter.setForwardPageLogin(request);
			}
			else if (gettype.equals("MAIN"))
			{
				helpers.RequestAttributeSetter.setForwardPageMain(request);
			}
			
		}
		else
		{
			helpers.RequestAttributeSetter.setWrongMethodTypeAttribute(request);
			helpers.RequestAttributeSetter.setForwardPageLogin(request);
		}
	}

}
